package porfolio.ut1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void imprimirTablero(int largo, int ancho) {
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print((i % 2 == 0) ? "# " : " #");
            }
            System.out.println();
        }
    }

    public static void leerEntradaArchivo(String rutaArchivo) {
        InputStream input = Main.class.getResourceAsStream("/com/example/entrada.txt");
        if (input == null) {
            System.out.println("Archivo no encontrado");
            return;
        }
        try (BufferedReader br = new BufferedReader(new InputStreamReader(input))) {
            int entero = Integer.parseInt(br.readLine());
            double flotante = Double.parseDouble(br.readLine());
            String cadena = br.readLine();

            System.out.println("El entero leído es: " + entero);
            System.out.println("El número de punto flotante es: " + flotante);
            System.out.println("La cadena leída es \"" + cadena + "\"");
            System.out.println("¡Hola " + cadena + "! La suma de " + entero + " y " + flotante + " es "
                    + (entero + flotante) + ".");
            System.out.println("La división entera de " + flotante + " y " + entero + " es " + (int) (flotante / entero)
                    + " y su resto es " + (flotante % entero) + ".");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static void leerEntradaStdin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = scanner.nextDouble();
        double area = Math.PI * radio * radio;
        double perimetro = 2 * Math.PI * radio;
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }

    public static void transformarTextoT9(String rutaArchivo) {
        Map<Character, String> t9Map = Map.ofEntries(
                Map.entry('A', "2"), Map.entry('B', "2"), Map.entry('C', "2"),
                Map.entry('D', "3"), Map.entry('E', "3"), Map.entry('F', "3"),
                Map.entry('G', "4"), Map.entry('H', "4"), Map.entry('I', "4"),
                Map.entry('J', "5"), Map.entry('K', "5"), Map.entry('L', "5"),
                Map.entry('M', "6"), Map.entry('N', "6"), Map.entry('O', "6"),
                Map.entry('P', "7"), Map.entry('Q', "7"), Map.entry('R', "7"), Map.entry('S', "7"),
                Map.entry('T', "8"), Map.entry('U', "8"), Map.entry('V', "8"),
                Map.entry('W', "9"), Map.entry('X', "9"), Map.entry('Y', "9"), Map.entry('Z', "9"),
                Map.entry(' ', "0"), Map.entry('.', "1"));

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
                BufferedWriter bw = new BufferedWriter(new FileWriter("salida.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                StringBuilder resultado = new StringBuilder();
                for (char c : linea.toUpperCase().toCharArray()) {
                    resultado.append(t9Map.getOrDefault(c, ""));
                }
                bw.write(resultado.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }
    }

    public static void transformarT9Texto(String rutaArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
                BufferedWriter bw = new BufferedWriter(new FileWriter("salida.txt"))) {
            String linea = br.readLine();
            if (linea != null) {
                String invertida = new StringBuilder(linea).reverse().toString();
                transformarTextoT9(invertida);
            }
        } catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }
    }

    public static int[] multiplicarVectores(int[] vector1, int[] vector2) {
        if (vector1.length != vector2.length) {
            throw new IllegalArgumentException("Los vectores deben tener la misma longitud");
        }
        int[] resultado = new int[vector1.length];
        for (int i = 0; i < vector1.length; i++) {
            resultado[i] = vector1[i] * vector2[i];
        }
        return resultado;
    }

    public static void main(String[] args) {
        // Ejemplo de ejecución
        imprimirTablero(7, 7);
        leerEntradaArchivo("/com/example/entrada.txt");
        leerEntradaStdin();
        transformarTextoT9("entrada.txt");
    }
}
