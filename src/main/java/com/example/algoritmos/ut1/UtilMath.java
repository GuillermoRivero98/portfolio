package porfolio.ut1;

public class UtilMath {

    // Ejercicio 1: Método para calcular el factorial de un número entero
    public static int factorial(int num) {
        // condiciones de borde
        if (num < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo.");
        }
        if (num == 0 || num == 1) {
            return 1; // El factorial de 0 y 1 es 1
        }

        int resultado = 1; 
        // bucle for para calcular el factorial
        for (int i = 2; i <= num; i++) {
            resultado *= i; // Multiplicamos el resultado por i
        }
        return resultado; // Retornamos el resultado final
    }

    // Ejercicio 2: Método para verificar si un número es primo y calcular la suma
    public static void verificarPrimoYCalcularSuma(int num) {
        // Verificamos si el número es primo
        boolean esPrimo = isPrime(num);
        int suma = 0;

        // Si es primo, sumamos los números pares; si no, sumamos los impares
        if (esPrimo) {
            int i = 0;
            while (i <= num) {
                suma += i; // Sumar el número par
                i += 2; // Incrementar de 2 en 2 para obtener solo pares
            }
            System.out.println("El número " + num + " es primo.");
            System.out.println("La suma de los números pares desde 0 hasta " + num + " es: " + suma);
        } else {
            int i = 1;
            while (i <= num) {
                suma += i; // Sumar el número impar
                i += 2; // Incrementar de 2 en 2 para obtener solo impares
            }
            System.out.println("El número " + num + " no es primo.");
            System.out.println("La suma de los números impares desde 0 hasta " + num + " es: " + suma);
        }
    }

    // Método auxiliar para verificar si un número es primo
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

    public static void main(String[] args) {
        // Ejemplo de uso del método factorial
        int numeroFactorial = 5; 
        int resultadoFactorial = factorial(numeroFactorial);
        System.out.println("El factorial de " + numeroFactorial + " es: " + resultadoFactorial);

        // Ejemplo de uso del método verificarPrimoYCalcularSuma
        int numeroPrimo = 10; 
        verificarPrimoYCalcularSuma(numeroPrimo);
    }
}
