public class Profesor extends Persona implements java.io.Serializable  {
    private Integer claveEmpleado;

    public Profesor(String n, Fecha f, Integer c) {
        super(n, f);
        claveEmpleado = c;
    }

    public String toString() {
        return super.toString()
                + " clave: " + claveEmpleado;
    }
}