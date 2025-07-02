package porfolio.ut1;

public class FactorialCalculator {

    // Método que calcula el factorial de un número entero
    public static int factorial(int num) {
        // Verificación de condiciones de borde
        if (num < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo.");
        }
        if (num == 0 || num == 1) {
            return 1; // El factorial de 0 y 1 es 1
        }

        int resultado = 1; // Inicializamos el resultado
        // Usamos un bucle for para calcular el factorial
        for (int i = 2; i <= num; i++) {
            resultado *= i; // Multiplicamos el resultado por i
        }
        return resultado; // Retornamos el resultado final
    }

    public static void main(String[] args) {
        // Ejemplo de uso del método factorial
        int numero = 3; // Cambiar este valor para probar otros números
        int resultado = factorial(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }
}
