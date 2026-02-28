package com.example;

public class ConversionDeTipos {
    public static void demostrarCastingImplicito(){
        System.out.println("Demostración de casting implícito");

        int numero = 8;
        double numeroDecimal = numero;

        System.out.println(numeroDecimal);
    }

    public static void demostrarCastingExplicito(){
        System.out.println("Demostración de casting explícito");

        double decimal = 145.5;
        int numeroEntero = (int) decimal;

        System.out.println(numeroEntero);
    }

    public static void demostrarProblemasDePrecision(){
        System.out.println("ejercios de problemas de precision");

        double a = 0.1;
        double b = 0.2;
        double resultado = a + b;

        System.out.println(resultado);
    }
    
}
