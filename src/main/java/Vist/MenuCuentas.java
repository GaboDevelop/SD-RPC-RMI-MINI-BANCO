package Vist;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuCuentas {

    public int MenuCuentas(){
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {
            System.out.println("************* Mini-banco: Deposito a cuentas *************");
            System.out.println("1. Cuenta *****-123");
            System.out.println("2. Cuenta *****-123");
            System.out.println("3. Cuenta *****-123");
            System.out.println("4. A cuentas de terceros");
            System.out.println("5. Salir");
            System.out.println("************* ******************************* *************");
            try {
                System.out.print("Escribe una de las opciones: ");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        System.out.println("\n\n\n\n\n\n\n\n\n\n");
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        System.out.println("\n\n\n\n\n\n\n\n\n\n");
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
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
        return 5;
    }
}
