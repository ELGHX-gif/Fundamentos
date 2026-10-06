package Practicas_1;

import java.util.Scanner;

public class Tienda_Descuentos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final double DESCUENTO_NORMAL = 0.00;
        final double DESCUENTO_FRECUENTE = 0.10;
        final double DESCUENTO_VIP = 0.20;
        final double DESCUENTO_ADICIONAL = 0.05;

        String nombre;
        double compra;
        double descuentoCliente = 0;
        double descuentoAdicional = 0;
        double total;
        int tipoCliente;

        System.out.print("Ingresa el nombre del cliente: ");
        nombre = scanner.nextLine();

        System.out.print("Ingresa el monto de la compra: ");
        compra = scanner.nextDouble();

        System.out.println("1. Cliente normal");
        System.out.println("2. Cliente frecuente");
        System.out.println("3. Cliente VIP");
        System.out.print("Selecciona el tipo de cliente: ");
        tipoCliente = scanner.nextInt();

        if (tipoCliente == 1) {
            descuentoCliente = DESCUENTO_NORMAL;
        } else {
            if (tipoCliente == 2) {
                descuentoCliente = DESCUENTO_FRECUENTE;
            } else {
                if (tipoCliente == 3) {
                    descuentoCliente = DESCUENTO_VIP;
                } else {
                    System.out.println("Tipo de cliente no valido.");
                }
            }
        }

        if (compra > 2000) {
            descuentoAdicional = DESCUENTO_ADICIONAL;
        }

        total = compra - (compra * descuentoCliente) - (compra * descuentoAdicional);

        System.out.println("Cliente: " + nombre);
        System.out.println("Monto original: $" + compra);
        System.out.println("Descuento por tipo de cliente: $" + (compra * descuentoCliente));
        System.out.println("Descuento adicional: $" + (compra * descuentoAdicional));
        System.out.println("Total a pagar: $" + total);
    }
}