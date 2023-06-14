package br.com.login.view;

import br.com.login.controller.LoginController;
import static br.edu.util.EnviaEmail.enviarEmail;
import br.edu.utilidades.LimitadorChar;
import br.edu.utilidades.Validador;
import static java.awt.event.KeyEvent.VK_ENTER;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadastroView extends javax.swing.JFrame {

    public CadastroView() {
        initComponents();
        
        
        
        // Irá validar o que foi escrito e se está nos padrões da classe
        NomeCadastro.setDocument(new Validador(40, Validador.TipoEntrada.USUARIO));
        EmailCadastro.setDocument(new Validador(40, Validador.TipoEntrada.EMAIL));
        senhaCadastro.setDocument(new Validador(15, Validador.TipoEntrada.SENHA));
        
        //Limita a quantidade de caracteres a ser digitado
        NomeCadastro.setDocument(new LimitadorChar(40));
        EmailCadastro.setDocument(new LimitadorChar(40));
        senhaCadastro.setDocument(new LimitadorChar(15));
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NomeCadastro = new javax.swing.JTextField();
        EmailCadastro = new javax.swing.JTextField();
        senhaCadastro = new javax.swing.JPasswordField();
        ButtonCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        AreaTotal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        VoltarMenu = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        SairMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro - Black Cat Company");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(200, 200));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NomeCadastro.setBackground(new java.awt.Color(33, 41, 51));
        NomeCadastro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NomeCadastro.setForeground(new java.awt.Color(255, 255, 255));
        NomeCadastro.setBorder(null);
        NomeCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeCadastroActionPerformed(evt);
            }
        });
        NomeCadastro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NomeCadastroKeyPressed(evt);
            }
        });
        getContentPane().add(NomeCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 280, 40));

        EmailCadastro.setBackground(new java.awt.Color(33, 41, 51));
        EmailCadastro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EmailCadastro.setForeground(new java.awt.Color(255, 255, 255));
        EmailCadastro.setBorder(null);
        EmailCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailCadastroActionPerformed(evt);
            }
        });
        EmailCadastro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EmailCadastroKeyPressed(evt);
            }
        });
        getContentPane().add(EmailCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 280, 40));

        senhaCadastro.setBackground(new java.awt.Color(33, 41, 51));
        senhaCadastro.setForeground(new java.awt.Color(255, 255, 255));
        senhaCadastro.setBorder(null);
        senhaCadastro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                senhaCadastroKeyPressed(evt);
            }
        });
        getContentPane().add(senhaCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 280, 30));

        ButtonCadastrar.setBackground(new java.awt.Color(30, 144, 255));
        ButtonCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ButtonCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCadastrar.setBorder(null);
        ButtonCadastrar.setContentAreaFilled(false);
        ButtonCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 240, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRAR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 130, 60));

        AreaTotal.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        AreaTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/TelaCadastro2.0.png"))); // NOI18N
        AreaTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AreaTotal.setPreferredSize(new java.awt.Dimension(350, 350));
        getContentPane().add(AreaTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 540));

        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setEnabled(false);
        jMenuBar1.setFocusable(false);
        jMenuBar1.setRequestFocusEnabled(false);
        jMenuBar1.setVerifyInputWhenFocusTarget(false);

        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/icons/icons8-cardápio-20.png"))); // NOI18N
        Menu.setText("Menu");
        Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        VoltarMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        VoltarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/icons/icons8-voltar-24.png"))); // NOI18N
        VoltarMenu.setText("Voltar");
        VoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarMenuActionPerformed(evt);
            }
        });
        Menu.add(VoltarMenu);
        Menu.add(jSeparator1);

        SairMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SairMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/icons/icons8-saída-de-emergência-24.png"))); // NOI18N
        SairMenu.setText("Sair");
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

    private void ButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCadastrarActionPerformed
    
String EmailUser = EmailCadastro.getText();
        String NomeUser = NomeCadastro.getText();
        String SenhaUser = senhaCadastro.getText();
        
        if(NomeCadastro.getText().matches("") || EmailCadastro.getText().matches("") || senhaCadastro.getText().matches("")){
        JOptionPane.showMessageDialog(rootPane, "Prencha todos os campos");
    
    }else{
   
        String destinatario = EmailUser;
        String assunto = "Agradecemos por se cadastrar com sucesso na Black Cat Company!";
        String corpo = "Prezado(a), " + NomeUser +"\n" +
"\n" +
"Agradecemos sinceramente por se cadastrar com sucesso na Black Cat Company! É um prazer tê-lo(a) como nosso novo membro.\n" +
"\n" +
"Estamos ansiosos para apoiá-lo(a) em sua jornada e fornecer soluções excepcionais que atendam às suas necessidades.\n" +
"\n" +
"Mais uma vez, obrigado por escolher a Black Cat Company.\n" +
"\n" +
"Seu Usuario de acesso é: " +NomeUser+ "\n" +
"\n" +
"E sua senha de acesso é: " +SenhaUser+ "\n" +
"\n" +
"Atenciosamente,\n" +
"\n" +
"Equipe da Black Cat Company";

        enviarEmail(destinatario, assunto, corpo);
        
        JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
  
        try{
              LoginController cadastro = new LoginController();
              cadastro.cadastroUsuario(this);
              this.dispose();
              LoginView telaDeLogin = new LoginView();
              telaDeLogin.setVisible(true);
             
              
              
              
        } catch(SQLException sql){
         }
        
        
        
        }

    }//GEN-LAST:event_ButtonCadastrarActionPerformed

    private void NomeCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeCadastroActionPerformed
       
    }//GEN-LAST:event_NomeCadastroActionPerformed

    private void EmailCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailCadastroActionPerformed
       
    }//GEN-LAST:event_EmailCadastroActionPerformed

    private void NomeCadastroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomeCadastroKeyPressed
        if(evt.getKeyCode() == evt.VK_DOWN){
            EmailCadastro.requestFocus();
        }
        if(evt.getKeyCode() == VK_ENTER){
            EmailCadastro.requestFocus();
        }
    }//GEN-LAST:event_NomeCadastroKeyPressed

    private void EmailCadastroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailCadastroKeyPressed
        if(evt.getKeyCode() == evt.VK_DOWN){
            senhaCadastro.requestFocus();
        }
        else if(evt.getKeyCode() == evt.VK_UP){
            NomeCadastro.requestFocus();
        }
        if(evt.getKeyCode() == VK_ENTER){
            senhaCadastro.requestFocus();
        }
    }//GEN-LAST:event_EmailCadastroKeyPressed

    private void senhaCadastroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaCadastroKeyPressed
        if(evt.getKeyCode() == evt.VK_UP){
            EmailCadastro.requestFocus();
        }
        if(evt.getKeyCode() == VK_ENTER){
            ButtonCadastrar.doClick();
        }
    }//GEN-LAST:event_senhaCadastroKeyPressed

    private void SairMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairMenuActionPerformed

        System.exit(0);
    }//GEN-LAST:event_SairMenuActionPerformed

    private void VoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarMenuActionPerformed
        LoginView telaDeLogin = new LoginView();
        telaDeLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VoltarMenuActionPerformed

    public JTextField getEmailCadastro() {
        return EmailCadastro;
    }

    public void setEmailCadastro(JTextField EmailCadastro) {
        this.EmailCadastro = EmailCadastro;
    }

    public JTextField getNomeCadastro() {
        return NomeCadastro;
    }

    public void setNomeCadastro(JTextField NomeCadastro) {
        this.NomeCadastro = NomeCadastro;
    }

    public JPasswordField getSenhaCadastro() {
        return senhaCadastro;
    }

    public void setSenhaCadastro(JPasswordField senhaCadastro) {
        this.senhaCadastro = senhaCadastro;
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
            java.util.logging.Logger.getLogger(CadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AreaTotal;
    private javax.swing.JButton ButtonCadastrar;
    private javax.swing.JTextField EmailCadastro;
    private javax.swing.JMenu Menu;
    private javax.swing.JTextField NomeCadastro;
    private javax.swing.JMenuItem SairMenu;
    private javax.swing.JMenuItem VoltarMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPasswordField senhaCadastro;
    // End of variables declaration//GEN-END:variables
}
