public class ContadorCiclico {
    int cuenta;
    int max;

    // Constructor
    public ContadorCiclico(int m) {
        max = m;
        cuenta = 0;
    }

    public void ponerEn(int c) {
        cuenta = c;
    }

    public int incrementar() {
        cuenta = (cuenta + 1) % max;
        return cuenta;
    }

    public String toString() {
        return Integer.toString(cuenta);
    }
}