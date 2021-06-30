package dia1;

public class Revisão {

    public static void main(String[] args) {
        short s = 123;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        double d2 = 100.00;
        float f2 = (float) d2;
        long l2 = (long) f2;
        int i2 = (int) l2;
        short s2 = (short) i2;

        System.out.println(s2);

        int maiorInteiroA = 2147483647;
        int maiorInteiroB = 2147483647;

        int resultado = maiorInteiroA + maiorInteiroB;
        System.out.println((resultado);

        long resultLong = (long) maiorInteiroA + (long) maiorInteiroB;
        long resultLong3 = maiorInteiroA * 1L + maiorInteiroB * 1L;
        System.out.println(resultLong);
        System.out.println(resultLong3);
        
    }
}
