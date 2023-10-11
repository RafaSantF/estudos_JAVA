package estudo_heranca;


public class Carro extends Automovel{
    
    public void abastecer(float quantidadeAbastecida){
        float quantidadeAtual = super.getCarga();
        float abastecido = quantidadeAtual + quantidadeAbastecida;
        super.setCarga(abastecido);
        System.out.printf("O automóvel está com %.2f litros de combustível. \n", super.getCarga());
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

            float distancia = super.getVelocidade()/800;
            super.setDistancia(super.getDistancia() + distancia);

            float consumo = distancia * 8;
            float quantidadeAtual = super.getCarga();
            super.setCarga(quantidadeAtual - consumo);

            System.out.printf("O automóvel está a %.2f km/h, e já percorreu %.2f km. \n", super.getVelocidade(), super.getDistancia());
            System.out.printf("O automóvel está com %.2f litros de combustível \n", super.getCarga());
            if (super.getCarga() < 0){
                System.out.println("O automóvel entrou na reserva de combustível.");
            }
        } else {
            System.out.println("O automóvel está sem combustível, favor abastecer.");
        }
    }
}
