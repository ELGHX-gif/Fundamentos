package Tema4;
import java.util.Scanner;
public class CapturaMatriz {
    static void main() {
        Scanner entrada = new Scanner (System.in);
        int[][]numeros = new int[2][3];
        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[j].length; j++){
                System.out.println(" Ingresa el numero de la fila " + i + " y columna " + i);
                numeros[i][j]= entrada.nextInt();

            }
        }
        System.out.println("Mostrar contenido de la matriz");
        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[j].length; j++){
                System.out.println(numeros[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
