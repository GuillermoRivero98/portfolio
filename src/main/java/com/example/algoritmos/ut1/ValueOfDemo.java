package porfolio.ut1;

public class ValueOfDemo {
    public static void main(String[] args) {
        if (args.length == 2) {
            float a = Float.valueOf(args[0]);
            float b = Float.valueOf(args[1]);

            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a * b = " + (a * b));
            System.out.println("a / b = " + (a / b));
            System.out.println("a % b = " + (a % b));
        } else {
            System.out.println("Este programa requiere dos argumentos en la línea de comandos.");
        }
    }
}
