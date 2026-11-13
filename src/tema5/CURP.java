package tema5;

import java.util.Scanner;

public class CURP {

    static Scanner scanner = new Scanner(System.in);

    static String nombre;
    static String paterno;
    static String materno;
    static String fecha;
    static String sexo;
    static String estado;

    public static void main(String[] args) {

        System.out.print("Nombre: ");
        nombre = scanner.nextLine().toUpperCase();

        System.out.print("Apellido paterno: ");
        paterno = scanner.nextLine().toUpperCase();

        System.out.print("Apellido materno: ");
        materno = scanner.nextLine().toUpperCase();

        System.out.print("Fecha de nacimiento (DD/MM/AAAA): ");
        fecha = scanner.nextLine();

        System.out.print("Sexo (H/M): ");
        sexo = scanner.nextLine().toUpperCase();

        System.out.print("Entidad federativa: ");
        estado = scanner.nextLine().toUpperCase();

        System.out.println();
        System.out.println("CURP generada: " + generarCURP());
    }

    static String obtenerPrimeraLetra(String palabra) {
        return palabra.substring(0, 1);
    }

    static String obtenerPrimeraVocal(String palabra) {
        String vocal = "X";

        for (int i = 1; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            if ("AEIOU".indexOf(letra) != -1) {
                vocal = String.valueOf(letra);
                break;
            }
        }

        return vocal;
    }

    static String obtenerPrimeraConsonante(String palabra) {
        String consonante = "X";

        for (int i = 1; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            if ("BCDFGHJKLMNÑPQRSTVWXYZ".indexOf(letra) != -1) {
                consonante = String.valueOf(letra);
                break;
            }
        }

        return consonante;
    }

    static String obtenerFecha() {
        String dia = fecha.substring(0, 2);
        String mes = fecha.substring(3, 5);
        String anio = fecha.substring(8, 10);

        return anio + mes + dia;
    }

    static String obtenerClaveEstado() {
        String clave = "NE";

        switch (estado) {
            case "AGUASCALIENTES": clave = "AS"; break;
            case "BAJA CALIFORNIA": clave = "BC"; break;
            case "BAJA CALIFORNIA SUR": clave = "BS"; break;
            case "CAMPECHE": clave = "CC"; break;
            case "COAHUILA": clave = "CL"; break;
            case "COLIMA": clave = "CM"; break;
            case "CHIAPAS": clave = "CS"; break;
            case "CHIHUAHUA": clave = "CH"; break;
            case "CIUDAD DE MEXICO": clave = "DF"; break;
            case "DURANGO": clave = "DG"; break;
            case "GUANAJUATO": clave = "GT"; break;
            case "GUERRERO": clave = "GR"; break;
            case "HIDALGO": clave = "HG"; break;
            case "JALISCO": clave = "JC"; break;
            case "MEXICO": clave = "MC"; break;
            case "MICHOACAN": clave = "MN"; break;
            case "MORELOS": clave = "MS"; break;
            case "NAYARIT": clave = "NT"; break;
            case "NUEVO LEON": clave = "NL"; break;
            case "OAXACA": clave = "OC"; break;
            case "PUEBLA": clave = "PL"; break;
            case "QUERETARO": clave = "QT"; break;
            case "QUINTANA ROO": clave = "QR"; break;
            case "SAN LUIS POTOSI": clave = "SP"; break;
            case "SINALOA": clave = "SL"; break;
            case "SONORA": clave = "SR"; break;
            case "TABASCO": clave = "TC"; break;
            case "TAMAULIPAS": clave = "TS"; break;
            case "TLAXCALA": clave = "TL"; break;
            case "VERACRUZ": clave = "VZ"; break;
            case "YUCATAN": clave = "YN"; break;
            case "ZACATECAS": clave = "ZS"; break;
        }

        return clave;
    }

    static String generarCURP() {
        String curp = "";

        curp += obtenerPrimeraLetra(paterno);
        curp += obtenerPrimeraVocal(paterno);
        curp += obtenerPrimeraLetra(materno);
        curp += obtenerPrimeraLetra(nombre);
        curp += obtenerFecha();
        curp += sexo;
        curp += obtenerClaveEstado();
        curp += obtenerPrimeraConsonante(paterno);
        curp += obtenerPrimeraConsonante(materno);
        curp += obtenerPrimeraConsonante(nombre);
        curp += "A1";

        return curp;
    }
}