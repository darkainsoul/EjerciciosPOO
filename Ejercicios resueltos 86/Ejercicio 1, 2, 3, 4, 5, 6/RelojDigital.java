public class RelojDigital extends Reloj {
    private Display elDisplay;

    RelojDigital(Integer h, Integer m, Integer s) {
        super(h, m, s);
        elDisplay = new Display();
        actualizarDisplay();
    }

    private void actualizarDisplay() {
        Integer h = getHora();
        if (h == 0) {
            h = 12;
        }
        elDisplay.poner(h, getMinuto(), getSegundo());
    }

    public void tic() {
        super.tic();
        actualizarDisplay();
    }

    public String toString() {
        String meridiano = "AM";
        if (!getAm()) {
            meridiano = "PM";
        }
        return "Digital: " + elDisplay.toString() + " " + meridiano;
    }
}