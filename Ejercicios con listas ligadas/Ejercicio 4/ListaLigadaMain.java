import Utilerias.*;

import java.util.LinkedList;

public class ListaLigadaMain {
    public static void main(String[] args) {
        LinkedList<Alumno> listaAlumnos = new LinkedList<Alumno>();
        Alumno objeto;
        MenuListas menu = new MenuListas();
        while (true) {
            Integer opcion = menu.opcion();
            switch (opcion) {
                case 1:
                    objeto = capturarAlumno();
                    listaAlumnos.addFirst(objeto);
                    break;
                case 2:
                    objeto = capturarAlumno();
                    listaAlumnos.addLast(objeto);
                    break;
                case 3:
                    desplegarLista(listaAlumnos);
                    break;
                case 4:
                    System.out.println("adios");
                    return;
            }
        }
    }

    public static void desplegarLista(LinkedList lista) {
        for (int i = 0; i < lista.size(); i++)
            System.out.println(lista.get(i));
    }

    public static Alumno capturarAlumno() {
        return new Alumno(
                LectorDeTeclado.leeString("Nombre?"),
                LectorDeTeclado.capturarDoble("Calificacion?"),
                LectorDeTeclado.capturarEntero("Matricula?"));
    }
}