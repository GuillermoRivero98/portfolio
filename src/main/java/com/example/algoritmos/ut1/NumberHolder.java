package porfolio.ut1;

/*
 * 3) Dada la siguiente clase, llamada “ContenedorDeNumeros”, escribe un programa que
cree una instancia de la clase, inicialice sus dos variables miembro yluego muestre el
valor de cada una de ellas.
public class NumberHolder {
public int anInt;
public float aFloat;
}
 */

 public class NumberHolder {
    public int anInt;
    public float aFloat;

    public static void main(String[] args) {
        NumberHolder obj = new NumberHolder(); // Se crea una instancia
        obj.anInt = 42;  // Se asigna un valor entero
        obj.aFloat = 3.14f;  // Se asigna un valor flotante

        // Mostrar valores
        System.out.println("Valor de anInt: " + obj.anInt);
        System.out.println("Valor de aFloat: " + obj.aFloat);
    }
}

