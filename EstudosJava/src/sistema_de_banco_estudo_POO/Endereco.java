package estudos_gerais;

public class Endereco {
  
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
    private int numero;    
    
    public String getLogradouro() {
        return logradouro;
    }
    
    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }
    
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    public String getCidade() {
        return cidade;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public String getPais() {
        return pais;
    }
    
    public void setPais(String pais){
        this.pais = pais;
    }

    public String getCep() {
        return cep;
    }
    
    public void setCep(String cep){
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;  
    }
}
