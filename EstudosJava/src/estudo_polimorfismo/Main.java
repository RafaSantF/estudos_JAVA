package estudo_polimorfismo;

public class Main {

    public static void main(String[] args) {
        
        ClasseConcreta cc = new ClasseConcreta();
        
        ClasseConcreta2 cc2 = new ClasseConcreta2();
        
        Impressao impressao = new Impressao();
        
        impressao.imprimir(cc);
        impressao.imprimir(cc2);
        
        // O MÉTODO DA CLASSE QUE UTILIZA AS DUAS IMPLEMENTAÇÕES DEVE UTILIZAR O MESMO MÉTODO QUE HÁ EM CADA IMPLEMENTAÇÃO. NO CASO ACIMA OS MÉTODO "recebe-texto" e "imprimir".
        // TANTO A CLASSE "Impressao" QUANTO AS IMPLEMENTAÇÕES "ClasseConcreta" E "ClasseConcreta2" UTILIZAM DO MÉTODO "retorna_texto" E "imprimir".
        // DESSA FORMA, A INTERFACE TRAZ O SEGUINTE BENEFÍCIO:
        // UTILIZAR NA CLASSE "Main" UM MÉTODO QUE PODE RECEBER PARÂMETRO TANTO DO TIPO ClasseConcreta ou ClasseConcreta2
        
        
        // ABAIXO O TESTE COM A CLASSE ABSTRATA
        Interface abs = new ClasseHerdaAbstrata();
        
        abs.imprimir(); // IMPRIMINDO MÉTODO DA CLASSE FILHA
        System.out.println(abs.retorna_texto());
        
        // MÉTODO DEFAULT DA INTERFACE.
        abs.metodoDefault();
        
        // MÉTODO DEFAULT COM PARÂMETRO. 
        System.out.println(abs.metodoDafaultTeste(100));
        
    }
    
    
}
