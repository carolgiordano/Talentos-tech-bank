package br.com.techbank.semana_3.aula_13.exercicio_banco.domain;

import java.time.LocalDate;
import java.util.Date;

public class Lancamento {

    private LocalDate data;
    private String tipo;
    private double movimentacao;
    private double saldo;

    @Override
    public String toString() {
        return "Lançamento [ " +
                "data: " + data +
                ", tipo: " + tipo +
                ", movimentação: R$" + movimentacao +
                ", saldo: R$" + saldo +
                " ]";
    }

    public Lancamento(LocalDate data, String tipo, double movimentacao, double saldo) {
        this.data = data;
        this.tipo = tipo;
        this.movimentacao = movimentacao;
        this.saldo = saldo;
    }

    public LocalDate getData() {
        return data;
    }
}
