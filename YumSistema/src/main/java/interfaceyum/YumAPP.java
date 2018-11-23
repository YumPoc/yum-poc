package interfaceyum;

import daoyum.ComputadorDao;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistemayum.InfoDinamicas;
import sistemayum.InfoGerais;
import sistemayum.Log;

/**
 * @author YumPoc
 *
 */
public class YumAPP extends javax.swing.JFrame {

    public YumAPP() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMessage = new javax.swing.JLabel();
        btn = new javax.swing.JButton();
        inpEmail = new javax.swing.JTextField();
        inpSenha = new javax.swing.JPasswordField();
        nPatri = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        setor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 50));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(430, 430));
        setMinimumSize(new java.awt.Dimension(430, 430));
        setResizable(false);
        setSize(new java.awt.Dimension(395, 295));

        jPanel1.setBackground(new java.awt.Color(0, 3, 50));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setMaximumSize(new java.awt.Dimension(430, 430));
        jPanel1.setMinimumSize(new java.awt.Dimension(430, 430));
        jPanel1.setPreferredSize(new java.awt.Dimension(375, 190));

        lblMessage.setBackground(new java.awt.Color(102, 255, 0));
        lblMessage.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(255, 255, 255));
        lblMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessage.setText("id");

        btn.setBackground(new java.awt.Color(204, 204, 204));
        btn.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        btn.setText("PLAY");
        btn.setBorder(null);
        btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        btn.setOpaque(false);
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        inpEmail.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        inpEmail.setForeground(new java.awt.Color(39, 48, 67));
        inpEmail.setText("Email");
        inpEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 2, true));
        inpEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpEmailActionPerformed(evt);
            }
        });

        inpSenha.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        inpSenha.setForeground(new java.awt.Color(39, 48, 67));
        inpSenha.setText("Senha");
        inpSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 2, true));
        inpSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpSenhaActionPerformed(evt);
            }
        });

        nPatri.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nPatri.setForeground(new java.awt.Color(39, 48, 67));
        nPatri.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 2, true));
        nPatri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nPatriActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(239, 246, 238));
        jLabel1.setText("N° Patrimônial");

        jLabel3.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(239, 246, 238));
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(239, 246, 238));
        jLabel4.setText("Senha");

        jLabel2.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(239, 246, 238));
        jLabel2.setText("Setor");

        setor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        setor.setForeground(new java.awt.Color(39, 48, 67));
        setor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 2, true));
        setor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nPatri, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(setor, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inpSenha))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inpEmail)))))
                .addContainerGap())
            .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inpSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nPatri, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblMessage)
                .addGap(18, 18, 18)
                .addComponent(btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Log gerarLog = new Log();
    
    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed

        InfoGerais gerais = new InfoGerais();
        InfoDinamicas dinamicas = new InfoDinamicas();
        ComputadorDao dao = null;
        try {
            dao = new ComputadorDao();
        } catch (ClassNotFoundException ex) {
            gerarLog.log("ClassNotFoundException YumAPP btnPlay \n Erro de conexão com o Banco de Dados");
            lblMessage.setText("Erro de conexão com o Banco de Dados");
            Logger.getLogger(YumAPP.class.getName()).log(Level.SEVERE, null, ex);
        }

        if ("".equals(nPatri.getText())) {
            lblMessage.setText("Insira um patrimônio");
        } else if (!numeroNaoInteiro()) {
            lblMessage.setText("Insira patrimônio válido \n(só aceitamos número)");
        } else {
            //Verifica se o usuario existe no banco de dados
            if (dao.logar(inpEmail.getText(), inpSenha.getText())) {

                //Verifica se o computador existe se existe ignora o numero digitado e 
                //utiliza o ID que consta no banco de dados                
                if (!dao.verificarComputador(Integer.parseInt(nPatri.getText()))) {
                    dao.setIdComputador(Integer.parseInt(nPatri.getText()));
                }

                //Substitui o texto do botão ira mudar para imagem
                if ("Play".equals(btn.getText())) {
                    btn.setText("Pausar");
                    inpEmail.setEnabled(false);
                    inpSenha.setEnabled(false);
                    nPatri.setEnabled(false);
                    lblMessage.setText("Logado");

                    //Executa o setters do oshi nos atributos
                    gerais.atualizarInfoGerais();
                    gerais.setSetorHospital(setor.getText());
                    
                    System.out.println("Setters foi executado");
                    //Envia os dados do Oshi para o banco de dados
                    dao.adicionaGerais(gerais);
                    //dao.adicionaDinamicas(dinamicas);
                    dao.infoDinamicasNaThread(dinamicas);
                    System.out.println("Envio para o banco executado");

                } else {
                    dao.infoDinamicasPararThread();
                    btn.setText("Play");
                    inpEmail.setEnabled(true);
                    inpSenha.setEnabled(true);
                    nPatri.setEnabled(true);
                    lblMessage.setText("Deslogado");
                }

            }
            else {
                lblMessage.setText("Email ou senha inválido");
            }

        }

    }//GEN-LAST:event_btnActionPerformed
    private boolean numeroNaoInteiro() {
        try {
            Integer.valueOf(nPatri.getText());
            return true;
        } catch (NumberFormatException ex) {
            gerarLog.log(ex.toString());
            return false;
        }
    }

    private void nPatriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nPatriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nPatriActionPerformed

    private void inpSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpSenhaActionPerformed

    private void inpEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpEmailActionPerformed

    private void setorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setorActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(YumAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YumAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YumAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YumAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new YumAPP().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JTextField inpEmail;
    private javax.swing.JPasswordField inpSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JTextField nPatri;
    private javax.swing.JTextField setor;
    // End of variables declaration//GEN-END:variables
}
