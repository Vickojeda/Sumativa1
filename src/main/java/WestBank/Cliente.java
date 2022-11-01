
package WestBank;
import java.util.*;

public class Cliente {
    String rut;
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    String domicilio;
    String comuna;
    int nroTelefono;
    CuentaCorriente cuentaCorriente;
    
    Cliente(){
    }          

    public Cliente(String rut, String nombre, String apellidoPaterno, String apellidoMaterno, String domicilio, String comuna, int nroTelefono, CuentaCorriente cuentaCorriente) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.domicilio = domicilio;
        this.comuna = comuna;
        this.nroTelefono = nroTelefono;
        this.cuentaCorriente = cuentaCorriente;
    }
    

    public void mostrarDatos(){
        System.out.println("Rut: " + rut +"\n");
        System.out.println("Nombre: " + nombre +"\n");
        System.out.println("Apellido Paterno: " + apellidoPaterno +"\n");
        System.out.println("Apellido Materno: " + apellidoMaterno +"\n");
        System.out.println("Domicilio: " + domicilio +"\n");
        System.out.println("Comuna: " + comuna +"\n");
        System.out.println("Telefono: " + String.valueOf(nroTelefono) +"\n");
        System.out.println("Número de cuenta corriente: " + String.valueOf(cuentaCorriente.nroCuenta) +"\n");
        System.out.println("Saldo: " + String.valueOf(cuentaCorriente.saldo) +"\n");
    }
}

