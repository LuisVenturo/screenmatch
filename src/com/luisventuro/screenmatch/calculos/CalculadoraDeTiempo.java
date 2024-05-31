package com.luisventuro.screenmatch.calculos;
import com.luisventuro.screenmatch.modelos.Pelicula;
import com.luisventuro.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {

    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }
}
