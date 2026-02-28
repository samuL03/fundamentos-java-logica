package com.example;

public class ArreglosUnidimensionales {

    public static void declararCrearInicializar(){
        int [] numeros = new int[10];
        int[] numeros2 = {1,2,3,4,5,6,7,8,9,10};
    }

    public static void mostrarLongitud(){
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(numeros.length);
    }

    public static void recorrerConForclasico(){
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public static void recorrerConForEach(){
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }

    public static void arrayComoParametroYRetorno() {
        int[] numeros = { 1, 2, 3, 4, 5 };
        int[] copia = (numeros);
    }
}
