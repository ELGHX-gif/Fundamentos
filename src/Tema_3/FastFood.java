package Tema_3;

import java.util.Scanner;

public class FastFood {
    public static void main(String[] args) {
        String op;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona algo del menú A) Hamburguesa" + "\n B) Hot-Dog \n C) Pizza");
        op = scanner.nextLine();


        switch (op){
            case "A":
                System.out.println("Seleccionaste Hamburguesa");
                break;
            case "B":
                System.out.println("Seleccionaste Hot-Dog");
                break;
            case "C":
                System.out.println("Seleccionaste Pizza");
                break;
            default:
                System.out.println("Seleccionaste una opcion no válida");
                break;

        }

    }
}
