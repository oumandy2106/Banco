import java.util.Scanner;

public class Banco {
    private double saldo;
    Scanner scanner = new Scanner(System.in);
    Scanner cantidad = new Scanner(System.in);

    public Banco(double saldo){
        this.saldo = saldo;
    }

    public double Deposito(){
        System.out.println("Usted eligio: Depósito. Escoja por favor la cantidad a depósitar");
        double depositar = cantidad.nextDouble();
        saldo = saldo + depositar;
        System.out.println("Su saldo despúes del deposito es: " +  saldo);
        return saldo;
    }

    public double Retiro(){
        double retirar = cantidad.nextDouble();
        saldo = saldo - retirar;
        System.out.println("Su saldo despúes del retiro es: " +  saldo);
        return saldo;
    }

    public void Consulta(){
        System.out.println("Su saldo despúes es: " +  saldo);
    }



}
