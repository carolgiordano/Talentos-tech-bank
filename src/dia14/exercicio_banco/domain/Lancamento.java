package br.com.techbank.semana_3.aula_13.exercicio_banco.domain;

import java.time.LocalDate;
import java.util.Date;

public class Lancamento {

    private LocalDate data;
    private double movimentacao;
    private double saldo;

    @Override
    public String toString() {
        return "Lancamento{" +
                "data=" + data +
                ", movimentacao=" + movimentacao +
                ", saldo=" + saldo +
                '}';
    }

    public Lancamento(LocalDate data, double movimentacao, double saldo) {
        this.data = data;
        this.movimentacao = movimentacao;
        this.saldo = saldo;
    }

    public LocalDate getData() {
        return data;
    }
}
