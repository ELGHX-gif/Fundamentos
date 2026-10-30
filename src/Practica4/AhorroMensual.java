package Practica4;

import java.util.Scanner;

public class AhorroMensual {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        final double INTERES = 0.01;
        final int MESES_6 = 6;
        final int MESES_12 = 12;
        final int MESES_24 = 24;
        final int REP = 1;

        int rep;

        do {
            double dineroI;
            double meta;
            double ahorroMensual;

            System.out.println("Escribe tu dinero inicial: ");
            dineroI = scanner.nextDouble();

            while (dineroI <= 0) {
                System.out.println("Ingresa una cantidad positiva: ");
                dineroI = scanner.nextDouble();
            }

            System.out.println("Escribe tu meta de ahorro: ");
            meta = scanner.nextDouble();

            while (meta <= 0) {
                System.out.println("Ingresa una meta positiva: ");
                meta = scanner.nextDouble();
            }

            System.out.println("Escribe cuanto ahorraras cada mes: ");
            ahorroMensual = scanner.nextDouble();

            while (ahorroMensual <= 0) {
                System.out.println("Ingresa un ahorro positivo: ");
                ahorroMensual = scanner.nextDouble();
            }

            System.out.println("\nElige el plazo de ahorro:");
            System.out.println("1. 6 meses");
            System.out.println("2. 12 meses");
            System.out.println("3. 24 meses");
            int opcion = scanner.nextInt();

            int meses = 0;

            switch (opcion) {
                case 1:
                    meses = MESES_6;
                    break;
                case 2:
                    meses = MESES_12;
                    break;
                case 3:
                    meses = MESES_24;
                    break;
                default:
                    System.out.println("Opcion incorrecta, se usaran 6 meses.");
                    meses = MESES_6;
            }

            double saldo = dineroI;
            double interes = 0;
            int mesesNecesarios = 0;

            for (int i = 1; i <= meses; i++) {
                saldo = saldo + ahorroMensual;

                double interesMes = saldo * INTERES;
                saldo = saldo + interesMes;

                interes = interes + interesMes;

                if (saldo >= meta && mesesNecesarios == 0) {
                    mesesNecesarios = i;
                }
            }

            System.out.println("Saldo final: $" + saldo);
            System.out.println("Intereses generados: $" + interes);

            if (saldo >= meta) {
                System.out.println("Se alcanzo la meta de ahorro.");

                if (mesesNecesarios > 0) {
                    System.out.println("La meta se alcanzo en "
                            + mesesNecesarios + " meses.");
                }
            } else {
                System.out.println("No se alcanzo la meta de ahorro.");
            }

            System.out.println("Quieres realizar otra simulacion? (1 si / 0 no): ");
            rep = scanner.nextInt();

            while (rep != 0 && rep != 1) {
                System.out.println("Escribe 1 o 0: ");
                rep = scanner.nextInt();
            }

        } while (rep == REP);
    }
}