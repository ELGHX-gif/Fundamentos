import java.util.Scanner;

public class Clasificacion_Equipaje {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String nombre;
        final int PESO_MAXIMO = 30;
        final int CARGO_LIGERO = 150;
        final int CARGO_MEDIO = 300;
        final int CARGO_PESADO = 500;

        double equipaje;
        int cargo;
        int peso = 30;
        cargo = 0;


        System.out.println("Ingresa tu nombre: ");
        nombre = scanner.nextLine();

        System.out.println("Peso de tu equipaje: ");
        peso = scanner.nextInt();

        if (peso >= PESO_MAXIMO){
            System.out.println(nombre + " Su equipaje es mayor a 30 ");
            cargo = CARGO_PESADO;
            System.out.println("Se cobrara de cargo: " + cargo);

        } else if (peso < 30 && peso >20) {
            System.out.println(nombre + " Su equipaje es mayor a 20 kg pero menor a 30");
            System.out.println("Su equipaje tiene una carga media");
            cargo = CARGO_MEDIO;
            System.out.println("Se cobrará de cargo: " + cargo);

        } else if (peso <= 20 && peso > 15) {
            System.out.println(nombre + " Su equipaje es menor a 20 kg pero mayor a 15 kg");
            System.out.println("Su equipaje tiene una carga ligera");
            cargo = CARGO_LIGERO;
            System.out.println("Se cobrara de cargo : " + cargo);
        } else {
            System.out.println(nombre + "Su equipaje es");
            System.out.println("Su equipaje pesa menos de 15");
            System.out.println("No se cobrará cargo ");
        }
    }
}
