import java.util.InputMismatchException;
import java.util.Scanner;

public class Promedio {
    static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println( "Escribe tu calificacion 1 : ");
            double a = scanner.nextDouble();
            System.out.println( "Escribe tu calificacion 2 : ");
            double b = scanner.nextDouble();
            System.out.println( "Escribe tu calificacion 3 : ");
            double c = scanner.nextDouble();

            double d= (a+b+c) /3;
            System.out.println("Tu promedio es :" + d);
            if(d<=18){
                System.out.println("Pasaste con :" + d);

            }
            else {
                System.out.println("No pasaste ");
            }
        }catch (InputMismatchException e){
            System.out.println("Solo se puede poner numeros");

        }finally {
            System.out.println("Gracias");
        }
    }
}
