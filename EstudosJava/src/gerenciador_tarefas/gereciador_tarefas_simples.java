package gerenciador_tarefas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class gereciador_tarefas_simples{
    public static void main(String[] args) {
        
        List<String> lista_tarefas = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        
        int opcao = 0;
        while(opcao != 4){
            System.out.println("Escolha uma das opções abaixo:\n1- Cadastrar tarefa\n2- Listar tarefa\n3- Excluir tarefa\n4- Sair");
            opcao = entrada.nextInt();
            entrada.nextLine();

            if(opcao == 1){
                System.out.println("Descreva sua tarefa com poucas palavras:");
                String inserir_tarefa = entrada.nextLine();
                lista_tarefas.add(inserir_tarefa);            
            }else if(opcao == 2){
                System.out.println("------------------------------------");
                for(int i=0; i<lista_tarefas.size(); ++i){
                    System.out.println((i+1) + "- " + lista_tarefas.get(i));
                }
                System.out.println("------------------------------------");
            }else if(opcao == 3){
                System.out.println("Escolha qual tarefa deseja excluir:");
                for(int i=0; i<lista_tarefas.size(); ++i){
                    System.out.println((i+1) + "- " + lista_tarefas.get(i));
                }
                int excluir = entrada.nextInt();
                entrada.nextLine();
                excluir -= 1;
                lista_tarefas.remove(excluir);   
            }
        }
    }
}