package porfolio.ut3.PrimerParcial2019Parte3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Parcial {

    public static void main(String[] args) {
        Conjunto basicoIng = cargarCurso("basico-ing.txt");
        Conjunto basicoEmp = cargarCurso("basico-emp.txt");

        Conjunto integrador101 = basicoIng.Union(basicoEmp);
        guardarEnArchivo("integrador101.txt", integrador101);

        Conjunto exigente102 = basicoIng.Interseccion(basicoEmp);
        guardarEnArchivo("exigente102.txt", exigente102);
    }

    private static Conjunto cargarCurso(String archivo) {
        Conjunto curso = new Conjunto();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                int codigoAlumno = Integer.parseInt(datos[0].trim());
                String nombreAlumno = datos[1].trim();
                Alumno alumno = new Alumno(codigoAlumno, nombreAlumno);
                curso.insertar(alumno);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return curso;
    }

    private static void guardarEnArchivo(String nombreArchivo, Conjunto conjunto) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (int i = 0; i < conjunto.longitud(); i++) {
                Alumno alumno = (Alumno) conjunto.recuperar(i);
                bw.write(alumno.getCodigo() + ", " + alumno.getNombre());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
