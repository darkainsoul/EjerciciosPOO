public class Manecilla {
    private Integer numero;
    private Integer marca;
    private Double largo;
    private Double ancho;

    public Manecilla(Double l, Double a, Integer n, Integer m) {
        largo = l;
        ancho = a;
        moverAPosicion(n, m);
    }

    public void moverAPosicion(Integer n, Integer m) {
        numero = n % 12; // del 0 al 11 y despues haremos que el 0
        // se "vea" como 12
        marca = m % 5;
    }

    public String toString() {
        Integer n = numero;
        if (n == 0) {
            n = 12; // para que el 0 se "vea" como 12
        }
        return n + "/" + marca
                + " largo:" + largo + " ancho:" + ancho;
    }
}