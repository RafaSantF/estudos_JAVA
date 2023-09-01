package estudo_ordenacao_listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    
    public static void main(String[] args) {
        
        List<Compra> listaCompras = new ArrayList<>();
        
        Compra compra1 = new Compra("lápis", 5);
        Compra compra2 = new Compra("caneta", 8);
        Compra compra3 = new Compra("borracha", 3);
        Compra compra4 = new Compra("grafite", 1);
                
        listaCompras.add(compra1);
        listaCompras.add(compra2);
        listaCompras.add(compra3);
        listaCompras.add(compra4);
        
        Collections.sort(listaCompras);
        
        for(int i = 0; i<listaCompras.size(); i++){
            System.out.println(listaCompras.get(i));
        }
    }
}

