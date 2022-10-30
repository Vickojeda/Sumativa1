package WestBank;

public class App {

    public static void main(String[] args) {
        Cliente cliente=new Cliente();
        CuentaCorriente cuentaCorriente=new CuentaCorriente();
        Menu menu= new Menu(cliente,cuentaCorriente);
        menu.displayMenu();
    }
}
