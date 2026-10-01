import java.util.Scanner;

/*
 * INSTITUTO TECNOLÓGICO DE PACHUCA
 * FUNDAMENTOS DE PROGRAMACIÓN
 * HERNANDEZ MEDINA GUSTAVO
 * HERNANDEZ REVILLA NAIM
 * TORRES SANCHEZ JONATAN EMIR*/

public class  Escuela {
    public static void main (String[] args) { //Inicio de clase

        String nombre;
        String Apellido;
        String edad;
        String semestre;
        String carrera;
        double promedio;

        final String  ESCUELA = "Tecnológico Nacional de México";
        Scanner scanner = new Scanner(System.in);


        System.out.println( "Escribe tu nombre:");
        nombre = scanner.nextLine();


        System.out.println( "Escribe tu apellido:");
        Apellido = scanner.nextLine();

        System.out.println( "Escribe tu edad:");
        edad = scanner.nextLine();

        System.out.println( "Escribe tu semestre:");
        semestre = scanner.nextLine();

        System.out.println( "Escribe tu promedio:");
        promedio = Double.parseDouble(scanner.nextLine());

        System.out.println( "Escribe tu carrera:");
        carrera = (scanner.nextLine());



        System.out.println( "Tu escuela es :" + ESCUELA);
        System.out.println("Hola," + nombre);
        System.out.println("Tu apellido es:" + Apellido);
        System.out.println("Tu edad es:" + edad);
        System.out.println("Tu semestre es:" + semestre);
        System.out.println("Tu promedio es: " + promedio);
        System.out.println("Tu carrera es: " + carrera);

    }
} //Fin de Clase


