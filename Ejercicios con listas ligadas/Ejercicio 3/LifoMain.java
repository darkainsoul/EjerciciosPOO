import java.util.LinkedList;
import Utilerias.LectorDeTeclado; //Paquete con la clase

public class LifoMain {
    public static void main(String[] args) {
        Integer otroElemento;
        Integer entero;
        LinkedList<Integer> listaEnteros = new LinkedList<Integer>();
        do {
            do {
                otroElemento = LectorDeTeclado.capturarEntero(
                        "tienes un elemento para la lista?\n"
                                + "0 = no 1 = si");
            } while ((otroElemento != 0)
                    && (otroElemento != 1)); // validar entrada
            // Se introduce un elemento sólo si el usuario dijo que si
            if (otroElemento == 1) {
                entero = LectorDeTeclado.capturarEntero("Dame un entero");
                listaEnteros.addFirst(entero);
            } else {
                desplegarLista(listaEnteros);
            }
        } while (otroElemento == 1);
    }

    public static void desplegarLista(LinkedList l) {
        for (int i = 0; i < l.size(); i++)
            System.out.println(l.get(i));
    }
}