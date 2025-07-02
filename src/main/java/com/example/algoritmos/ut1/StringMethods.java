package porfolio.ut1;

public class StringMethods {
    public static void main(String[] args) {
        String texto = "  Java es Genial!  ";

        System.out.println(texto.substring(5)); // "es Genial!  "
        System.out.println(texto.split(" ")[1]); // "es"
        System.out.println(texto.subSequence(2, 8)); // "Java e"
        System.out.println(texto.trim()); // "Java es Genial!"
        System.out.println(texto.toLowerCase()); // "  java es genial!  "
        System.out.println(texto.toUpperCase()); // "  JAVA ES GENIAL!  "
        System.out.println(texto.indexOf('e')); // 6
        System.out.println(texto.lastIndexOf('a')); // 12
        System.out.println(texto.contains("Genial")); // true
        System.out.println(texto.replace("Java", "Python")); // "  Python es Genial!  "
        System.out.println(texto.replaceAll("\\s", "_")); // "__Java_es_Genial!__"
        System.out.println(texto.replaceFirst("\\s", "*")); // "* Java es Genial!  "
    }
}

