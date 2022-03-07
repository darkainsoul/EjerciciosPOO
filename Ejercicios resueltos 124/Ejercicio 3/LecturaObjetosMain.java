import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class LecturaObjetosMain {
    public static void main(String[] args) throws IOException, Exception {
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream("datos.bin");
            ois = new ObjectInputStream(fis);
            // Se lee el objeto Alumno
            System.out.println(ois.readObject());
            //Alumno elAlumno = (Alumno) ois.readObject();
            // Se lee el objeto Profesor
            Profesor elProfe = (Profesor) ois.readObject();
            //System.out.println(elAlumno);
            System.out.println(elProfe);
        } catch (IOException e) {
            throw e;
        } catch (ClassNotFoundException e) {
            throw e;
        } finally {
            if (ois != null) {
                ois.close();
            }
        }
    }
}