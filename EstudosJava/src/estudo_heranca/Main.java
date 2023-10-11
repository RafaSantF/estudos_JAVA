package estudo_heranca;


public class Main {

    public static void main(String[] args) {
        
        Carro carro1 = new Carro();
        carro1.setTipo("Carro");
        carro1.setModelo("Ford Mustang");
        carro1.setAno(2019);
        
        carro1.acelerar(100);
        carro1.acelerar(50);
        carro1.acelerar(52);
        
      
    }
    
}
