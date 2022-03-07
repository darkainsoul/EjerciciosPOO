import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        double radio;
        int n;
        float flotante;
        System.out.print("¿Como te llamas? ");
        nombre = input.nextLine(); // lee un String
        System.out.println("¿Como estas, " + nombre + "?");
        System.out.print("Cual es el radio del circulo? ");
        radio = input.nextDouble(); // lee un double
        System.out.println("La longitud de la circunferencia es: "
                + 2 * Math.PI * radio);
        System.out.print("Ahora dame un numero entero: ");
        n = input.nextInt(); // lee un entero
        System.out.println("El cuadrado del entero es: "
                + (n * n));
        System.out.println("Ahora dame un numero de punto "
                + "flotante:");
        flotante = input.nextFloat();
        System.out.println("Tu numero es: " + flotante);
    }
}