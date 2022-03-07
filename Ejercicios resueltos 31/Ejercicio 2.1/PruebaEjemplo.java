public class PruebaEjemplo {
    public static void main(String[] args) {
        Ejemplo e;
        Ejemplo f;
        e = new Ejemplo();
        f = new Ejemplo();
        e.a = 7;
        e.hacerAlgo();
        f.x = e.suma();
        f.a = f.x + e.a;
        e.a = f.suma();
        e.imprimir();
        f.imprimir();
    }
}