public class Reloj {
    int h;
    int m;
    int s;

    // método constructor (se llama igual que la clase)
    public Reloj() {
        h = 0;
        m = 0;
        s = 0;
    }

    public void visualizar() {
        System.out.println(h + ":" + m + ":" + s);
    }

    public void tic() {
        s++;
        if (s >= 60) {
            s = 0;
            m++;
            if (m >= 60) {
                m = 0;
                h++;
                if (h >= 12) {
                    h = 0;
                }
            }
        }
    }

    public void ponerALas(int hora, int min, int seg) {
        h = hora;
        m = min;
        s = seg;
    }
}