import java.util.LinkedList;

public class FilaMain {
    public static void main(String[] args) {
        LinkedList<Integer> fila = new LinkedList<Integer>();
        Integer elemento;
        fila.addLast(1);
        fila.addLast(2);
        fila.addLast(3);
        fila.addLast(4);
        while (!fila.isEmpty()) {
            elemento = fila.removeFirst();
            System.out.println("Se atendio al elemento: " + elemento
                    + " de la fila");
        }
        System.out.println("La fila esta vacia");
    }
}