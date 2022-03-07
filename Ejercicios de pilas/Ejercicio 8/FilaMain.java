import java.util.LinkedList;
import Utilerias.LectorDeTeclado;

public class FilaMain {
    public static void main(String[] args) {
        LinkedList<String> fila = new LinkedList<String>();
        String nombre;
        int opcion;
        while (true) {
            do {
                System.out.println("elige una opcion\n" +
                        "1: Agregar un nombre\n" +
                        "2: Desplegar los nombres\n" +
                        "3: Salir");
                opcion = LectorDeTeclado.capturarEntero("Opcion?");
            } while ((opcion < 1) || (opcion > 3));
            switch (opcion) {
                case 1:
                    nombre = LectorDeTeclado.leeString("Cuál es el nombre?");
                    fila.addLast(nombre);
                    break;
                case 2:
                    for (int i = 0; i < fila.size(); i++)
                        System.out.println("nombre " + (i + 1)
                                + " es: " + fila.get(i));
                    break;
                case 3:
                    System.out.println("Adios!");
                    return;
            }
        }
    }
}