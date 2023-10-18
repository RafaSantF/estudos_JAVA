package estudo_polimorfismo;


public abstract class ClasseAbstrata implements Interface {

    @Override
    public String retorna_texto(){
        return "texto da classe abstrata";
    }  
    
    // A CLASSE É ABSTRATA POIS NÃO IMPLEMENTA TODOS OS MÉTODOS DA INTERFACE. NO CASO O "imprimir".
}
