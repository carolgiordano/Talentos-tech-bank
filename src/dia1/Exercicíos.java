package dia1;

import java.util.Scanner;

public class Exercicíos {
    public static void main(String[] args) {
        Exercicío4();
    }


    public static void exercícios1() {
        // 1.Escreva um algoritmo que armazene o valor 99 em uma variável Y e o valor 11 em uma variável Z. A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com que o valor que está em Y passe para Z e vice-versa. Ao final, escrever os valores que ficaram armazenados nas variáveis.

        short y = 99; // Anderson
        short z = 11; // Leornado
        short coringa = 0; // Geane


        System.out.printf("O valor da variável y antes da troca é = %d\n", y);
        System.out.printf("O valor da variável z antes da troca é = %d\n", z);

        coringa = y;
        y = z;
        z = coringa;

        System.out.printf("O valor da variável y depois da troca é = " + y);
        System.out.printf("O valor da variável z depois da troca é = " + z);
    }


    public static void exercícios2() {
        // Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor para mostrar seu antecessor");
        int valor = in.nextInt();

        int antecessor = valor - 1;

        System.out.println("O antecessor de " + valor + " é = " + --valor);
        in.close();
    }


    public static void Exercicíos3() {
        //Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.
        Scanner in = new Scanner(System.in);
        System.out.println("Qual a base do retângulo?");
        double base = in.nextInt();
        System.out.println("Qual a altura do retangulo?");
        double altura = in.nextInt();

        double area = base * altura;

        System.out.println("A área desse retângulo é: " + area);

        in.close();

    }

    public static void Exercicío4() {
        //Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o total de votos");
        int totalDeVotos = in.nextInt();

        System.out.println("Digite o total de votos brancos");
        int totalDeVotosBrancos = in.nextInt();

        System.out.println("Digite o total de votos nulos");
        int totalDeVotosNulos = in.nextInt();

        System.out.println("Digite o total de votos válidos");
        int totalDeVotosVálidos = in.nextInt();

        System.out.println("A quantidade de votos é: " + totalDeVotos);

        System.out.println("A quantidade de votos brancos é: " + totalDeVotosBrancos);

        System.out.println("A quantidade de votos nulos é: " + totalDeVotosNulos);

        System.out.println("A quantidade de votos válidos é: " + totalDeVotosVálidos);

        double percentualVotosBrancos, percentualVotosNulos, percentualVotosVálidos;

        percentualVotosBrancos = totalDeVotosBrancos * 100 / totalDeVotos ;
        percentualVotosNulos = totalDeVotosNulos * 100 / totalDeVotos ;
        percentualVotosVálidos = totalDeVotosVálidos * 100 / totalDeVotos ;

        System.out.println("----");
        System.out.println("O percentual total de votos em branco é: " + percentualVotosBrancos + "%");
        System.out.println("O percentual total de votos nulos é: " + percentualVotosNulos + "%");
        System.out.println("O percentual total de votos válidos é: " + percentualVotosVálidos + "%");



        in.close();

    }

}