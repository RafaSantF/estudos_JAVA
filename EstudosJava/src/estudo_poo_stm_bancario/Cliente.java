package estudo_poo_stm_bancario;

public class Cliente {
   
    private String nome;
    private String cpf;
    private String dataNascimento;
    Endereco endereco = new Endereco();
    private int agencia;
    private int numeroConta;
    
    private int saldo;
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
    
    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public int getAgencia(){
        return agencia;
    }    
       
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    
    public int getNumeroConta(){
        return numeroConta;
    }
    
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getSaldo(){
        return saldo;
    }
    
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
     
}
