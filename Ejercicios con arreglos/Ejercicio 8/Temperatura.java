public class Temperatura {
    private Double centigrados;

    Temperatura() {
        centigrados = -273.0; // inicializa con el valor del cero
        // absoluto
    }

    public void setCentigrados(Double c) {
        centigrados = c;
    }

    public void setEnFarenheit(Double f) {
        centigrados = 5 / 9.0 * (f - 32);
    }

    public Double getCentigrados() {
        return centigrados;
    }

    public Double getFarenheit() {
        return 9 / 5.0 * centigrados + 32;
    }
}