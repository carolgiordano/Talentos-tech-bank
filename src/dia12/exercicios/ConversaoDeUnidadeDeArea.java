package dia12.exercicios;

public class ConversaoDeUnidadeDeArea {

    public static final double UM_METRO_QUADRADO_EM_PES_QUADRADOS = 10.7639;

    public static final double UM_PE_QUADRADO_EM_CENTIMETROS_QUADRADOS = 929.0;

    public static final double UMA_MILHA_QUADRADA_EM_ACRES = 640.0;

    public static final double UM_ACRE_EM_PES_QUADRADOS = 43_560.0;


    public static double converteMetrosQuadradosParaPesQuadrados(double metros) {
        return metros * UM_METRO_QUADRADO_EM_PES_QUADRADOS;
    }

    public static double convertePesQuadradosParaCentimetrosQuadrados(double pes) {
        return pes * UM_PE_QUADRADO_EM_CENTIMETROS_QUADRADOS;
    }

    public static double converteMilhasQuadradosParaAcres(double milhas) {
        return milhas * UMA_MILHA_QUADRADA_EM_ACRES;
    }

    public static double converteAcresParaPesQuadrados(double acres) {
        return acres * UM_ACRE_EM_PES_QUADRADOS;
    }

}
