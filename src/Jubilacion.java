import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Jubilacion {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int EDAD_JUBILACION = 67;
        String nombre;
        int edad = 0;

        System.out.println("Escribe tu nombre:");
        nombre = scanner.nextLine();
        System.out.println("Escribe tu edad");
        edad = scanner.nextInt();

        if (edad >= EDAD_JUBILACION){
            System.out.println(nombre + " Tiene " + edad + " años " + " Y esta listo para jubilarse");


        }// Fin si
        else{
            System.out.println(nombre + " Tiene " + edad + " años " + " Y no esta listo para jubilarse");
            System.out.println("Le faltan " + (EDAD_JUBILACION - edad) + " años para jubilarse ");
        }
    }
}
