/*
*Generador de CURP
* Hernandez Medina Gustavo
* Viernes 13 de Noviembre del 2026
* Instituto Tecnologico de Pachuca
*/

package CURP;
import java.util.Scanner;

public class CURP {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("GENERADOR DE CURP");

        System.out.print("Nombre: ");
        String nom = entrada.nextLine().toUpperCase();

        System.out.print("Apellido paterno: ");
        String paterno = entrada.nextLine().toUpperCase();

        System.out.print("Apellido materno: ");
        String materno = entrada.nextLine().toUpperCase();

        System.out.print("Fecha de nacimiento (DD/MM/AAAA): ");
        String nacimiento = entrada.nextLine();

        System.out.print("Sexo (H o M): ");
        String genero = entrada.nextLine().toUpperCase();

        System.out.println("Entidad federativa:");
        System.out.println("AGUASCALIENTES");
        System.out.println("BAJA CALIFORNIA");
        System.out.println("BAJA CALIFORNIA SUR");
        System.out.println("CAMPECHE");
        System.out.println("COAHUILA");
        System.out.println("COLIMA");
        System.out.println("CHIAPAS");
        System.out.println("CHIHUAHUA");
        System.out.println("CIUDAD DE MEXICO");
        System.out.println("DURANGO");
        System.out.println("GUANAJUATO");
        System.out.println("GUERRERO");
        System.out.println("HIDALGO");
        System.out.println("JALISCO");
        System.out.println("MEXICO");
        System.out.println("MICHOACAN");
        System.out.println("MORELOS");
        System.out.println("NAYARIT");
        System.out.println("NUEVO LEON");
        System.out.println("OAXACA");
        System.out.println("PUEBLA");
        System.out.println("QUERETARO");
        System.out.println("QUINTANA ROO");
        System.out.println("SAN LUIS POTOSI");
        System.out.println("SINALOA");
        System.out.println("SONORA");
        System.out.println("TABASCO");
        System.out.println("TAMAULIPAS");
        System.out.println("TLAXCALA");
        System.out.println("VERACRUZ");
        System.out.println("YUCATAN");
        System.out.println("ZACATECAS");

        System.out.print("Escribe tu estado: ");
        String entidad = entrada.nextLine().toUpperCase();

        String resultado = generarCURP(nom, paterno, materno,
                nacimiento, genero, entidad);

        System.out.println("CURP Generada: " + resultado);
    }

    public static String obtenerPrimeraLetra(String palabra) {
        return palabra.substring(0, 1);
    }

    public static String obtenerPrimeraVocal(String palabra) {

        for (int i = 1; i < palabra.length(); i++) {

            char letra = palabra.charAt(i);

            if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {

                return "" + letra;
            }
        }

        return "X";
    }

    public static String obtenerPrimeraConsonante(String palabra) {

        for (int i = 1; i < palabra.length(); i++) {

            char letra = palabra.charAt(i);

            if (letra != 'A' && letra != 'E' && letra != 'I' && letra != 'O' && letra != 'U') {

                return "" + letra;
            }
        }

        return "X";
    }

    public static String obtenerFecha(String nacimiento) {

        String anio = nacimiento.substring(8, 10);
        String mes = nacimiento.substring(3, 5);
        String dia = nacimiento.substring(0, 2);

        return anio + mes + dia;
    }

    public static String obtenerClaveEstado(String entidad) {

        switch (entidad) {

            case "AGUASCALIENTES": return "AS";
            case "BAJA CALIFORNIA": return "BC";
            case "BAJA CALIFORNIA SUR": return "BS";
            case "CAMPECHE": return "CC";
            case "COAHUILA": return "CL";
            case "COLIMA": return "CM";
            case "CHIAPAS": return "CS";
            case "CHIHUAHUA": return "CH";
            case "CIUDAD DE MEXICO": return "DF";
            case "DURANGO": return "DG";
            case "GUANAJUATO": return "GT";
            case "GUERRERO": return "GR";
            case "HIDALGO": return "HG";
            case "JALISCO": return "JC";
            case "MEXICO": return "MC";
            case "MICHOACAN": return "MN";
            case "MORELOS": return "MS";
            case "NAYARIT": return "NT";
            case "NUEVO LEON": return "NL";
            case "OAXACA": return "OC";
            case "PUEBLA": return "PL";
            case "QUERETARO": return "QT";
            case "QUINTANA ROO": return "QR";
            case "SAN LUIS POTOSI": return "SP";
            case "SINALOA": return "SL";
            case "SONORA": return "SR";
            case "TABASCO": return "TC";
            case "TAMAULIPAS": return "TS";
            case "TLAXCALA": return "TL";
            case "VERACRUZ": return "VZ";
            case "YUCATAN": return "YN";
            case "ZACATECAS": return "ZS";

            default: return "NE";
        }
    }

    public static String generarCURP(String nom, String paterno, String materno, String nacimiento, String genero, String entidad) {

        String curp = "";

        curp += obtenerPrimeraLetra(paterno);
        curp += obtenerPrimeraVocal(paterno);
        curp += obtenerPrimeraLetra(materno);
        curp += obtenerPrimeraLetra(nom);

        curp += obtenerFecha(nacimiento);
        curp += genero;
        curp += obtenerClaveEstado(entidad);

        curp += obtenerPrimeraConsonante(paterno);
        curp += obtenerPrimeraConsonante(materno);
        curp += obtenerPrimeraConsonante(nom);

        curp += "26";

        return curp;
    }
}