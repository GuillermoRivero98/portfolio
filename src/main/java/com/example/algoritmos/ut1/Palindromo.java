package porfolio.ut1;

public class Palindromo {
    public static boolean esPalindromo(String frase) {
        String limpia = frase.replaceAll("[^a-zA-Z]", "").toLowerCase();
        return new StringBuilder(limpia).reverse().toString().equals(limpia);
    }

    public static void main(String[] args) {
        System.out.println(esPalindromo("Anita lava la tina")); // true
        System.out.println(esPalindromo("Hola mundo")); // false
    }
}

