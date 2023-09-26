package estudo_poo_stm_bancario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {          
       
    public static void main(String[] args) {
        List<Agencia> listaAgencias = new ArrayList<>();

        int opcao = 0;
        Scanner entrada = new Scanner(System.in);
        
        while (opcao != 1){
            System.out.println("""
                               Por favor, digite uma das opções abaixo:
                               1 - Sair
                               2 - Cadastrar Agência
                               3 - Listar Agências
                               4 - Excluir Agência
                               5 - Cadastrar Cliente
                               6 - Excluir Cliente
                               7 - Realizar operações bancárias""");
            
            opcao = entrada.nextInt();
            entrada.nextLine();
            
            if (opcao == 1){
                break;
            } else if (opcao == 2) {
                Agencia agencia = new Agencia();
                String logradouro;
                String bairro;
                String cidade;
                String estado;
                String pais;
                String cep;
                int numero;
                System.out.print("Logradouro: ");
                logradouro = entrada.nextLine();
                agencia.endereco.setLogradouro(logradouro);
                System.out.print("Número: ");
                numero = -1;
                
                // TESTANDO CONDIÇÃO PARA QUE NÚMERO DO ESTABELECIMETNO NÃO SEJA MENOR OU IGUAL A ZERO.
                while (numero <= 0){
                    System.out.println("O número deve ser maior que zero.");
                    System.out.print("Número: ");
                    numero = entrada.nextInt();
                    entrada.nextLine();
                }
                
                agencia.endereco.setNumero(numero);
                System.out.print("Bairro: ");
                bairro = entrada.nextLine();
                agencia.endereco.setBairro(bairro);
                System.out.print("Cidade: ");
                cidade = entrada.nextLine();
                agencia.endereco.setCidade(cidade);
                System.out.print("Estado: ");
                estado = entrada.nextLine();
                agencia.endereco.setEstado(estado);
                System.out.print("Pais: ");
                pais = entrada.nextLine();
                agencia.endereco.setPais(pais);
                System.out.print("Cep: ");
                cep = entrada.nextLine();
                agencia.endereco.setCep(cep);
                
                if(listaAgencias.isEmpty()){
                    agencia.setNumeroAgencia(1);
                } else {
                    agencia.setNumeroAgencia(listaAgencias.get(listaAgencias.size()-1).getNumeroAgencia() + 1);
                }
                
                listaAgencias.add(agencia);            

                System.out.println("""
                                   \n------------------------------------------------
                                   Agência cadastrada com sucesso.
                                   ------------------------------------------------\n""");
                
            } else if (opcao == 3){
                
                if (listaAgencias.isEmpty()){
                    System.out.println("Não ha agências cadastradas.\n");
                } else if (listaAgencias.isEmpty() == false){
                    System.out.println("\n------------------------------------------------");
                    for(int i=0; i<listaAgencias.size(); i++){
                        System.out.println("Agência " + listaAgencias.get(i).getNumeroAgencia());
                    }
                    System.out.println("------------------------------------------------\n");
                    System.out.println("""
                                     Deseja listar clientes? 
                                     1 - Sim   
                                     2 - Não""");
                    int resposta = entrada.nextInt();
                    entrada.nextLine();
                    if (resposta == 1){
                        System.out.print("Digite o número da agência: ");
                        int agencia = entrada.nextInt();
                        entrada.nextLine();
                        System.out.println("------------------------------------------------");
                        for (int i=0; i<listaAgencias.get(agencia-1).listaClientes.size(); i++){
                            System.out.println("Conta: " + listaAgencias.get(agencia-1).listaClientes.get(i).getNumeroConta() + " Nome: " + listaAgencias.get(agencia-1).listaClientes.get(i).getNome());
                            }
                        System.out.println("------------------------------------------------\n");
                        
                        System.out.println("""
                                           Deseja listar dados do cliente? 
                                           1 - Sim   
                                           2 - Não""");
                            int resposta2 = entrada.nextInt();
                            entrada.nextLine();
                            if (resposta2 == 1){
                                System.out.print("Digite o número da conta: ");
                                int numeroConta = entrada.nextInt();
                                entrada.nextLine();
                                System.out.println("Conta: " + listaAgencias.get(agencia-1).listaClientes.get(numeroConta-1).getNumeroConta());
                                System.out.println("Nome: " + listaAgencias.get(agencia-1).listaClientes.get(numeroConta-1).getNome());
                                System.out.println("Cpf: " + listaAgencias.get(agencia-1).listaClientes.get(numeroConta-1).getCpf());
                                System.out.println("Data Nasc.: " + listaAgencias.get(agencia-1).listaClientes.get(numeroConta-1).getDataNascimento());
                                System.out.println("Logradouro: " + listaAgencias.get(agencia-1).listaClientes.get(numeroConta-1).endereco.getLogradouro());
                                System.out.println("Bairro: " + listaAgencias.get(agencia-1).listaClientes.get(numeroConta-1).endereco.getBairro());
                                System.out.println("Número: " + listaAgencias.get(agencia-1).listaClientes.get(numeroConta-1).endereco.getNumero());
                                System.out.println("Cidade: " + listaAgencias.get(agencia-1).listaClientes.get(numeroConta-1).endereco.getCidade());
                                System.out.println("Estado: " + listaAgencias.get(agencia-1).listaClientes.get(numeroConta-1).endereco.getEstado());
                                System.out.println("País: " + listaAgencias.get(agencia-1).listaClientes.get(numeroConta-1).endereco.getPais());
                                System.out.println("Cep: " + listaAgencias.get(agencia-1).listaClientes.get(numeroConta-1).endereco.getCep());
                                System.out.println("Agência: " + listaAgencias.get(agencia-1).listaClientes.get(numeroConta-1).getAgencia());          
                        }
                    } 
                                      
                    System.out.println("\n");
                }
                
            } else if (opcao == 4){
                if(listaAgencias.isEmpty()){
                    System.out.println("Não há agências cadastradas.\n");
                }else if(listaAgencias.isEmpty() == false){
                    System.out.println("Digite o número da agência que deseja apagar: \n");
                    for(int i=0; i<listaAgencias.size(); i++){
                        System.out.println("Agência " + listaAgencias.get(i).getNumeroAgencia());
                    }
                    System.out.println("\n");
                    
                    System.out.print("Digite o número da agência que deseja excluir: ");
                    int excluirAgencia = entrada.nextInt();    
                    entrada.nextLine();
                    listaAgencias.remove(excluirAgencia - 1);
                    
                    System.out.println("\n");
                    
                }
            } else if (opcao == 5){
                Cliente cliente = new Cliente();
                String nome;
                String cpf;
                String dataNascimento;
                int agencia;
                
                String logradouro;
                String bairro;
                String cidade;
                String estado;
                String pais;
                String cep;
                int numero;
                
                if(listaAgencias.isEmpty()){
                    System.out.println("Não há agências cadastradas.\n");
                    
                }else if(listaAgencias.isEmpty() == false){
                    System.out.println("Digite o número da agência em que o cliente será cadastrado: \n");
                    System.out.println("\n------------------------------------------------");
                    for(int i=0; i<listaAgencias.size(); i++){
                        System.out.println("Agência " + listaAgencias.get(i).getNumeroAgencia());
                    }
                    System.out.println("------------------------------------------------\n");

                    agencia = entrada.nextInt();
                    entrada.nextLine();
                    cliente.setAgencia(agencia);
                                        
                    System.out.print("Nome: ");
                    nome = entrada.nextLine();
                    cliente.setNome(nome);
                    System.out.print("CPF: ");
                    cpf = entrada.nextLine();
                    cliente.setCpf(cpf);
                    System.out.print("Data de Nascimento: ");
                    dataNascimento = entrada.nextLine();
                    cliente.setDataNascimento(dataNascimento);
                    System.out.print("Logradouro: ");
                    logradouro = entrada.nextLine();
                    cliente.endereco.setLogradouro(logradouro);
                    System.out.print("Bairro: ");
                    bairro = entrada.nextLine();
                    cliente.endereco.setBairro(bairro);
                    System.out.print("Cidade: ");
                    cidade = entrada.nextLine();
                    cliente.endereco.setCidade(cidade);
                    System.out.print("Estado: ");
                    estado = entrada.nextLine();
                    cliente.endereco.setEstado(estado);
                    System.out.print("Pais: ");
                    pais = entrada.nextLine();
                    cliente.endereco.setPais(pais);
                    System.out.print("CEP: ");
                    cep = entrada.nextLine();
                    cliente.endereco.setCep(cep);
                    System.out.print("Número: ");
                    numero = entrada.nextInt();
                    entrada.nextLine();
                    cliente.endereco.setNumero(numero);
                    
                    if(listaAgencias.get(agencia-1).listaClientes.isEmpty()){
                        cliente.setNumeroConta(1);
                    } else {
                        cliente.setNumeroConta(listaAgencias.get(agencia-1).listaClientes.get(listaAgencias.get(agencia-1).listaClientes.size()-1).getNumeroConta()+ 1);
                    }
                    listaAgencias.get(agencia-1).listaClientes.add(cliente);
                    System.out.println("""
                                   \n------------------------------------------------
                                   Cliente cadastrado com sucesso.
                                   ------------------------------------------------\n""");
                }  
                
            } else if (opcao == 6){
                if(listaAgencias.isEmpty()){
                    System.out.println("Não há agências cadastradas.\n");
                } else if (listaAgencias.isEmpty() == false) {
                    for(int i=0; i<listaAgencias.size(); i++){
                            System.out.println("Agência " + listaAgencias.get(i).getNumeroAgencia());
                        }

                    System.out.print("Digite a agência da qual a conta será excluída: ");

                    int agencia = entrada.nextInt();
                    entrada.nextLine();

                    for (int i=0; i<listaAgencias.get(agencia-1).listaClientes.size(); i++){
                        System.out.println("Conta: " + listaAgencias.get(agencia-1).listaClientes.get(i).getNumeroConta()+ " Nome: " + listaAgencias.get(agencia-1).listaClientes.get(i).getNome());
                        System.out.println("\n");
                    }

                    System.out.print("Digite o número da conta: ");
                    int numeroConta = entrada.nextInt();
                    entrada.nextLine();

                    listaAgencias.get(agencia-1).listaClientes.remove(numeroConta - 1);
                }
                
            // FUNÇÕES DE OPERAÇÕES BANCÁRIAS:
            
            } else if (opcao == 7) {
                System.out.println("""
                                   Qual operação deseja realizar?
                                   1 - Depositar
                                   2 - Sacar
                                   3 - Transferir
                                   4 - Verificar saldo""");
                    
                int resposta = entrada.nextInt();
                entrada.nextLine();
                
                if (resposta == 1){
                    System.out.print("Qual valor a ser depositado? ");
                    
                    int valor = entrada.nextInt();
                    entrada.nextLine();
                    
                    System.out.println("Digite a agência e conta em que será depositado: ");
                    System.out.print("Agência: ");
                    int agencia = entrada.nextInt();
                    entrada.nextLine();
                    
                    System.out.print("Conta: ");
                    int conta = entrada.nextInt();
                    entrada.nextLine();
                    System.out.println("");
                    
                    listaAgencias.get(agencia-1).listaClientes.get(conta-1).setSaldo(listaAgencias.get(agencia-1).listaClientes.get(conta-1).getSaldo() + valor);
                    System.out.println("""
                                   \n------------------------------------------------
                                   Deposito realizado com sucesso.
                                   ------------------------------------------------\n""");
                    
                } else if (resposta == 2) {
                    System.out.print("Qual valor a ser sacado? ");
                    
                    int valor = entrada.nextInt();
                    entrada.nextLine();
                    
                    System.out.println("Digite a agência e conta da qual o valor será sacado: ");
                    System.out.print("Agência: ");
                    int agencia = entrada.nextInt();
                    entrada.nextLine();
                    
                    System.out.print("Conta: ");
                    int conta = entrada.nextInt();
                    entrada.nextLine();
                    System.out.println("");
                    
                    listaAgencias.get(agencia-1).listaClientes.get(conta-1).setSaldo(listaAgencias.get(agencia-1).listaClientes.get(conta-1).getSaldo() - valor);
                    System.out.println("""
                                   \n------------------------------------------------
                                   Saque realizado com sucesso.
                                   ------------------------------------------------\n""");
                    
                } else if (resposta == 3){
                    System.out.println("Digite a agência e conta origem: ");
                    
                    System.out.print("Agência: ");
                    int agenciaOrigem = entrada.nextInt();
                    entrada.nextLine();
                    
                    System.out.print("Conta: ");
                    int contaOrigem = entrada.nextInt();
                    entrada.nextLine();
                    System.out.println("");
                    
                    System.out.println("Digite a agência e conta destino: ");
                    
                    System.out.print("Agência: ");
                    int agenciaDestino = entrada.nextInt();
                    entrada.nextLine();
                    
                    System.out.print("Conta: ");
                    int contaDestino = entrada.nextInt();
                    entrada.nextLine();
                    System.out.println("");
                    
                    System.out.print("Qual valor a ser transferido? ");
                    int valor = entrada.nextInt();
                    entrada.nextLine();
                    
                    listaAgencias.get(agenciaOrigem-1).listaClientes.get(contaOrigem-1).setSaldo(listaAgencias.get(agenciaOrigem-1).listaClientes.get(contaOrigem-1).getSaldo() - valor);
                    listaAgencias.get(agenciaDestino-1).listaClientes.get(contaDestino-1).setSaldo(listaAgencias.get(agenciaDestino-1).listaClientes.get(contaDestino-1).getSaldo()+ valor);
                    
                    System.out.println("""
                                   \n------------------------------------------------
                                   Transferência realizada com sucesso.
                                   ------------------------------------------------\n""");
                
                } else if (resposta == 4) {
                    System.out.println("Digite a agência e conta que deseja conferir: ");
                    System.out.print("Agência: ");
                    int agencia = entrada.nextInt();
                    entrada.nextLine();
                    
                    System.out.print("Conta: ");
                    int conta = entrada.nextInt();
                    entrada.nextLine();
                    System.out.println("");
                    System.out.println("------------------------------------------------\n");
                    System.out.println(listaAgencias.get(agencia-1).listaClientes.get(conta-1).getSaldo());
                    System.out.println("------------------------------------------------\n");   
                }
                
            }  
        }
    }
}


