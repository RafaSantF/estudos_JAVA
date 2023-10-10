package estudo_heranca;


public class Main {

    public static void main(String[] args) {
        
        Carro carro1 = new Carro();
        carro1.setTipo("Carro");
        carro1.setModelo("Ford Mustang");
        carro1.setAno(2019);
        
        carro1.imprimeInfo();
        
        BicicletaMotorizada bike1 = new BicicletaMotorizada();
        bike1.setTipo("Bicicleta");
        bike1.setModelo("Caloi");
        bike1.setAno(2023);
        
        bike1.imprimeInfo();
        
        Motocicleta moto1 = new Motocicleta();
        moto1.setTipo("Motocicleta");
        moto1.setModelo("Yamaha Fazer");
        moto1.setAno(2015);
        
        moto1.imprimeInfo();
    }
    
}
