
package WestBank;

public class Cliente {
    String rut;
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    String domicilio;
    String comuna;
    int nroTelefono;
    CuentaCorriente cuentaCorriente;      

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getNroTelefono() {
        return nroTelefono;
    }

    public void setNroTelefono(int nroTelefono) {
        this.nroTelefono = nroTelefono;
    }

    public CuentaCorriente getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    Cliente(String rut, String nombre, String apellidoPaterno, String apellidoMaterno, String domicilio, String comuna, int nroTelefono, CuentaCorriente cuentaCorriente) {
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
        System.out.println("Rut: " + this.getRut() +"\n");
        System.out.println("Nombre: " + this.getNombre() +"\n");
        System.out.println("Apellido Paterno: " + this.getApellidoPaterno() +"\n");
        System.out.println("Apellido Materno: " + this.getApellidoMaterno() +"\n");
        System.out.println("Domicilio: " + this.getDomicilio() +"\n");
        System.out.println("Comuna: " + this.getComuna() +"\n");
        System.out.println("Telefono: " + String.valueOf(this.getNroTelefono()) +"\n");
        System.out.println("Número de cuenta corriente: " + String.valueOf(this.getCuentaCorriente().nroCuenta) +"\n");
        System.out.println("Saldo: " + String.valueOf(this.getCuentaCorriente().saldo) +"\n");
    }
}

