package com.luisventuro.screenmatch;

public class prueba {
    public static void main(String[] args) {
        //matrices
        int[][] numero = new int[5][5];

        for (int i = 0; i< 5; i++){
            for (int j=0; j< 5; j++){
                numero[i][j] = i+j;
            }
        }

        //imprimir matriz
        for (int i = 0; i< 5; i++){
            for (int j=0; j< 5; j++){
                System.out.print(numero[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("+++++++++++MATRIZ POR FOR EACH++++++++");

        for (int[] fila: numero){
            for (int elemento: fila){
                System.out.println(elemento + "\t");
            }
            System.out.println();
        }
    }
}
