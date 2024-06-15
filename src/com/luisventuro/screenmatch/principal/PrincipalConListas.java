package com.luisventuro.screenmatch.principal;


import com.luisventuro.screenmatch.modelos.Pelicula;
import com.luisventuro.screenmatch.modelos.Serie;
import com.luisventuro.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);
        Pelicula otrapelicula = new Pelicula("Matrix", 1998);
        otrapelicula.evalua(6);
        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2001);
        peliculaDeBruno.evalua(10);
        Serie casaDragon = new Serie("La casa del dragón", 2022);

        Pelicula p1 = peliculaDeBruno;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otrapelicula);
        lista.add(peliculaDeBruno);
        lista.add(casaDragon);

        for (Titulo item : lista) {
            System.out.println(item);

            //primera forma antes de java 14
           /* if(item instanceof Pelicula){
                //realizamos un casteo para convertir un item en pelicula
                Pelicula pelicula = (Pelicula) item;
                System.out.println(pelicula.getClasificacion());
            }*/

            //segunda forma despues de java 14
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() >3) {
                System.out.println(pelicula.getClasificacion());
            }

        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penélope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darín");

        System.out.println("Lista de Artistas no ordenada: "+listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de Artistas ordenada: "+listaDeArtistas);

        //comparación con listas de titulo, tuvimos que modificar puesto que no era un simplee String, sino un objeto
        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados: "+lista);

    }
}
