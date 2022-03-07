import LectorDeTeclado.*;

public class mainCuadrados {
    public static void main(String[] args) {
        Integer a;
        Integer b;
        Integer c;
        LectorDeTeclado in;
        // Leer los datos
        a = LectorDeTeclado.capturarEntero("a? ");
        b = LectorDeTeclado.capturarEntero("b? ");
        c = LectorDeTeclado.capturarEntero("c? ");
        // Hacer comparación y enviar mensaje
        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
            System.out.println("Los numeros si son solucion");
        } else {
            System.out.println("Los numeros no son solucion");
        }
    }
}