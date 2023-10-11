package estudo_heranca;


public class Automovel {
    private String tipo;
    private String modelo;
    private int ano;   
    private float velocidade;
    private float carga;
    private float distancia;
    private int contagemAceleradas;
    
    public void imprimeInfo(){
        String formato = """
                         Tipo do automóvel: %s
                         Modelo do automóvel: %s
                         Ano do automóvel: %d
                         """;
        
        String saidaFormatada = String.format(formato, this.tipo, this.modelo, this.ano);
        System.out.println(saidaFormatada);        
    }

    public String getTipo() {
        return tipo;
    }
   
    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
    
    public float getVelocidade(){
        return this.velocidade;
    }

    public float getCarga() {
        return carga;
    }

    public float getDistancia() {
        return distancia;
    }

    public int getContagemAceleradas() {
        return contagemAceleradas;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    } 
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }  
        
    public void setVelocidade(float velocidade){
        this.velocidade = velocidade;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public void setContagemAceleradas() {
        this.contagemAceleradas += 1;
    }

    public void acelerar(float velocidade){
    }
    
    public void distancia(){
    }

    public void carga(){
    }
}
