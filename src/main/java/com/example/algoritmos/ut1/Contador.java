package porfolio.ut1;

/*
 * EJERCICIO 5 Bucles
Escriba una clase Contador y utilice un bucle while para mostrar el valor de una variable
contador que se incrementa de a uno.
Siga los siguientes pasos para crear su clase:
1. Cree una clase llamada contador con tres atributos llamados: MAX_CONT, incremento
y contador. Asigne el valor 50 a MAX_CONT y el valor 1 a contador e incremento.
Asegúrese de declarar MAX_CONT como una variable "final".
2. Cree un método público mostrarContador en la clase, que no reciba parámetros y
retorne void. Por ejemplo:
public void displayCount()
3. Cree un bucle while en el método con las siguientes características:
a. Expresión booleana: Repita si el valor de contador es menor o igual que el
valor de MAX_CONT.
b. Bloque de código:
i. Imprima el valor de la variable contador.
ii. Incremente el valor de la variable contador con el valor de incremento.
Por ejemplo: contador = contador + incremento;
4. ejecute el archivo Contador.java y observe los valores emitidos.
5. Reescriba el algoritmo de manera de usar una sentencia do-while. Verifique que hace
lo mismo.
6. Reescriba el algoritmo de manera de usar una sentencia for. Verifique que hace lo
mismo.
 */

public class Contador {
    private static final int MAX_CONT = 50;
    private int contador = 1;
    private int incremento = 1;

    public void mostrarContador() {
        while (contador <= MAX_CONT) {
            System.out.println(contador);
            contador += incremento;
        }
    }

    public void mostrarContadorDoWhile() {
        contador = 1;
        do {
            System.out.println(contador);
            contador += incremento;
        } while (contador <= MAX_CONT);
    }

    public void mostrarContadorFor() {
        for (int i = 1; i <= MAX_CONT; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Contador c = new Contador();
        System.out.println("Usando while:");
        c.mostrarContador();

        System.out.println("Usando do-while:");
        c.mostrarContadorDoWhile();

        System.out.println("Usando for:");
        c.mostrarContadorFor();
    }
}
