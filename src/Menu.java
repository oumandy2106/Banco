import java.util.Scanner;

public class Menu {
    public void Menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese que operación quiere realizar. \n 1._Deposito \n 2._Retiro \n 3._Consulta \n 4._Salir");
        int opcion = sc.nextInt();
        switch(opcion){

            do{
                switch(opcion){
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }

            }while(opcion != 4 && opcion > 0 && opcion < 5);
        }


    }
}
