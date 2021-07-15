package br.com.techbank.semana_3.aula_13.exercicio_banco.domain;

public class ContaPoupanca extends Conta{


    public ContaPoupanca(String nome, double renda, double saldo)  {
        super(nome, renda, saldo);
    }

    @Override
    public double sacar(double valor){
        if(getSaldo() >= valor) {
            setSaldo(getSaldo()-valor);
            adicionarLancamento(-valor, "saque");

            System.out.println("Saque realizado com sucesso!");
            return valor;
        } else {
            System.out.println("Saldo insuficiente!");
            return 0;
        }
    }

    @Override
    public void transferirPara(Conta conta, double valor) {
        if(getSaldo() >= valor){
            this.setSaldo(this.getSaldo()-valor);
            this.adicionarLancamento(-valor, "transferência");
            conta.depositar(valor);
        }
    }

}
