import java.util.Scanner;

public class MaquinaExpendedora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int PRODUCTO = 1;
        final int  CONSULTAR_TOTAL = 2;
        final int SALIDA= 3;

        int opcion;
        double total = 0;
        int unidadesTotales = 0;
        int prod;
        double importe;
        int cantidad;
        int precio = 0;

        do {
            System.out.println("--- MAQUINA EXPENDEDORA ---");
            System.out.println("1. Comprar producto");
            System.out.println("2. Consultar total");
            System.out.println("3. Salir");
            System.out.print("Elige opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case PRODUCTO:
                    System.out.println("Productos:");
                    System.out.println("1. Agua $15");
                    System.out.println("2. Jugo $22");
                    System.out.println("3. Galletas $18");
                    System.out.println("4. Sandwich $45");
                    System.out.print("Que quieres comprar? ");
                    prod = scanner.nextInt();

                    switch (prod) {
                        case 1:
                            precio = 15;
                            break;
                        case 2:
                            precio = 22;
                            break;
                        case 3:
                            precio = 18;
                            break;
                        case 4:
                            precio = 45;
                            break;
                        default:
                            System.out.println("Tu producto no es existente");
                            break;
                    }

                    if (precio != 0) {
                        System.out.print("Cuantas unidades? ");
                        cantidad = scanner.nextInt();

                        while (cantidad <= 0) {
                            System.out.println("Error: debe ser un numero positivo");
                            System.out.print("Cuantas unidades? ");
                            cantidad = scanner.nextInt();
                        }

                        importe = precio * cantidad;
                        total = total + importe;
                        unidadesTotales = unidadesTotales + cantidad;

                        System.out.println("Pagaste: $" + importe);

                        if (importe < 50) {
                            System.out.println("Compra pequeña");
                        } else if (importe <= 100) {
                            System.out.println("Compra mediana");
                        } else {
                            System.out.println("Compra grande");
                        }
                    }
                    break;

                case CONSULTAR_TOTAL:
                    System.out.println("Total recaudado hasta ahora: $" + total);
                    System.out.println("Unidades vendidas: " + unidadesTotales);
                    break;

                case SALIDA:
                    System.out.println("Gracias por tu eleccion, vuelve pronto :D");
                    break;

                default:
                    System.out.println("Esta eleccion del menu no existe");
                    break;
            }

        } while (opcion != 3);

        System.out.println("--- VUELVE PRONTO ---");
        System.out.println("Total final recaudado: $" + total);
        System.out.println("Total unidades vendidas: " + unidadesTotales);

    }
}