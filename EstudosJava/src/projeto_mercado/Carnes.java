package projeto_mercado;

public class Carnes {
    
    public int Picanha(int quantidade){
        int valor_picanha = quantidade * 55;
        return valor_picanha;
    }
    
    public int ContraFile(int quantidade){
        int valor_contra = quantidade * 42;
        return valor_contra;
    }
    
    public int Alcatra(int quantidade){
        int valor_alcatra = quantidade * 40;
        return valor_alcatra;
    }
}