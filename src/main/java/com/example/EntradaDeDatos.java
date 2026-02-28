package com.example;

import java.util.Scanner;

public class EntradaDeDatos {

    public static void Leervariostipos() {
        System.out.println("leer varios tipos de datos");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite un numero entero: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite un numero decimal: ");
        double num2 = entrada.nextDouble();
        System.out.println("Digite una cadena de texto: ");
        String text = entrada.next();
    }

    public static void manejarSaltoDeLineaPendiente() {
        System.out.println("manejar salto de linea pendiente");

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Edad: " + edad);
        System.out.println("Nombre: " + nombre);
    }


}
