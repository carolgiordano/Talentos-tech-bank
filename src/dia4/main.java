package dia4;

public class main {

    public static void main(String[] args) {

        System.out.println("WHITE");
        int contagem = 1;

        while (contagem < 11) {
            System.out.println(contagem);
            contagem++;
        }

        System.out.println("DO WHITE");
        int contagem2 = 1;

        do {
            System.out.println(contagem);
            contagem++;
        } while (contagem < 11);


    }
}
