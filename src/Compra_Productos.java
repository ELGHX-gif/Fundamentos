/* Gustavo Hernandez Medina
 * Instituto Tecnológico de Pachuca
 * Funfamentos de Programación
 * 30-09-2026 */
import java.util.Scanner;

public class Compra_Productos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double DESCUENTO = 0.10;
        final double C_ENVIO = 80;

        String nombre;
        double precio;
        int cantidad;
        double subtotal;
        double descuento = 0;
        double totalDescuento;
        double envio;
        double totalFinal;

        System.out.print("Nombre de producto: ");
        nombre = scanner.nextLine();

        System.out.print("Precio del producto: $");
        precio = scanner.nextDouble();

        System.out.print("Cantidad: ");
        cantidad = scanner.nextInt();

        subtotal = precio * cantidad;

        if (subtotal >= 1000) {
            descuento = subtotal * DESCUENTO;
        }

        totalDescuento = subtotal - descuento;

        envio = C_ENVIO;

        if (totalDescuento >= 1500) {
            envio = 0;
        }

        totalFinal = totalDescuento + envio;
        System.out.println("Producto: " + nombre);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total con descuento: $" + totalDescuento);
        System.out.println("Envío: $" + envio);
        System.out.println("Total final: $" + totalFinal);
    }
}