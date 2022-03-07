import java.util.*;

public class PilaMain {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<Integer>();
        LinkedList<Integer> lista = new LinkedList<Integer>();
        lista.addFirst(1);
        lista.addFirst(2);
        lista.addFirst(3);
        lista.addFirst(4);
        Integer elemento;
        for (int i = 0; i < 4; i++) {
            elemento = lista.get(i);
            pila.push(elemento);
        }
        System.out.println("elementos de la pila: ");
        for (int j = 1; j <= 4; j++) {
            elemento = (Integer) pila.pop();
            System.out.println("elemento " + j + " = " + elemento);
        }
    }
}