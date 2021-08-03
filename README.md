# java-puzzle

## puzzle encontrado en una web de ofertas de trabajo IT, me gustó y lo copié para resolverlo.

¡Desafío para desarrolladores!Si te interesa participar postulate a la búsqueda, para luego poder enviar la solución del siguiente puzzle.¿Podrías decirnos cuál es el resultado de ejecutar el siguiente código? (suponiendo que la máquina tiene los recursos suficientes para terminar de ejecutarlo). Por favor no olvides comentarnos cuál fue tu razonamiento para llegar al resultado.
`
import java.math.BigInteger;

class Puzzle { 

    final static BigInteger M = new BigInteger("2021");

    private static BigInteger compute(long n) { String s = "";
    
    for (long i = 0; i < n; i++) { 
        s = s + n;
    } 

    return new BigInteger(s.toString()).mod(M); 
} 

public static void main(String args[]) { 
for (long n : new long[] { 1L, 2L, 5L, 10L, 20L, 67489454811002199L }) { 
    System.out.println("" + n + ": " + compute(n)); 
    } 
  }
}
`
Si lo corremos como esta te empacha la maquina.
