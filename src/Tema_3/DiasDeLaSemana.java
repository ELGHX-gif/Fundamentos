package Tema_3;

import java.util.Scanner;

public class DiasDeLaSemana {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int opcion = 5;
        System.out.println("Elige un numero del 1 al 7");

        switch (opcion){
            case 1:
                System.out.println("Lunes");
            break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("Elegiste una opción no válida");
                break;
        }

    }
}
