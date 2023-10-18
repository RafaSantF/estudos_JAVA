package estudo_polimorfismo;


public interface Interface {
    
    public String retorna_texto();
    public void imprimir();
    
    // PERMITIDO A PARTIR DO JAVA 8 INSERIR UM MÉTODO COM IMPLEMENTAÇÃO EM UMA INTERFACE.
    public default void metodoDefault(){
        System.out.println("Imprimindo o método default");
    }
    
    public default int metodoDafaultTeste(int valor){
        return valor + 50;
    }
    
}
