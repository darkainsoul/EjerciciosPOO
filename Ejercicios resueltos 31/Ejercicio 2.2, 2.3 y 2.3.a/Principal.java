public class Principal {
    public static void main(String[] args) {
        Cuenta cuentaCredito;
        Cuenta cuentaDebito;
        // Creamos los objetos
        cuentaCredito = new Cuenta();
        cuentaDebito = new Cuenta();
        cuentaCredito.nombre = "Pedro Sanchez";
        cuentaCredito.saldo = 1500;
        cuentaCredito.numero = 244513;
        cuentaCredito.tipo = "crédito";
        cuentaDebito.nombre = "Pablo Garcia";
        cuentaDebito.saldo = 7800;
        cuentaDebito.numero = 273516;
        cuentaDebito.tipo = "débito";
        cuentaCredito.imprimir();
        cuentaDebito.imprimir();
    }
}