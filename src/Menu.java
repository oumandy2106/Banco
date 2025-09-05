import java.util.Scanner;

public class Menu {
    public void mostrarMenu(){
        Scanner sc = new Scanner(System.in);
        Banco persona1 = new Banco(0.0);
        boolean bandera;
        bandera = true;
        System.out.println("Ingrese que operación quiere realizar. \n 1._Deposito \n 2._Retiro \n 3._Consulta \n 4._Salir");
        int opcion = sc.nextInt();
            do{
                switch(opcion){
                    case 1:
                        persona1.Deposito();
                        persona1.Regresar();
                        break;
                    case 2:
                        persona1.Retiro();
                        persona1.Regresar();
                        break;
                    case 3:
                        persona1.Consulta();
                        persona1.Regresar();
                        break;
                    case 4:
                        System.out.println("Saliendo...");
                        bandera = false;
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            }while(bandera == true);
        }
}

