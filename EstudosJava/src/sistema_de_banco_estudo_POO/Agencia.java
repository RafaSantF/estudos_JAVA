package estudos_gerais;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    
    private int numeroAgencia;
    Endereco endereco = new Endereco();    
    List <Cliente> listaClientes = new ArrayList<>();

    public int getNumeroAgencia() {
        return numeroAgencia;
    }
    
    public void setNumeroAgencia(int numeroAgencia){
        this.numeroAgencia = numeroAgencia;
    }
}
