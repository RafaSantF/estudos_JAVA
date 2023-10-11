package estudo_heranca;


public class Carro extends Automovel{
    
    public void abastecer(float quantidadeAbastecida){
        float quantidadeAtual = super.getCarga();
        float abastecido = quantidadeAtual + quantidadeAbastecida;
        super.setCarga(abastecido);
        System.out.printf("O automóvel está com %f litros de combustível. \n", super.getCarga());
    }
    
    @Override
    public void acelerar(float pisadaAcelerador){
        if (super.getCarga() > 0){
            double fatorDesempenho = 50; //valor variável para cada automóvel. Idealiza o arranque do automóvel.
            float porcentagemPisada = pisadaAcelerador/100;
            float velocidade = super.getVelocidade();
            velocidade += fatorDesempenho * porcentagemPisada; 

            super.setVelocidade(velocidade);
            super.setContagemAceleradas();
            int aceleradas = super.getContagemAceleradas();

            float distancia = super.getVelocidade()/800 * aceleradas;
            super.setDistancia(distancia);

            float consumo = distancia * 8;
            float quantidadeAtual = super.getCarga();
            super.setCarga(quantidadeAtual - consumo);
            quantidadeAtual = super.getCarga();

            System.out.printf("O automóvel está a %.2f km/h, e já percorreu %f km. \n", velocidade, distancia);
            System.out.printf("O automóvel está com %f litros de combustível \n", quantidadeAtual);
            if (super.getCarga() < 0){
                System.out.println("O automóvel entrou na reserva de combustível.");
            }
        } else {
            System.out.println("O automóvel está sem combustível, favor abastecer.");
        }
    }
}
