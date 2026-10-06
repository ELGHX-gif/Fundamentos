package Practicas_1;

import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        final double TARIFA_MOTO = 10;
        final double TARIFA_AUTO = 20;
        final double TARIFA_CAMIONETA = 30;
        final double DESCUENTO_10 = 0.10;
        final double DESCUENTO_20 = 0.20;

        int tipoVehiculo;
        double horas;
        double tarifa = 0;
        double subtotal;
        double descuento = 0;
        double total;

        System.out.println("1. Motocicleta");
        System.out.println("2. Automovil");
        System.out.println("3. Camioneta");

        System.out.print("Selecciona el tipo de vehiculo: ");
        tipoVehiculo = teclado.nextInt();

        System.out.print("Ingresa el numero de horas: ");
        horas = teclado.nextDouble();

        if (horas <= 0) {
            System.out.println("La cantidad de horas no es valida.");
        } else {
            if (tipoVehiculo == 1) {
                tarifa = TARIFA_MOTO;
            } else {
                if (tipoVehiculo == 2) {
                    tarifa = TARIFA_AUTO;
                } else {
                    if (tipoVehiculo == 3) {
                        tarifa = TARIFA_CAMIONETA;
                    } else {
                        System.out.println("Tipo de vehiculo no valido.");
                    }
                }
            }

            subtotal = tarifa * horas;

            if (horas > 10) {
                descuento = DESCUENTO_20;
            } else {
                if (horas > 5) {
                    descuento = DESCUENTO_10;
                }
            }

            total = subtotal - (subtotal * descuento);

            System.out.println("Tipo de vehiculo: " + tipoVehiculo);
            System.out.println("Horas: " + horas);
            System.out.println("Tarifa por hora: $" + tarifa);
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("Descuento: $" + (subtotal * descuento));
            System.out.println("Total a pagar: $" + total);
        }
    }
}