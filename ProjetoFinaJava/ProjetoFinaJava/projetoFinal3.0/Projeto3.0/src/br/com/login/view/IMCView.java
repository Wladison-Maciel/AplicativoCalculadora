package br.com.login.view;

import static java.awt.event.KeyEvent.VK_ENTER;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class IMCView extends javax.swing.JFrame {

    public IMCView() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuario3 = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        altura = new javax.swing.JTextField();
        Peso = new javax.swing.JTextField();
        BotaoCalcular = new javax.swing.JButton();
        usuario1 = new javax.swing.JLabel();
        ResultadoText = new javax.swing.JTextField();
        Limpar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        usuario2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        AreaAjuda = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        TabelaMenu = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        Sobre = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        VoltarMenu = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        LogoutMenu = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        SairMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculadora IMC - BCC");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usuario3.setForeground(new java.awt.Color(255, 255, 255));
        usuario3.setText("m");
        getContentPane().add(usuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 20, 30));

        usuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setText("Kg");
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 20, 30));

        altura.setBackground(new java.awt.Color(96, 96, 96));
        altura.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        altura.setForeground(new java.awt.Color(255, 255, 255));
        altura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        altura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturaActionPerformed(evt);
            }
        });
        altura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                alturaKeyPressed(evt);
            }
        });
        getContentPane().add(altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 310, 30));

        Peso.setBackground(new java.awt.Color(96, 96, 96));
        Peso.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Peso.setForeground(new java.awt.Color(255, 255, 255));
        Peso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesoActionPerformed(evt);
            }
        });
        Peso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PesoKeyPressed(evt);
            }
        });
        getContentPane().add(Peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 310, 30));

        BotaoCalcular.setBackground(new java.awt.Color(0, 0, 153));
        BotaoCalcular.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotaoCalcular.setForeground(new java.awt.Color(255, 255, 255));
        BotaoCalcular.setText("Calcular");
        BotaoCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 130, 60));

        usuario1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usuario1.setForeground(new java.awt.Color(255, 255, 255));
        usuario1.setText("Digite seu Peso (em kg):");
        getContentPane().add(usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 220, 40));

        ResultadoText.setBackground(new java.awt.Color(32, 32, 32));
        ResultadoText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ResultadoText.setForeground(new java.awt.Color(255, 255, 255));
        ResultadoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadoTextActionPerformed(evt);
            }
        });
        getContentPane().add(ResultadoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 310, 60));

        Limpar.setBackground(new java.awt.Color(64, 64, 64));
        Limpar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Limpar.setForeground(new java.awt.Color(255, 255, 255));
        Limpar.setText("Limpar");
        Limpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });
        getContentPane().add(Limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 130, 60));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Consulte a Tabela de IMC");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, -1, 20));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(50, 50, 205));
        jLabel3.setText("aqui !");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 50, 20));

        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(50, 50, 205)));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 410, 430));

        usuario2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usuario2.setForeground(new java.awt.Color(255, 255, 255));
        usuario2.setText("Digite sua Altura (em M):");
        getContentPane().add(usuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 180, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Resultado:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 100, 30));

        AreaAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/CalcImcView.png"))); // NOI18N
        getContentPane().add(AreaAjuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 530));

        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setEnabled(false);
        jMenuBar1.setFocusable(false);
        jMenuBar1.setRequestFocusEnabled(false);
        jMenuBar1.setVerifyInputWhenFocusTarget(false);

        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/icons/icons8-cardápio-20.png"))); // NOI18N
        Menu.setText("Menu");
        Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        TabelaMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/icons/icons8-visão-diurna-24.png"))); // NOI18N
        TabelaMenu.setText("Tabela IMC");
        TabelaMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TabelaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TabelaMenuActionPerformed(evt);
            }
        });
        Menu.add(TabelaMenu);
        Menu.add(jSeparator6);

        Sobre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/icons/icons8-sobre-24.png"))); // NOI18N
        Sobre.setText("Sobre?");
        Sobre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreActionPerformed(evt);
            }
        });
        Menu.add(Sobre);
        Menu.add(jSeparator2);

        VoltarMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        VoltarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/icons/icons8-voltar-24.png"))); // NOI18N
        VoltarMenu.setText("Voltar");
        VoltarMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarMenuActionPerformed(evt);
            }
        });
        Menu.add(VoltarMenu);
        Menu.add(jSeparator5);

        LogoutMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LogoutMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/icons/icons8-sair-24.png"))); // NOI18N
        LogoutMenu.setText("Fazer Logout");
        LogoutMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogoutMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutMenuActionPerformed(evt);
            }
        });
        Menu.add(LogoutMenu);
        Menu.add(jSeparator1);

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

    private void alturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alturaActionPerformed
        
    }//GEN-LAST:event_alturaActionPerformed

    private void PesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesoActionPerformed
        
    }//GEN-LAST:event_PesoActionPerformed

    private void BotaoCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCalcularActionPerformed

        if(Peso.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite seu Peso!");
        }
        else if(altura.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite sua Altura!");
        }
        
        else{
            try {
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                double PegarPeso = Double.parseDouble(Peso.getText().replace(",", "."));
                double PegarAltura = Double.parseDouble(altura.getText().replace(",", "."));
                double IMC = PegarPeso/(PegarAltura*PegarAltura);
                ResultadoText.setText("Seu IMC é de: "+(decimalFormat.format(IMC)));
            } catch (Exception e) {
                ResultadoText.setText("Valores Inválidos!");
                Peso.setText("");
                altura.setText("");
                
            }

        }
        
    }//GEN-LAST:event_BotaoCalcularActionPerformed

    private void PesoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PesoKeyPressed
        if(evt.getKeyCode() == evt.VK_DOWN){
            altura.requestFocus();
        }
        if(evt.getKeyCode() == VK_ENTER){
            altura.requestFocus();
        }
        if(evt.getKeyCode() == VK_ENTER){
            if(!altura.getText().isEmpty()){
                BotaoCalcular.doClick();
            }
        }
    }//GEN-LAST:event_PesoKeyPressed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        Peso.setText("");
        altura.setText("");
        ResultadoText.setText("");
    }//GEN-LAST:event_LimparActionPerformed

    private void LogoutMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutMenuActionPerformed
        LoginView TelaDeLogin = new LoginView();
        TelaDeLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutMenuActionPerformed

    private void SairMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairMenuActionPerformed

        System.exit(0);
    }//GEN-LAST:event_SairMenuActionPerformed

    private void ResultadoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadoTextActionPerformed
        
    }//GEN-LAST:event_ResultadoTextActionPerformed

    private void alturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_alturaKeyPressed
        if(evt.getKeyCode() == evt.VK_UP){
            Peso.requestFocus();
        }
        if(evt.getKeyCode() == VK_ENTER){
            BotaoCalcular.doClick();
        }
        if(evt.getKeyCode() == VK_ENTER){
            if(Peso.getText().isEmpty()){
                Peso.requestFocus();
            }
        }
    }//GEN-LAST:event_alturaKeyPressed

    private void SobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreActionPerformed
        SobreView TelaSobre = new SobreView();
        TelaSobre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SobreActionPerformed

    private void TabelaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TabelaMenuActionPerformed
        TabelaIMC tabela = new TabelaIMC();
        tabela.setVisible(true);
        this.dispose();
     
    }//GEN-LAST:event_TabelaMenuActionPerformed

    private void VoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarMenuActionPerformed
        TelaInicial TelaDeInicio = new TelaInicial();
        TelaDeInicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VoltarMenuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        TabelaIMC TelaIMC = new TabelaIMC();
        TelaIMC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(IMCView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IMCView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IMCView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IMCView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IMCView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AreaAjuda;
    private javax.swing.JButton BotaoCalcular;
    private javax.swing.JButton Limpar;
    private javax.swing.JMenuItem LogoutMenu;
    private javax.swing.JMenu Menu;
    private javax.swing.JTextField Peso;
    private javax.swing.JTextField ResultadoText;
    private javax.swing.JMenuItem SairMenu;
    private javax.swing.JMenuItem Sobre;
    private javax.swing.JMenuItem TabelaMenu;
    private javax.swing.JMenuItem VoltarMenu;
    private javax.swing.JTextField altura;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JLabel usuario;
    private javax.swing.JLabel usuario1;
    private javax.swing.JLabel usuario2;
    private javax.swing.JLabel usuario3;
    // End of variables declaration//GEN-END:variables
}
