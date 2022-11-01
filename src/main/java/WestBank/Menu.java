package WestBank;

import static java.lang.Integer.parseInt;
import java.util.InputMismatchException;
import java.util.Scanner;

class Menu {

    Cliente cliente;
    CuentaCorriente cuentaCorriente;

    Menu(Cliente cliente, CuentaCorriente cuentaCorriente) {
        this.cliente = cliente;
        this.cuentaCorriente = cuentaCorriente;
    }

    void displayMenu() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Menu: ");
            System.out.println("Opcion 1: Registrar cliente");
            System.out.println("Opcion 2: Ver datos de cliente");
            System.out.println("Opcion 3: Depositar");
            System.out.println("Opcion 4: Girar");
            System.out.println("Opcion 5: Consultar saldo");
            System.out.println("Opcion 6: Salir");
            System.out.println("Escoja una opcion: \n");
            try {
                int opcion = parseInt(sn.nextLine(), 10);
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1: Registrar cliente");
                        System.out.println("Ingrese rut:");
                        String rut = sn.nextLine();
                        System.out.println("Ingrese nombre:");
                        String nombre = sn.nextLine();
                        System.out.println("Ingrese apellido paterno:");
                        String apellidoPaterno = sn.nextLine();
                        System.out.println("Ingrese apellido materno:");
                        String apellidoMaterno = sn.nextLine();
                        System.out.println("Ingrese domicilio:");
                        String domicilio = sn.nextLine();
                        System.out.println("Ingrese comuna:");
                        String comuna = sn.nextLine();
                        System.out.println("Ingrese teléfono:");
                        int nroTelefono = parseInt(sn.nextLine(), 10);
                        System.out.println("Ingrese número de cuenta corriente:");
                        int nroCuenta = parseInt(sn.nextLine(), 10);
                        cuentaCorriente.nroCuenta = nroCuenta;
                        cliente = new Cliente(
                                rut,
                                nombre,
                                apellidoPaterno,
                                apellidoMaterno,
                                domicilio,
                                comuna,
                                nroTelefono,
                                cuentaCorriente);
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2: Ver datos de cliente");
                        cliente.mostrarDatos();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3: Depositar");
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion 4: Girar");
                        break;
                    case 5:
                        System.out.println("Has seleccionado la opcion 5: Consultar saldo");
                        cuentaCorriente.mostrarSaldo();
                        break;
                    case 6:
                        System.out.println("Has seleccionado la opcion 6: Salir");
                        salir = true;
                        break;
                    default:
                        System.out.println("Selecciona solo numeros del 1 al 6");
                        break;
                }
            } catch (InputMismatchException error) {
                System.out.println("Selecciona solo numeros del 1 al 6");
                sn.next();
            }
        }
    }
}
