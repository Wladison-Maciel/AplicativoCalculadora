package br.com.login.view;

import br.com.login.controller.LoginController;
public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Imc = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Calculadora = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Velocidademedia = new javax.swing.JButton();
        TempC = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        Sobre = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        LogoutMenu = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        SairMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial - BCC");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Imc.setContentAreaFilled(false);
        Imc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Imc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImcActionPerformed(evt);
            }
        });
        getContentPane().add(Imc, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 150, 150));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONVERSOR TEMP.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 150, 20));

        Calculadora.setContentAreaFilled(false);
        Calculadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Calculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculadoraActionPerformed(evt);
            }
        });
        getContentPane().add(Calculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 140, 150));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CALCULADORA ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 110, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CALCULADORA IMC");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 120, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CALCULADORA VEL. MÉDIA");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 150, 20));

        Velocidademedia.setContentAreaFilled(false);
        Velocidademedia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Velocidademedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VelocidademediaActionPerformed(evt);
            }
        });
        getContentPane().add(Velocidademedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 150, 150));

        TempC.setContentAreaFilled(false);
        TempC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TempC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TempCActionPerformed(evt);
            }
        });
        getContentPane().add(TempC, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 150, 150));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("IMC");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 60, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/telaInitial.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 530));

        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setEnabled(false);
        jMenuBar1.setFocusable(false);
        jMenuBar1.setRequestFocusEnabled(false);
        jMenuBar1.setVerifyInputWhenFocusTarget(false);

        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/icons/icons8-cardápio-20.png"))); // NOI18N
        Menu.setText("Menu");
        Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

    private void CalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculadoraActionPerformed
       CalcView calculadora = new CalcView();
        calculadora.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CalculadoraActionPerformed

    private void ImcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImcActionPerformed
        IMCView calculadoraIMC = new IMCView();
        calculadoraIMC.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ImcActionPerformed

    private void SairMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairMenuActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairMenuActionPerformed

    private void LogoutMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutMenuActionPerformed
        LoginView TelaDeLogin = new LoginView();
        TelaDeLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutMenuActionPerformed

    private void SobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreActionPerformed
        SobreView TelaSobre = new SobreView();
        TelaSobre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SobreActionPerformed

    private void VelocidademediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VelocidademediaActionPerformed
      CalcVeloMedia VM = new CalcVeloMedia();
        VM.setVisible(true);
        dispose();
    }//GEN-LAST:event_VelocidademediaActionPerformed

    private void TempCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TempCActionPerformed
       CalcConverter C = new CalcConverter();
        C.setVisible(true);
        dispose();
    }//GEN-LAST:event_TempCActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculadora;
    private javax.swing.JButton Imc;
    private javax.swing.JMenuItem LogoutMenu;
    private javax.swing.JMenu Menu;
    private javax.swing.JMenuItem SairMenu;
    private javax.swing.JMenuItem Sobre;
    private javax.swing.JButton TempC;
    private javax.swing.JButton Velocidademedia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
