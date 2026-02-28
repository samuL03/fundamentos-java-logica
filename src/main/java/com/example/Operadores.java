package com.example;

public class Operadores {
    public static void demostrarAritmeticos(){
        System.out.println("ejercisios de ritmeticos son: ");

        int num1 = 3;
        int num2 = 5;

        System.out.println("la suma es :" + (num1 + num2 ));
        System.out.println("la resta es :" + (num1 - num2 ));
        System.out.println("la multiplicacion  es :" + (num1 * num2 ));
        System.out.println("la division es :" + (num1 / num2 ));
        System.out.println("el modulo es :" + (num1 % num2 ));
       
    }

    public static void demostrarIncrementoDecremento(){
        System.out.println("ejercisios de incremento y decremento son: ");

        int k = 10;
        int l = 20;

        System.out.println("Incremento:" + (++k));
        System.out.println("Decremento:" + (--l));
    }

    public static void demostrarRelacionales(){
        System.out.println("ejercisios de relacionales son: ");

        int a = 1;
        int b = 3;

        System.out.println("mayor: " + (a > b));
        System.out.println("menor: " + (a < b));
        System.out.println("mayor o igual: " + (a >= b));
        System.out.println("menor o mayor: " + (a <= b));
        System.out.println("igual: " + (a == b));
        System.out.println("diferente: " + (a != b));
    }

    public static void demostrarLogicos(){
        System.out.println("Operadores Logicos");

        int i = 10;
        int n = 20;

        System.out.println("AND:" + (i > 5 && n > 10));
        System.out.println("OR:" + (i > 5 || n > 10));
        System.out.println("NOT:" + !(i > 5 && n > 10));
    }

    public static void demostrarAsignacionCompuesta(){
        System.out.println("Operadores de Asignacion Compuesta");
        int i = 10;
        int n = 20;

        System.out.println("Suma:" + (i += n));
        System.out.println("Resta:" + (i -= n));
        System.out.println("Multiplicacion:" + (i *= n));
        System.out.println("Division:" + (i /= n));
        System.out.println("Modulo:" + (i %= n));
    }
}
