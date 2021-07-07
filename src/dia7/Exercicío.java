package dia7;

import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercicío {



        //Escreva um algoritmo que leia números insira em um array e após mostre os números informados na tela.
        //Ler somente 5 números.



    public static void exercicio1(){

        Scanner in = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número");
            numeros[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(numeros));


        in.close();

    }

    public static void exercicioArrayList() {

        Scanner in = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número");
            numeros.add(in.nextInt());
        }

        System.out.println(numeros);

        in.close();

    }

    public static void exercicio2ArrayList(){
        //Escreva um algoritmo que leia números, insira em um array e após mostre a quantidade de números negativos.

        Scanner in = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número");
            numeros.add(in.nextInt());
        }
        int quantidade = 0;
        for(Integer numero: numeros){
            if (numero < 0) {
                quantidade++;
            }
        }

        System.out.println(quantidade);

        in.close();
    }

    public static void excercicio3ArrayList(){
        //Escreva um algoritmo que leia números, insira em um array e após mostre a quantidade de números pares.

        Scanner in = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número");
            numeros.add(in.nextInt());
        }
        int quantidade = 0;
        for(Integer numero: numeros){
            if (numero % 2 == 0) {
                quantidade++;
            }
        }

        System.out.println(quantidade);

        in.close();

    }

    public static void exercicio4ArrayList(){

        //Escreva um algoritmo que leia números, insira em um array e após mostre o maior valor.

        Scanner in = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número");
            numeros.add(in.nextInt());
        }
        int maiorValor = Integer.MIN_VALUE;
        for(Integer numero: numeros){
            if (numero > maiorValor){
                maiorValor = numero;
            }
        }

        System.out.println(maiorValor);

        in.close();

    }

    public static void exercicio5ArrayList() {

        //Escreva um algoritmo que simula um jogo da forca simples. o usuario precisara adivinhar uma palavra
        // chutando cada letra em no máximo 10 chutes, caso o usuario acerte a letra o jogo dirá que ele acertou,
        // caso tenha errado, o numero de tentativas vai diminuindo. Caso o numero de tentativas
        // chegue a 0 o usuário perde.

        Scanner in = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número");
            numeros.add(in.nextInt());
        }
        int maiorValor = Integer.MIN_VALUE;
        for (Integer numero : numeros) {
            if (numero > maiorValor) {
                maiorValor = numero;
            }
        }

        System.out.println(maiorValor);

        in.close();


    }

    public static void excercicio6(){
        //Escreva um algoritmo que simula um jogo da forca simples. o usuario precisara adivinhar uma palavra
        // chutando cada letra em no máximo 10 chutes, caso o usuario acerte a letra o jogo dirá que ele acertou,
        // caso tenha errado, o numero de tentativas vai diminuindo.
        // Caso o numero de tentativas chegue a 0 o usuário perde.

        Scanner in = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Jogador 1, escolha a palavra que deverá ser adivinhada");
        String palavraParaSerAdivinhadaInput = in.next();

        System.out.println("Jogador 1, dê uma dica sobre a palavra");
        String dicaDaPalavraParaSerAdivinhada = in.next();

        palavraParaSerAdivinhadaInput = palavraParaSerAdivinhadaInput.trim();

        int maximoDeChutes = 10;

        char[] palavraParaSerAdivinhada = palavraParaSerAdivinhadaInput.toCharArray();

        List<Boolean> listaDeLetrasAcertadas = new ArrayList<>();
        for (char x: palavraParaSerAdivinhada){
            listaDeLetrasAcertadas.add(false);
        }

        System.out.println("Agora é a vez do jogador 2 ... ");
        System.out.printf("Sua dica é %s \n", dicaDaPalavraParaSerAdivinhada);

        while (maximoDeChutes > 0 && Arrays.asList(listaDeLetrasAcertadas).contains(false)){
            System.out.println("Jogador 2, chute uma letra");
            char chute = in.next().charAt(0);

            boolean errouOhChute = true;
            for (int i = 0; i < palavraParaSerAdivinhada.length; i++) {
                if (chute == palavraParaSerAdivinhada[i]) {
                    listaDeLetrasAcertadas.set(i, true) ;
                    errouOhChute = false;
                }
            }

            if (errouOhChute) {
                maximoDeChutes --;
                System.out.printf("Agora você só tem %s chutes\n", maximoDeChutes);
            }
        }


        if (!listaDeLetrasAcertadas.contains(false)){
            System.out.println("Jogador 2 ganhou o jogo");
        } else {
            System.out.println("Jogador 1 ganhou");
        }


        in.close();



    }








    public static void Forca2 (){

        Scanner sc = new Scanner(System.in);
        String Palavra;
        int vidas = 6;
        String Letra;
        String Resposta;
        int check=0;
		System.out.println("Digite uma palavra para o jogador: ");
        Palavra= sc.nextLine();
        char Palavrachare [] = Palavra.toCharArray();
        Resposta = Palavra;
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("BOM JOGO");
		System.out.println(" ");
		System.out.println("|----------");
		System.out.println("|         |");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println(" ");
        int NumLetras= Palavra.length();
		while(vidas>0&&NumLetras>0){
            System.out.println("A palavra tem: "+NumLetras+" letras");
            System.out.println("Você tem "+vidas+" chances");
            System.out.println("Digite uma letra: ");
            Letra= sc.next();
            while(Letra.charAt(0)==' '){
                System.out.println("Digite uma letra");
                Letra= sc.next();
            }
            for(int k=0; k<Palavra.length(); k++){
                if(Letra.charAt(0)==Palavrachare[k]){
                    check++;
                    Palavrachare[k] = ' ';
                }
            }
            if(check==0){
                vidas--;
            }else{

                NumLetras = NumLetras-check;
                check=0;
            }
            if(vidas==5){
                System.out.println("|----------");
                System.out.println("|         |");
                System.out.println("|         O");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println(" ");
            }
            if(vidas==4){
                System.out.println("|----------");
                System.out.println("|         |");
                System.out.println("|         O");
                System.out.println("|         |");
                System.out.println("|");
                System.out.println("|");
                System.out.println(" ");

            }
            if(vidas==3){
                System.out.println("|----------");
                System.out.println("|         |");
                System.out.println("|         O");
                System.out.println("|      ---|");
                System.out.println("|          ");
                System.out.println("|");
                System.out.println(" ");
            }
            if(vidas==2){
                System.out.println("|----------");
                System.out.println("|         |");
                System.out.println("|         O");
                System.out.println("|      ---|---");
                System.out.println("|          ");
                System.out.println("|");
                System.out.println(" ");
            }
            if(vidas==1){
                System.out.println("|----------");
                System.out.println("|         |");
                System.out.println("|         O");
                System.out.println("|      ---|---");
                System.out.println("|        / ");
                System.out.println("|       / ");
                System.out.println(" ");
            }
            if(check>0){
                System.out.println("Esta letra tem na palavra");
            }

        }
						if(vidas==0){System.out.println("|----------");
            System.out.println("|         |");
            System.out.println("|         O");
            System.out.println("|      ---|---");
            System.out.println("|        /| ");
            System.out.println("|       / | ");
            System.out.println(" ");
            System.out.println("VOCE PERDEU x-x");
        }
						if(vidas>0&&NumLetras==0){
            System.out.println("VOCE GANHOU :D");
        }


    }




    public static void main(String[] args) {
        excercicio6();
    }



}
