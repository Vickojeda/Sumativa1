package WestBank.utils;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class ValidacionesCliente {

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
}
