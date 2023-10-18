package estudo_polimorfismo;


public class ClasseHerdaAbstrata extends ClasseAbstrata{
    
    @Override
    public void imprimir(){
        System.out.println("Texo da classe que herda");
    }
    
    // ESTA CLASSE HERDA DE "ClasseAbstrata" E FINALIZA A IMPLEMENTAÇÃO COM O MÉTODO "imprimir".
}
    