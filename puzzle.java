import java.math.BigInteger;

public class puzzle {

        final static BigInteger M = new BigInteger("2021");

        private static String compute(long n) {
            //Es un problema de aritmetica modular. Para acelerar la convergencia de una serie de la que vamos a buscar
            //finalmente su modulo simplemente buscamos el modulo de cada operando y hacemos las operaciones con ellos
            //trato de mantener lo maximo posible del ejemplo del puzzle.
            String s = "";
            String a = new BigInteger(String.valueOf(n)).mod(M).toString(10);
            //System.out.println("a = " + a);
            for (long i = 0; i < Integer.parseInt(a); i++) {
                s = s + n;
                s = new BigInteger(s).mod(M).toString(10);
                //System.out.println("s = " + s);
            }

            return s;
        }

        public static void main(String args[]) {
            for (long n : new long[] { 1L, 2L, 5L, 10L, 20L, 67489454811002199L }) {
                System.out.println("" + n + ": " + compute(n));
            }
        }

}
