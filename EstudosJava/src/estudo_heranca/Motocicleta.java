package estudo_heranca;


public class Motocicleta extends Automovel{
    
    @Override
    public void acelerar(float giradaAcelerador){
        double fatorDesempenho = 20;
        float porcentagemGirada = giradaAcelerador/100;
        float velocidade = super.getVelocidade();
        velocidade += fatorDesempenho * porcentagemGirada;        
        
        super.setVelocidade(velocidade);
        super.setContagemAceleradas();
        int aceleradas = super.getContagemAceleradas();

        float distancia = super.getVelocidade()/100 * aceleradas;
        super.setDistancia(distancia);
        System.out.printf("O automóvel está a %.2f km/h, e já percorreu %f km. \n", velocidade, distancia);
    }
}
