package estudo_heranca;


public class Carro extends Automovel{
    
    @Override
    public void acelerar(int pisadaAcelerador){
        double porcentagemPisada = pisadaAcelerador/100;
        double velocidade = super.getVelocidade();
        velocidade += velocidade * porcentagemPisada; 
        
        super.setVelocidade(velocidade);
        super.setContagemAceleradas();
        int aceleradas = super.getContagemAceleradas();

        double distancia = (super.getVelocidade()/10 + 1) * 10 * aceleradas;
        super.setDistancia(distancia);
        System.out.println("O automóvel está a " + velocidade + "km/h, e já percorreu " + distancia + " km.");
        
        
    }
    
    
}
