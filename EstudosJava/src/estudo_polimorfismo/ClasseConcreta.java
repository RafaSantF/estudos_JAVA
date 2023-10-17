package estudo_polimorfismo;


public class ClasseConcreta implements Interface{

    public String retorna_texto(){
        return "Teste do método recebe_texto da ClasseConcreta";
    }
    
    public void imprimir(){
        System.out.println("Teste do método imprimir da ClasseConcreta");
    }
        
}
