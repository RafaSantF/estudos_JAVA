package estudo_polimorfismo;


public class ClasseConcreta2 implements Interface{

    public String retorna_texto(){
        return "Teste do método recebe_texto da ClasseConcreta2";
    }
    
    public void imprimir(){
        System.out.println("Teste do método imprimir da ClasseConcreta2");
    }
        
}
