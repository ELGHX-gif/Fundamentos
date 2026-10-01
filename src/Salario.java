/* Gustavo Hernandez Medina
* Instituto Tecnológico de Pachuca
* Funfamentos de Programación
* 30-09-2026 */
import java.util.Scanner;

public class Salario{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        final int HORASN = 40;
        final double PAGOEXT = 2;

        String nombre;
        int horas;
        double pagoHora;
        double pago;
        double pagoextra = 0;
        double total;

        System.out.print("Nombre del empleado: ");
        nombre = entrada.nextLine();

        System.out.print("Horas trabajadas: ");
        horas = entrada.nextInt();

        System.out.print("Pago por hora: $");
        pagoHora = entrada.nextDouble();

        if (horas <= HORASN) {
            pago = horas * pagoHora;
        } else {
            pago = HORASN * pagoHora;

            int horasExtra = horas - HORASN;

            pagoextra = horasExtra * pagoHora * PAGOEXT;
        }

        total = pago + pagoextra;

        System.out.println("Nombre: " + nombre);
        System.out.println("Horas trabajadas: " + horas);
        System.out.println("Pago normal: $" + pago);
        System.out.println("Pago por horas extra: $" + pagoextra);
        System.out.println("Salario total: $" + total);
    }
}