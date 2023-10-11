package estudo_heranca;


public class BicicletaMotorizada extends Automovel{
    
    @Override
    public void acelerar(float giradaAcelerador){
        float porcentagemGirada = giradaAcelerador/100;
        float velocidade = super.getVelocidade();
        velocidade += velocidade * porcentagemGirada; 

        super.setVelocidade(velocidade);
        super.setContagemAceleradas();
        int aceleradas = super.getContagemAceleradas();

        double distancia = super.getVelocidade()/100 * aceleradas;
        super.setDistancia(distancia);
        System.out.printf("O automóvel está a %.2f km/h, e já percorreu %f km. \n", velocidade, distancia);
    }
}
