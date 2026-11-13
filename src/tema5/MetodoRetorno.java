package tema5;

import java.util.Scanner;

public class MetodoRetorno {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        do {
            System.out.println("\nIngresa una opcion:\n 1) Cuadrado\n 2) Triangulo\n 3) Circulo\n 4) Rectangulo\n 5) Salir");
            op = entrada.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Area: " + cuadrado());
                    break;
                case 2:
                    System.out.println("Area: " + triangulo());
                    break;
                case 3:
                    System.out.println("Area: " + circulo());
                    break;
                case 4:
                    System.out.println("Area: " + rectangulo());
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Esta opcion no es válida...");
            }
        } while (op != 5);
    }

    public static double cuadrado() {
        double l;
        System.out.println("Ingresa el valor de un lado:");
        l = entrada.nextDouble();
        return l * l;
    }

    public static double triangulo() {
        double a, b;
        System.out.println("Ingresa el valor de la base:");
        a = entrada.nextDouble();
        System.out.println("Ingresa el valor de la altura:");
        b = entrada.nextDouble();
        return (a * b) / 2;
    }

    public static double circulo() {
        double r;
        System.out.println("Ingresa el valor del radio:");
        r = entrada.nextDouble();
        return Math.PI * r * r;
    }

    public static double rectangulo() {
        double a, b;
        System.out.println("Ingresa el valor de la base:");
        a = entrada.nextDouble();
        System.out.println("Ingresa el valor de la altura:");
        b = entrada.nextDouble();
        return a * b;
    }
}