public class mainCuadrados {
    public static void main(String[] args) {
        Double a;
        Double b;
        Double c;
        LectorDeTeclado in;
        // Leer los datos
        in = new LectorDeTeclado();
        System.out.println("a? ");
        a = in.capturarDoble();
        System.out.println("b? ");
        b = in.capturarDoble();
        System.out.println("c? ");
        c = in.capturarDoble();
        // Hacer comparacion y enviar mensaje
        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
            System.out.println("Los numeros sí son solucion");
        } else {
            System.out.println("Los numeros no son solucion");
        }
    }
}