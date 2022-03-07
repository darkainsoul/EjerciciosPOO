public class PruebaContadorCiclico {
    public static void main(String[] args) {
        ContadorCiclico contadorCiclico = new ContadorCiclico(8,5);
        System.out.println(contadorCiclico.getCuenta().toString());
        System.out.println(contadorCiclico.getMax().toString());
    }
}
