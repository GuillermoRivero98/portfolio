package porfolio.ut3.UT3_PD9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Casos de prueba
        String exp1 = "{}{{}}"; // Válido
        String exp2 = "{{}{{}"; // Inválido
        String exp3 = "{{{{}}}}"; // Válido
        String exp4 = "{{{{}{{}"; // Inválido
        
        // Convertir las expresiones en listas de caracteres
        List<Character> entrada1 = stringToList(exp1);
        List<Character> entrada2 = stringToList(exp2);
        List<Character> entrada3 = stringToList(exp3);
        List<Character> entrada4 = stringToList(exp4);
        
        // Probar el método controlCorchetes
        System.out.println(exp1 + " es una secuencia bien formada: " + Expresion.controlCorchetes(entrada1));
        System.out.println(exp2 + " es una secuencia bien formada: " + Expresion.controlCorchetes(entrada2));
        System.out.println(exp3 + " es una secuencia bien formada: " + Expresion.controlCorchetes(entrada3));
        System.out.println(exp4 + " es una secuencia bien formada: " + Expresion.controlCorchetes(entrada4));
    }
    
    // Método auxiliar para convertir una cadena en una lista de caracteres
    private static List<Character> stringToList(String s) {
        List<Character> list = new ArrayList<>();
        for (char c : s.toCharArray()) {
            list.add(c);
        }
        return list;
    }
}
