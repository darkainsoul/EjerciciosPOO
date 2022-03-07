import java.util.*;

public class PilasMain {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<Integer>();
        LinkedList<Integer> lista = new LinkedList<Integer>();
        lista.addFirst(1);
        lista.addFirst(2);
        lista.addFirst(3);
        lista.addFirst(4);
        Integer elemento;
        for (int i = 0; i < lista.size(); i++) {
            elemento = lista.get(i);
            pila.push(elemento);
        }
        System.out.println("Los elementos que hay en la pila son:");
        while (!pila.isEmpty()) {
            elemento = pila.pop();
            System.out.println("se sacó el elemento " + elemento + " de la pila ");
        }
    }
}