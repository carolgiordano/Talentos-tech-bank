package dia2;

public class main {

    public static void main(String[] args) {
        int idade = 18;
        boolean teste = idade >= 18;

        System.out.println(teste);


        int idade2 = 17;
        if (idade >= 18) {
            System.out.println("Você tem permissão para assistir esse conteúdo");

        } else {
            System.out.println("Você não tem permissão para assistir esse conteúdo");
        }

        if (idade < 0) {
            System.out.println("Idade inválida");
        } else if (idade >= 150) {
            System.out.println("Idade inválida");
        }
        if (idade2 < 0) {
            System.out.println("Idade inválida");
        } else if (idade2 >= 150) {
            System.out.println("Idade inválida");
        }
    }



}
