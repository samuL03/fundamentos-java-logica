package com.example;

public class ArreglosBidimensionales {

    public static void declararCrearMatrices(){
        int[][] matriz = new int[3][3];
    }


    public static void recorrerMatriz(){
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]);
            }
        }
        
    }

    public static void ejemploUsosTipicos(){
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i + j;
            }
        }   
    }

}
