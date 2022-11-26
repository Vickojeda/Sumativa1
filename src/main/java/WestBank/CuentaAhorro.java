package WestBank;

public class CuentaAhorro extends CuentaBancaria {
    public CuentaAhorro(int nroCuenta) {
        super(nroCuenta);
    }
    
    @Override
    public void mostrarSaldo() {
        System.out.println("Su saldo actual es: " + saldo + "\n");
    }
    
    @Override
    void ingresarSaldo(int deposito) {
        this.saldo = deposito + this.saldo;
    }

    @Override
    void girarDeposito(int giro) {
        this.saldo = this.saldo - giro;
    }
    
    @Override
    public void depositarMonto(int cantidad, int nroCuenta) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a depositar debe ser mayor que 0");
        } else {
            this.saldo += cantidad;
        }
    }
}
