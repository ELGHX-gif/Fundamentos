import java.util.Scanner;

public class calificaciones {


        static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String nombre;
            double calf = 0;


            System.out.println("Escribe tu nombre:");
            nombre = scanner.nextLine();
            System.out.println("Escribe tu calificacion");
            calf = scanner.nextDouble();

            if (calf >= 90){
                System.out.println(nombre + " EXCELENTE tu calificacion es " + calf + "Y has aprobado la materia ");


            }// Fin si
            else if (calf >=80){
                System.out.println(nombre + " MUY BIEN tu calificacion es " + calf + "Has aprobado la materia ");

            }
            else if (calf >=70){
                System.out.println(nombre + " BIEN " + calf + "Has APROBADO la materia ");

            }
            else if (calf >= 60){
                System.out.println(nombre + " SUFICIENTE tu calificacion es " + calf + "Y has aprobado la materia ");


            }// Fin si
            else if (calf <=59){
                System.out.println(nombre + " Tienes " + calf + "Has reprobado la materia ");

            }
        }
    }

