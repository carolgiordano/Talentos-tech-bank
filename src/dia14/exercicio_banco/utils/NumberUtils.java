package br.com.techbank.semana_3.aula_13.exercicio_banco.utils;

import br.com.techbank.semana_3.aula_13.exercicio_banco.domain.Banco;

public class NumberUtils {

    public static Integer gerarNumeroDeContaAleatorio(){
        int numero = 0;
        do {
            numero = (int) (Math.random() * 10000);
        }while(Banco.procurarConta(numero) != null
                || numero < 1000);

        return numero;
    }


}
