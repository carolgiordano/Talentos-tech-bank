package dia6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Excercicíos {


    public static void exercicío1() {
        // dado um array com 20 números, imprima seus valores de trás para frente.
        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]

        int[] numeros;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número inteiro para criar um array");

        int tamanhoDoArray = in.nextInt();

        numeros = new int[tamanhoDoArray];

        for (int i = 0; i < tamanhoDoArray; i++) {
            numeros[i] = i + 1;
        }

        for (int i = numeros.length - 1; i > -1; i--) {
            System.out.println(numeros[i]);
        }

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        for (int i = numeros.length; i > 0; i--) {
            System.out.println(numeros[i - 1]);
        }

        in.close();

    }

    public static void exercicio1Alternativo() {
        Scanner in = new Scanner(System.in);
        System.out.println("Preencher vetor até: ");

        int num = in.nextInt();
        int[] vetor = new int[num];

        for (int i = 0; i < num; i++) {
            vetor[i] = i + 1;
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[num - (i + 1)]);
        }

        in.close();
    }

    public static void exercicio1Alternativo2() {

        // Dado um array com 20 números, imprima seus valores de trás para frente.
        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] novoVetor = new int[20];
        for (int i = 0; i < vetor.length; i++) {
            novoVetor[i] = vetor[vetor.length - (i + 1)];
            System.out.println(vetor[vetor.length - (i + 1)]);
        }

        System.out.println(Arrays.toString(novoVetor));


    }

    public static void selectionSortPtBr(int[] vetor) {
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            int indice_com_menor_valor = i;

            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[indice_com_menor_valor]) {
                    indice_com_menor_valor = j;
                }
            }

            int temporaria = vetor[indice_com_menor_valor];
            vetor[indice_com_menor_valor] = vetor[i];
            vetor[i] = temporaria;

        }


    }


    public static void selectionSort(int arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted sub array
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void bubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }
    


    public static void main(String[] args) {

    }


}

