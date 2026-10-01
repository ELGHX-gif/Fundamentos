import java.util.Scanner;

/*
* INSTITUTO TECNOLÓGICO DE PACHUCA
* FUNDAMENTOS DE PROGRAMACIÓN
* HERNANDEZ MEDINA GUSTAVO
* HERNANDEZ REVILLA NAIM
* TORRES SANCHEZ JONATAN EMIR*/

public class Main {
    public static void main (String[] args) { //Inicio de clase

        String nombre;
        final String  SALUDO = "Hola,";
        Scanner scanner = new Scanner(System.in);

        System.out.println( "Escribe tu nombre:");
        nombre = scanner.nextLine();

        System.out.println("HOLA MUNDO");
        System.out.print(SALUDO + nombre); //Imprimir nombre

    }
} //Fin de Clase

