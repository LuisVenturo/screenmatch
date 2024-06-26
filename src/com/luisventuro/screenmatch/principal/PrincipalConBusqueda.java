package com.luisventuro.screenmatch.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.luisventuro.screenmatch.excepcion.ErrorEnConversionDeDuracionException;
import com.luisventuro.screenmatch.modelos.Titulo;
import com.luisventuro.screenmatch.modelos.TituloOmdb;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        while (true){

            System.out.println("Escriba el nombre de la película: ");
            var busqueda = lectura.nextLine();

            if (busqueda.equalsIgnoreCase("salir")){
                break;
            }

            //primera forma de reemplazar el problema del espacio
            String direccion = "https://www.omdbapi.com/?t="+
                    URLEncoder.encode(busqueda, "UTF-8") +
                    "&apikey=d5244f96";
            //segunda forma de reemplazar por urlEncoder
            String direccion2 = "https://www.omdbapi.com/?t="+
                    busqueda.replace(" ","")+
                    "&apikey=d5244f96";

            try {

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);



                TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println("Titulo: "+ miTituloOmdb);


                Titulo miTitulo = new Titulo(miTituloOmdb);
                System.out.println("Titulo ya convertido: "+miTitulo);

                titulos.add(miTitulo);


            }catch (NumberFormatException e){
                System.out.println("Ocurrió un error");
                System.out.println(e.getMessage());
            }catch (IllegalArgumentException e){
                System.out.println("Error en l URI, verifica la dirección");
            }catch (ErrorEnConversionDeDuracionException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println(titulos);
        FileWriter escritura = new FileWriter("titulos.json");
        escritura.write(gson.toJson(titulos));
        escritura.close();
        System.out.println("Finalizó la ejecución del programa");


    }
}
