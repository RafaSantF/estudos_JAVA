package estudo_heranca;


public class Automovel {
    private String tipo;
    private String modelo;
    private int ano;   
    private float velocidade;
    private float carga;
    private float distancia;
    private int contagemAceleradas;
    float fatorDesempenho;
    int consumo;
    
    public Automovel (float fatorDesempenho, int consumo){
        this. fatorDesempenho = fatorDesempenho;
        this.consumo = consumo;
    }
    
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

    public void acelerar(float pisadaAcelerador){
        if (this.carga > 0){
            float porcentagemPisada = pisadaAcelerador/100; 

            this.velocidade += fatorDesempenho * porcentagemPisada;
            this.contagemAceleradas += 1;

            this.distancia += this.velocidade/800;
            
            float quantidadeAtual = this.carga;
            this.carga = quantidadeAtual - (consumo * distancia);

            System.out.printf("O automóvel está a %.2f km/h, e já percorreu %.2f km. Carga de combustível atual: %.2f litros\n", this.velocidade, this.distancia, this.carga);
            if (this.carga < 0){
                System.out.println("O automóvel entrou na reserva de combustível.");
            }
        } else {
            System.out.println("O automóvel está sem combustível, favor abastecer.");
        }
    }
    
    public void abastecer(float quantidadeAbastecida){
        this.carga += quantidadeAbastecida;
        System.out.printf("O automóvel foi abastecido e está com %.2f litros de combustível. \n", this.carga);
    }
    
}
    