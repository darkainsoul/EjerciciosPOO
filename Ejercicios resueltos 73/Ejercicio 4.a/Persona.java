public abstract class Persona {
    private String nombre;
    private Fecha fechaNacimiento;

    public Persona(String n, Fecha fn) {
        nombre = n;
        fechaNacimiento = new Fecha(fn);
    }

    public String toString() {
        return nombre + " nacido el: " + fechaNacimiento;
    }
}