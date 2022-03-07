public class TemperaturasMain {

    public static void main(String[] args) {
        TemperaturaArray t = new TemperaturaArray(5);
        MenuTemperaturas menu = new MenuTemperaturas();
        while (true) {
            Integer opcion = menu.opcion();
            switch (opcion) {
                case 1:
                    t.CapturarEnCentigrados();
                    break;
                case 2:
                    t.CapturarEnFarenheit();
                    break;
                case 3:
                    t.DesplegarEnCentigrados();
                    break;
                case 4:
                    t.DesplegarEnFarenheit();
                    break;
                case 5:
                    System.out.println("adios");
                    return;
            }
        }
    }
}