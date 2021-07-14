package br.com.techbank.semana_3.aula_13.exercicio_banco.application;

import java.util.Scanner;

public class Validador {

    public static void validaInputInt(Scanner sc){
        if(!sc.hasNextInt()){
            System.out.println("Você precisa informar um número do tipo inteiro.");
            System.exit(1);
        }
    }

    public static void validaInputDouble(Scanner sc){
        if(!sc.hasNextDouble()){
            System.out.println("Você precisa informar um número válido");
            System.exit(1);
        }
    }

    public static void validaInputLong(Scanner sc){
        if(!sc.hasNextLong()){
            System.out.println("Você precisa informar um número válido");
            System.exit(1);
        }
    }

    public static void validaInputNegativo(double input){
        if(input < 0){
            System.out.println("Você precisa informar um número maior do que 0.");
            System.exit(1);
        }
    }

    public static void validaInputNegativo(long input){
        if(input < 0){
            System.out.println("Você precisa informar um número maior do que 0.");
            System.exit(1);
        }
    }
}
