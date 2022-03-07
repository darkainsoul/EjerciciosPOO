public class PruebaReloj {
    public static void main(String[] args) {
        Reloj r = new Reloj();
        System.out.println(r);
        r.ponerALas(1, 21, 58);
        r.tic();
        System.out.println(r);
        r.tic();
        System.out.println(r);
    }
}