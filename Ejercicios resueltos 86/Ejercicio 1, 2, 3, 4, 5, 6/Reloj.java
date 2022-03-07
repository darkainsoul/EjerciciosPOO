public abstract class Reloj {
    private ContadorCiclico hora;
    private ContadorCiclico minuto;
    private ContadorCiclico segundo;
    private Boolean am;

    public Reloj(Integer h, Integer m, Integer s) {
        ponerALas(h, m, s);
    }

    public void ponerALas(Integer h, Integer m, Integer s) {
        hora = new ContadorCiclico(h, 12);
        minuto = new ContadorCiclico(m, 60);
        segundo = new ContadorCiclico(s, 60);
        am = h < 12;
    }

    public void tic() {
        if (segundo.incrementar() == 0) {
            if (minuto.incrementar() == 0) {
                if (hora.incrementar() == 0) {
                    am = !am;
                }
            }
        }
    }

    public Integer getHora() {
        return hora.getCuenta();
    }

    public Integer getMinuto() {
        return minuto.getCuenta();
    }

    public Integer getSegundo() {
        return segundo.getCuenta();
    }

    public Boolean getAm() {
        return am;
    }
}