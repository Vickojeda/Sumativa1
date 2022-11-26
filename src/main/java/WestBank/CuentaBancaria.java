package WestBank;

import static java.lang.Integer.parseInt;

public class CuentaBancaria {
    int saldo = 0;
    int nroCuenta;
    String tipo;
    
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

    public CuentaBancaria(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public CuentaBancaria(String nroCuenta, int tipoCuenta) {
        this.nroCuenta = parseInt(nroCuenta, 10);
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void mostrarSaldo() {}
    void ingresarSaldo(int deposito){}
    void girarDeposito(int giro) {}
    public void depositarMonto(int cantidad, int nroCuenta) {}

}
