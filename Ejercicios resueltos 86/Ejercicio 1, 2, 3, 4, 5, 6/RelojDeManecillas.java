public class RelojDeManecillas extends Reloj {
    private Manecilla horario;
    private Manecilla minutero;
    private Manecilla segundero;

    RelojDeManecillas(Integer h, Integer m, Integer s) {
        super(h, m, s); // la clase Reloj inicializa los contadores
        // Calcula la posicion de las manecillas respecto a
        // los números en caratula del reloj (0..11)
        // y a las marcas entre ellos (0..4, con 0 es en el número)
        horario = new Manecilla(getHora(), getMinuto() / 12);
        minutero = new Manecilla(getMinuto() / 5, getMinuto() % 5);
        segundero = new Manecilla(getSegundo() / 5, getSegundo() % 5);
    }

    public void tic() {
        super.tic(); // Reloj tiene el funcionamiento de
        // los contadores
        // Se agrega el comportamiento de las manecillas
        horario.moverAPosicion(getHora(), getMinuto() / 12);
        minutero.moverAPosicion(getMinuto() / 5, getMinuto() % 5);
        segundero.moverAPosicion(getSegundo() / 5,
                getSegundo() % 5);
    }

    public String toString() {
        return "Manec: h:" + horario
                + " m:" + minutero
                + " s:" + segundero;
    }
}