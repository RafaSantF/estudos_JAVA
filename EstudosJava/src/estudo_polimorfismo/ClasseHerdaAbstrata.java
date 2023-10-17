package estudo_polimorfismo;


public class ClasseHerdaAbstrata extends ClasseAbstrata{
    
    @Override
    public void imprimir(){
        System.out.println(retorna_texto());
    }
}
    