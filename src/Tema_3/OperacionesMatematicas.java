package Tema_3;

import java.util.Scanner;

public class OperacionesMatematicas {
    public static void main(String[] args) {

        int op, a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Suma \n 2. Resta \n 3. Multiplicacion \n 4. Division");
        op = scanner.nextInt();

        System.out.println("Ingresa el valor a");
        a = scanner.nextInt();
        System.out.println("Ingresa el valor b");
        b = scanner.nextInt();

        switch (op){
            case 1:
                System.out.println("Resultado = " + (a+b));
                break;
            case 2:
                System.out.println("Resultado = " + (a-b));
                break;
            case 3:

                System.out.println("Resultado = " + (a*b));
                break;
            case 4:
                if (b != 0){
                    System.out.println("Resultado = " + (a/b));

                }
                else{
                    System.out.println("No se puede dividir entre 0");
                }


        }

    }
}
