package Utilerias;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LectorDeTeclado {
    private static InputStreamReader isr = new InputStreamReader(System.in);
    private static BufferedReader reader = new BufferedReader(isr);

    public static String leeString(String mensaje) {
        try {
            System.out.println(mensaje);
            // La entrada finaliza al pulsar Enter
            return reader.readLine();
        } catch (IOException e) {
            System.err.println("Error: 0: " + e.getMessage());
            return null;
        }
    }

    // Metodo para capturar enteros
    public static Integer capturarEntero(String mensaje) {
        try {
            return Integer.parseInt(leeString(mensaje));
        } catch (NumberFormatException e) {
            System.err.println("Error 1: " + e.getMessage());
            return Integer.MIN_VALUE; // valor mas pequeño
        }
    }
    
    public static double capturarDoble(String mensaje) {
        try {
            return Double.parseDouble(leeString(mensaje));
        } catch (NumberFormatException e) {
            System.err.println("Error 3: " + e.getMessage());
            return Double.NaN; // Indica no es un numero;
        }
    }

    // Metodo para capturar dobles
    public static Double[] capturarArrDoble(String mensaje) {
        Integer tamanio = capturarEntero("¿cuantos elementos hay en el arreglo?");
        if (tamanio < 1) {
            return null;
        }
        Double[] datos = new Double[tamanio];
        for (int i = 0; i < datos.length; i++) {
            datos[i] = capturarDoble(mensaje + "[" + i + "]= ");
        }
        return datos;
    }
}