public class Cuenta {
    public String nombre;
    public double saldo;
    public int numero;
    public String tipo;

    public void depositar(double deposito) {
        saldo = saldo + deposito;
    }

    public void retirar(double retiro) {
        if (saldo >= retiro) {
            saldo = saldo - retiro;
        }
    }

    public void imprimir() {
        System.out.println("La cuenta es de: " + nombre
                + ", número: " + numero
                + ". Es una cuenta de " + tipo
                + ", con saldo: " + saldo + "\n");
    }
}