package com.example;

public class EstructurasDeRepeticion {

    public static void ejemploWhile() {
        System.out.println("while");

        int a = 0;
        while (a < 10) {
            System.out.println(a);
            a++;
        }
    }

    public static void ejemploDoWhile() {
        System.out.println("do while");

        int a = 0;
        do {
            System.out.println(a);
            a++;
        } while (a < 10);
    }

    public static void ejemploForClasico() {
        System.out.println("for");

        for (int a = 0; a < 10; a++) {
            System.out.println(a);
        }
    }

    public static void ejemploForAnidado() {
        System.out.println("for anidado");

        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                System.out.println(a + " " + b);
            }
        }

    }

    public static void ejemploBreakContinue() {
        System.out.println("break y continue");

        for (int a = 0; a < 10; a++) {
            if (a == 5) {
                break;
            }
            System.out.println(a);
        }

        for (int a = 0; a < 10; a++) {
            if (a == 5) {
                continue;
            }
        }
    }  // ✅ ESTA LLAVE FALTABA

    public static void ejemploEtiquetas() {
        System.out.println("etiquetas");

        etiqueta1: for (int a = 0; a < 10; a++) {
            etiqueta2: for (int b = 0; b < 10; b++) {
                if (a == 5) {
                    break etiqueta1;
                }
                System.out.println(a + " " + b);
            }
        }

    }
}
