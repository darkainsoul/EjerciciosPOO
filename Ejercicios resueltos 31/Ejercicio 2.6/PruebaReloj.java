public class PruebaReloj {
    public static void main(String[] args) {
        Reloj r = new Reloj(); // El constructor no lleva parametros
        r.visualizar();
        r.ponerALas(1, 21, 58);
        r.tic();
        r.visualizar();
        r.tic();
        r.visualizar();
    }
}