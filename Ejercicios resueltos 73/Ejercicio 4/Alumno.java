public class Alumno extends Persona {
    private String matricula;

    public Alumno(String n, Fecha f, String m) {
        super(n, f);
        matricula = new String(m);
    }

    public String toString() {
        return super.toString()
                + " mat: " + matricula;
    }
}