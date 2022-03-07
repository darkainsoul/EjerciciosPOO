public class Manecilla {
    private Integer numero;
    private Integer marca;

    public Manecilla(Integer n, Integer m) {
        moverAPosicion(n, m);
    }

    public void moverAPosicion(Integer n, Integer m) {
        numero = n % 12; // del 0 al 11 y después haremos que el 0
        // se "vea" como 12
        marca = m % 5;
    }

    public String toString() {
        Integer n = numero;
        if (n == 0) {
            n = 12; // para que el 0 se "vea" como 12
        }
        return n + "/" + marca;
    }
}