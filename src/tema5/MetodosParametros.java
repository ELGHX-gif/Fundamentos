package tema5;

import java.util.Scanner;

public class MetodosParametros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op = 0, a, b;
        System.out.println("Ingresa una opcion \n 1) Suma \n 2) Resta" +
                "\n 3) Multiplicación \n 4) Division");
        op = scanner.nextInt();

        System.out.println("Ingressa el valor de a:");
        a = scanner.nextInt();

        System.out.println("Ingresa el valor de b:");
        b = scanner.nextInt();
        switch (op){
            case 1:
                suma(a,b);
                break;
            case 2:
                resta(a,b);
                break;
            case 3:
                multi(a,b);
            case 4: division(a,b);
            default:
                System.out.println("Elegiate una opcion no valida");
                break;
        }
    }
    public static void suma(int a, int b){
        System.out.println("Suma = " + (a+b));
    }
    public static void resta(int a, int b){
        System.out.println("Suma = " + (a-b));
    }
    public static void multi(int a, int b){
        System.out.println("Suma = " + (a*b));
    }
    public static void division(int a, int b){
        System.out.println("Suma = " + (a/b));
    }

}
