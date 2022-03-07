public class Alumno {
    String nombre;
    Double calific;
    Integer matricula;

    public Alumno(String nom, Double cal, Integer matr) {
        nombre = nom;
        calific = cal;
        matricula = matr;
    }

    public String toString() {
        return nombre
                + " matricula: " + matricula + " tiene: " + calific;
    }
}