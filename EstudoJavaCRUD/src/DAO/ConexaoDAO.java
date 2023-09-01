package DAO;

import java.sql.Connection;
import javax.swing.JOptionPane;
import  java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {
    
   public Connection conectaBD(){
       Connection conn = null;
       
       try {
           String url = "jdbc:mysql://localhost:3306/primeiro_programa_bd?user=root&password=123456";
           conn = DriverManager.getConnection(url);
           
       } catch (SQLException erro) {
           JOptionPane.showMessageDialog(null,"ConexaoDAO" +  erro.getMessage());
       }
       return conn;
   } 
}
