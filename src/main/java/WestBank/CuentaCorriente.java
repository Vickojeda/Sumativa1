package WestBank;

import static java.lang.Integer.parseInt;

public class CuentaCorriente {

    int saldo = 0;
    int nroCuenta;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    CuentaCorriente(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public CuentaCorriente(String nroCuenta, int tipoCuentaCorriente) {
        this.nroCuenta = parseInt(nroCuenta, 10);
    }
    
    public void mostrarSaldo() {
        System.out.println("Su saldo actual es: " + saldo + "\n");
    }

    void ingresarSaldo(int deposito) {
        this.saldo = deposito + this.saldo;
    }

    void girarDeposito(int giro) {
        this.saldo = this.saldo - giro;
    }

    public void depositarMonto(int cantidad, int nroCuenta) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a depositar debe ser mayor que 0");
        } else {
            this.saldo += cantidad;
        }
    }

}
