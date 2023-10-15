package estudo_heranca;


public class Main {

    public static void main(String[] args) {
        
        Carro carro1 = new Carro("Carro", "Fiat Argo", 2022, 50, 9);
  
        carro1.abastecer(0.8f);
        
        carro1.acelerar(100);
        carro1.acelerar(50);
        carro1.acelerar(10);
        
        carro1.acelerar(-50);
        carro1.acelerar(-30);
        carro1.acelerar(30);
           

      
    }
    
}
