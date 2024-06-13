package com.luisventuro.screenmatch.principal;

import com.luisventuro.screenmatch.calculos.CalculadoraDeTiempo;
import com.luisventuro.screenmatch.calculos.FiltroRecomendacion;
import com.luisventuro.screenmatch.modelos.Episodio;
import com.luisventuro.screenmatch.modelos.Pelicula;
import com.luisventuro.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());


        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del dragón");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otrapelicula = new Pelicula();
        otrapelicula.setNombre("Matrix");
        otrapelicula.setFechaDeLanzamiento(1998);
        otrapelicula.setDuracionEnMinutos(180);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otrapelicula);
        System.out.println("Tiempo necesario para ver tus titulos favoritos estas vacaciones: "
                +calculadora.getTiempoTotal() + " minutos");


        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(300);
        
         filtroRecomendacion.filtra(episodio);


         var peliculaDeBruno = new Pelicula();
         peliculaDeBruno.setNombre("El señor de los anillos");
         peliculaDeBruno.setDuracionEnMinutos(1801);
         peliculaDeBruno.setFechaDeLanzamiento(2001);

        ArrayList<Pelicula> listaDePelicula = new ArrayList<>();
        listaDePelicula.add(peliculaDeBruno);
        listaDePelicula.add(miPelicula);
        listaDePelicula.add(otrapelicula);

        System.out.println("Tamaño de la lista: " + listaDePelicula.size());
        System.out.println("La primera pelicula es: " + listaDePelicula.get(0).getNombre());

        System.out.println(listaDePelicula);

        System.out.println("toString de la pelicula: " + listaDePelicula.get(0).toString());

    }
}
