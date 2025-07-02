package porfolio.ut1;

// Contador de palabras pd10
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ContadorDePalabras {

    // Método que devuelve un array con las palabras comunes entre dos arrays de palabras
    public String[] palabrasComunes(String[] palabras1, String[] palabras2) {
        ArrayList<String> comunes = new ArrayList<>(); // Usamos un ArrayList para almacenar las palabras comunes

        // Recorremos el primer array
        for (String palabra1 : palabras1) {
            // Recorremos el segundo array
            for (String palabra2 : palabras2) {
                // Comparamos las palabras
                if (palabra1.equals(palabra2) && !comunes.contains(palabra1)) {
                    comunes.add(palabra1); // Agregamos la palabra común si no está ya en la lista
                }
            }
        }

        // Convertimos el ArrayList a un array de Strings y lo retornamos
        return comunes.toArray(new String[0]);
    }

    // Método para leer un archivo y obtener dos líneas aleatorias
    public void leerArchivoYEjecutar(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea1 = br.readLine(); // Leemos la primera línea
            String linea2 = br.readLine(); // Leemos la segunda línea

            // Si alguna línea es null, no continuamos
            if (linea1 == null || linea2 == null) {
                System.out.println("El archivo no contiene suficientes líneas.");
                return;
            }

            // Convertimos las líneas en arrays de palabras
            String[] palabras1 = linea1.split(" ");
            String[] palabras2 = linea2.split(" ");

            // Llamamos al método palabrasComunes
            String[] resultado = palabrasComunes(palabras1, palabras2);

            // Mostramos el resultado
            System.out.println("Palabras comunes: ");
            for (String palabra : resultado) {
                System.out.println(palabra);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ContadorDePalabras contador = new ContadorDePalabras();  
        contador.leerArchivoYEjecutar("src\\main\\java\\com\\example\\entradaPD10.txt");
    }
}
