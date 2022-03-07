public class PruebaReloj {
    public static void main(String[] args) {
        // El constructor no lleva parametros
        Reloj r1 = new Reloj();
        // Se usa el constructor con parametros
        Reloj r2 = new Reloj(11, 24, 59);
        r1.visualizar();
        r1.tic();
        r1.visualizar();
        r2.tic();
        r2.visualizar();
    }
}