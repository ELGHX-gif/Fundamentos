package Practicas_1;

import java.util.Scanner;

public class Sistema_Calfs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double MINIMO_APROBATORIO = 70;
        final double MINIMO_UNIDAD = 60;

        double unidad1;
        double unidad2;
        double unidad3;
        double promedio;

        System.out.print("Ingresa la calificacion de la unidad 1: ");
        unidad1 = scanner.nextDouble();

        System.out.print("Ingresa la calificacion de la unidad 2: ");
        unidad2 = scanner.nextDouble();

        System.out.print("Ingresa la calificacion de la unidad 3: ");
        unidad3 = scanner.nextDouble();

        promedio = (unidad1 + unidad2 + unidad3) / 3;

        System.out.println("Su calificacion de la unidad 1: " + unidad1);
        System.out.println("Su calificacion de la unidad 2: " + unidad2);
        System.out.println("Su calificacion de la unidad 3: " + unidad3);
        System.out.println("Promedio: " + promedio);

        if (promedio >= MINIMO_APROBATORIO) {
            System.out.println("Ha sido aprobado.");
        } else {
            System.out.println("Ha sido reprobado.");
        }

        if (unidad1 < MINIMO_UNIDAD) {
            System.out.println("Usted debe presentar recuperacion de la unidad 1.");
        }

        if (unidad2 < MINIMO_UNIDAD) {
            System.out.println("Usted debe presentar recuperacion de la unidad 2.");
        }

        if (unidad3 < MINIMO_UNIDAD) {
            System.out.println("Usted debe presentar recuperacion de la unidad 3.");
        }
    }
}