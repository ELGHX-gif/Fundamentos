package Practica4;

import java.util.Scanner;

public class NumerosAmigos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        final int INICIO = 1;
        final int DIVISOR_INICIAL = 1;
        final int OPCION_SUMAS = 1;
        final int OPCION_COMPARAR = 2;
        final int REPETIR = 1;

        int rep;

            int numero1;
            int numero2;

            System.out.println("Escribe el primer numero: ");
            numero1 = teclado.nextInt();

            while (numero1 <= 0) {
                System.out.println("Ingresa un numero positivo: ");
                numero1 = teclado.nextInt();
            }

            System.out.println("Escribe el segundo numero: ");
            numero2 = teclado.nextInt();

            while (numero2 <= 0) {
                System.out.println("Ingresa un numero positivo: ");
                numero2 = teclado.nextInt();
            }

            int suma1 = 0;
            int contador1 = 0;

            for (int i = INICIO; i < numero1; i++) {
                if (numero1 % i == 0) {
                    suma1 = suma1 + i;
                    contador1++;
                }
            }

            int suma2 = 0;
            int contador2 = 0;

            for (int i = INICIO; i < numero2; i++) {
                if (numero2 % i == 0) {
                    suma2 = suma2 + i;
                    contador2++;
                }
            }

            boolean amigos;

            if (suma1 == numero2 && suma2 == numero1) {
                amigos = true;
            } else {
                amigos = false;
            }

            System.out.println("\nQue deseas consultar?");
            System.out.println("1. Mostrar las sumas de los divisores");
            System.out.println("2. Mostrar solamente si son amigos");

            int opcion = teclado.nextInt();

            switch (opcion) {
                case OPCION_SUMAS:
                    System.out.println("Suma de divisores del primer numero: " + suma1);
                    System.out.println("Suma de divisores del segundo numero: " + suma2);
                    break;

                case OPCION_COMPARAR:
                    if (amigos) {
                        System.out.println("Los numeros SI son amigos.");
                    } else {
                        System.out.println("Los numeros NO son amigos.");
                    }
                    break;

                default:
                    System.out.println("Opcion incorrecta.");
            }

            if (amigos) {
                System.out.println("Resultado: Son numeros amigos.");
            } else {
                System.out.println("Resultado: No son numeros amigos.");
            }

            System.out.println("Quieres analizar otra pareja? (1 si / 0 no): ");
            rep = teclado.nextInt();

            while (rep != 0 && rep != 1) {
                System.out.println("Escribe 1 o 0: ");
                rep = teclado.nextInt();
            }

    }
}