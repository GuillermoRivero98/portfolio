package porfolio.ut1;

/*
 * EJERCICIO 4
Ingrese el siguiente código fuente en su proyecto (una clase “Alumno” y varios métodos
independientes, que no son de la clase “Alumno”) :
public class Alumno {
private String nombre;
public Alumno () {
nombre = null;
}
public String getNombreAdmiracion() {
return nombre.concat("!");
}
public static void main (String[] args) {
Alumno alumno = new Alumno();
System.out.println(alumno.getNombreAdmiracion());
}
}
public static int recorrer (String cadena) {
int res = 0;
for (int i = 1; i <= cadena.length(); i++) {
if (cadena.charAt(i) != ' ') {
res++;
}
}
return res;
}
public static int getValor() {
int vector[] = { 6, 16, 26,36,46,56,66,76 };
int idx = 8;
return vector[idx];
}
public static char getPrimerCaracter(String palabra) {
String string[] = new String[5];
return (string[1].charAt(1));
}
public static String paraAString(int a) {
Object x1 = new Integer(a);
return (String) (x1) ;
}
a) Indicar el error al ejecutar la clase Alumno y corregirlo. ¿cómo lo detectaste?
b) Indicar el error al ejecutar el método “recorrer” y corregirlo. ¿cómo lo detectaste?
c) Indicar el error al ejecutar el método “getValor” y corregirlo. ¿cómo lo detectaste?
d) Indicar el error al ejecutar el método “getPrimerCaracter” y corregirlo. ¿cómo lo detectaste?
e) Indicar el error al ejecutar el método “paraAString” y corregirlo. ¿cómo lo detectaste?
 */
public class Alumno {
    private String nombre;

    public Alumno() {
        nombre = ""; // Se inicializa como una cadena vacía para evitar NullPointerException
    }

    public String getNombreAdmiracion() {
        return nombre.concat("!");
    }

    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        System.out.println(alumno.getNombreAdmiracion()); 
    }


    // Método corregido recorrer (Error de indice fuera de rango)
    public static int recorrer(String cadena) {
        int res = 0;
        for (int i = 0; i < cadena.length(); i++) { // Se cambio el indice para empezar en 0
            if (cadena.charAt(i) != ' ') {
                res++;
            }
        }
        return res;
    }

    // Metodo corregido getValor (Error de índice fuera del rango del array)
    public static int getValor() {
        int vector[] = { 6, 16, 26, 36, 46, 56, 66, 76 };
        int idx = 7; // Se cambio el indice de 8 a 7, que es el ultimo valido
        return vector[idx]; 
    }

    // Metodo corregido getPrimerCaracter (Error de NullPointerException)
    public static char getPrimerCaracter(String palabra) {
        if (palabra.length() > 1) {
            return palabra.charAt(1);
        }
        return '\0'; // Devuelve un carácter nulo en caso de error
    }

    // Metodo corregido paraAString (Error de ClassCastException)
    public static String paraAString(int a) {
        return String.valueOf(a); // Se usa el metodo adecuado para conversion a String
    }

}