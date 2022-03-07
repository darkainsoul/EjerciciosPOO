import Utilerias.LectorDeTeclado;

public class TemperaturaArray {
    Temperatura[] t;

    TemperaturaArray(Integer n) {
        t = new Temperatura[n];
        for (int i = 0; i < n; i++) {
            t[i] = new Temperatura();
        }
    }

    public void CapturarEnCentigrados() {
        for (int i = 0; i < t.length; i++)
            t[i].setCentigrados(LectorDeTeclado.capturarDoble("t[" + i + "] en Centígrados: "));
    }

    public void CapturarEnFarenheit() {
        for (int i = 0; i < t.length; i++)
            t[i].setEnFarenheit(LectorDeTeclado.capturarDoble("t[" + i + "] en Farenheit: "));
    }

    public void DesplegarEnCentigrados() {
        for (int i = 0; i < t.length; i++)
            System.out.println(t[i].getCentigrados() + "°C");
    }

    public void DesplegarEnFarenheit() {
        for (int i = 0; i < t.length; i++)
            System.out.println(t[i].getFarenheit() + "°F");
    }
}