package interfaceyum;

import daoyum.ComputadorDao;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import sistemayum.InfoDinamicas;
import sistemayum.InfoGerais;
import sistemayum.Log;

/**
 * @author YumPoc
 *
 */
public class YumAPP extends javax.swing.JFrame {
    public static YumAPP quadroPrincipal;
    public YumAPP() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMensagem = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        inpEmail = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        inpSenha = new javax.swing.JPasswordField();
        lblPatrimonio = new javax.swing.JLabel();
        nPatri = new javax.swing.JTextField();
        lblSetor = new javax.swing.JLabel();
        setor = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        btnPlayPause = new javax.swing.JButton();
        sair = new javax.swing.JLabel();
        fechar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelProgresso = new javax.swing.JLabel();
        painelDeLogs = new javax.swing.JScrollPane();
        areaDeLogs = new javax.swing.JTextArea();
        minimiza = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(0, 0));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(450, 300));
        setResizable(false);
        setSize(new java.awt.Dimension(450, 300));

        jPanel1.setBackground(new java.awt.Color(39, 48, 67));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 46, 6), 1, true));
        jPanel1.setToolTipText("");
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.setLayout(null);

        lblMensagem.setBackground(new java.awt.Color(0, 0, 0));
        lblMensagem.setFont(new java.awt.Font("SansSerif", 3, 17)); // NOI18N
        lblMensagem.setForeground(new java.awt.Color(255, 255, 255));
        lblMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensagem.setAlignmentX(0.5F);
        lblMensagem.setFocusable(false);
        lblMensagem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblMensagem);
        lblMensagem.setBounds(10, 180, 430, 35);

        lblEmail.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmail.setText("Email");
        lblEmail.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblEmail.setFocusable(false);
        lblEmail.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblEmail);
        lblEmail.setBounds(20, 100, 40, 20);

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
        inpEmail.setBounds(70, 90, 360, 30);

        lblSenha.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSenha.setText("Senha");
        lblSenha.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblSenha.setFocusable(false);
        lblSenha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblSenha);
        lblSenha.setBounds(20, 150, 47, 20);

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
        inpSenha.setBounds(70, 140, 360, 30);

        lblPatrimonio.setVisible(false);
        lblPatrimonio.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        lblPatrimonio.setForeground(new java.awt.Color(255, 255, 255));
        lblPatrimonio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPatrimonio.setText("N° Patrimônial");
        lblPatrimonio.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblPatrimonio.setFocusable(false);
        lblPatrimonio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblPatrimonio);
        lblPatrimonio.setBounds(20, 100, 104, 20);

        nPatri.setVisible(false);
        nPatri.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        nPatri.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nPatri.setToolTipText("Exemplo: 2378456");
        nPatri.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(39, 48, 67)));
        nPatri.setCaretColor(new java.awt.Color(39, 48, 67));
        nPatri.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(nPatri);
        nPatri.setBounds(150, 90, 280, 30);

        lblSetor.setVisible(false);
        lblSetor.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        lblSetor.setForeground(new java.awt.Color(255, 255, 255));
        lblSetor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSetor.setText("Setor");
        lblSetor.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblSetor.setFocusable(false);
        lblSetor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblSetor);
        lblSetor.setBounds(20, 150, 39, 20);

        setor.setVisible(false);
        setor.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        setor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        setor.setToolTipText("Exemplo: Administrativo");
        setor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(39, 48, 67), 1, true));
        setor.setCaretColor(new java.awt.Color(39, 48, 67));
        setor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(setor);
        setor.setBounds(70, 140, 360, 30);

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
        btnEntrar.setBounds(190, 230, 81, 35);

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
        btnPlayPause.setBounds(190, 230, 81, 35);

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

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new ImageIcon("logo.png"));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 20, 450, 90);

        labelProgresso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(labelProgresso);
        labelProgresso.setBounds(290, 260, 150, 20);

        painelDeLogs.setBorder(null);
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
        areaDeLogs.setBorder(null);
        areaDeLogs.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        areaDeLogs.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        painelDeLogs.setViewportView(areaDeLogs);

        jPanel1.add(painelDeLogs);
        painelDeLogs.setBounds(450, 10, 190, 280);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
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
private void exibeLogs(boolean maximizado){
    if(maximizado){
            this.setSize(650, 300);
            painelDeLogs.setVisible(true);
        }else{
            this.setSize(450, 300);
            painelDeLogs.setVisible(false);
        }
}
    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        Log.areaDeTexto=areaDeLogs;

        ComputadorDao dao = null;
        try {
            dao = new ComputadorDao();
        } catch (ClassNotFoundException ex) {
            Log.log("YumAPP btnActionPerformed Erro de conexão com o Banco de Dados \n " + ex);
            lblMensagem.setText("Verifique a sua conecção");
        }
        //Verifica se o usuario existe no banco de dados
        //progressoBarraIniciar();
        if (dao.logar(inpEmail.getText(), inpSenha.getText())) {
            System.out.println("FOI");
            lblEmail.setVisible(false);
            inpEmail.setVisible(false);
            lblSenha.setVisible(false);
            inpSenha.setVisible(false);
            btnEntrar.setVisible(false);

            lblMensagem.setText("Logado");

            sair.setVisible(true);
            lblPatrimonio.setVisible(true);
            nPatri.setVisible(true);
            lblSetor.setVisible(true);
            setor.setVisible(true);
            btnPlayPause.setVisible(true);
            Log.log("Logado");

        } else {
            lblMensagem.setText("Email ou senha inválido");
        }

    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnPlayPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayPauseActionPerformed
        System.out.println("FOI ATÉ AQUI");
        try {
            InfoGerais gerais = new InfoGerais();
            InfoDinamicas dinamicas = new InfoDinamicas();
            ComputadorDao dao = new ComputadorDao();

            if ("".equalsIgnoreCase(nPatri.getText())) {
                lblMensagem.setText("Insira um patrimônio");

            } else if (!numeroNaoInteiro()) {
                lblMensagem.setText("Insira patrimônio válido \n(só aceitamos número)");

            } else {

                //Verifica se o computador existe
                if (!dao.verificarComputador(Integer.parseInt(nPatri.getText()))) {
                    dao.setIdComputador(Integer.parseInt(nPatri.getText()));
                }

                //Substitui o texto do botão ira mudar para imagem
                if ("Play".equalsIgnoreCase(btnPlayPause.getText())) {
                    btnPlayPause.setText("Pausar");
                    nPatri.setEnabled(false);
                    setor.setEnabled(false);
                    lblMensagem.setText("Enviando...");
                    Log.log("Enviando dados");
                    //Executa o setters do oshi nos atributos
                    gerais.atualizarInfoGerais();
                    gerais.setSetorHospital(setor.getText());

                    //Envia os dados do Oshi para o banco de dados
                    dao.adicionaGerais(gerais);

                    //dao.adicionaDinamicas(dinamicas);
                    dao.infoDinamicasNaThread(dinamicas);
                    System.out.println("Envio para o banco executado");
                    this.exibeLogs(true);

                } else {
                    btnPlayPause.setText("Play");
                    lblMensagem.setText("Pausado");
                    nPatri.setEnabled(true);
                    setor.setEnabled(true);
                    dao.infoDinamicasPararThread();
                    Log.log("Pausado");
                    exibeLogs(false);

                }

            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(YumAPP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPlayPauseActionPerformed

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
        ComputadorDao dao = null;
        try {
            dao = new ComputadorDao();
        } catch (ClassNotFoundException ex) {
            Log.log("YumAPP btnActionPerformed Erro de conexão com o Banco de Dados \n " + ex);
            lblMensagem.setText("Verifique a sua conecção");
        }

        dao.infoDinamicasPararThread();

        lblEmail.setVisible(true);
        inpEmail.setVisible(true);
        lblSenha.setVisible(true);
        inpSenha.setVisible(true);
        btnEntrar.setVisible(true);

        lblMensagem.setText("Deslogado");

        sair.setVisible(false);
        lblPatrimonio.setVisible(false);
        nPatri.setVisible(false);
        lblSetor.setVisible(false);
        setor.setVisible(false);
        btnPlayPause.setVisible(false);

        Log.log("Deslogado");

    }//GEN-LAST:event_sairMouseClicked

    private void fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecharMouseClicked
        System.exit(0);
    }//GEN-LAST:event_fecharMouseClicked

    private void minimizaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizaMouseClicked
        this.setState(YumAPP.ICONIFIED);
    }//GEN-LAST:event_minimizaMouseClicked

    private boolean numeroNaoInteiro() {
        try {
            Integer.valueOf(nPatri.getText());
            return true;
        } catch (NumberFormatException ex) {
            Log.log(ex.toString());
            return false;
        }
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
            Log.log(ex.toString());
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
    private javax.swing.JPasswordField inpSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelProgresso;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel lblPatrimonio;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSetor;
    private javax.swing.JLabel minimiza;
    private javax.swing.JTextField nPatri;
    private javax.swing.JScrollPane painelDeLogs;
    private javax.swing.JLabel sair;
    private javax.swing.JTextField setor;
    // End of variables declaration//GEN-END:variables

}
