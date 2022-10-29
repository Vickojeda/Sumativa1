package WestBank;

import java.util.InputMismatchException;
import java.util.Scanner;

class Menu {

    void displayMenu() {
        Scanner sn = new Scanner(System.in);

        boolean salir = false;
        while (!salir) {
            System.out.println("Opci�n 1: Registrar cliente");
            System.out.println("Opci�n 2: Ver datos de cliente");
            System.out.println("Opci�n 3: Depositar");
            System.out.println("Opci�n 4: Girar");
            System.out.println("Opci�n 5: Consultar saldo");
            System.out.println("Opci�n 6: Salir");
            try {
                int opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opci�n 1: Registrar cliente");
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opci�n 2: Ver datos de cliente");
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opci�n 3: Depositar");
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opci�n 4: Girar");
                        break;
                    case 5:
                        System.out.println("Has seleccionado la opci�n 5: Consultar saldo");
                        break;
                    case 6:
                        System.out.println("Has seleccionado la opci�n 6: Salir");
                        salir = true;
                        break;
                    default:
                        System.out.println("Selecciona s�lo n�meros del 1 al 6");
                        break;

                }

            } catch (InputMismatchException error) {
                System.out.println("Selecciona s�lo n�meros del 1 al 6");
                sn.next();
            }
        }

    }

}
