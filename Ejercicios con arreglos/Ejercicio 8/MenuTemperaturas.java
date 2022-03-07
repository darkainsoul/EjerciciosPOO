import Utilerias.Menu;

public class MenuTemperaturas extends Menu {
    MenuTemperaturas() {
        opciones = new String[5];
        opciones[0] = "Capturar en Centigrados";
        opciones[1] = "Capturar en Farenheit";
        opciones[2] = "Desplegar en Centigrados";
        opciones[3] = "Desplegar en Farenheit";
        opciones[4] = "Salir";
    }
}