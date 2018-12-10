package interfaceyum;

import daoyum.ComputadorDao;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import sistemayum.InfoDinamicas;
import sistemayum.InfoGerais;
import sistemayum.Log;

/**
 * @author YumPoc
 *
 */
public class YumAPP extends javax.swing.JFrame {

    public static YumAPP quadroPrincipal;
    private Point posicaoOriginal;

    public YumAPP() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fechar = new javax.swing.JLabel();
        sair = new javax.swing.JLabel();
        minimiza = new javax.swing.JLabel();
        lblMensagem = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        inpEmail = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        inpSenha = new javax.swing.JPasswordField();
        lblPatrimonio = new javax.swing.JLabel();
        inpNPatri = new javax.swing.JTextField();
        lblSetor = new javax.swing.JLabel();
        inpSetor = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        btnPlayPause = new javax.swing.JButton();
        yumImagem = new javax.swing.JLabel();
        painelDeLogs = new javax.swing.JScrollPane();
        areaDeLogs = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(0, 0));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(442, 300));
        setResizable(false);
        setSize(new java.awt.Dimension(442, 300));

        jPanel1.setBackground(new java.awt.Color(39, 48, 67));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 46, 6), 1, true));
        jPanel1.setToolTipText("");
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.setLayout(null);

        fechar.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        fechar.setForeground(new java.awt.Color(255, 255, 255));
        fechar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fechar.setText("x");
        fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fecharMouseClicked(evt);
            }
        });
        jPanel1.add(fechar);
        fechar.setBounds(420, 0, 20, 20);

        sair.setVisible(false);
        sair.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        sair.setForeground(new java.awt.Color(255, 255, 255));
        sair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sair.setText("<<sair");
        sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });
        jPanel1.add(sair);
        sair.setBounds(0, 0, 60, 20);

        minimiza.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        minimiza.setForeground(new java.awt.Color(255, 255, 255));
        minimiza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimiza.setText("-");
        minimiza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimiza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizaMouseClicked(evt);
            }
        });
        jPanel1.add(minimiza);
        minimiza.setBounds(400, 0, 20, 20);

        lblMensagem.setBackground(new java.awt.Color(0, 0, 0));
        lblMensagem.setFont(new java.awt.Font("SansSerif", 3, 17)); // NOI18N
        lblMensagem.setForeground(new java.awt.Color(255, 255, 255));
        lblMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensagem.setText("Deslogado");
        lblMensagem.setAlignmentX(0.5F);
        lblMensagem.setFocusable(false);
        lblMensagem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblMensagem);
        lblMensagem.setBounds(10, 190, 420, 35);

        lblEmail.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmail.setText("Email");
        lblEmail.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblEmail.setFocusable(false);
        lblEmail.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblEmail);
        lblEmail.setBounds(20, 110, 40, 20);

        inpEmail.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        inpEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inpEmail.setText("exemplo@email.com");
        inpEmail.setToolTipText("Exemplo: yum@poc.com");
        inpEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(39, 48, 67), 1, true));
        inpEmail.setCaretColor(new java.awt.Color(39, 48, 67));
        inpEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inpEmail.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        inpEmail.setMaximumSize(new java.awt.Dimension(400, 30));
        inpEmail.setMinimumSize(new java.awt.Dimension(400, 30));

        inpEmail.setPreferredSize(new java.awt.Dimension(400, 30));
        inpEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inpEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inpEmailFocusLost(evt);
            }
        });
        jPanel1.add(inpEmail);
        inpEmail.setBounds(70, 100, 360, 30);

        lblSenha.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSenha.setText("Senha");
        lblSenha.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblSenha.setFocusable(false);
        lblSenha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblSenha);
        lblSenha.setBounds(20, 160, 47, 20);

        inpSenha.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        inpSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inpSenha.setText("Senha");
        inpSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(39, 48, 67), 1, true));
        inpSenha.setCaretColor(new java.awt.Color(39, 48, 67));
        inpSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inpSenha.setMaximumSize(new java.awt.Dimension(400, 30));
        inpSenha.setMinimumSize(new java.awt.Dimension(400, 30));
        inpSenha.setPreferredSize(new java.awt.Dimension(400, 30));
        inpSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inpSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inpSenhaFocusLost(evt);
            }
        });
        jPanel1.add(inpSenha);
        inpSenha.setBounds(70, 150, 360, 30);

        lblPatrimonio.setVisible(false);
        lblPatrimonio.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        lblPatrimonio.setForeground(new java.awt.Color(255, 255, 255));
        lblPatrimonio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPatrimonio.setText("N° Patrimônial");
        lblPatrimonio.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblPatrimonio.setFocusable(false);
        lblPatrimonio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblPatrimonio);
        lblPatrimonio.setBounds(20, 110, 104, 20);

        inpNPatri.setVisible(false);
        inpNPatri.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        inpNPatri.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inpNPatri.setToolTipText("Exemplo: 2378456");
        inpNPatri.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(39, 48, 67)));
        inpNPatri.setCaretColor(new java.awt.Color(39, 48, 67));
        inpNPatri.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(inpNPatri);
        inpNPatri.setBounds(150, 100, 280, 30);

        lblSetor.setVisible(false);
        lblSetor.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        lblSetor.setForeground(new java.awt.Color(255, 255, 255));
        lblSetor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSetor.setText("Setor");
        lblSetor.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblSetor.setFocusable(false);
        lblSetor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblSetor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblSetorFocusGained(evt);
            }
        });
        jPanel1.add(lblSetor);
        lblSetor.setBounds(20, 160, 39, 20);

        inpSetor.setVisible(false);
        inpSetor.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        inpSetor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inpSetor.setToolTipText("Exemplo: Administrativo");
        inpSetor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(39, 48, 67), 1, true));
        inpSetor.setCaretColor(new java.awt.Color(39, 48, 67));
        inpSetor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(inpSetor);
        inpSetor.setBounds(70, 150, 360, 30);

        btnEntrar.setBackground(new java.awt.Color(39, 48, 67));
        btnEntrar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.setBorder(null);
        btnEntrar.setBorderPainted(false);
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.setFocusPainted(false);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar);
        btnEntrar.setBounds(180, 230, 81, 35);

        btnPlayPause.setVisible(false);
        btnPlayPause.setBackground(new java.awt.Color(145, 151, 174));
        btnPlayPause.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnPlayPause.setText("Play");
        btnPlayPause.setPreferredSize(new java.awt.Dimension(60, 30));
        btnPlayPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayPauseActionPerformed(evt);
            }
        });
        jPanel1.add(btnPlayPause);
        btnPlayPause.setBounds(180, 230, 81, 35);

        yumImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yumImagem.setIcon(new ImageIcon("logo6.png"));
        jPanel1.add(yumImagem);
        yumImagem.setBounds(0, 0, 470, 90);

        painelDeLogs.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(255, 255, 255)));
        painelDeLogs.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        painelDeLogs.setAutoscrolls(true);
        painelDeLogs.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        painelDeLogs.setHorizontalScrollBar(null);
        painelDeLogs.setRequestFocusEnabled(false);
        painelDeLogs.setVerifyInputWhenFocusTarget(false);

        areaDeLogs.setEditable(false);
        areaDeLogs.setBackground(new java.awt.Color(39, 48, 67));
        areaDeLogs.setColumns(5);
        areaDeLogs.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        areaDeLogs.setForeground(new java.awt.Color(255, 255, 255));
        areaDeLogs.setLineWrap(true);
        areaDeLogs.setRows(5);
        areaDeLogs.setWrapStyleWord(true);
        areaDeLogs.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 7, 1, 1));
        areaDeLogs.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        areaDeLogs.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        painelDeLogs.setViewportView(areaDeLogs);

        jPanel1.add(painelDeLogs);
        painelDeLogs.setBounds(450, 10, 188, 280);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inpEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inpEmailFocusGained
        if (inpEmail.getText().equalsIgnoreCase("exemplo@email.com")) {
            inpEmail.setText("");
        }
    }//GEN-LAST:event_inpEmailFocusGained

    private void inpSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inpSenhaFocusGained
        if (inpSenha.getText().equalsIgnoreCase("senha")) {
            inpSenha.setText("");
        }
    }//GEN-LAST:event_inpSenhaFocusGained

    private void inpEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inpEmailFocusLost
        if (inpEmail.getText().equalsIgnoreCase("")) {
            inpEmail.setText("exemplo@email.com");
        }
    }//GEN-LAST:event_inpEmailFocusLost

    private void inpSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inpSenhaFocusLost
        if (inpSenha.getText().equalsIgnoreCase("")) {
            inpSenha.setText("senha");
        }
    }//GEN-LAST:event_inpSenhaFocusLost
    private void exibeLogs(boolean maximizado) {
        if (maximizado) {
            this.setSize(655, 300);
            painelDeLogs.setSize(250, 280);
            painelDeLogs.setLocation(painelDeLogs.getX() - 60, painelDeLogs.getY());
            yumImagem.setLocation(yumImagem.getX() - 35, yumImagem.getY());
            inpNPatri.setSize(200, 30);
            inpSetor.setSize(280, 30);
            minimiza.setLocation(minimiza.getX() - 55, minimiza.getY());
            fechar.setLocation(fechar.getX() - 55, fechar.getY());
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int x = (int) Math.round((screenSize.getWidth() / 2) - 327);
            this.setLocation(x, posicaoOriginal.y);
            lblMensagem.setSize(lblMensagem.getWidth() - 45, lblMensagem.getHeight());
            btnPlayPause.setLocation(inpNPatri.getX(), btnPlayPause.getY());
        } else {
            this.setSize(442, 300);
//            painelDeLogs.setSize(185, 280);
            painelDeLogs.setLocation(painelDeLogs.getX() + 60, painelDeLogs.getY());
            yumImagem.setLocation(yumImagem.getX() + 35, yumImagem.getY());
            inpNPatri.setSize(280, 30);
            inpSetor.setSize(360, 30);
            minimiza.setLocation(minimiza.getX() + 55, minimiza.getY());
            fechar.setLocation(fechar.getX() + 55, fechar.getY());
            this.setLocation(posicaoOriginal);
            lblMensagem.setSize(lblMensagem.getWidth() + 45, lblMensagem.getHeight());

        }
    }
    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        areaDeLogs.setText("");
        Log.areaDeTexto = areaDeLogs;        
        posicaoOriginal = this.getLocation();
        ComputadorDao dao = null;
        try {
            dao = new ComputadorDao();
        } catch (ClassNotFoundException ex) {
            Log.gerarLog("YumAPP btnActionPerformed \n " + ex);
            lblMensagem.setText("Verifique a sua conecção");
        }
        //Verifica se o usuario existe no banco de dados
        //progressoBarraIniciar();
        if (dao.logar(inpEmail.getText(), inpSenha.getText())) {
            lblEmail.setVisible(false);
            inpEmail.setVisible(false);
            lblSenha.setVisible(false);
            inpSenha.setVisible(false);
            btnEntrar.setVisible(false);

            lblMensagem.setText("Insira um patrimônio");

            sair.setVisible(true);
            lblPatrimonio.setVisible(true);
            inpNPatri.setVisible(true);
            lblSetor.setVisible(true);
            inpSetor.setVisible(true);
            btnPlayPause.setVisible(true);
            Log.gerarLog(dao.getNomeCliente() + " está logado");

            this.exibeLogs(true);

        } else {
            lblMensagem.setText("Email ou senha inválido");
        }

    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnPlayPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayPauseActionPerformed
        try {
            InfoGerais gerais = new InfoGerais();
            InfoDinamicas dinamicas = new InfoDinamicas();
            ComputadorDao dao = new ComputadorDao();

            if ("".equalsIgnoreCase(inpNPatri.getText())) {
                lblMensagem.setText("Insira um patrimônio");
                inpNPatri.setBackground(Color.red);

            } else if (!numeroNaoInteiro()) {
                lblMensagem.setText("Insira patrimônio válido (só aceitamos número)");
                inpNPatri.setBackground(Color.red);
                
            } else {
                inpNPatri.setBackground(Color.white);
                
                //Verifica se o computador existe
                if (!dao.verificarComputador(Integer.parseInt(inpNPatri.getText()))) {
                    dao.setIdComputador(Integer.parseInt(inpNPatri.getText()));
                }

                //Substitui o texto do botão ira mudar para imagem
                if ("Play".equalsIgnoreCase(btnPlayPause.getText())) {
                    btnPlayPause.setText("Pausar");
                    inpNPatri.setEnabled(false);
                    inpSetor.setEnabled(false);
                    lblMensagem.setText("Enviando dados...");
                    Log.gerarLog("Programa iniciado");
                    areaDeLogs.setText(areaDeLogs.getText() + "\n" + "Enviando dados para o banco");

                    //Executa o setters do oshi nos atributos
                    gerais.atualizarInfoGerais();
                    gerais.setSetorHospital(inpSetor.getText());

                    //Envia os dados do Oshi para o banco de dados
                    dao.adicionaGerais(gerais);

                    //dao.adicionaDinamicas(dinamicas);
                    dao.infoDinamicasNaThread(dinamicas);

                } else {
                    btnPlayPause.setText("Play");
                    lblMensagem.setText("Pausado");
                    inpNPatri.setEnabled(true);
                    inpSetor.setEnabled(true);
                    dao.infoDinamicasPararThread();
                    Log.gerarLog("Programa está pausado");
                    //exibeLogs(false);

                }

            }
        } catch (ClassNotFoundException ex) {
            Log.gerarLog("YumAPP btnPlayPauseActionPerformed erro");
            Log.gerarLog(ex.toString());
            Logger.getLogger(YumAPP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPlayPauseActionPerformed

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
        ComputadorDao dao = null;
        try {
            dao = new ComputadorDao();
        } catch (ClassNotFoundException ex) {
            Log.gerarLog("YumAPP sairMouseClicked erro");
            Log.gerarLog(ex.toString());
        }

        exibeLogs(false);
        dao.infoDinamicasPararThread();

        lblEmail.setVisible(true);
        inpEmail.setVisible(true);
        lblSenha.setVisible(true);
        inpSenha.setVisible(true);
        btnEntrar.setVisible(true);

        lblMensagem.setText("Deslogado");

        sair.setVisible(false);
        lblPatrimonio.setVisible(false);
        inpNPatri.setVisible(false);
        lblSetor.setVisible(false);
        inpSetor.setVisible(false);
        btnPlayPause.setVisible(false);

        Log.gerarLog(dao.getNomeCliente() + " está deslogado");

    }//GEN-LAST:event_sairMouseClicked

    private void fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecharMouseClicked

        try {
            Log.gerarLog(new ComputadorDao().getNomeCliente() + " finalizou o programa");
        } catch (ClassNotFoundException ex) {
            Log.gerarLog("Usuário finalizou o programa");
        } finally {
            System.exit(0);
        }
        
    }//GEN-LAST:event_fecharMouseClicked

    private void minimizaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizaMouseClicked
        this.setState(YumAPP.ICONIFIED);
    }//GEN-LAST:event_minimizaMouseClicked

    private void lblSetorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblSetorFocusGained
        //lblSetor.setForeground(new java.awt.Color(240,240,240));
        //lblSetor.setBackground(new java.awt.Color(255, 255, 255));

        lblSetor.setForeground(new java.awt.Color(255, 0, 0));


    }//GEN-LAST:event_lblSetorFocusGained

    private boolean numeroNaoInteiro() {
        try {
            Integer.valueOf(inpNPatri.getText());
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public void setLblMensagem(String texto){        
        lblMensagem.setText(texto);        
    }
    
    /**
     * @param args the command line arguments
     */
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
        } catch (Exception ex) {
            Log.gerarLog(ex.toString());
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new YumAPP().setVisible(true);

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaDeLogs;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnPlayPause;
    private javax.swing.JLabel fechar;
    private javax.swing.JTextField inpEmail;
    private javax.swing.JTextField inpNPatri;
    private javax.swing.JPasswordField inpSenha;
    private javax.swing.JTextField inpSetor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel lblPatrimonio;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSetor;
    private javax.swing.JLabel minimiza;
    private javax.swing.JScrollPane painelDeLogs;
    private javax.swing.JLabel sair;
    private javax.swing.JLabel yumImagem;
    // End of variables declaration//GEN-END:variables

}
