package Practicas_1;

import java.util.Scanner;

public class Comision_Bancaria {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double COMISION = 10;
        final double LIMITE_RETIRO = 5000;

        double saldo;
        double retiro;
        double saldoFinal;

        System.out.print("Ingresa tu saldo disponible: ");
        saldo = scanner.nextDouble();

        System.out.print("Ingresa la cantidad que deseas retirar: ");
        retiro = scanner.nextDouble();

        if (retiro <= 0) {
            System.out.println("La cantidad a retirar debe ser mayor a cero.");
        } else {
            if (retiro > LIMITE_RETIRO) {
                System.out.println("El retiro supera el limite de $5000.");
            } else {
                if (retiro + COMISION > saldo) {
                    System.out.println("Saldo insuficiente para cubrir el retiro y la comision.");
                } else {
                    saldoFinal = saldo - retiro - COMISION;

                    System.out.println("Retiro autorizado.");
                    System.out.println("Monto retirado: $" + retiro);
                    System.out.println("Comision bancaria: $" + COMISION);
                    System.out.println("Saldo final: $" + saldoFinal);
                }
            }
        }
    }
}