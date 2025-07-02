package porfolio.ut3.UT3_PD7;

public class PruebaConjunto {
    public static void main(String[] args) {

        IConjunto<TAlumno> cursoAED1 = new TConjunto<>();
        IConjunto<TAlumno> cursoPF = new TConjunto<>();

        TAlumno alumno1 = new TAlumno("1234", "Juan", "Perez");
        TAlumno alumno2 = new TAlumno("5678", "Maria", "Gomez");
        TAlumno alumno3 = new TAlumno("9012", "Carlos", "Lopez");
        TAlumno alumno4 = new TAlumno("3456", "Ana", "Martinez");

        cursoAED1.agregar(alumno1);
        cursoAED1.agregar(alumno2);
        cursoPF.agregar(alumno2); 
        cursoPF.agregar(alumno3);
        cursoPF.agregar(alumno4);

        IConjunto<TAlumno> union = cursoAED1.union(cursoPF);
        System.out.println("Alumnos matriculados en cualquiera de los dos cursos:");
        for (TAlumno alumno : union) {
            System.out.println(alumno);
        }

        IConjunto<TAlumno> interseccion = cursoAED1.interseccion(cursoPF);
        System.out.println("\nAlumnos matriculados en ambos cursos:");
        for (TAlumno alumno : interseccion) {
            System.out.println(alumno);
        }
    }
}
