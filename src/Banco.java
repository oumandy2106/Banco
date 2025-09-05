public class Banco {
    private double saldo;
    private double cantidad;

    public Banco(double saldo){
        this.saldo = saldo;
    }

    public double Deposito(){
        saldo = saldo + cantidad;
        System.out.println("Su saldo despúes del deposito es: " +  saldo);
        return saldo;
    }

    public double Retiro(){
        saldo = saldo - cantidad;
        System.out.println("Su saldo despúes del retiro es: " +  saldo);
        return saldo;
    }

    public void Consulta(){
        System.out.println("Su saldo despúes es: " +  saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
