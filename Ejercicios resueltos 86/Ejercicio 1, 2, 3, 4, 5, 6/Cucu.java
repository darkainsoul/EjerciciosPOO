public class Cucu extends RelojDeManecillas {
    private Pajaro elPajarito;

    public Cucu(Integer h, Integer m, Integer s) {
        super(h, m, s);
        elPajarito = new Pajaro();
    }

    public void tic() {
        super.tic();
        if (getMinuto() == 0) {
            if ((getHora() > getSegundo())
                    || (getHora() == 0) && (getSegundo() < 12)) {
                elPajarito.canta(); // canta una vez
            }
        }
    }
}