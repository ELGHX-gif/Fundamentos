package Practicas_1;

import java.util.Scanner;

public class Cajero_Automatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double LIMITE_RETIRO = 5000;

        double saldo;
        double retiro;
        double saldoFinal;

        System.out.println("Ingresa tu saldo disponible : $ ");
        saldo = scanner.nextDouble();

        System.out.println("Ingresa la cantidad que deseas retirar : $ ");
        retiro = scanner.nextDouble();

        if (retiro <= 0) {
            System.out.println("La cantidad a retirar debe ser mayor a 0...");
        }
        else {
            if (retiro > LIMITE_RETIRO){
                System.out.println("Tu retiro no puede ser mayor a 5000...");

            }
            else {
                if (retiro > saldo){
                    System.out.println("No cuentas con el saldo suficiente...");
                }
                else {
                    saldoFinal = saldo - retiro;

                    System.out.println("Retiro autorizado");
                    System.out.println("Efectivo entregado : $ " + retiro);
                    System.out.println("Saldo restante : $ " + saldoFinal);

                    if (saldoFinal < 500){
                        System.out.println("ADVERTENCIA: tu saldo restante es menor a $500.");
                    }

                }
            }
        }

    }
}
