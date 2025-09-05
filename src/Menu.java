import java.util.Scanner;

public class Menu {
    public void mostrarMenu(Banco persona1){
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;

        do {
            System.out.println("Ingrese que operación quiere realizar. \n 1._Deposito \n 2._Retiro \n 3._Consulta \n 4._Salir");
            int opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    persona1.Deposito();
                    break;
                case 2:
                    persona1.Retiro();
                    break;
                case 3:
                    persona1.Consulta();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    bandera = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while(bandera);
    }

}

