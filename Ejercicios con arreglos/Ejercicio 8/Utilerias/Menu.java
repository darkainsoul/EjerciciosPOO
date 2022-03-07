package Utilerias;
//import LectorDeTeclado.*;
 // la pondremos dentro de un paquete hecho
// por nosotros
public abstract class Menu {
    // Las clases descendientes de Menu deberan inicializar
    // las opciones.
    // opcion[0] es la opción 1 del menu en pantalla.
    protected String[] opciones;

    public Integer opcion() {
        if (opciones.length < 1) {
            return 0;
        }
        System.out.println();
        for (int i = 0; i < opciones.length; i++) {
            System.out.println((i + 1) + ":" + opciones[i]);
        }
        System.out.println();
        Integer opcion;
        do {
            opcion = Utilerias.LectorDeTeclado.capturarEntero("Escriba la opción deseada:");
        } while (opcion < 1 || opcion > opciones.length);
        return opcion;
    }
}