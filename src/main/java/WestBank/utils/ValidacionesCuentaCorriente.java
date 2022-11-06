
package WestBank.utils;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class ValidacionesCuentaCorriente {
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

    public int validacionNroCuenta(Scanner sn) {
        int nroCuenta = 0;
        boolean flagNroCuenta = false;
        while (!flagNroCuenta){
            System.out.println("Ingrese numero de cuenta corriente:");
            try{
                nroCuenta = parseInt(sn.nextLine(),10); 
                int longNroCuenta = String.valueOf(nroCuenta).length();
                if (longNroCuenta == 9 ){
                    return nroCuenta;
                }
                else{
                    System.out.println("El numero de cuenta debe ser un numero de 9 digitos");
                }
            }
            catch (NumberFormatException e){
                System.out.println("El numero de Cuenta Corriente debe ser un numero:");
            } 
        }
        return 0;
    }
}
