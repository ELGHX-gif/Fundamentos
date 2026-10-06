import java.util.Scanner;

public class Division {
    static void main() {
        try {
            int a,b,c; //c = a/b
            String n = null;
            Scanner scanner = new Scanner(System.in);

            System.out.println( "Dawe el valor para a");
            a = scanner.nextInt();
            System.out.println( "Dame el valor de b");
            b = scanner.nextInt();
            //dividir
            c = a/b;
            System.out.println(" c = " + c);

        }catch (ArithmeticException ae){

        System.out.println("No puedes dividir por 0 ");

        }catch (NullPointerException np){
            System.out.println( "Estas manejando mal un null");
        }finally {
            System.out.println("Me ejecutar siempre");


    }

    }
}
