package br.com.techbank.semana_3.aula_13.exercicio_banco.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Banco {

    private static List<Conta> contas = new ArrayList<>();

    public static void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public static Conta procurarConta(int numero){
        Optional<Conta> contaOptional = contas.stream().filter(conta -> conta.getNumero() == numero).findFirst();

        return contaOptional.orElse(null);
    }

    public static List<Conta> getContas() {
        return contas;
    }
}
