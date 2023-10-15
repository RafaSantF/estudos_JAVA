package estudo_heranca;


public class Main {

    public static void main(String[] args) {
        
        BicicletaMotorizada bike1 = new BicicletaMotorizada("Bike", "GasBike", 2023, 20, 2);
        
        bike1.imprimeInfo();
        
        bike1.abastecer(5);
        
        bike1.acelerar(400);
        bike1.acelerar(400);
        bike1.acelerar(400);
        bike1.acelerar(400);
        bike1.acelerar(400);
        bike1.acelerar(400);
        
        bike1.pedalar(10);
        bike1.pedalar(10);
        
        // CONFIGURAR MÉTODO PEDALAR PARA FUNCIONAR SOMENTE SE VELOCIDADE FOR REDUZIDA PARA ???
        // CRIAR DOIS MÉTODOS DISTINTOS PARA CARRO E MOTOCICLETA

       

      
    }
    
}
