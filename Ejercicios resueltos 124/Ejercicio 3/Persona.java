public class Persona implements java.io.Serializable  {
    private String nombre;
    private Fecha fechaNacimiento;

    public Persona(String n, Fecha fn) {
        // para copiar un objeto se debe hacer una nueva instancia
        nombre = new String(n);
        fechaNacimiento = new Fecha(fn); // ver constructor de
        // Fecha abajo
    }

    public String toString() {
        return nombre + " nacido el: " + fechaNacimiento;
    }
}