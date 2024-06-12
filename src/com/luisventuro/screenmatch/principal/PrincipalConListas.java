package com.luisventuro.screenmatch.principal;

import com.luisventuro.screenmatch.modelos.Pelicula;
import com.luisventuro.screenmatch.modelos.Serie;
import com.luisventuro.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);
        Pelicula otrapelicula = new Pelicula("Matrix", 1998);
        otrapelicula.evalua(6);
        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2001);
        peliculaDeBruno.evalua(10);
        Serie casaDragon = new Serie("La casa del dragón", 2022);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otrapelicula);
        lista.add(peliculaDeBruno);
        lista.add(casaDragon);

        for(Titulo item: lista){
            System.out.println(item);
            //realizamos un casteo para convertir un item en pelicula
            Pelicula pelicula = (Pelicula) item;
            System.out.println(pelicula.getClasificacion());
        }
    }
}
