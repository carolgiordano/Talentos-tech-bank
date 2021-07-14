package br.com.techbank.semana_3.aula_13.exercicio_banco.domain;

public class Emprestimo {
    private static final double jurosCompostos = 0.0272;
    private static final int maxParcelas = 100;
    private static final int minParcelas = 10;

    public static void simularEmprestimo(double emprestimo, int numeroDeParcelas) {
        if(validarNumeroParcelas(numeroDeParcelas)){
            double montante = calculoMontanteJurosCompostos(emprestimo, numeroDeParcelas);
            double valorDaParcela = montante/numeroDeParcelas;

            System.out.printf(String.format("Para um emprestimo de %s você tera %s parcelas no valor de %.2f.", emprestimo, numeroDeParcelas, valorDaParcela));
        }
    }

    private static double calculoMontanteJurosCompostos(double emprestimo, int numeroDeParcelas){
        double montanteAhPagar = emprestimo*(Math.pow((1+jurosCompostos),numeroDeParcelas));
        return montanteAhPagar;
    }

    private static boolean validarNumeroParcelas(int numeroDeParcelas){
        if(numeroDeParcelas<10 || numeroDeParcelas>100){
            System.out.println(String.format("Número de parcelas inválido! Escolha um número entre %s e %s.", minParcelas, maxParcelas));
            return false;
        }else{
            return true;
        }
    }
}
