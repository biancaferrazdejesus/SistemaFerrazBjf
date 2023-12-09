/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import CONTROLEBJF.FuncionarioControleBjf;
import bean.FuncionarioBjf;
import dao.FuncionarioDAO;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;

/**
 *
 * @author duals
 */
public class JDlgFuncionariosNovoIABjf extends javax.swing.JDialog {
    FuncionarioBjf funcionarioBjf;
    FuncionarioDAO funcionarioDAO;
    JDlgFuncionariosNovoBjf jDlgFuncionariosNovoBjf;
    FuncionarioControleBjf funcionarioControleBjf;
    private boolean incluir;
    MaskFormatter mascaracpf;
    MaskFormatter mascaratelefone;
    /**
     * Creates new form JDlgFuncionarios
     */
    public JDlgFuncionariosNovoIABjf(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Funcionario");
        setLocationRelativeTo(null);
        funcionarioDAO = new FuncionarioDAO();
        
        try {
            mascaracpf = new MaskFormatter("###.###.###-##");
            mascaratelefone = new MaskFormatter("(##)#####-####");
    }catch (ParseException ex) {
            Logger.getLogger(JDlgClientesBjf.class.getName()).log(Level.SEVERE, null, ex);
        }
        jFmtCpf.setFormatterFactory(new DefaultFormatterFactory(mascaracpf));
        jFmtNumero_tel_Bjf.setFormatterFactory(new DefaultFormatterFactory(mascaratelefone));
    }

public FuncionarioBjf viewBean() {
        FuncionarioBjf funcionarioBjf = new FuncionarioBjf();
        int id = Util.strInt(jFmtCodigoBjf.getText());
        double salario = Util.strDouble(jFmtSalario_Bjf.getText());
        if (jCboSexo.getSelectedIndex() == 1) {
            funcionarioBjf.setSexoBjf("F");
        } else{
            funcionarioBjf.setSexoBjf("M");
        }
        funcionarioBjf.setSalarioBjf(salario);
        funcionarioBjf.setIdfuncionarioBjf(id);
        funcionarioBjf.setNomeBjf(JTxtNome_Bjf.getText());
        funcionarioBjf.setNumeroTelefoneBjf(jFmtNumero_tel_Bjf.getText());
        funcionarioBjf.setEmailBjf(jTxtEmail_Bjf.getText());
        funcionarioBjf.setCpfBjf(jFmtCpf.getText());
        funcionarioBjf.setDepartamentoBjf(jTxtDepartamento_Bjf.getText());
        funcionarioBjf.setSalarioBjf(salario);
       

        return funcionarioBjf;
    }

    public void beanView(FuncionarioBjf funcionarioBjf) {

        String intStr = Util.intStr(funcionarioBjf.getIdfuncionarioBjf());
        String salarios = Util.doubleStr(funcionarioBjf.getSalarioBjf());
        
        jFmtCodigoBjf.setText(intStr);
        jFmtSalario_Bjf.setText(salarios);
        JTxtNome_Bjf.setText(funcionarioBjf.getNomeBjf());
        jTxtEmail_Bjf.setText(funcionarioBjf.getEmailBjf());
        jTxtDepartamento_Bjf.setText(funcionarioBjf.getDepartamentoBjf());
        jFmtCpf.setText(funcionarioBjf.getCpfBjf());
        jFmtNumero_tel_Bjf.setText(funcionarioBjf.getNumeroTelefoneBjf());

    }
    public void setTelaAnterior(JDlgFuncionariosNovoBjf jDlgFuncionariosNovoBjf) {
        this.jDlgFuncionariosNovoBjf = jDlgFuncionariosNovoBjf;
    }
  
     public void setIncluir(boolean incluir){
         this.incluir = incluir;
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
        JTxtNome_Bjf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtEmail_Bjf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jFmtCpf = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jFmtSalario_Bjf = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jCboSexo = new javax.swing.JComboBox<>();
        jTxtDepartamento_Bjf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jFmtNumero_tel_Bjf = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jBtnOk1 = new javax.swing.JButton();
        jBtnCancelar1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jFmtCodigoBjf = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Número de Telefone:");

        JTxtNome_Bjf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTxtNome_BjfActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jTxtEmail_Bjf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEmail_BjfActionPerformed(evt);
            }
        });

        jLabel3.setText("Email:");

        jFmtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtCpfActionPerformed(evt);
            }
        });

        jLabel5.setText("CPF");

        jLabel7.setText("Salário:");

        jLabel9.setText("Departamento:");

        jCboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));
        jCboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboSexoActionPerformed(evt);
            }
        });

        jTxtDepartamento_Bjf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDepartamento_BjfActionPerformed(evt);
            }
        });

        jLabel8.setText("Sexo");

        jFmtNumero_tel_Bjf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtNumero_tel_BjfActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 0, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setToolTipText("");
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jBtnOk1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/confirmar.png"))); // NOI18N
        jBtnOk1.setText("Ok");
        jBtnOk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOk1ActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnOk1);

        jBtnCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jBtnCancelar1.setText("Cancelar");
        jBtnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnCancelar1);

        jLabel4.setFont(new java.awt.Font("Georgia", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 153));
        jLabel4.setText("Cadastro de Funcionários");

        jLabel10.setText("Código");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jFmtSalario_Bjf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTxtDepartamento_Bjf, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtEmail_Bjf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFmtNumero_tel_Bjf, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9))
                                .addGap(62, 62, 62))
                            .addComponent(jFmtCpf)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jFmtCodigoBjf)
                                .addGap(15, 15, 15))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(JTxtNome_Bjf, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTxtNome_Bjf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtCodigoBjf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtEmail_Bjf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtNumero_tel_Bjf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtSalario_Bjf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtDepartamento_Bjf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTxtNome_BjfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTxtNome_BjfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTxtNome_BjfActionPerformed

    private void jTxtEmail_BjfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEmail_BjfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEmail_BjfActionPerformed

    private void jFmtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtCpfActionPerformed

    private void jCboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboSexoActionPerformed

    private void jTxtDepartamento_BjfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDepartamento_BjfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtDepartamento_BjfActionPerformed

    private void jBtnOk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOk1ActionPerformed
        FuncionarioBjf funcionarioBjf = viewBean();
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        
        if(incluir) {
            funcionarioDAO.insert(funcionarioBjf);
            List lista = funcionarioDAO.listAll();
            jDlgFuncionariosNovoBjf.funcionarioControleBjf.setList(lista);
            Util.mensagem("Registro incluido");
        } else{
            funcionarioDAO.update(funcionarioBjf);
            List lista = funcionarioDAO.listAll();
            jDlgFuncionariosNovoBjf.funcionarioControleBjf.setList(lista);
            Util.mensagem("Registro alterado");
        }
        
        
        
      
       
   //    Util.limparCampos(jTxtCodigo, jTxtNome, jTxtDescricao, jTxtPreco, jTxtQuantidade, jTxtTipo4);
        this.dispose();
        
    }//GEN-LAST:event_jBtnOk1ActionPerformed

    private void jBtnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelar1ActionPerformed
        Util.mensagem("Operação Cancelada");
        setVisible(false);
    }//GEN-LAST:event_jBtnCancelar1ActionPerformed

    private void jFmtNumero_tel_BjfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtNumero_tel_BjfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtNumero_tel_BjfActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgFuncionariosNovoIABjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgFuncionariosNovoIABjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgFuncionariosNovoIABjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgFuncionariosNovoIABjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgFuncionariosNovoIABjf dialog = new JDlgFuncionariosNovoIABjf(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTxtNome_Bjf;
    private javax.swing.JButton jBtnCancelar1;
    private javax.swing.JButton jBtnOk1;
    private javax.swing.JComboBox<String> jCboSexo;
    private javax.swing.JFormattedTextField jFmtCodigoBjf;
    private javax.swing.JFormattedTextField jFmtCpf;
    private javax.swing.JFormattedTextField jFmtNumero_tel_Bjf;
    private javax.swing.JFormattedTextField jFmtSalario_Bjf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtDepartamento_Bjf;
    private javax.swing.JTextField jTxtEmail_Bjf;
    // End of variables declaration//GEN-END:variables
}
