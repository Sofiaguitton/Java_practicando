package Package3.java;
import java.util.TimeZone;
public class Cuenta {
    public String nroCuenta;
    public double saldo;
    public String titular;
    
    public void depositar ( double cantidad){
        saldo += cantidad;
    }
    public void retirar (double cantidad){
        saldo -= cantidad;
    }
        if (saldo < 0) {
            System.out.println("Error! Saldo insuficiente.");
        }else{
            System.out.println("Retiro realizado con éxito.");
         }
        
    public void consultarSaldo(){
      System.out.println("Saldo actual de la cuenta" + saldo);}
    
    public void registrarTransaccion(String tipo, double monto){
        System.out.println("Fecha:"  , "tipo de movimiento:" +tipo+    "monto de la transaccion realizada " +monto  );

    }
    
    public Cuenta(String nroCuenta, double saldo, String titular) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }
}