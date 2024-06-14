package com.luisventuro.screenmatch;

import com.luisventuro.screenmatch.modelos.Pelicula;
import com.luisventuro.screenmatch.modelos.Serie;
import com.luisventuro.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class prueba {
    public static void main(String[] args) {
       /* //matrices
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
        }*///matrices
        Pelicula pelicula1 = new Pelicula("Los Avengers", 2020);
        pelicula1.setDuracionEnMinutos(120);
        pelicula1.setDirector("Luis venturo");
        pelicula1.setIncluidoEnElPlan(false);
        pelicula1.evalua(10);
        pelicula1.evalua(5);
        pelicula1.evalua(9);
        pelicula1.evalua(14);

        Serie serie1 = new Serie("La gerra de tronos", 2024);
        serie1.setTemporadas(10);
        serie1.setMinutosPorEpisodio(20);
        serie1.setIncluidoEnElPlan(true);
        //serie1.setDuracionEnMinutos(10); --> esto es algo que no debería estar habilitado para serie
        serie1.evalua(4);
        serie1.evalua(10);
        serie1.evalua(6);
        serie1.evalua(7);
        serie1.evalua(9);

        ArrayList<Titulo> cartelera = new ArrayList<>();
        cartelera.add(pelicula1);
        cartelera.add(serie1);

        for (Titulo entretenimiento: cartelera){
            System.out.println(entretenimiento);
            if (entretenimiento instanceof Pelicula pelicula){
                System.out.println(((Pelicula) entretenimiento).getClasificacion());
            }
        }

    }
}
