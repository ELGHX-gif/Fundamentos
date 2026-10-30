package Practica4;

import java.util.Scanner;

public class Competencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int RONDAS = 5;
        final int INICIO = 0;
        final double DISTANCIA_BAJA = 2;
        final double DISTANCIA_ALTA = 4;
        final int OPCION_TOTAL = 1;
        final int OPCION_PROMEDIO = 2;
        final int OPCION_CATEGORIAS = 3;
        final int REPETIR = 1;

        int rep;

            int participantes;

            System.out.println("Escribe la cantidad de participantes: ");
            participantes = scanner.nextInt();

            while (participantes <= 0) {
                System.out.println("Ingresa una cantidad mayor que cero... ");
                participantes = scanner.nextInt();
            }

            double mayorDistancia = 0;
            double sumaGeneral = 0;
            int mejorParticipante = 0;

            int totalBajo = 0;
            int totalMedio = 0;
            int totalAlto = 0;

            for (int p = 1; p <= participantes; p++) {
                double total = 0;

                System.out.println("Participante " + p);

                for (int r = 1; r <= RONDAS; r++) {
                    double distancia;

                    System.out.print("Distancia de la ronda " + r + " en km: ");
                    distancia = scanner.nextDouble();

                    while (distancia < INICIO) {
                        System.out.print("La distancia no puede ser negativa... ");
                        distancia = scanner.nextDouble();
                    }

                    total = total + distancia;

                    if (distancia < DISTANCIA_BAJA) {
                        totalBajo++;
                        System.out.println("Rendimiento bajo.");
                    } else if (distancia <= DISTANCIA_ALTA) {
                        totalMedio++;
                        System.out.println("Rendimiento medio.");
                    } else {
                        totalAlto++;
                        System.out.println("Rendimiento alto.");
                    }
                }

                double promedio = total / RONDAS;

                sumaGeneral = sumaGeneral + total;

                System.out.println("Distancia total: " + total + " km");
                System.out.println("Promedio por ronda: " + promedio + " km");

                if (total > mayorDistancia || p == 1) {
                    mayorDistancia = total;
                    mejorParticipante = p;
                }
            }

            System.out.println("\nQue estadistica deseas ver?");
            System.out.println("1. Mayor distancia acumulada");
            System.out.println("2. Promedio general de distancia");
            System.out.println("3. Cantidad de rondas por categoria");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case OPCION_TOTAL:
                    System.out.println("El participante con mayor distancia fue el numero "
                            + mejorParticipante);
                    System.out.println("Distancia acumulada: " + mayorDistancia + " km");
                    break;

                case OPCION_PROMEDIO:
                    double promedioGeneral = sumaGeneral / (participantes * RONDAS);
                    System.out.println("Promedio general por ronda: "
                            + promedioGeneral + " km");
                    break;

                case OPCION_CATEGORIAS:
                    System.out.println("Rondas de rendimiento bajo: " + totalBajo);
                    System.out.println("Rondas de rendimiento medio: " + totalMedio);
                    System.out.println("Rondas de rendimiento alto: " + totalAlto);
                    break;

                default:
                    System.out.println("Opcion incorrecta.");
            }

            System.out.println("Quieres registrar otra competencia? (1 si / 0 no): ");
            rep = scanner.nextInt();

            while (rep != 0 && rep!= 1) {
                System.out.println("Escribe 1 o 0: ");
                rep = scanner.nextInt();
            }
    }
}