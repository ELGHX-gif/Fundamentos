package Tema4;
import java.util.Scanner;
public class CalificacionesArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cantidad;
        double suma = 0;
        double promedio;
        double mayor;
        double menor;
        int aprobados = 0;
        int reprobados = 0;
        double porcentaje;

        System.out.println("Ingrese la cantidad de estudiantes: ");
        cantidad = scanner.nextInt();
        scanner.nextLine();

        while (cantidad <= 0) {
            System.out.println("Cantidad no valida.");
            System.out.println("Ingrese nuevamente la cantidad: ");
            cantidad = scanner.nextInt();
            scanner.nextLine();
        }

        String[] estudiantes = new String[cantidad];
        double[] calificaciones = new double[cantidad];

        for (int i = 0; i < cantidad; i++) {

            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            estudiantes[i] = scanner.nextLine();

            System.out.print("Ingrese su calificacion: ");
            calificaciones[i] = scanner.nextDouble();

            while (calificaciones[i] < 0 || calificaciones[i] > 100) {
                System.out.println("Calificacion no valida. Debe estar entre 0 y 100.");
                System.out.print("Ingrese nuevamente la calificacion: ");
                calificaciones[i] = scanner.nextDouble();
            }

            scanner.nextLine();
        }

        mayor = calificaciones[0];
        menor = calificaciones[0];

        for (int i = 0; i < cantidad; i++) {

            suma = suma + calificaciones[i];

            if (calificaciones[i] > mayor) {
                mayor = calificaciones[i];
            }

            if (calificaciones[i] < menor) {
                menor = calificaciones[i];
            }

            if (calificaciones[i] >= 70) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        promedio = suma / cantidad;
        porcentaje = (aprobados * 100.0) / cantidad;

        System.out.println("\n===== RESULTADOS DEL GRUPO =====");

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Estudiante: " + estudiantes[i]);
            System.out.println("Calificacion: " + calificaciones[i]);

            if (calificaciones[i] >= 70) {
                System.out.println("Estado: Aprobado");
            } else {
                System.out.println("Estado: Reprobado");
            }
        }

        System.out.println("\nPromedio general: " + promedio);
        System.out.println("Calificacion mas alta: " + mayor);
        System.out.println("Calificacion mas baja: " + menor);
        System.out.println("Estudiantes aprobados: " + aprobados);
        System.out.println("Estudiantes reprobados: " + reprobados);
        System.out.println("Porcentaje de aprobacion: " + porcentaje + "%");
    }
}