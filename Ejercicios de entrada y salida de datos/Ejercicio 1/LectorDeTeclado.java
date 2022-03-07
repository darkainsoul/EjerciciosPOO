import java.io.*;

public class LectorDeTeclado {
    BufferedReader reader;

    LectorDeTeclado() {
        InputStreamReader isr = new InputStreamReader(System.in);
        reader = new BufferedReader(isr);
    }

    public String capturarLinea() {
        try {
            // La captura finaliza al pulsar Enter
            return reader.readLine();
        } catch (IOException e) {
            System.err.println("Error: 0" + e.getMessage());
            return null;
        }
    }

    // Método para capturar enteros
    public Integer capturarEntero() {
        try {
            return Integer.parseInt(capturarLinea());
        } catch (NumberFormatException e) {
            System.err.println("Error 1: " + e.getMessage());
            return Integer.MIN_VALUE; // valor mas pequeño
        }
    }

    // Método para capturar flotantes
    public Float capturarFlotante() {
        try {
            return Float.parseFloat(capturarLinea());
        } catch (NumberFormatException e) {
            System.err.println("Error 2: " + e.getMessage());
            return Float.NaN; // Indica no es un numero
        }
    }

    // Metodo para capturar dobles
    public double capturarDoble() {
        try {
            return Double.parseDouble(capturarLinea());
        } catch (NumberFormatException e) {
            System.err.println("Error 3: " + e.getMessage());
            return Double.NaN; // Indica no es un numero
        }
    }
}