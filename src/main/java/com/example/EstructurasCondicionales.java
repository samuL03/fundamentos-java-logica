package com.example;

public class EstructurasCondicionales {

    public static void ejemploIf() {
        System.out.println("if");

        int edad = 18;

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }
    }

    public static void ejemploIfElse() {
        System.out.println("if else");

        int edad = 17;

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }

    public static void ejemploIfElseIf() {
        System.out.println("if else if");

        int edad = 17;

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else if (edad >= 16) {
            System.out.println("Eres un adolecente");
        } else {
            System.out.println("Eres menor de edad");
        }
    }

    public static void ejemploSwitch() {
        System.out.println("switch");

        int edad = 17;
        switch (edad) {
            case 18:
                System.out.println("Eres mayor de edad");
                break;
            case 16:
                System.out.println("Eres un adolecente");
                break;
            default:
                System.out.println("Eres menor de edad");
                break;
        }
    }

    public static void ejemploSwitchExpression() {
        System.out.println("switch expression");

        int edad = 17;
        String resultado = switch (edad) {
            case 18 -> "Eres mayor de edad";
            case 16 -> "Eres un adolecente";
            default -> "Eres menor de edad";
        };
        System.out.println(resultado);
        
    }

}
