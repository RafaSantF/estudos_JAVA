package DAO;

import DTO.TesteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class TesteDAO {
    
    Connection conn;
    PreparedStatement pstm; 
    ResultSet rs;        
    
    ArrayList<TesteDTO> lista = new ArrayList<>(); 

    
    public void CadastrarPessoa(TesteDTO objtestedto){
        String sql = "INSERT INTO cadastro(Nome, Idade) VALUES (?, ?)";

        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objtestedto.getNome());
            pstm.setInt(2, objtestedto.getIdade());
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Pessoa cadastrado com sucesso.");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"TesteDAO CADASTRAR: " + erro);
        } 
    }
    
    public ArrayList <TesteDTO> Pesquisarpessoa(){
        String sql =  "SELECT * FROM cadastro";
        
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while (rs.next()){
                TesteDTO objtestedto = new TesteDTO();
                objtestedto.setId(rs.getInt("id"));
                objtestedto.setNome(rs.getString("nome"));
                objtestedto.setIdade(rs.getInt("idade"));
                
                lista.add(objtestedto);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "TesteDAO LISTAR: "+erro);
        }
        return lista;
    } 
    
    public void AtualizarPessoa(TesteDTO objtestedto){
        String sql = "UPDATE cadastro SET Idade = ? WHERE Nome = ?";
        
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objtestedto.getIdade());
            pstm.setString(2, objtestedto.getNome());
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso.");
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"TesteDAO ATUALIZAR: " + erro);
        }
    }
    
    public void DeletarPessoa(TesteDTO objtestedto){
        String sql_1 = "DELETE FROM cadastro WHERE Nome = ?"; 
        String sql_2 = "SET  @num := 0";
        String sql_3 = "UPDATE cadastro SET id = @num:= (@num+1)"; 
        String sql_4 = "ALTER TABLE cadastro AUTO_INCREMENT =1";
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql_1);
            pstm.setString(1, objtestedto.getNome());
            pstm.execute();
            pstm.close();
            pstm = conn.prepareStatement(sql_2);
            pstm.execute();
            pstm.close();
            pstm = conn.prepareStatement(sql_3);
            pstm.execute();
            pstm.close();
            pstm = conn.prepareStatement(sql_4);
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Pessoa deletada com sucesso.");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"TesteDAO DELETAR: " + erro);
        }   
    }
}
