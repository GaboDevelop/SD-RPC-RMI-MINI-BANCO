package Vist;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuTransacciones {

    public int MenuTransacciones(){
        MenuCuentas menuCuentas = new MenuCuentas();
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {
            System.out.println("************* Mini-banco: Menú de transacciones *************");
            System.out.println("1. Consultar cuenta");
            System.out.println("2. Deposito a cuenta");
            System.out.println("3. Retiro de cuenta");
            System.out.println("4. Transferencia entre cuentas");
            System.out.println("5. Salir");
            System.out.println("************* ******************************* *************");
            try {
                System.out.print("Escribe una de las opciones: ");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("\n\n\n\n\n\n\n\n\n\n");
                        this.MenuConsultarCuentas();
                        break;
                    case 2:
                        System.out.println("\n\n\n\n\n\n\n\n\n\n");
                        opcion = menuCuentas.MenuCuentas();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        System.out.println("\n\n\n\n\n\n\n\n\n\n");
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion 4");
                        System.out.println("\n\n\n\n\n\n\n\n\n\n");
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
        return 4;
    }


    public void MenuConsultarCuentas(){
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {
            System.out.println("************* Mini-banco: Menú de transacciones *************");
            System.out.println("1. Consultar: *****-4567");
            System.out.println("1. Consultar: *****-4569");
            System.out.println("3. Consultar: *****-4570");
            System.out.println("4. Salir");
            System.out.println("************* ******************************* *************");
            try {
                System.out.print("Escribe una de las opciones: ");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("\n\n\n\n\n\n\n\n\n\n");

                        System.out.println("tienes 5000$");

                        System.out.println("Transaccion: 12121 Monto: 5000$ hacia:****-12121");
                        System.out.println("Transaccion: 12121 Monto: 5000$ hacia:****-12121");
                        System.out.println("Transaccion: 12121 Monto: 5000$ hacia:****-12121");
                        System.out.println("Transaccion: 12121 Monto: 5000$ hacia:****-12121");
                        System.out.println("Transaccion: 12121 Monto: 5000$ hacia:****-12121");
                        break;
                    case 2:
                        System.out.println("\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("tienes 9000$");
                        System.out.println("Transaccion: 12121 Monto: 5000$ hacia:****-12121");
                        System.out.println("Transaccion: 12121 Monto: 5000$ hacia:****-12121");
                        System.out.println("Transaccion: 12121 Monto: 5000$ hacia:****-12121");
                        System.out.println("Transaccion: 12121 Monto: 5000$ hacia:****-12121");
                        System.out.println("Transaccion: 12121 Monto: 5000$ hacia:****-12121");
                        break;
                    case 3:
                        System.out.println("\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("tienes 5000$");
                        System.out.println("Transaccion: 12121 Monto: 5000$ hacia:****-12121");
                        System.out.println("Transaccion: 12121 Monto: 5000$ hacia:****-12121");
                        System.out.println("Transaccion: 12121 Monto: 5000$ hacia:****-12121");
                        System.out.println("Transaccion: 12121 Monto: 5000$ hacia:****-12121");
                        System.out.println("Transaccion: 12121 Monto: 5000$ hacia:****-12121");
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }
}
