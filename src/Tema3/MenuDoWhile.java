package Tema3;

import java.util.Scanner;

public class MenuDoWhile {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int op = 0 , a = 0 , b = 0 , c = 0;

            System.out.println("Selecciona una opcion");
            System.out.println("1)Suma \n 2)Resta \n 3)Salir");
            op = scanner.nextInt();
            switch (op){
                case 1:
                    System.out.println("dame el valor para a");
                    a = scanner.nextInt();
                    System.out.println("dame le valor para b");
                    b = scanner.nextInt();
                    System.out.println("suma = "+ (a+b));
                    break;
                case 2:
                    System.out.println("dame el valor para a");
                    a = scanner.nextInt();
                    System.out.println("dame le valor para b");
                    b = scanner.nextInt();
                    System.out.println("Resta = "+(a-b));
                    break;
                case 3:
                    System.out.println("adios");
                    break;
                     }


    }
}