package br.com.login.view;

import br.com.tutorial.calculadora.model.CalculadoraModel;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.VK_ENTER;

public class CalcView extends javax.swing.JFrame {

    CalculadoraModel calculadora = new CalculadoraModel();
    boolean segundoValor = false;
    String operacao;

    public CalcView() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelnumero = new javax.swing.JLabel();
        botao0 = new javax.swing.JButton();
        botaox = new javax.swing.JButton();
        botao1 = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        botao4 = new javax.swing.JButton();
        botao5 = new javax.swing.JButton();
        botao6 = new javax.swing.JButton();
        botao7 = new javax.swing.JButton();
        botao8 = new javax.swing.JButton();
        ponto = new javax.swing.JButton();
        botao9 = new javax.swing.JButton();
        botaoResult1 = new javax.swing.JButton();
        apagar = new javax.swing.JButton();
        botaoadicao1 = new javax.swing.JButton();
        botaomenos = new javax.swing.JButton();
        botaoreset = new javax.swing.JButton();
        botaodiv = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        areaCalc = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        Sobre = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        VoltarMenu = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        SairMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora - BCC");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelnumero.setBackground(new java.awt.Color(255, 255, 255));
        jLabelnumero.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 37)); // NOI18N
        jLabelnumero.setForeground(new java.awt.Color(255, 255, 255));
        jLabelnumero.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelnumero.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(jLabelnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 360, 70));

        botao0.setBackground(new java.awt.Color(96, 96, 96));
        botao0.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botao0.setForeground(new java.awt.Color(255, 255, 255));
        botao0.setText("0");
        botao0.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botao0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao0ActionPerformed(evt);
            }
        });
        getContentPane().add(botao0, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 90, 50));

        botaox.setBackground(new java.awt.Color(50, 50, 205));
        botaox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botaox.setForeground(new java.awt.Color(255, 255, 255));
        botaox.setText("x");
        botaox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botaox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoxActionPerformed(evt);
            }
        });
        getContentPane().add(botaox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 90, 70));

        botao1.setBackground(new java.awt.Color(96, 96, 96));
        botao1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botao1.setForeground(new java.awt.Color(255, 255, 255));
        botao1.setText("1");
        botao1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botao1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });
        getContentPane().add(botao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 90, 50));

        botao3.setBackground(new java.awt.Color(96, 96, 96));
        botao3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botao3.setForeground(new java.awt.Color(255, 255, 255));
        botao3.setText("3");
        botao3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botao3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao3ActionPerformed(evt);
            }
        });
        getContentPane().add(botao3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 90, 50));

        botao2.setBackground(new java.awt.Color(96, 96, 96));
        botao2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botao2.setForeground(new java.awt.Color(255, 255, 255));
        botao2.setText("2");
        botao2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botao2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2ActionPerformed(evt);
            }
        });
        getContentPane().add(botao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 90, 50));

        botao4.setBackground(new java.awt.Color(96, 96, 96));
        botao4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botao4.setForeground(new java.awt.Color(255, 255, 255));
        botao4.setText("4");
        botao4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botao4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao4ActionPerformed(evt);
            }
        });
        getContentPane().add(botao4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 90, 50));

        botao5.setBackground(new java.awt.Color(96, 96, 96));
        botao5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botao5.setForeground(new java.awt.Color(255, 255, 255));
        botao5.setText("5");
        botao5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botao5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao5ActionPerformed(evt);
            }
        });
        getContentPane().add(botao5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 90, 50));

        botao6.setBackground(new java.awt.Color(96, 96, 96));
        botao6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botao6.setForeground(new java.awt.Color(255, 255, 255));
        botao6.setText("6");
        botao6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botao6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao6ActionPerformed(evt);
            }
        });
        getContentPane().add(botao6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 90, 50));

        botao7.setBackground(new java.awt.Color(96, 96, 96));
        botao7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botao7.setForeground(new java.awt.Color(255, 255, 255));
        botao7.setText("7");
        botao7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botao7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao7ActionPerformed(evt);
            }
        });
        getContentPane().add(botao7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 90, 50));

        botao8.setBackground(new java.awt.Color(96, 96, 96));
        botao8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botao8.setForeground(new java.awt.Color(255, 255, 255));
        botao8.setText("8");
        botao8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botao8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao8ActionPerformed(evt);
            }
        });
        getContentPane().add(botao8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 90, 50));

        ponto.setBackground(new java.awt.Color(96, 96, 96));
        ponto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ponto.setForeground(new java.awt.Color(255, 255, 255));
        ponto.setText(".");
        ponto.setToolTipText("");
        ponto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ponto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ponto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pontoActionPerformed(evt);
            }
        });
        getContentPane().add(ponto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 90, 50));

        botao9.setBackground(new java.awt.Color(96, 96, 96));
        botao9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botao9.setForeground(new java.awt.Color(255, 255, 255));
        botao9.setText("9");
        botao9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botao9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao9ActionPerformed(evt);
            }
        });
        getContentPane().add(botao9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 90, 50));

        botaoResult1.setBackground(new java.awt.Color(0, 128, 255));
        botaoResult1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botaoResult1.setForeground(new java.awt.Color(255, 255, 255));
        botaoResult1.setText("=");
        botaoResult1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botaoResult1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoResult1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoResult1ActionPerformed(evt);
            }
        });
        getContentPane().add(botaoResult1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 90, 110));

        apagar.setBackground(new java.awt.Color(96, 96, 96));
        apagar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        apagar.setForeground(new java.awt.Color(255, 255, 255));
        apagar.setText("APAGAR");
        apagar.setToolTipText("");
        apagar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        apagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarActionPerformed(evt);
            }
        });
        getContentPane().add(apagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 90, 50));

        botaoadicao1.setBackground(new java.awt.Color(50, 50, 205));
        botaoadicao1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botaoadicao1.setForeground(new java.awt.Color(255, 255, 255));
        botaoadicao1.setText("+");
        botaoadicao1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botaoadicao1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoadicao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoadicao1ActionPerformed(evt);
            }
        });
        getContentPane().add(botaoadicao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 90, 110));

        botaomenos.setBackground(new java.awt.Color(50, 50, 205));
        botaomenos.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        botaomenos.setForeground(new java.awt.Color(255, 255, 255));
        botaomenos.setText("-");
        botaomenos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botaomenos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaomenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaomenosActionPerformed(evt);
            }
        });
        getContentPane().add(botaomenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 90, 70));

        botaoreset.setBackground(new java.awt.Color(50, 50, 205));
        botaoreset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botaoreset.setForeground(new java.awt.Color(255, 255, 255));
        botaoreset.setText("C");
        botaoreset.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botaoreset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoresetActionPerformed(evt);
            }
        });
        botaoreset.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoresetKeyPressed(evt);
            }
        });
        getContentPane().add(botaoreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 90, 70));

        botaodiv.setBackground(new java.awt.Color(50, 50, 205));
        botaodiv.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botaodiv.setForeground(new java.awt.Color(255, 255, 255));
        botaodiv.setText("/");
        botaodiv.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botaodiv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaodiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaodivActionPerformed(evt);
            }
        });
        getContentPane().add(botaodiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 90, 70));

        jButton1.setText(".");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(50, 50, 205)));
        jButton1.setContentAreaFilled(false);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 410, 430));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(64, 64, 64));
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(50, 50, 205)));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 390, 90));

        areaCalc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/CalcView.png"))); // NOI18N
        getContentPane().add(areaCalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 540));

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

    private void botao0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao0ActionPerformed
        jLabelnumero.setText(jLabelnumero.getText() + 0);
    }//GEN-LAST:event_botao0ActionPerformed

    private void botaoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoxActionPerformed
        calculadora.setValor1(Double.parseDouble(jLabelnumero.getText()));
        segundoValor = true;
        jLabelnumero.setText("");
        operacao = "multiplicacao";
    }//GEN-LAST:event_botaoxActionPerformed

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
        jLabelnumero.setText(jLabelnumero.getText() + 1);
    }//GEN-LAST:event_botao1ActionPerformed

    private void botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao3ActionPerformed
        jLabelnumero.setText(jLabelnumero.getText() + 3);
    }//GEN-LAST:event_botao3ActionPerformed

    private void botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2ActionPerformed
        jLabelnumero.setText(jLabelnumero.getText() + 2);
    }//GEN-LAST:event_botao2ActionPerformed

    private void botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao4ActionPerformed
        jLabelnumero.setText(jLabelnumero.getText() + 4);
    }//GEN-LAST:event_botao4ActionPerformed

    private void botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao7ActionPerformed
        jLabelnumero.setText(jLabelnumero.getText() + 7);
    }//GEN-LAST:event_botao7ActionPerformed

    private void botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao8ActionPerformed
        jLabelnumero.setText(jLabelnumero.getText() + 8);
    }//GEN-LAST:event_botao8ActionPerformed

    private void botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao9ActionPerformed
        jLabelnumero.setText(jLabelnumero.getText() + 9);
    }//GEN-LAST:event_botao9ActionPerformed

    private void botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao5ActionPerformed
        jLabelnumero.setText(jLabelnumero.getText() + 5);
    }//GEN-LAST:event_botao5ActionPerformed

    private void botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao6ActionPerformed
        jLabelnumero.setText(jLabelnumero.getText() + 6);
    }//GEN-LAST:event_botao6ActionPerformed

    private void botaoresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoresetActionPerformed
        calculadora.setValor1(0);
        calculadora.setValor2(0);
        segundoValor = false;
        jLabelnumero.setText("");
        operacao = "";
    }//GEN-LAST:event_botaoresetActionPerformed

    private void botaodivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaodivActionPerformed
        calculadora.setValor1(Double.parseDouble(jLabelnumero.getText()));
        segundoValor = true;
        jLabelnumero.setText("");
        operacao = "divisao";
    }//GEN-LAST:event_botaodivActionPerformed

    private void botaoadicao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoadicao1ActionPerformed
        calculadora.setValor1(Double.parseDouble(jLabelnumero.getText()));
        segundoValor = true;
        jLabelnumero.setText("");
        operacao = "soma";
    }//GEN-LAST:event_botaoadicao1ActionPerformed

    private void botaoResult1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoResult1ActionPerformed
        if (segundoValor == true) {
            calculadora.setValor2(Double.parseDouble(jLabelnumero.getText()));
            if (operacao == "soma") {
                calculadora.somar();
                jLabelnumero.setText(String.valueOf(calculadora.getResultado()));
                operacao = "";
            }

            if (operacao == "subtracao") {
                calculadora.subtracao();
                jLabelnumero.setText(String.valueOf(calculadora.getResultado()));
                operacao = "";
            }

            if (operacao == "divisao") {
                calculadora.divisao();
                jLabelnumero.setText(String.valueOf(calculadora.getResultado()));
                operacao = "";
            }

            if (operacao == "multiplicacao") {
                calculadora.multiplicacao();
                jLabelnumero.setText(String.valueOf(calculadora.getResultado()));
                operacao = "";
            }

        }
    }//GEN-LAST:event_botaoResult1ActionPerformed

    private void botaomenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaomenosActionPerformed
        calculadora.setValor1(Double.parseDouble(jLabelnumero.getText()));
        segundoValor = true;
        jLabelnumero.setText("");
        operacao = "subtracao";
    }//GEN-LAST:event_botaomenosActionPerformed

    private void SairMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairMenuActionPerformed

        System.exit(0);
    }//GEN-LAST:event_SairMenuActionPerformed

    private void VoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarMenuActionPerformed
        TelaInicial menu = new TelaInicial();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_VoltarMenuActionPerformed

    private void SobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreActionPerformed
        SobreView TelaSobre = new SobreView();
        TelaSobre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SobreActionPerformed

    private void pontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pontoActionPerformed
        jLabelnumero.setText(jLabelnumero.getText() + ".");
    }//GEN-LAST:event_pontoActionPerformed

    private void apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarActionPerformed
        jLabelnumero.setText(jLabelnumero.getText().substring(0, jLabelnumero.getText().length() - 1));
    }//GEN-LAST:event_apagarActionPerformed

    private void botaoresetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoresetKeyPressed
        if(evt.getKeyCode() == VK_ENTER){
            botaoreset.doClick();
        }
    }//GEN-LAST:event_botaoresetKeyPressed

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
            java.util.logging.Logger.getLogger(CalcView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menu;
    private javax.swing.JMenuItem SairMenu;
    private javax.swing.JMenuItem Sobre;
    private javax.swing.JMenuItem VoltarMenu;
    private javax.swing.JButton apagar;
    private javax.swing.JLabel areaCalc;
    private javax.swing.JButton botao0;
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botao3;
    private javax.swing.JButton botao4;
    private javax.swing.JButton botao5;
    private javax.swing.JButton botao6;
    private javax.swing.JButton botao7;
    private javax.swing.JButton botao8;
    private javax.swing.JButton botao9;
    private javax.swing.JButton botaoResult1;
    private javax.swing.JButton botaoadicao1;
    private javax.swing.JButton botaodiv;
    private javax.swing.JButton botaomenos;
    private javax.swing.JButton botaoreset;
    private javax.swing.JButton botaox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelnumero;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton ponto;
    // End of variables declaration//GEN-END:variables
}
