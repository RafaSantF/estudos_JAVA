package projeto_mercado;
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Estoque estoque = new Estoque();
        
        int compra_venda = 1;
        while(compra_venda != 0){
            System.out.println("Por favor, escolha um dos itens abaixo:\n1- Entrada no estoque\n2- Venda de produto\n0- Sair");
            compra_venda = input.nextInt();
            input.nextLine();
        
            if(compra_venda == 1){
                System.out.println("Por favor, escolha um dos produtos para ser inserido no estoque e em seguida, sua quantidade:");
                System.out.println("1- Carne: Picanha\n2- Carne: Contra File\n3- Carne: Alcatra");
                System.out.println("4- Biscoito: Belvita\n5- Biscoito: Nesfit\n6- Biscoito: Trakinas");
                int opcao_alimento_estoque = input.nextInt();
                input.nextLine();
                                
                System.out.println("Qual a quantidade a ser inserida no estoque?");
                int opcao_quantidade_estoque = input.nextInt();
                input.nextLine();
                   

                switch (opcao_alimento_estoque){
                    case 1 -> estoque.setPicanha(opcao_quantidade_estoque);
                    case 2 -> estoque.setContra(opcao_quantidade_estoque);
                    case 3 -> estoque.setAlcatra(opcao_quantidade_estoque);
                    case 4 -> estoque.setBelvita(opcao_quantidade_estoque);
                    case 5 -> estoque.setNesfit(opcao_quantidade_estoque);
                    case 6 -> estoque.setTrakinas(opcao_quantidade_estoque);
                }
                          
            }else if(compra_venda == 2){
                System.out.println("Por favor, escolha um dos produtos para a ser vendido e em seguida, sua quantidade:");
                System.out.println("1- Carne: Picanha\n2- Carne: Contra File\n3- Carne: Alcatra");
                System.out.println("4- Biscoito: Belvita\n5- Biscoito: Nesfit\n6- Biscoito: Trakinas");
                int opcao_alimento_estoque = input.nextInt();
                input.nextLine();

                System.out.println("Qual a quantidade vendida?");
                int opcao_quantidade_estoque = input.nextInt();
                input.nextLine();

                switch (opcao_alimento_estoque){
                    case 1 -> estoque.setPicanhaVenda(opcao_quantidade_estoque);
                    case 2 -> estoque.setContraVenda(opcao_quantidade_estoque);
                    case 3 -> estoque.setAlcatraVenda(opcao_quantidade_estoque);
                    case 4 -> estoque.setBelvitaVenda(opcao_quantidade_estoque);
                    case 5 -> estoque.setNesfitVenda(opcao_quantidade_estoque);
                    case 6 -> estoque.setTrakinasVenda(opcao_quantidade_estoque);
                }
            }else{
                System.out.println("Por favor, insira um dos comandos informados.");
            }          

            Carnes capital_carnes = new Carnes();
            int capital_estoque_carnes = capital_carnes.Alcatra(estoque.quantidade_alcatra) + capital_carnes.ContraFile(estoque.quantidade_contra) + capital_carnes.Picanha(estoque.quantidade_picanha);

            Biscoitos capital_biscoitos = new Biscoitos();
            int capital_estoque_biscoitos =  capital_biscoitos.Belvita(estoque.quantidade_belvita) + capital_biscoitos.Nesfit(estoque.quantidade_nesfit) + capital_biscoitos.Trakinas(estoque.quantidade_trakinas);

            // CÁLCULO DO VALOR TOTAL ARMAZENADO EM ESTOQUE.
            int valor_estoque = capital_estoque_carnes + capital_estoque_biscoitos;

            System.out.println("\nValor acumulado em estoque: R$" + valor_estoque + ",00");
        }       
    }  
}