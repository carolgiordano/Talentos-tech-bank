package br.com.techbank.semana_3.aula_13.exercicio_banco.domain;

public class Cliente {

    private String nome;
    private double rendaMensal;

    public Cliente(String nome, double rendaMensal) {
        this.nome = nome;
        this.rendaMensal = rendaMensal;
    }

    public String getNome() {
        return nome;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }
}
