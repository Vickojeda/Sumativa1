package WestBank.utils;

import WestBank.Cliente;
import static java.lang.Integer.parseInt;
import java.util.List;

public class ValidacionesCliente {

    String mensajeError = "";

    public void validacionRut(String rut) {
        if (rut.length() < 11 || rut.length() > 12) {
            mensajeError = mensajeError + "\n * El rut ingresado debe tener entre 11 y 12 caracteres, incluyendo puntos y guion";
        }
    }

    public void validacionNombre(String nombre) {

        if (nombre.length() <= 0) {
            mensajeError = mensajeError + "\n * El campo nombre no puede ser vacio";
        }
    }

    public void validacionApellidoPaterno(String apellidoPaterno) {
        if (apellidoPaterno.length() <= 0) {
            mensajeError = mensajeError + "\n * El campo apellido paterno no puede ser vacio";
        }
    }

    public void validacionApellidoMaterno(String apellidoMaterno) {
        if (apellidoMaterno.length() <= 0) {
            mensajeError = mensajeError + "\n * El campo apellido materno no puede ser vacio";
        }
    }

    public void validacionDomicilio(String domicilio) {
        if (domicilio.length() <= 0) {
            mensajeError = mensajeError + "\n * El campo domicilio no puede ser vacio";
        }
    }

    public void validacionComuna(String comuna) {
        if (comuna.length() <= 0) {
            mensajeError = mensajeError + "\n * El campo comuna no puede ser vacio";
        }
    }

    public void validacionTelefono(String telefono) {
        try {
            int nroTelefono = parseInt(telefono, 10);
        } catch (NumberFormatException e) {
            mensajeError = mensajeError + "\n * El campo telefonico debe ser numerico";
        }
    }

    public void validacionNroCuenta(String nroCuenta) {
        try {
            int numero = parseInt(nroCuenta, 10);
            int longNroCuenta = String.valueOf(numero).length();
            if (longNroCuenta != 9) {
                mensajeError = mensajeError + "\n * El campo numero de cuenta debe ser de 9 digitos";
            }
        } catch (NumberFormatException e) {
            mensajeError = mensajeError + "\n * El campo numero de cuenta debe ser numerico";
        }
    }

    public void validacionRutConCuenta(List<Cliente> clientes, String rut) {
        for (Cliente cliente : clientes) {
            if (cliente.getRut().equals(rut)) {
                mensajeError = mensajeError + "\n * El rut ya esta asociado a una cuenta";
            }
        }
    }

    public String validacionFormularioRegistro(
            String rut, String nombre, String apellidoPaterno, String apellidoMaterno, String domicilio, String comuna, String telefono, String numeroCuenta, int tipoCuenta, List<Cliente> clientes) {
        this.mensajeError = "";

        validacionRut(rut);
        validacionNombre(nombre);
        validacionApellidoPaterno(apellidoPaterno);
        validacionApellidoMaterno(apellidoMaterno);
        validacionDomicilio(domicilio);
        validacionComuna(comuna);
        validacionTelefono(telefono);
        validacionNroCuenta(numeroCuenta);
        validacionRutConCuenta(clientes, rut);

        return mensajeError;
    }

    public String validacionRutBusqueda(String rut) {
        if (rut.length() < 11 || rut.length() > 12) {
            return "* El rut ingresado debe tener entre 11 y 12 caracteres, incluyendo puntos y guion";
        }
        return "";
    }
}
