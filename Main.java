package Package3.java;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cuenta cuenta = new Cuenta(null, 0, null);
        System.out.println("Ingrese el número de cuenta:");
        String nroCuenta = scanner.nextLine();
        System.out.println("Ingrese el saldo inicial:");
        double saldo = scanner.nextDouble();

        cuenta.depositar(0);    
        cuenta.retirar();
        cuenta.consultarSaldo();
    }

}
