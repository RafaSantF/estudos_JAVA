package estudo_heranca;


public class BicicletaMotorizada extends Automovel{

    public BicicletaMotorizada(String tipo, String modelo, int ano, float fatorDesempenho, int consumo) {
        super(tipo, modelo, ano, fatorDesempenho, consumo);
    }
    
    public void pedalar(int forca){
        if (super.getVelocidade() > 30){
            System.out.println("Reduza a velocidade para ao menos 20km/h para pedalar com segurança.");
        } else {
            super.setVelocidade(super.getVelocidade() + forca);
            super.setContagemAceleradas();

            super.setDistancia(super.getDistancia() + super.getVelocidade()/800);

            System.out.printf("O automóvel está a %.2f km/h, e já percorreu %.2f km. Carga de combustível atual: %.2f litros\n", super.getVelocidade(), super.getDistancia(), super.getCarga());
        }
    }
    
    @Override
    public void acelerar(float giradaAcelerador){
        if (super.getCarga() > 0 || giradaAcelerador < 0){
            float porcentagemGirada = giradaAcelerador/100; 

            super.setVelocidade(super.getVelocidade() + (fatorDesempenho * porcentagemGirada));
            super.setContagemAceleradas();

            super.setDistancia(super.getDistancia() + super.getVelocidade()/800);
            
            float quantidadeAtual = super.getCarga();
            if (giradaAcelerador > 0){
                super.setCarga(quantidadeAtual - (consumo * super.getDistancia()));
            }
            
            System.out.printf("O automóvel está a %.2f km/h, e já percorreu %.2f km. Carga de combustível atual: %.2f litros\n", super.getVelocidade(), super.getDistancia(), super.getCarga());
            if (super.getCarga() < 0 && giradaAcelerador > 0){
                System.out.println("O automóvel entrou na reserva de combustível.");
            }
        } else {
            System.out.println("O automóvel está sem combustível, favor ABASTECER ou PEDALAR.");
        }
    }
}
