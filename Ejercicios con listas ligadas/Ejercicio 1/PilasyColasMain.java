import java.util.LinkedList;

public class PilasyColasMain {
    public static void main(String[] args) {
        // hacer una lista de String
        LinkedList<String> listaString = new LinkedList<String>();
        listaString.addFirst("Pedro");
        listaString.addFirst("María");
        listaString.addFirst("Juan");
        listaString.addLast("Alicia");
        desplegarLista(listaString);
    }

    public static void desplegarLista(LinkedList l) {
        for (int i = 0; i < l.size(); i++)
            System.out.println(l.get(i));
    }
}