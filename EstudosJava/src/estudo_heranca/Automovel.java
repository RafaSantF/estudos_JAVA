package estudo_heranca;


public class Automovel {
    private String tipo;
    private String modelo;
    private int ano;   
    private double velocidade;
    private int carga;
    private double distancia;
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
    
    public double getVelocidade(){
        return this.velocidade;
    }

    public int getCarga() {
        return carga;
    }

    public double getDistancia() {
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
        
    public void setVelocidade(double velocidade){
        this.velocidade = velocidade;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setContagemAceleradas() {
        this.contagemAceleradas += 1;
    }

    public void acelerar(int velocidade){
    }
    
    public void distancia(){
    }

    public void carga(){
    }
}
