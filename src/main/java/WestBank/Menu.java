package WestBank;

import WestBank.utils.ValidacionesCliente;
import WestBank.utils.ValidacionesCuentaCorriente;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Menu {

    List<Cliente> clientes = new ArrayList<>();
    ValidacionesCuentaCorriente validacionCuentaCorriente = new ValidacionesCuentaCorriente();
    ValidacionesCliente validacionCliente = new ValidacionesCliente();

    Menu() {
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
            System.out.println("Escoja una opcion:");
            try {
                int opcion = parseInt(sn.nextLine(), 10);
                switch (opcion) {
                    case 1:
                        Cliente clienteIngresado = ingresarCliente();
                        clientes.add(clienteIngresado);
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2: Ver datos de cliente");
                        try {
                            Cliente clienteEncontrado = buscarCliente();
                            clienteEncontrado.mostrarDatos();
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3: Depositar");
                        try {
                            Cliente clienteEncontrado = buscarCliente();
                            //ingresarDeposito(clienteEncontrado.cuentaCorriente);
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion 4: Girar");
                        try {
                            Cliente clienteEncontrado = buscarCliente();
                            //girarDeposito(clienteEncontrado.cuentaCorriente);
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                        break;
                    case 5:
                        System.out.println("Has seleccionado la opcion 5: Consultar saldo");
                        try {
                            Cliente clienteEncontrado = buscarCliente();
                           // consultaSaldo(clienteEncontrado.cuentaCorriente);
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                        break;
                    case 6:
                        System.out.println("Has seleccionado la opcion 6: Salir");
                        salir = true;
                        break;
                    default:
                        System.out.println("Selecciona solo numeros del 1 al 6");
                        break;
                }
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println("Selecciona solo numeros del 1 al 6");
            }
        }
    }

    private Cliente ingresarCliente() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Has seleccionado la opcion 1: Registrar cliente");
        System.out.println("Ingrese rut:");
        String rut = sn.nextLine();
        validacionCliente.validacionRut(rut, sn);
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
        int nroTelefono = validacionCliente.validacionTelefono(sn);
        int nroCuenta = validacionCuentaCorriente.validacionNroCuenta(sn);
        Cliente cliente = new Cliente(
                rut,
                nombre,
                apellidoPaterno,
                apellidoMaterno,
                domicilio,
                comuna,
                nroTelefono,
                new CuentaCorriente(nroCuenta));
        System.out.println("¡Cliente registrado exitosamente!");
        return cliente;
    }

    private Cliente buscarCliente() throws Exception {
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese el rut del cliente: ");
        String rut = sn.nextLine();
        for (Cliente cliente : clientes) {
            if (cliente.rut.equals(rut)) {
                return cliente;
            }
        }
        throw new Exception("Cliente no encontrado");
    }

    private void ingresarDeposito(CuentaCorriente cuentaCorriente) {
        try {
            Scanner sn = new Scanner(System.in);
            System.out.println("Ingrese un monto para depositar: ");
            int deposito = parseInt(sn.nextLine());
            boolean esValido = validacionCuentaCorriente.validarMontoDeposito(deposito);
            if (!esValido) {
                return;
            }
            cuentaCorriente.ingresarSaldo(deposito);
            System.out.println("¡Deposito realizado de manera exitosa! ");
            System.out.println("Usted tiene un saldo actual de :" + cuentaCorriente.saldo + " pesos ");
        } catch (InputMismatchException | NumberFormatException error) {
            System.out.println("Ingrese un monto a depositar numerico y sin puntos:");
        }
    }

    private void girarDeposito(CuentaCorriente cuentaCorriente) {
        try {
            Scanner sn = new Scanner(System.in);
            System.out.println("Ingrese un monto para girar: ");
            int giro = parseInt(sn.nextLine());
            boolean esValido = validacionCuentaCorriente.validarMontoGiro(giro, cuentaCorriente.saldo);
            if (!esValido) {
                return;
            }
            cuentaCorriente.girarDeposito(giro);
            System.out.println("¡Giro realizado de manera exitosa! ");
            System.out.println("Usted tiene un saldo actual de :" + cuentaCorriente.saldo + " pesos ");
        } catch (InputMismatchException | NumberFormatException error) {
            System.out.println("Ingrese un giro numerico y sin puntos:");
        }
    }

    private void consultaSaldo(CuentaCorriente cuentaCorriente) {
        cuentaCorriente.mostrarSaldo();
    }

}
