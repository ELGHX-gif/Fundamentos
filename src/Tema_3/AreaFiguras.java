package Tema_3;

import java.util.Scanner;

public class AreaFiguras {
    public static void main(String[] args) {

        int op, a = 0, b, r;
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Cuadrado \n2. Rectangulo \n3. Triangulo \n4. Circulo");
        op = scanner.nextInt();

        switch (op) {
            case 1:
                System.out.println("CUADRADO");
                System.out.println("Ingresa el valor de a: ");
                a = scanner.nextInt();
                System.out.println("Resultado = " + (a * a));
                break;

            case 2:
                System.out.println("RECTANGULO");
                System.out.println("Ingresa el valor de a: ");
                a = scanner.nextInt();
                System.out.println("Ingresa el valor de b: ");
                b = scanner.nextInt();

                System.out.println("Resultado = " + (a * b));
                break;

            case 3:
                System.out.println("TRIANGULO");
                System.out.println("Ingresa el valor de a: ");
                a = scanner.nextInt();
                System.out.println("Ingresa el valor de b: ");
                b = scanner.nextInt();

                System.out.println("Resultado = " + ((a * b) / 2.0));
                break;

            case 4:
                System.out.println("CIRCULO");
                System.out.println("Ingresa el radio de la figura: ");
                r = scanner.nextInt();

                double area = Math.PI * Math.pow(r, 2);

                System.out.println("Resultado = " + area);
                break;

            default:
                System.out.println("Seleccionaste una opcion no valida");
                break;
        }
    }
}
