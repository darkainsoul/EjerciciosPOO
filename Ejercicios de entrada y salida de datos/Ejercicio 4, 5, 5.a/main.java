import LectorDeTeclado.*;

public class main {
    public static void main(String[] args) {
        Double[] x = LectorDeTeclado.capturarArrDoble("Da un número real");
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "]= " + x[i]);
        }
    }
}