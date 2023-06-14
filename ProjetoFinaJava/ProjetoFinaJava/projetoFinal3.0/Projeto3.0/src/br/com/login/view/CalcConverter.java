package br.com.login.view;

import static java.awt.event.KeyEvent.VK_ENTER;
import javax.swing.DefaultComboBoxModel;

public class CalcConverter extends javax.swing.JFrame {

    public CalcConverter() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TiposTempComboBox1 = new javax.swing.JComboBox<>();
        TiposTempComboBox2 = new javax.swing.JComboBox<>();
        ConverterButton = new javax.swing.JButton();
        TemperaturaText = new javax.swing.JTextField();
        LimparjButton2 = new javax.swing.JButton();
        ResultText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        Sobre = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        VoltarMenu = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        LogoutMenu = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        SairMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de Temperatura - BCC");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TiposTempComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Kelvin", "Fahrenheit" }));
        TiposTempComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiposTempComboBox1ActionPerformed(evt);
            }
        });
        TiposTempComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TiposTempComboBox1KeyPressed(evt);
            }
        });
        getContentPane().add(TiposTempComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 100, 30));

        TiposTempComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kelvin", "Celsius", "Fahrenheit" }));
        TiposTempComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiposTempComboBox2ActionPerformed(evt);
            }
        });
        TiposTempComboBox2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TiposTempComboBox2KeyPressed(evt);
            }
        });
        getContentPane().add(TiposTempComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 100, 30));

        ConverterButton.setBackground(new java.awt.Color(50, 50, 205));
        ConverterButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ConverterButton.setForeground(new java.awt.Color(255, 255, 255));
        ConverterButton.setText("Converter");
        ConverterButton.setBorder(null);
        ConverterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConverterButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ConverterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 120, 60));

        TemperaturaText.setBackground(new java.awt.Color(33, 41, 51));
        TemperaturaText.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        TemperaturaText.setForeground(new java.awt.Color(255, 255, 255));
        TemperaturaText.setBorder(null);
        TemperaturaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TemperaturaTextActionPerformed(evt);
            }
        });
        TemperaturaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TemperaturaTextKeyPressed(evt);
            }
        });
        getContentPane().add(TemperaturaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 270, 30));

        LimparjButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LimparjButton2.setText("Limpar");
        LimparjButton2.setBorder(null);
        LimparjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparjButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(LimparjButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 120, 60));

        ResultText.setBackground(new java.awt.Color(33, 41, 51));
        ResultText.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        ResultText.setForeground(new java.awt.Color(255, 255, 255));
        ResultText.setBorder(null);
        ResultText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultTextActionPerformed(evt);
            }
        });
        getContentPane().add(ResultText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 250, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/ConvTemp.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void LimparjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparjButton2ActionPerformed
        TemperaturaText.setText("");
        ResultText.setText("");
    }//GEN-LAST:event_LimparjButton2ActionPerformed

    private void TiposTempComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiposTempComboBox2ActionPerformed

    }//GEN-LAST:event_TiposTempComboBox2ActionPerformed

    private void ConverterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConverterButtonActionPerformed
        if(TemperaturaText.getText().isEmpty()){
            ResultText.setText("Valor Inválido");
        }
        String temperatureText = TemperaturaText.getText().replace(",", ".");
        double temperatura = Double.parseDouble(temperatureText);
        String SelectUnid1 = (String) TiposTempComboBox1.getSelectedItem();
        String SelectUnid2 = (String) TiposTempComboBox2.getSelectedItem();
        double converterTemp = 0.0;

        if (SelectUnid1.equals("Celsius") && SelectUnid2.equals("Kelvin"))  {
            converterTemp = temperatura + 273.15;
        } else if (SelectUnid1.equals("Celsius") && SelectUnid2.equals("Fahrenheit")) {
            converterTemp = (temperatura * 9/5) + 32;
        } else if (SelectUnid1.equals("Kelvin") && SelectUnid2.equals("Celcius")) {
            converterTemp = (temperatura - 273.15);
        } else if (SelectUnid1.equals("Kelvin")&& SelectUnid2.equals("Fahrenheit")) {
            converterTemp = (temperatura - 273.15) * 9/5 + 32;
        } else if (SelectUnid1.equals("Fahrenheit") && SelectUnid2.equals("Celsius")) {
            converterTemp = (temperatura - 32) * 5/9;
        } else if (SelectUnid1.equals("Fahrenheit") && SelectUnid2.equals("Kelvin")) {
            converterTemp = (temperatura - 32) * 5/9 + 273.15;
        }
        ResultText.setText("A Temperatura ficará de: " + (String.format("%.2f", converterTemp)));
    }//GEN-LAST:event_ConverterButtonActionPerformed

    private void TiposTempComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiposTempComboBox1ActionPerformed

    }//GEN-LAST:event_TiposTempComboBox1ActionPerformed

    private void TemperaturaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TemperaturaTextActionPerformed
        
    }//GEN-LAST:event_TemperaturaTextActionPerformed

    private void ResultTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultTextActionPerformed

    }//GEN-LAST:event_ResultTextActionPerformed

    private void SobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreActionPerformed
        SobreView TelaSobre = new SobreView();
        TelaSobre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SobreActionPerformed

    private void LogoutMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutMenuActionPerformed
        LoginView TelaDeLogin = new LoginView();
        TelaDeLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutMenuActionPerformed

    private void SairMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairMenuActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairMenuActionPerformed

    private void TemperaturaTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TemperaturaTextKeyPressed
        if(evt.getKeyCode() == VK_ENTER){
            TiposTempComboBox1.requestFocus();
        }        
    }//GEN-LAST:event_TemperaturaTextKeyPressed

    private void VoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarMenuActionPerformed
        TelaInicial TelaDeInicio = new TelaInicial();
        TelaDeInicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VoltarMenuActionPerformed

    private void TiposTempComboBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TiposTempComboBox1KeyPressed
        if(evt.getKeyCode() == VK_ENTER){
            TiposTempComboBox2.requestFocus();
        }
    }//GEN-LAST:event_TiposTempComboBox1KeyPressed

    private void TiposTempComboBox2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TiposTempComboBox2KeyPressed
        if(evt.getKeyCode() == VK_ENTER){
            ConverterButton.doClick();
        }        
    }//GEN-LAST:event_TiposTempComboBox2KeyPressed

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
            java.util.logging.Logger.getLogger(CalcConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConverterButton;
    private javax.swing.JButton LimparjButton2;
    private javax.swing.JMenuItem LogoutMenu;
    private javax.swing.JMenu Menu;
    private javax.swing.JTextField ResultText;
    private javax.swing.JMenuItem SairMenu;
    private javax.swing.JMenuItem Sobre;
    private javax.swing.JTextField TemperaturaText;
    private javax.swing.JComboBox<String> TiposTempComboBox1;
    private javax.swing.JComboBox<String> TiposTempComboBox2;
    private javax.swing.JMenuItem VoltarMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
