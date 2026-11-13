package Tema4;

public class ArreglosEjemplo {
    static void main() {
        int [] calificaciones = new int [5];
        int[] numeros  = {10,20,30,40,50};
        System.out.println(numeros[0]);
        System.out.println(numeros[2]);
        numeros[1] = 100;
        numeros[4] = 200;
        System.out.println(numeros [1]);
        System.out.println(numeros [4]);
        for (int i=0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
        System.out.println("Recorrido de arreglos utilizando for-each");
        for (int numero: numeros){ //varible del mismo tipo tipo de arreglo: arreglo
            System.out.println(numero);
        }
        int suma = 0;
        for (int i = 0; i < numeros.length; i++){
            suma = numeros [i];
        }
        System.out.println(suma);
    }

}
