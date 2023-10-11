package estudo_heranca;


public class Carro extends Automovel{
    
    @Override
    public void acelerar(float pisadaAcelerador){
        double fatorDesempenho = 50; //valor variável para cada automóvel. Idealiza o arranque do automóvel.
        float porcentagemPisada = pisadaAcelerador/100;
        float velocidade = super.getVelocidade();
        velocidade += fatorDesempenho * porcentagemPisada; 
        
        super.setVelocidade(velocidade);
        super.setContagemAceleradas();
        int aceleradas = super.getContagemAceleradas();

        double distancia = super.getVelocidade()/100 * aceleradas;
        super.setDistancia(distancia);
        System.out.printf("O automóvel está a %.2f km/h, e já percorreu %f km. \n", velocidade, distancia);

        
        
    }
    
    
}
