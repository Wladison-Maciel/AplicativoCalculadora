package br.com.login.dao;

import br.com.login.view.TelaInicial;
import br.com.login.view.LoginView;
import br.com.login.view.CadastroView;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class LoginDAO {
    
    
    
    public void cadastrarUsuario(String nome, String email, String senha) throws SQLException{
    Connection conexao = new Conexao().getConnection();
    String sql = "insert into login (nome, email, senha) values ('"+nome+"','"+email+"','"+senha+"')";
    System.out.println(sql);
    PreparedStatement statment = conexao.prepareStatement(sql);
    statment.execute();
    conexao.close();
    }
    
    public void login(String nome, String senha) throws SQLException{
         Connection conexao = new Conexao().getConnection();
    String sql = "select nome,senha from login where nome = '"+nome+"'and senha = '"+senha+"'";
    System.out.println(sql);
    PreparedStatement statment = conexao.prepareStatement(sql);
    ResultSet rs = statment.executeQuery();
    
    if(rs.next()){
        TelaInicial telaInicial = new TelaInicial();
        telaInicial.setVisible(true);
        this.setVisible(false);
        
    }else{
         JOptionPane.showMessageDialog(null, "Login ou Senha INVALIDOS");
    }
    conexao.close();
    }

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
