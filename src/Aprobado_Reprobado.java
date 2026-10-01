import java.util.Scanner;

public class Aprobado_Reprobado {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        double calf = 0;

        System.out.println("Escribe tu nombre:");
        nombre = scanner.nextLine();
        System.out.println("Escribe tu calificacion");
        calf = scanner.nextDouble();

        if (calf >= 70){
            System.out.println(nombre + " Tienes " + calf + "Y has aprobado las materias ");


        }// Fin si
        else{
            System.out.println(nombre + " Tienes " + calf + "Has reprobado las materias ");
            System.out.println("Le faltan " + (70- calf) + " para pasar el semestre ");
        }
    }
}
