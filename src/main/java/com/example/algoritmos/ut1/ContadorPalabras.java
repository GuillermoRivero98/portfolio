package porfolio.ut1;

enum TipoCaracter {
    VOCAL, CONSONANTE, OTRO;
}

public class ContadorPalabras {
    public static TipoCaracter determinarTipo(char c) {
        c = Character.toLowerCase(c);
        if ("aeiou".indexOf(c) != -1) {
            return TipoCaracter.VOCAL;
        } else if (Character.isLetter(c)) {
            return TipoCaracter.CONSONANTE;
        }
        return TipoCaracter.OTRO;
    }

    public static void main(String[] args) {
        String frase = "Hola, mundo!";
        int vocales = 0, consonantes = 0;
        for (char c : frase.toCharArray()) {
            switch (determinarTipo(c)) {
                case VOCAL -> vocales++;
                case CONSONANTE -> consonantes++;
            }
        }
        System.out.println("Vocales: " + vocales + ", Consonantes: " + consonantes);
    }

    public void leerArchivoYEjecutar(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'leerArchivoYEjecutar'");
    }
}

