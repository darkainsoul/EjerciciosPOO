public class Cronometro extends Reloj {
    private Display elDisplay;
    private Boolean corriendo;
    private Boolean congelado;

    public Cronometro() {
        super(0, 0, 0);
        corriendo = false;
        congelado = false;
        elDisplay = new Display();
    }

    private void reset() {
        ponerALas(0, 0, 0);
    }

    public void start() {
        corriendo = true;
    }

    public void stop() {
        corriendo = false;
    }

    public void lap() {
        if (corriendo || congelado) {
            congelado = !congelado;
        } else {
            reset();
        }
    }

    public void tic() {
        if (corriendo) {
            super.tic();
        }
        if (!congelado) {
            elDisplay.poner(getHora(), getMinuto(), getSegundo());
        }
    }

    public String toString() {
        return "Crono: " + elDisplay.toString()
                + (corriendo ? " C" : " ")
                + (congelado ? " L" : " ");
    }
}