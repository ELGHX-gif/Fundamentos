package tema5;

import java.util.Scanner;

public class CajeroAutomatico {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre = nombre();
        double saldo = saldo();
        double retiro = retiro();

        if (validar(saldo, retiro)) {
            double saldoRestante = actualizarSaldo(saldo, retiro);
            recibo(nombre, retiro, saldoRestante);
        } else {
            rechazo(saldo, retiro);
        }
    }
    public static String nombre() {
        System.out.println("Ingresa tu nombre:");
        return entrada.nextLine();
    }

    public static double saldo() {
        System.out.println("Ingresa tu saldo disponible:");
        return entrada.nextDouble();
    }

    public static double retiro() {
        System.out.println("Ingresa la cantidad que deseas retirar:");
        return entrada.nextDouble();
    }

    public static boolean validar(double saldo, double retiro) {
        return retiro > 0 && retiro <= saldo && retiro % 50 == 0;
    }

    public static double actualizarSaldo(double saldo, double retiro) {
        return saldo - retiro;
    }

    public static void recibo(String nombre, double retiro, double saldoRestante) {
        System.out.println("COMPROBANTE");
        System.out.println("Cliente: " + nombre);
        System.out.println("Cantidad retirada: $" + retiro);
        System.out.println("Saldo restante: $" + saldoRestante);
    }
    public static void rechazo(double saldo, double retiro) {
        System.out.println("RETIRO RECHAZADO");
        if (retiro <= 0) {
            System.out.println("la cantidad debe ser mayor que cero.");
        } else if (retiro > saldo) {
            System.out.println("La cantidad supera el saldo disponible.");
        } else {
            System.out.println("Motivo: la cantidad debe ser múltiplo de 50.");
        }
    }
}
