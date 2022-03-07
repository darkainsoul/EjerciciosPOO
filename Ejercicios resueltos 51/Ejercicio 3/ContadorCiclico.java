public class ContadorCiclico {
    private Integer cuenta;
    private Integer max;

    public ContadorCiclico(Integer c, Integer m) {
        cuenta = c % m;
        max = m;
    }

    public Integer incrementar() {
        cuenta = (cuenta + 1) % max;
        return cuenta;
    }

    public Integer getCuenta() {
        return cuenta;
    }

    public Integer getMax() {
        return max;
    }
}