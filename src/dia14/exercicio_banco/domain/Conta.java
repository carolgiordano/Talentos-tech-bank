package br.com.techbank.semana_3.aula_13.exercicio_banco.domain;

import java.time.LocalDate;
import java.util.*;

import static br.com.techbank.semana_3.aula_13.exercicio_banco.utils.NumberUtils.gerarNumeroDeContaAleatorio;

public abstract class Conta {

    private final int numero;
    private Cliente cliente;
    private double saldo;
    private Deque<Lancamento> extrato;
    private String tipoConta;
    private Gerente gerente;
    private boolean ativa;

    Conta(String nome, double renda, double saldo){
        this.numero = gerarNumeroDeContaAleatorio();
        this.cliente = new Cliente(nome, renda);
        this.saldo = saldo;
        this.extrato = new ArrayDeque<>();
        this.tipoConta = this.getClass().getSimpleName();
        this.gerente = new Gerente();
        this.ativa = true;
    }

    public abstract double sacar(double valor);

    public void depositar(double valor){
        this.saldo += valor;
        adicionarLancamento(valor, "depósito");
        System.out.println("Depósito realizado com sucesso!");
    }

    public void listarExtrato(long dias){
        System.out.println("Seu extrato:");
        System.out.println(String.format("Número da conta: %d / Nome: %s", this.numero, this.cliente));

        LocalDate limite = LocalDate.now().minusDays(dias);

        extrato.stream().filter(lancamento -> lancamento.getData().isAfter(limite)).forEach(lancamento -> System.out.println(lancamento.toString()));
    }

    public void listarExtrato(){
        System.out.println("Seu extrato:");
        System.out.println(String.format("Número da conta: %d / Nome: %s", this.numero, mostrarNomeCliente()));

        extrato.stream().forEach(lancamento -> System.out.println(lancamento.toString()));
    }

    public void adicionarLancamento(double valor, String tipo){
        if(valor != 0){
            Lancamento lancamento = new Lancamento(LocalDate.now(), tipo, valor, this.saldo);
            getExtrato().push(lancamento);
        }
    }

    public boolean encerrar(){
        if(saldo == 0){
            this.ativa = false;
            System.out.println("Conta encerrada!");
            return true;
        } else if (saldo > 0){
            System.out.println(
                    String.format("Ainda há dinheiro na sua conta. Realize um saque no valor de %s.", this.saldo));
            return false;
        } else {
            System.out.println(String.format("Seu saldo está negativo. Realize um depósito no valor de %s.", Math.abs(this.saldo)));
            return false;
        }
    }

    public abstract void transferirPara(Conta conta, double valor);

    public String mostrarNomeCliente(){
        return this.cliente.getNome();
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Deque<Lancamento> getExtrato() {
        return extrato;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public boolean isAtiva() {
        return ativa;
    }
}
