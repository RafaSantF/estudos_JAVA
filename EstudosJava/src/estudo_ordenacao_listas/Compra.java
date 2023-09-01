package estudo_ordenacao_listas;

public class Compra implements Comparable<Compra>{
    private final String descricao;
    private final double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Compra: descricao = " + descricao + " // valor = " + valor ;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(outraCompra.valor); 
    }
 
    
    
    
}
