package Vist;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuPrincipal {

    public void MenuPrincipal(){
        MenuTransacciones menuTransacciones = new MenuTransacciones();
        FormularioIngreso formularioIngreso = new FormularioIngreso();
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {
            System.out.println("************* BIENVENIDO A RMI/RPC Mini-banco *************");
            System.out.println("1. Apertura de cuenta");
            System.out.println("2. Realizar transacción");
            System.out.println("3. Salir");
            System.out.println("************* ******************************* *************");
            try {
                System.out.print("Escribe una de las opciones: ");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("\n\n\n\n\n\n\n\n\n\n");
                        formularioIngreso.solicitarDocumento();
                        break;
                    case 2:
                        System.out.println("\n\n\n\n\n\n\n\n\n\n");
                        boolean successLogin = formularioIngreso.ingreso();

                        if(successLogin){
                            System.out.println("Credenciales validas");
                            opcion = menuTransacciones.MenuTransacciones();
                        }else{
                            System.out.println("Credenciales invalidas");
                        }

                        break;
                    case 3:
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
