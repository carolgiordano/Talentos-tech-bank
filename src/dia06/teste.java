package dia6;

public class teste {

    public static void exercicio03() {
        int[] lista = {50, 30, 25, 80, 2, 7, 30, 20};
        int menor;
        for (int i = 0; i < lista.length -1; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[j] < lista[i]) {
                    menor = lista[j];
                    lista[j] = lista[i];
                    lista[i] = menor;
                }
            }
        }
        for (int valor : lista) {
            System.out.println(valor);
        }
    }

    public static void main(String[] args) {
        exercicio03();
    }
}
