package Practica4;

import java.util.Scanner;

public class SecuenciaNumerica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int DIVISOR4 = 4;
        final int DIVISOR3 = 3;
        final int DIVISOR2 = 2;
        final int DIVISOR5 = 5;

        int rep;

        do {
            int n;
            System.out.println("Escribe un numero positivo: ");
            n = scanner.nextInt();

            while (n <= 0) {
                System.out.println("Escribe un numero mayor que cero... ");
                n = scanner.nextInt();
            }

            int suma4 = 0;
            int multiplos3 = 0;
            int multiplos3y4 = 0;
            int pares = 0;
            int impares = 0;
            int multiplos5 = 0;

            for (int i = 1; i <= n; i++) {

                if (i % DIVISOR4 == 0) {
                    suma4 = suma4 + i;
                }

                if (i % DIVISOR3 == 0) {
                    multiplos3++;
                }

                if (i % DIVISOR3 == 0 && i % DIVISOR4 == 0) {
                    multiplos3y4++;
                }

                if (i % DIVISOR2 == 0) {
                    pares++;
                } else {
                    impares++;
                }

                if (i % DIVISOR5 == 0) {
                    multiplos5++;
                }
            }

            System.out.println("\nSuma de divisibles entre 4: " + suma4);
            System.out.println("Multiplos de 3: " + multiplos3);
            System.out.println("Divisibles entre 3 y 4: " + multiplos3y4);

            System.out.println("\nQue quieres consultar?");
            System.out.println("1. Numeros pares");
            System.out.println("2. Numeros impares");
            System.out.println("3. Multiplos de 5");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Hay " + pares + " numeros pares.");
                    break;

                case 2:
                    System.out.println("Hay " + impares + " numeros impares.");
                    break;

                case 3:
                    System.out.println("Hay " + multiplos5 + " multiplos de 5.");
                    break;

                default:
                    System.out.println("Opcion incorrecta.");
            }

            System.out.println("Quieres hacer otro analisis? (1 si / 0 no): ");
            rep = scanner.nextInt();

            while (rep != 0 && rep != 1) {
                System.out.println("Escribe 1 o 0: ");
                rep = scanner.nextInt();
            }

        } while (rep == 1);

    }
}