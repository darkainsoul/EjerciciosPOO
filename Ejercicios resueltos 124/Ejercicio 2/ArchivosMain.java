import java.util.Scanner;
import java.io.*;

public class ArchivosMain {
    public static void main(String[] args) {
        PrintWriter pw = null;
        try {
            File archivoEntrada = new File("datos.txt");
            FileWriter archivoSalida = new FileWriter("salida.txt");
            Scanner scanner = new Scanner(archivoEntrada);
            pw = new PrintWriter(archivoSalida);
            int cont = 0;
            while (scanner.hasNextLine()) {
                // Leemos el dato del archivo
                int dato = scanner.nextInt();
                cont++;
                // Guardamos el dato en el archivo de salida
                pw.println("se guardo el dato " + cont + ": " + dato);
                // Desplegamos el dato en pantalla
                System.out.println("se guardo el dato " + cont
                        + " : " + dato);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (pw != null)
                pw.close();
        }
    }
}
