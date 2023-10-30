package estudo_api;
import com.google.gson.annotations.SerializedName;


public class Filme {
    @SerializedName("Title")   
    private String nome;
    @SerializedName("time")
    private String anoDeLancamento;
    @SerializedName("Director")
    private String diretor;

    public String getNome() {
        return nome;
    }

    public String getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(String anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    
    
    
}
