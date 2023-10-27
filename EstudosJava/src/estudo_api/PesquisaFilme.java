package estudo_api;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.Scanner;


public class PesquisaFilme {
    
    public static void main(String[] args) throws IOException, InterruptedException {
        //API Key = 420b9651
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, insira o nome de um filme: ");
        String nome = entrada.nextLine();
        
        
        HttpClient client = HttpClient.newHttpClient(); //estudar...
        HttpRequest request = HttpRequest.newBuilder() //estudar...
            .uri(URI.create("https://www.omdbapi.com/?apikey=420b9651&t=" + nome))
            .build();
        // No OMDb cria-se a chave
        // Na plataforma Postman, foi adicionada a chave (parâmetro "apikey") e o nome do filme (parâmetro "t")
        // Neste código o parâmetro "t" foi subsituido por uma entrada em Scanner, para pesquisa do filme 
        
        HttpResponse<String> response = client //estudar...
            .send(request, HttpResponse.BodyHandlers.ofString()); //estudar...  
        
        System.out.println(response.body()); // Esta linha imprime a "lista" que a API retorna.
        
        
        
        Gson gson = new Gson(); 
            // Para utilizar esta classe, foi feito o download o arquivo .jar em Maven Repository. O arquivo foi salvo na pasta deste projeto e posteriormente 
            // adicionado em Library. 
            
            Filme filme = gson.fromJson(response.body(), Filme.class);
            
        System.out.println(""); //pular linha
        
        String nomeFilme = filme.getNome();
        String anoDeLancamento = filme.getAnoDeLancamento();
        String diretor = filme.getDiretor();
            
        System.out.printf("""
                          Nome: %s
                          Ano de Lançamento: %s
                          Diretor: %s
                           """, nomeFilme, anoDeLancamento, diretor);
        
        

    
    }

}
