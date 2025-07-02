package porfolio.ut3.PD12.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ProgramaPD12 {

    public static void main(String[] args) throws IOException {
        String directorioSalida = "C:\\Users\\guill\\OneDrive\\Escritorio\\porfolio\\src\\main\\java\\com\\example\\ut3\\PD12\\src\\salida\\";

        // Crear directorio de salida si no existe
        crearDirectorioSiNoExiste(directorioSalida);

        Conjunto<Alumno> basicoIng = cargarCurso("C:\\Users\\guill\\OneDrive\\Escritorio\\porfolio\\src\\main\\java\\com\\example\\ut3\\PD12\\src\\basico-ing.txt");
        Conjunto<Alumno> basicoEmp = cargarCurso("C:\\Users\\guill\\OneDrive\\Escritorio\\porfolio\\src\\main\\java\\com\\example\\ut3\\PD12\\src\\basico-emp.txt");

        Conjunto<Alumno> integrador101 = basicoIng.union(basicoEmp);
        guardarEnArchivo(directorioSalida + "integrador101.txt", integrador101);

        Conjunto<Alumno> exigente102 = basicoIng.interseccion(basicoEmp);
        guardarEnArchivo(directorioSalida + "exigente102.txt", exigente102);
    }

    private static Conjunto<Alumno> cargarCurso(String archivo) throws IOException {
        Conjunto<Alumno> curso = new Conjunto<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                int codigo = Integer.parseInt(datos[0]);
                String nombre = datos[1].trim(); // Trim para eliminar espacios en blanco
                curso.insertar(new Nodo<>(codigo, new Alumno(codigo, nombre)));
            }
        }
        return curso;
    }

    private static void guardarEnArchivo(String nombreArchivo, Conjunto<Alumno> conjunto) throws IOException {
        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            Nodo<Alumno> aux = conjunto.getPrimero();
            while (aux != null) {
                writer.write(aux.getDato().getCodigo() + "," + aux.getDato().getNombre() + "\n");
                aux = aux.getSiguiente();
            }
        }
    }

    private static void crearDirectorioSiNoExiste(String directorio) throws IOException {
        Path path = Paths.get(directorio);
        if (!Files.exists(path)) {
            Files.createDirectories(path);
        }
    }
}
