package br.com.login.view;

import br.com.login.controller.LoginController;
import br.edu.utilidades.LimitadorChar;
import br.edu.utilidades.Validador;
import static java.awt.event.KeyEvent.VK_ENTER;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class LoginView extends javax.swing.JFrame {

    public LoginView() {
        initComponents();
        // Irá validar o que foi escrito e se está nos padrões da classe 
        UsuarioLogin.setDocument(new Validador(40, Validador.TipoEntrada.USUARIO));
        SenhaLogin.setDocument(new Validador(15, Validador.TipoEntrada.SENHA));
        
        //Limita a quantidade de caracteres a ser digitado
        UsuarioLogin.setDocument(new LimitadorChar(40));
        SenhaLogin.setDocument(new LimitadorChar(15));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ajudaLogin = new javax.swing.JButton();
        UsuarioLogin = new javax.swing.JTextField();
        SenhaLogin = new javax.swing.JPasswordField();
        FazerCadastro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        entrarLogin = new javax.swing.JButton();
        areaTotal_Login = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        SairMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - Black Cat Company");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(200, 200));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ajudaLogin.setBackground(new java.awt.Color(24, 24, 32));
        ajudaLogin.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        ajudaLogin.setForeground(new java.awt.Color(255, 255, 255));
        ajudaLogin.setText("Ajuda?");
        ajudaLogin.setBorder(null);
        ajudaLogin.setBorderPainted(false);
        ajudaLogin.setContentAreaFilled(false);
        ajudaLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ajudaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajudaLoginActionPerformed(evt);
            }
        });
        getContentPane().add(ajudaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 100, 60));

        UsuarioLogin.setBackground(new java.awt.Color(33, 41, 51));
        UsuarioLogin.setForeground(new java.awt.Color(255, 255, 255));
        UsuarioLogin.setBorder(null);
        UsuarioLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioLoginActionPerformed(evt);
            }
        });
        UsuarioLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UsuarioLoginKeyPressed(evt);
            }
        });
        getContentPane().add(UsuarioLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 280, 40));

        SenhaLogin.setBackground(new java.awt.Color(33, 41, 51));
        SenhaLogin.setForeground(new java.awt.Color(255, 255, 255));
        SenhaLogin.setBorder(null);
        SenhaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaLoginActionPerformed(evt);
            }
        });
        SenhaLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SenhaLoginKeyPressed(evt);
            }
        });
        getContentPane().add(SenhaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 280, 40));

        FazerCadastro.setContentAreaFilled(false);
        FazerCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FazerCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FazerCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(FazerCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 80, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ENTRAR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 110, 70));

        entrarLogin.setContentAreaFilled(false);
        entrarLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarLoginActionPerformed(evt);
            }
        });
        entrarLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                entrarLoginKeyPressed(evt);
            }
        });
        getContentPane().add(entrarLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 300, 70));

        areaTotal_Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/telaLogin2.0.png"))); // NOI18N
        areaTotal_Login.setPreferredSize(new java.awt.Dimension(350, 350));
        getContentPane().add(areaTotal_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 540));

        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setEnabled(false);
        jMenuBar1.setFocusable(false);
        jMenuBar1.setRequestFocusEnabled(false);
        jMenuBar1.setVerifyInputWhenFocusTarget(false);

        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/icons/icons8-cardápio-20.png"))); // NOI18N
        Menu.setText("Menu");
        Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        SairMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SairMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/icons/icons8-saída-de-emergência-24.png"))); // NOI18N
        SairMenu.setText("Sair");
        SairMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SairMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairMenuActionPerformed(evt);
            }
        });
        Menu.add(SairMenu);

        jMenuBar1.add(Menu);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FazerCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FazerCadastroActionPerformed
        CadastroView telaDeCadastro = new CadastroView();
        telaDeCadastro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_FazerCadastroActionPerformed

    private void entrarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarLoginActionPerformed
       
        if(UsuarioLogin.getText().matches("") || SenhaLogin.getText().matches("")){
        JOptionPane.showMessageDialog(rootPane, "prencha todos o Campos");
    }else{
            try{
        this.setVisible(false);
        LoginController login = new LoginController();
        login.loginUsuario(this);
        this.setVisible(true);
        
       } catch(SQLException sql){
           
       }
        }     
    }//GEN-LAST:event_entrarLoginActionPerformed

    private void UsuarioLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioLoginActionPerformed
        
    }//GEN-LAST:event_UsuarioLoginActionPerformed

    private void SenhaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaLoginActionPerformed
        
    }//GEN-LAST:event_SenhaLoginActionPerformed

    private void ajudaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajudaLoginActionPerformed
        AjudaView telaDeAjuda = new AjudaView();
        telaDeAjuda.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ajudaLoginActionPerformed

    private void UsuarioLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsuarioLoginKeyPressed
        if(evt.getKeyCode() == evt.VK_DOWN){
            SenhaLogin.requestFocus();
        }
        if(evt.getKeyCode() == VK_ENTER){
            SenhaLogin.requestFocus();
        }
    }//GEN-LAST:event_UsuarioLoginKeyPressed

    private void SenhaLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SenhaLoginKeyPressed
        if(evt.getKeyCode() == evt.VK_UP){
            UsuarioLogin.requestFocus();
        }
        if(evt.getKeyCode() == VK_ENTER){
            entrarLogin.doClick();
        }
    }//GEN-LAST:event_SenhaLoginKeyPressed

    private void entrarLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entrarLoginKeyPressed
        
    }//GEN-LAST:event_entrarLoginKeyPressed

    private void SairMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairMenuActionPerformed

        System.exit(0);
    }//GEN-LAST:event_SairMenuActionPerformed

    public JTextField getUsuarioLogin() {
        return UsuarioLogin;
    }

    public void setUsuarioLogin(JTextField UsuarioLogin) {
        this.UsuarioLogin = UsuarioLogin;
    }

    public JPasswordField getSenhaLogin() {
        return SenhaLogin;
    }

    public void setSenhaLogin(JPasswordField senhaLogin) {
        this.SenhaLogin = senhaLogin;
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FazerCadastro;
    private javax.swing.JMenu Menu;
    private javax.swing.JMenuItem SairMenu;
    private javax.swing.JPasswordField SenhaLogin;
    private javax.swing.JTextField UsuarioLogin;
    private javax.swing.JButton ajudaLogin;
    private javax.swing.JLabel areaTotal_Login;
    private javax.swing.JButton entrarLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
