package estudo_heranca;


public class Motocicleta extends Automovel{
    @Override
    public void acelerar(float giradaAcelerador){
        float porcentagemGirada = giradaAcelerador/100;
        float velocidade = super.getVelocidade();
        velocidade += velocidade * porcentagemGirada; 
        
        super.setVelocidade(velocidade);
        System.out.println("O automóvel está a " + velocidade + "km/h");
    }
}
