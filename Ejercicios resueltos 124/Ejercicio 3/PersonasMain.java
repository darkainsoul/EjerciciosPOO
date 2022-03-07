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
        // crear persona
        f.asignar(1975, 9, 28);
        n = "Tercera persona";
        Persona unaPersona = new Persona(n, f);
        // imprimir los objetos
        System.out.println(elAlumno);
        System.out.println(elProfe);
        System.out.println(unaPersona);
    }
}