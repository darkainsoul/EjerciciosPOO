import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class EscrituraObjetosMain {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = null;
        // Se crea un alumno
        Alumno elAlumno = new Alumno("Eloy Mata Arce",
                new Fecha(1990, 2, 1),
                "2008112233");
        // Se crea un profesor
        Profesor elProfe = new Profesor("Elmer Homero Petatero",
                new Fecha(1987, 12, 11),
                23245);
        try {
            FileOutputStream fos = new FileOutputStream("datos.bin");
            oos = new ObjectOutputStream(fos);
            // Se escribe el objeto Alumno
            oos.writeObject(elAlumno);
            // Se escribe el objeto Profesor
            oos.writeObject(elProfe);
        } catch (IOException e) {
            throw e;
        } finally {
            if (oos != null) {
                oos.close();
            }
        }
    }
}