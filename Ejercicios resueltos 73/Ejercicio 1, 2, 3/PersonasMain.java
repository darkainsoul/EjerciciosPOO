public class PersonasMain {
    public static void main(String[] args) {
        Fecha f = new Fecha(1990, 2, 1);
        String n;
        n = "Eloy Mata Arce";
        // crear alumno
        Alumno elAlumno = new Alumno(n, f, "2008112233");
        // crear profesor
        f.asignar(1987, 12, 11);
        n = "Elmer Homero Petatero";
        Profesor elProfe = new Profesor(n, f, 23245);
        // imprimir los dos objetos
        System.out.println(elAlumno);
        System.out.println(elProfe);
    }
}