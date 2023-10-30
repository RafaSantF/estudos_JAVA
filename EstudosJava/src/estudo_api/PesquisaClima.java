package estudo_api;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PesquisaClima {
    
    public static void main(String[] args) throws IOException, InterruptedException  {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, insira o nome da cidade: ");
        String cidade = entrada.nextLine();
        System.out.println("Por favor, insira a sigla do estado: ");
        String estado = entrada.nextLine();
        
        
        HttpClient client = HttpClient.newHttpClient(); 
        HttpRequest request = HttpRequest.newBuilder() 
            .uri(URI.create("https://api.hgbrasil.com/weather?key=d6bb0b3d&city_name=" + cidade + "," + estado))
            .build();
        
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        
        Gson gson = new Gson();            
            Clima clima = gson.fromJson(response.body(), Clima.class);
            
        System.out.println(""); 
        
        String cidadeNome = clima.getResults().getCidade();
        String data = clima.getResults().getData();
        int temp = clima.getResults().getTemperatura();
        String climaHoje = clima.getResults().getClima();
        
            
        System.out.printf("""
                          Cidade: %s
                          Data: %s
                          Temperatura Máxima: %d
                          Clima: %s
                           """, cidadeNome, data, temp, climaHoje );
    }
}
