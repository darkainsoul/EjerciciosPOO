public class Display {
    private String[] par; // arreglo de pares de digitos

    public Display() {
        par = new String[3];
        poner(0, 0, 0);
    }

    public void poner(Integer h, Integer m, Integer s) {
        Integer[] num = { h, m, s };
        for (int i = 0; i < 3; i++) {
            num[i] = num[i] % 100; // para asegurar un numero valido
            if (num[i] < 0) {
                num[i] = -num[i];
            }
            if (num[i] < 10) {
                par[i] = "0" + num[i].toString();
            } else {
                par[i] = num[i].toString();
            }
        }
    }

    public String toString() {
        return par[0] + ":" + par[1] + ":" + par[2];
    }
}