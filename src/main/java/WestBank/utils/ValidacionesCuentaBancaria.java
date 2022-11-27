package WestBank.utils;

import WestBank.Cliente;
import static java.lang.Integer.parseInt;
import java.util.List;
public class ValidacionesCuentaBancaria {

    public boolean validarMontoDeposito(int deposito) {
        if (deposito <= 0) {
            System.out.println("Ingrese un deposito mayor a 0 : ");
            return false;
        }
        return true;
    }

    public boolean validarMontoGiro(int giro, int saldo) {
        if (giro > saldo) {
            System.out.println("Su saldo es menor al giro realizado");
            return false;
        }
        return true;

    }

    public String validarMontoDeposito(String deposito) {
        try {
            int monto = parseInt(deposito, 10);
            if (monto <= 0) {
                return "\n * El deposito debe ser superior a cero";
            }
            return "";
        } catch (NumberFormatException e) {
            return "\n * El monto debe ser numerico";
        }
    }

    public String validarExisteCuentaBancariaOrigen(List<Cliente> clientes, String cuentaOrigen) {
        for (Cliente cliente : clientes) {
            if (Integer.toString(cliente.getCuentaBancaria().getNroCuenta()).equals(cuentaOrigen)) {
                return "";
            }
        }
        return "\n * Cuenta Bancaria de Origen No existe";
    }

    public String validarCupoCuentaBancariaOrigen(List<Cliente> clientes, String cuentaOrigen, int monto) {
        for (Cliente cliente : clientes) {
            if (Integer.toString(cliente.getCuentaBancaria().getNroCuenta()).equals(cuentaOrigen)) {
                if (cliente.getCuentaBancaria().getSaldo() < monto) {
                    return "\n * Cuenta Bancaria No posee suficiente saldo";
                }
            }
        }
        return "";
    }

    public String validarTipoCuentaBancariaOrigen(List<Cliente> clientes, String cuentaOrigen, int monto) {
        for (Cliente cliente : clientes) {
            if (Integer.toString(cliente.getCuentaBancaria().getNroCuenta()).equals(cuentaOrigen)) {
                if (cliente.getCuentaBancaria().getTipo().equals("Cuenta de Ahorro")) {
                    return "\n * Cuenta de Ahorro no puede realizar transferencias";
                }
            }
        }
        return "";
    }
    
}
