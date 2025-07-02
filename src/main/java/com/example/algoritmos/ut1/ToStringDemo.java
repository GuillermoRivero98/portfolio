package porfolio.ut1;

public class ToStringDemo {
    public static void main(String[] args) {
        double d = 888.51;
        String s = Double.toString(d);
        int dot = s.indexOf('.');

        System.out.println(dot + " dígitos antes del punto decimal.");
        System.out.println((s.length() - dot - 1) + " dígitos después del punto decimal.");
    }
}

