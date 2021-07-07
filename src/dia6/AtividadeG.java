package dia6;

public class AtividadeG {


    public static void atividadeGrupo(){
        //swap
        //int[] array = {98,56,23,7,89,0,32,12,-89,45,32,-21,18};
        //int[] array = {11,25,12,22,64,22};
        int[] array = {78,89,45,32,12,-98,-32,-15,5,39,67,786,45,45};
        int[] sortedArray = new int[array.length];

        for(int i=0; i < array.length; i++){
            int min = array[i];
            for(int f=i; f < array.length; f++){
                if(array[f] < min){
                    int aux = min;
                    min = array[f];
                    array[f] = aux;
                }
            }

            sortedArray[i] = min;
        }

        for(int number : sortedArray){
            System.out.print(number+",");
        }
    }

    public static void main(String[] args) {
        atividadeGrupo();
    }

}
