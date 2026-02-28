package com.example;
import java.util.Scanner;

public class ManejobasicoExcepciones {

    public static void ejemploTryCatchDivision(){
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        }
    }

    public static void ejemploTryCatchInput(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese un número entero:");
            int numero = scanner.nextInt();
            System.out.println("El número ingresado es: " + numero);
        } catch (Exception e) {
            System.out.println("Error: No se ingresó un número entero válido.");
        }
    }

    public static void ejemploBloqueFinally(){
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        } finally {
            System.out.println("Este bloque se ejecuta siempre, incluso si hay una excepción.");
        }
    }

    public static void evitarCierrePrograma(){
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        } finally {
            System.out.println("Este bloque se ejecuta siempre, incluso si hay una excepción.");
        }
    }
}
