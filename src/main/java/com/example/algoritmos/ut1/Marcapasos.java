package porfolio.ut1;

public class Marcapasos {
    // Variables optimizadas para menor consumo de memoria
    private byte presionSanguinea; // Rango 0-250 -> byte (-128 a 127) no alcanza, por lo que usamos short
    private short frecuenciaCardiaca; // Rango 0-226 -> cabe en un short (-32,768 a 32,767)
    private short nivelAzucar; // Rango 0-1000 -> cabe en un short
    
    private int maximaFuerza; // Rango 0-3,000,000,000 -> necesita int (-2,147,483,648 a 2,147,483,647)
    private float tiempoEntreLatidos; // Necesita decimales, float suficiente
    private double bateriaRestante; // Mayor precisión en decimales, usamos double
    
    private String codigoFabricante; // 8 caracteres alfanuméricos
    
    public Marcapasos(byte presionSanguinea, short frecuenciaCardiaca, short nivelAzucar, 
                      int maximaFuerza, float tiempoEntreLatidos, double bateriaRestante, String codigoFabricante) {
        this.presionSanguinea = presionSanguinea;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.nivelAzucar = nivelAzucar;
        this.maximaFuerza = maximaFuerza;
        this.tiempoEntreLatidos = tiempoEntreLatidos;
        this.bateriaRestante = bateriaRestante;
        this.codigoFabricante = codigoFabricante;
    }
    
    public static void main(String[] args) {
        int size = (Byte.BYTES * 1) + (Short.BYTES * 2) + (Integer.BYTES * 1) + (Float.BYTES * 1) + (Double.BYTES * 1);
        System.out.println("Memoria consumida por un objeto Marcapasos (sin contar el String): " + size + " bytes");
        
        // Cálculo adicional para el String (8 caracteres -> cada char usa 2 bytes en UTF-16)
        int stringSize = 8 * Character.BYTES;
        System.out.println("Memoria consumida total (incluyendo String de 8 caracteres): " + (size + stringSize) + " bytes");
    }
}

