package view;

import view.JFrmPrincipal;
import javax.swing.JOptionPane;
import view.JFrmPrincipal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author u10840155107
 */
public class JDlgLogin extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public JDlgLogin(java.awt.Frame parent, boolean modal) {
        initComponents();
        setTitle("Login");
        setLocationRelativeTo(null);
    }
    
    public void entrar(){
        System.out.println(jTxtUsuario_Bjf.getText());
        System.out.println(jPwfSenha_Bjf.getPassword());
        System.out.println(jTxtUsuario_Bjf.getText());
        System.out.println(jPwfSenha_Bjf.getPassword());
        if(jTxtUsuario_Bjf.getText().equalsIgnoreCase("ferraz") && jPwfSenha_Bjf.getText().equalsIgnoreCase("ferraz")){
        JFrmPrincipal  jFrmPrincipal = new JFrmPrincipal();
        jFrmPrincipal.setVisible(true);
        } else if(jTxtUsuario_Bjf.getText().equalsIgnoreCase("ferraz") && jPwfSenha_Bjf.getText().equalsIgnoreCase("ferraz")){
        JFrmPrincipal  jFrmPrincipal = new JFrmPrincipal();
        jFrmPrincipal.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this,"Não é um usuário, ou há algo errado", "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTxtUsuario_Bjf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPwfSenha_Bjf = new javax.swing.JPasswordField();
        jBtnAcessar_Bjf = new javax.swing.JButton();
        jBtnCancelar_Bjf = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel1.setText("Usuário");

        jTxtUsuario_Bjf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtUsuario_BjfActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel2.setText("Senha");

        jPwfSenha_Bjf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPwfSenha_BjfActionPerformed(evt);
            }
        });

        jBtnAcessar_Bjf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/confirmar.png"))); // NOI18N
        jBtnAcessar_Bjf.setText("Acessar");
        jBtnAcessar_Bjf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAcessar_BjfActionPerformed(evt);
            }
        });

        jBtnCancelar_Bjf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jBtnCancelar_Bjf.setText("Cancelar");
        jBtnCancelar_Bjf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelar_BjfActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Georgia", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 102));
        jLabel3.setText("Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBtnAcessar_Bjf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnCancelar_Bjf))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jPwfSenha_Bjf, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jTxtUsuario_Bjf, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(jTxtUsuario_Bjf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPwfSenha_Bjf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCancelar_Bjf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAcessar_Bjf))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtUsuario_BjfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtUsuario_BjfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtUsuario_BjfActionPerformed

    private void jPwfSenha_BjfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPwfSenha_BjfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPwfSenha_BjfActionPerformed

    private void jBtnAcessar_BjfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAcessar_BjfActionPerformed
        // TODO add your handling code here:
        entrar();
    }//GEN-LAST:event_jBtnAcessar_BjfActionPerformed

    private void jBtnCancelar_BjfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelar_BjfActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jBtnCancelar_BjfActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JDlgLogin(null, true).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAcessar_Bjf;
    private javax.swing.JButton jBtnCancelar_Bjf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPwfSenha_Bjf;
    private javax.swing.JTextField jTxtUsuario_Bjf;
    // End of variables declaration//GEN-END:variables
}
