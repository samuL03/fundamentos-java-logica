package com.example;

public class MetodosEstaticosSimples {

    public static void ejemploDeclaracionLlamada() {
        System.out.println("Hola, este es un método estático.");
        System.out.println("No recibe parámetros y no retorna nada.");
    }

    public static void ejemploPasoParametros(int numero) {
        System.out.println("El número ingresado es: " + numero);
    }

    public static int ejemploRetornoValores(int numero) {
        return numero * 2;
    }

    public static void ejemploSobrecarga(){
        System.out.println("Hola, este es un método estático.");
        System.out.println("No recibe parámetros y no retorna nada.");
    }
}
