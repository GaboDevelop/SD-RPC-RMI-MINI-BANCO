package Vist;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FormularioIngreso {

    public void solicitarDocumento(){
        String document;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca su número de documento: ");
        document = teclado.nextLine();

        //this.formularioRegistro(document);
        //this.posees3cuentas();

        boolean successLogin = this.ingreso();

        if(successLogin){
            System.out.println("Credenciales validas");
            this.depositoInicial();
        }else{
            System.out.println("Credenciales invalidas");
            return;
        }
    }

    public void formularioRegistro(String document){
        String name;
        String userName;
        String password;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Nuevo usuario");
        System.out.print("Introduzca su nombre: ");
        name = teclado.nextLine();
        System.out.print("Nombre de usuario: ");
        userName = teclado.nextLine();
        System.out.print("Contraseña: ");
        password = teclado.nextLine();

        System.out.println("Documento: " + document + "!");
        System.out.println("Nombre: " + name + "!");
        System.out.println("Usuario: " + userName + "!");
        System.out.println("Contraseña: " + password + "!");
    }

    public void posees3cuentas(){
        System.out.println("Su usuario ya posee 3 cuentas");
    }

    public boolean ingreso(){
        String userName;
        String password;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tus credenciales");
        System.out.print("Nombre de usuario: ");
        userName = teclado.nextLine();
        System.out.print("Contraseña: ");
        password = teclado.nextLine();

        return true;
    }

    public void depositoInicial(){
        String initialQtyString;
        Float initialQty;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de $ de deposito inicial para su nueva cuenta: ");
        initialQtyString = teclado.nextLine();

        try {
            initialQty = Float.parseFloat(initialQtyString);
            System.out.println("tu cantidad inicial : " + initialQty + "!");
        } catch (NumberFormatException e) {
            System.out.println("Debes insertar un número");
            return;
        }
    }
}
