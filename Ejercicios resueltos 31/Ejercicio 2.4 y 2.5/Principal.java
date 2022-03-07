public class Principal {
    public static void main(String args[]) {
    Cuenta cuentaCredito;
    Cuenta cuentaDebito;
    // Creamos los objetos
    cuentaCredito = new Cuenta();
    cuentaDebito = new Cuenta();
    cuentaCredito.nombre = "Pedro Sanchez";
    cuentaCredito.setSaldo(1500.0);
    cuentaCredito.setNumero(244513);
    cuentaCredito.tipo = "crédito";
    cuentaDebito.nombre = "Pablo Garcia";
    cuentaDebito.setSaldo(7800.0);
    cuentaDebito.setNumero(273516);
    cuentaDebito.tipo = "débito";
    cuentaCredito.imprimir();
    cuentaDebito.imprimir();
    }
}