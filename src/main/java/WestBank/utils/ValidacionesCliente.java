package WestBank.utils;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class ValidacionesCliente {

    String mensajeError = "";

    public void validacionRut(String rut, Scanner sn) {
        while (rut.length() < 11 || rut.length() > 12) {
            System.out.println("El rut ingresado debe tener entre 11 y 12 caracteres, incluyendo puntos y guion");
            System.out.println("Ingrese rut:");
            rut = sn.nextLine();
        }
    }

    public int validacionTelefono(Scanner sn) {
        int nroTelefono = 0;
        boolean flagTelefono = false;
        while (!flagTelefono) {
            System.out.println("Ingrese telefono:");
            try {
                nroTelefono = parseInt(sn.nextLine(), 10);
                return nroTelefono;
            } catch (NumberFormatException e) {
                System.out.println("El telefono debe ser un numero:");
            }
        }
        return 0;
    }

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

    public String validacionFormularioRegistro(
            String rut,
            String nombre,
            String apellidoPaterno,
            String apellidoMaterno,
            String domicilio,
            String comuna,
            String telefono,
            String numeroCuenta,
            int tipoCuenta
    ) {
        this.mensajeError = "";

        validacionRut(rut);
        validacionNombre(nombre);
        validacionApellidoPaterno(apellidoPaterno);
        validacionApellidoMaterno(apellidoMaterno);
        validacionDomicilio(domicilio);
        validacionComuna(comuna);
        validacionTelefono(telefono);
        validacionNroCuenta(numeroCuenta);

        return mensajeError;
    }

}
