package porfolio.ut1;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hola");
        sb.setLength(10);
        sb.ensureCapacity(20);
        sb.append(" Mundo");
        sb.insert(5, " Querido");
        sb.delete(5, 13);
        sb.deleteCharAt(4);
        sb.reverse();

        System.out.println(sb);
    }
}

