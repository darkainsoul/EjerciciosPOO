public class RelojesMain {
    // Este metodo llama n veces al metodo tic de cada reloj que
    // recibe como parametro
    private static void tic(Cucu reloj1, Cronometro reloj2,
            RelojDigital reloj3, Integer n) {
        for (int i = 0; i < n; i++) {
            reloj1.tic();
            reloj2.tic();
            reloj3.tic();
            System.out.println(reloj1 + "\t\t\t"
                    + reloj2 + "\t\t\t"
                    + reloj3);
        }
    }

    public static void main(String[] args) {
        // Hace varias pruebas con tres objetos derivados de Reloj
        Cucu reloj1 = new Cucu(2, 59, 59);
        Cronometro reloj2 = new Cronometro();
        RelojDigital reloj3 = new RelojDigital(11, 58, 57);
        tic(reloj1, reloj2, reloj3, 5);
        reloj2.start();
        tic(reloj1, reloj2, reloj3, 5);
        reloj2.lap();
        tic(reloj1, reloj2, reloj3, 5);
        reloj2.lap();
        tic(reloj1, reloj2, reloj3, 5);
        reloj2.stop();
        tic(reloj1, reloj2, reloj3, 5);
        reloj2.start();
        tic(reloj1, reloj2, reloj3, 5);
        reloj2.lap();
        tic(reloj1, reloj2, reloj3, 5);
        reloj2.stop();
        tic(reloj1, reloj2, reloj3, 5);
        reloj2.lap();
        tic(reloj1, reloj2, reloj3, 5);
        reloj2.start();
        tic(reloj1, reloj2, reloj3, 5);
        reloj2.stop();
        tic(reloj1, reloj2, reloj3, 5);
        reloj2.lap();
        tic(reloj1, reloj2, reloj3, 5);
    }
}