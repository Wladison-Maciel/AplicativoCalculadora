package br.com.login.view;
import static java.awt.event.KeyEvent.VK_ENTER;
import java.text.DecimalFormat;

public class CalcVeloMedia extends javax.swing.JFrame {

    public CalcVeloMedia() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        tempoText = new javax.swing.JTextField();
        distanciaText = new javax.swing.JTextField();
        ResultText1 = new javax.swing.JTextField();
        calcularButton = new javax.swing.JButton();
        LimparButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        Sobre = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        VoltarMenu = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        LogoutMenu = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        SairMenu = new javax.swing.JMenuItem();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Velocidade Média - BCC");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tempoText.setBackground(new java.awt.Color(33, 41, 51));
        tempoText.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        tempoText.setForeground(new java.awt.Color(255, 255, 255));
        tempoText.setBorder(null);
        tempoText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tempoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempoTextActionPerformed(evt);
            }
        });
        tempoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tempoTextKeyPressed(evt);
            }
        });
        getContentPane().add(tempoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 320, 50));

        distanciaText.setBackground(new java.awt.Color(33, 41, 51));
        distanciaText.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        distanciaText.setForeground(new java.awt.Color(255, 255, 255));
        distanciaText.setToolTipText("");
        distanciaText.setBorder(null);
        distanciaText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        distanciaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distanciaTextActionPerformed(evt);
            }
        });
        distanciaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                distanciaTextKeyPressed(evt);
            }
        });
        getContentPane().add(distanciaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 320, 40));

        ResultText1.setBackground(new java.awt.Color(33, 41, 51));
        ResultText1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        ResultText1.setForeground(new java.awt.Color(255, 255, 255));
        ResultText1.setBorder(null);
        ResultText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultText1ActionPerformed(evt);
            }
        });
        getContentPane().add(ResultText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 340, 70));

        calcularButton.setBackground(new java.awt.Color(0, 0, 153));
        calcularButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        calcularButton.setForeground(new java.awt.Color(255, 255, 255));
        calcularButton.setText("CALCULAR");
        calcularButton.setBorder(null);
        calcularButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularButtonActionPerformed(evt);
            }
        });
        getContentPane().add(calcularButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 150, 70));

        LimparButton.setBackground(new java.awt.Color(64, 64, 64));
        LimparButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LimparButton.setForeground(new java.awt.Color(255, 255, 255));
        LimparButton.setText("LIMPAR");
        LimparButton.setBorder(null);
        LimparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LimparButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 150, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/VM.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 540));

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
        Menu.add(jSeparator4);

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

    private void tempoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempoTextActionPerformed
        
    }//GEN-LAST:event_tempoTextActionPerformed

    private void distanciaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distanciaTextActionPerformed
        
    }//GEN-LAST:event_distanciaTextActionPerformed

    private void ResultText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultText1ActionPerformed
        
    }//GEN-LAST:event_ResultText1ActionPerformed

    private void calcularButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularButtonActionPerformed
        try{
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            
            double distancia = Double.parseDouble(distanciaText.getText().replace(",", "."));
            double tempo = Double.parseDouble(tempoText.getText().replace(",", "."));
            double velocidadeMedia = distancia / tempo;
            ResultText1.setText("A velocidade Média será de: " + (decimalFormat.format(velocidadeMedia) + " Km/H"));
        } catch (NumberFormatException ex) {
            ResultText1.setText("Valores Inválidos");
    }//GEN-LAST:event_calcularButtonActionPerformed
   }
    private void LimparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparButtonActionPerformed
        distanciaText.setText("");
        tempoText.setText("");
        ResultText1.setText("");
    }//GEN-LAST:event_LimparButtonActionPerformed

    private void SobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreActionPerformed
        SobreView TelaSobre = new SobreView();
        TelaSobre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SobreActionPerformed

    private void LogoutMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutMenuActionPerformed
        LoginView TelaDeLogin = new LoginView();
        TelaDeLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_LogoutMenuActionPerformed

    private void SairMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairMenuActionPerformed

        System.exit(0);
    }//GEN-LAST:event_SairMenuActionPerformed

    private void VoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarMenuActionPerformed
        TelaInicial TelaDeInicio = new TelaInicial();
        TelaDeInicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VoltarMenuActionPerformed

    private void distanciaTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_distanciaTextKeyPressed
        if(evt.getKeyCode() == evt.VK_DOWN){
            tempoText.requestFocus();
        }
        if(evt.getKeyCode() == VK_ENTER){
            tempoText.requestFocus();
        }
        if(evt.getKeyCode() == VK_ENTER){
            if(!tempoText.getText().isEmpty()){
                calcularButton.doClick();
            }
        }
    }//GEN-LAST:event_distanciaTextKeyPressed

    private void tempoTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tempoTextKeyPressed
        if(evt.getKeyCode() == evt.VK_UP){
            distanciaText.requestFocus();
        }
        if(evt.getKeyCode() == VK_ENTER){
            calcularButton.doClick();
        }
        
    }//GEN-LAST:event_tempoTextKeyPressed

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
            java.util.logging.Logger.getLogger(CalcVeloMedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcVeloMedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcVeloMedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcVeloMedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcVeloMedia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LimparButton;
    private javax.swing.JMenuItem LogoutMenu;
    private javax.swing.JMenu Menu;
    private javax.swing.JTextField ResultText1;
    private javax.swing.JMenuItem SairMenu;
    private javax.swing.JMenuItem Sobre;
    private javax.swing.JMenuItem VoltarMenu;
    private javax.swing.JButton calcularButton;
    private javax.swing.JTextField distanciaText;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JTextField tempoText;
    // End of variables declaration//GEN-END:variables
}
