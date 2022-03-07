import Utilerias.Menu;

public class MenuListas extends Menu {
    MenuListas() {
        opciones = new String[4];
        opciones[0] = "Agregar elemento al principio";
        opciones[1] = "Agregar elemento al final";
        opciones[2] = "Desplegar todos los elementos de la lista";
        opciones[3] = "Salir";
    }
}