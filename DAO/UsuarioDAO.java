package DAO;

import DTO.UsuarioDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    
   Connection conn;
   
   public ResultSet autenticacaoUsuario(UsuarioDTO objusuariodto){
    conn = new ConexaoDAO().conectaBD();
    
       try {
           String sql = "SELECT * FROM usuario WHERE nome_usuario = ? AND senha_usuario = ?";
           
           PreparedStatement pstm = conn.prepareStatement(sql);
           pstm.setString(1, objusuariodto.getNome_usuario());
           pstm.setString(2, objusuariodto.getSenha_usuario());
           ResultSet rs = pstm.executeQuery();
           return rs;
           
       } catch (SQLException erro) {
           JOptionPane.showMessageDialog(null,"UsuarioDAO: " + erro);
           return null;
       } 
       
       
       
   }
}
