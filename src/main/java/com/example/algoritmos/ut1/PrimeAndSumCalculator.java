package porfolio.ut1;

public class PrimeAndSumCalculator {

    // Método que verifica si un número es primo
    public static boolean isPrime(long n) {
        if (n <= 1) return false; // Números menores o iguales a 1 no son primos
        if (n == 2) return true; // 2 es primo
        if (n % 2 == 0) return false; // Números pares mayores que 2 no son primos

        // Verificamos divisibilidad desde 3 hasta la raíz cuadrada de n
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false; // Si es divisible, no es primo
            }
        }
        return true; // Si no se encontró ningún divisor, es primo
    }

    // Método que calcula la suma de números pares o impares
    public static long calculateSum(long n) {
        long suma = 0;
        long i = 0;

        // Si el número es primo, sumamos pares; si no, sumamos impares
        if (isPrime(n)) {
            while (i <= n) {
                suma += i; // Sumar el número par
                i += 2; // Incrementar de 2 en 2 para obtener solo pares
            }
        } else {
            while (i <= n) {
                suma += i; // Sumar el número impar
                i += 2; // Incrementar de 2 en 2 para obtener solo impares
            }
        }
        return suma; // Retornamos la suma calculada
    }

    public static void main(String[] args) {
        // Ejemplo de uso del método
        long numero = 10; // Cambiar este valor para probar otros números
        boolean primo = isPrime(numero);
        long suma = calculateSum(numero);
        
        System.out.println("El número " + numero + (primo ? " es primo." : " no es primo."));
        System.out.println("La suma es: " + suma);
    }
}
