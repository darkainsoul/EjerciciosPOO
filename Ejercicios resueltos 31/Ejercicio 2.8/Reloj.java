public class Reloj {
    ContadorCiclico h;
    ContadorCiclico m;
    ContadorCiclico s;

    public Reloj() {
        h = new ContadorCiclico(12);
        m = new ContadorCiclico(60);
        s = new ContadorCiclico(60);
    }

    public String toString() {
        return h + ":" + m + ":" + s;
    }

    public void tic() {
        if (s.incrementar() == 0) {
            if (m.incrementar() == 0) {
                h.incrementar();
            }
        }
    }

    public void ponerALas(int hora, int min, int seg) {
        h.ponerEn(hora);
        m.ponerEn(min);
        s.ponerEn(seg);
    }
}