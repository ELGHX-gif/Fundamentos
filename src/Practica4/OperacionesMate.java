package Practica4;

import java.util.Scanner;

public class OperacionesMate{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int CUADRADO = 1;
        final int CUBO = 2;
        final int PAR_IMPAR = 3;
        final int SUMA = 4;
        final int SALIR = 5;
        final int INICIO = 1;

        int opcion;

        do {
            System.out.println("\n======== MENU DE OPERACIONES ==========");
            System.out.println("1. Calcular el cuadrado de un numero");
            System.out.println("2. Calcular el cubo de un numero");
            System.out.println("3. Saber si un numero es par o impar");
            System.out.println("4. Sumar los numeros desde 1 hasta N");
            System.out.println("5. Salir");
            System.out.println("Elige una opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case CUADRADO:
                    int numero1;

                    System.out.println("Escribe un numero positivo: ");
                    numero1 = scanner.nextInt();

                    if (numero1 > 0) {
                        int resultado = numero1 * numero1;
                        System.out.println("El cuadrado es: " + resultado);
                    } else {
                        System.out.println("El numero debe ser positivo...");
                    }
                    break;

                case CUBO:
                    int numero2;

                    System.out.println("Escribe un numero positivo: ");
                    numero2 = scanner.nextInt();

                    if (numero2 > 0) {
                        int resultado = numero2 * numero2 * numero2;
                        System.out.println("El cubo es: " + resultado);
                    } else {
                        System.out.println("El numero debe ser positivo...");
                    }
                    break;

                case PAR_IMPAR:
                    int numero3;

                    System.out.println("Escribe un numero positivo: ");
                    numero3 = scanner.nextInt();

                    if (numero3 > 0) {
                        if (numero3 % 2 == 0) {
                            System.out.println("El numero es par.");
                        } else {
                            System.out.println("El numero es impar.");
                        }
                    } else {
                        System.out.println("El numero debe ser positivo...");
                    }
                    break;

                case SUMA:
                    int n;
                    int suma = 0;

                    System.out.println("Escribe un numero positivo: ");
                    n = scanner.nextInt();

                    if (n > 0) {
                        for (int i = INICIO; i <= n; i++) {
                            suma = suma + i;
                        }

                        System.out.println("La suma es: " + suma);
                    } else {
                        System.out.println("El numero debe ser positivo...");
                    }
                    break;

                case SALIR:
                    System.out.println("Nos vemos pronto");
                    break;

                default:
                    System.out.println("Vuelve a intentar...");
            }

        } while (opcion != SALIR);

    }
}