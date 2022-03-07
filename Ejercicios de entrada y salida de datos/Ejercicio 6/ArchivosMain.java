import java.util.Scanner;
import java.io.*;

public class ArchivosMain {
    private static int[] A;

    public static void main(String[] args) throws IOException {
        File archivoEntrada = new File("datos.txt");
        FileWriter archivoSalida = null;
        PrintWriter pw = null;
        int cont = 0;
        int dato;
        A = new int[15];
        try {
            Scanner scanner = new Scanner(archivoEntrada);
            archivoSalida = new FileWriter("salida.txt");
            pw = new PrintWriter(archivoSalida);
            while (scanner.hasNextLine()) {
                dato = scanner.nextInt();
                A[cont] = dato;
                cont++;
            }
            for (int i = cont - 1; i >= 0; i--)
                pw.println(A[i]);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (archivoSalida != null)
                archivoSalida.close();
        }
    }
}
