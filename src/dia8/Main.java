package dia8;

import dia8.exercicios.agenda.Pessoa;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> meusNumeros = new HashSet<>();

        meusNumeros.add(1);
        meusNumeros.add(1);


        System.out.println(meusNumeros);

        Set<Pessoa> pessoas = new HashSet<>();

        Pessoa pessoa1 = new Pessoa("Anderson", 1990, 1.80, "19 9 9871 0077");
        pessoas.add(pessoa1);

        Pessoa pessoa2 = new Pessoa("Anderson", 1990, 1.80, "19 9 9871 0077");
        pessoas.add(pessoa2);

        System.out.println(pessoas);

    }

}
