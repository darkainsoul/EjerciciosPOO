import java.util.*;

public class PilasMain {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<Integer>();
        LinkedList<Integer> lista = new LinkedList<Integer>();
        lista.addFirst(5);
        lista.addFirst(6);
        lista.addFirst(7);
        lista.addFirst(8);
        Integer elemento;
        for (int i = 0; i < 4; i++) {
            elemento = lista.get(i);
            pila.push(elemento);
        }
        System.out.println("Los elementos que hay en la pila son:");
        for (int i = 0; i < 4; i++)
            System.out.println("el número " + pila.get(i) +
                    " está en la posición " +
                    pila.search(pila.get(i)));
    }
}