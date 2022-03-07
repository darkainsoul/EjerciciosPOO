import java.util.LinkedList;

public class ListasLigadasMain {
    public static void main(String[] args) {
        // hacer una lista de Alumnos
        LinkedList<Alumno> listaAlumnos = new LinkedList<Alumno>();
        Alumno alumno1 = new Alumno("Pedro Martinez", 9.8, 943012);
        listaAlumnos.addFirst(alumno1);
        Alumno alumno2 = new Alumno("Eleazar Hernandez", 8.5, 274901);
        listaAlumnos.addFirst(alumno2);
        Alumno alumno3 = new Alumno("Obdulia Garcia", 7.3, 204117);
        listaAlumnos.addFirst(alumno3);
        // desplegar la lista
        desplegarLista(listaAlumnos);
    }

    public static void desplegarLista(LinkedList l) {
        for (int i = 0; i < l.size(); i++)
            System.out.println(l.get(i));
    }
}