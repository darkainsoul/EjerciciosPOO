import java.util.LinkedList;

public class ListasLigadasMain {
    public static void main(String[] args) {
        // Se declara e instancia una lista de Integer
        LinkedList<Integer> listaEnteros = new LinkedList<Integer>();
        // Añadimos 3 elementos al principio
        listaEnteros.addFirst(1);
        listaEnteros.addFirst(2);
        listaEnteros.addFirst(3);
        // Añadimos un elemento al final
        listaEnteros.addLast(0);
        desplegarLista(listaEnteros);
    }

    public static void desplegarLista(LinkedList l) {
        for (int i = 0; i < l.size(); i++)
            System.out.println(l.get(i));
    }
}