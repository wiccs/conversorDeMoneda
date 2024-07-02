package com.conversor.conexion;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HTTP  {
    //Importamos la libreria y hacemos una instancia de la linreria:
    HttpClient cliente = HttpClient.newHttpClient();

    // Construimos una Solicitud com.conversor.conexion.HTTP:
    String apiKey = "5d05c8fff05114026f3391cc";

    //Llamar algo que traiga las bases:

    String base1;
    String base2;

    String json;

   public void sendRequest (){
       String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + base1 +"/"+ base2;
       HttpRequest request = HttpRequest.newBuilder()
               .uri(URI.create(url))
               .build();

       {
           try {
               HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());
               System.out.println(response.body());
               this.json = response.body();
           } catch (IOException e) {
               throw new RuntimeException(e);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
   }

    //Geters y setters

    public String getBase1() {
        return base1;
    }

    public void setBase1(String base) {
        this.base1 = base;
    }
    //----------------------------------------
    public String getBase2(){
        return base2;
    }
    public void setBase2(String base){
        this.base2 = base;
    }
    //--------------------------------------
    public String getJson(){
       return json;
    }

    public void setJson(String json){
       this.json = json;
    }




    //Pruebitas:
    public static void main(String[] args) {
      HTTP nueva = new HTTP();

    }
}
