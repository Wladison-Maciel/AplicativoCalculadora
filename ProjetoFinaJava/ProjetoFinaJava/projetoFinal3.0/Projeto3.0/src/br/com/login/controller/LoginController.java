package br.com.login.controller;

import br.com.login.view.CadastroView;
import br.com.login.dao.Conexao;
import br.com.login.dao.LoginDAO;
import br.com.login.view.LoginView;
import java.sql.Connection;
import java.sql.SQLException;

public class LoginController {
    
    
    public void cadastroUsuario(CadastroView view) throws SQLException{
    
    Connection conexao = new Conexao().getConnection();
    LoginDAO cadastro = new LoginDAO();
    cadastro.cadastrarUsuario(view.getNomeCadastro().getText(), view.getEmailCadastro().getText(), view.getSenhaCadastro().getText() );
    }
    
    public void loginUsuario(LoginView view) throws SQLException{
    
    Connection conexao = new Conexao().getConnection();
    LoginDAO login = new LoginDAO();
    login.login(view.getUsuarioLogin().getText(), view.getSenhaLogin() .getText());
    }
}