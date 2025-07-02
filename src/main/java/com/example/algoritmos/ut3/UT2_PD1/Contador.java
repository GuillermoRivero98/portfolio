package porfolio.ut3.UT2_PD1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Contador {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(
                    "C:\\Users\\guill\\OneDrive\\Escritorio\\porfolio\\src\\main\\java\\com\\example\\ut3\\UT2_PD1\\n" + //
                            "umeros.txt"));
            int N = Integer.parseInt(reader.readLine());
            int[] arreglo = new int[N];
            for (int i = 0; i < N; i++) {
                arreglo[i] = Integer.parseInt(reader.readLine());
            }
            int contadorSi = 0;

            // Implementación del algoritmo del ejercicio 1 con contador de veces "si"
            for (int i = 0; i < N - 1; i++) {
                for (int j = N - 1; j > i; j--) {
                    contadorSi++;
                    if (arreglo[j] < arreglo[j - 1]) {
                        int temp = arreglo[j];
                        arreglo[j] = arreglo[j - 1];
                        arreglo[j - 1] = temp;
                    }
                }
            }

            // Mostrar resultados
            System.out.println("Largo N: " + N);
            System.out.println("Contador del si: " + contadorSi);
            System.out.println("Primer número: " + arreglo[0]);
            System.out.println("Último número: " + arreglo[N - 1]);

            reader.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
