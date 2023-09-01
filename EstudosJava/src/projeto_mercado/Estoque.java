package projeto_mercado;

public class Estoque{
    
    int quantidade_picanha = 0;
    int quantidade_contra = 0;
    int quantidade_alcatra = 0;
    int quantidade_belvita = 0;
    int quantidade_nesfit = 0;
    int quantidade_trakinas = 0;
    
    // ENTRADA NO ESTOQUE
    public void setPicanha(int quantidade){
        this.quantidade_picanha += quantidade;
    }
    public void setContra(int quantidade){
        this.quantidade_contra += quantidade;
    }
    public void setAlcatra(int quantidade){
        this.quantidade_alcatra += quantidade;
    }
    public void setBelvita(int quantidade){
        this.quantidade_belvita += quantidade;
    }
    public void setNesfit(int quantidade){
        this.quantidade_nesfit += quantidade;
    }
    public void setTrakinas(int quantidade){
        this.quantidade_trakinas += quantidade;
    }
    
    // SAÍDA DO ESTOQUE
    public void setPicanhaVenda(int quantidade){
        this.quantidade_picanha -= quantidade;
    }
    public void setContraVenda(int quantidade){
        this.quantidade_contra -= quantidade;
    }
    public void setAlcatraVenda(int quantidade){
        this.quantidade_alcatra -= quantidade;
    }
    public void setBelvitaVenda(int quantidade){
        this.quantidade_belvita -= quantidade;
    }
    public void setNesfitVenda(int quantidade){
        this.quantidade_belvita -= quantidade;
    }
    public void setTrakinasVenda(int quantidade){
        this.quantidade_trakinas -= quantidade;
    }
        
}