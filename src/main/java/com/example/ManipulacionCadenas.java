package com.example;

public class ManipulacionCadenas {

    public static void demostrarConcatenacion(){

        int numero = 10;
        String cadena = "Hola";
        String cadena2 = "Mundo";
        String cadena3 = cadena + " " + cadena2 + " " + numero;
        System.out.println(cadena3);
    }

    public static void demostrarMetodosutiles (){

        String cadena = "Hola Mundo";
        System.out.println(cadena.length());
        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.charAt(0));
        System.out.println(cadena.trim());
        System.out.println(cadena.substring(0, 4));
        System.out.println(cadena.substring(5));
        System.out.println(cadena.equals("Hola Mundo"));
        System.out.println(cadena.equalsIgnoreCase("hola mundo"));
        System.out.println(cadena.contains("Hola"));
        System.out.println(cadena.startsWith(cadena));
        System.out.println(cadena.endsWith("Mundo"));
    }

    public static void demostrarInmutabilidad(){

        String cadena = "Hola";
        cadena = "Adios";
        System.out.println(cadena);
    }

    public static void usarsteinRuilder(){

        StringBuilder cadena = new StringBuilder("Hola");
        cadena.append(" Mundo");
        System.out.println(cadena);
    }
}
