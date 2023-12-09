/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesquisa;

import CONTROLEBJF.VendasControle;
import CONTROLEBJF.VendasProdutoControleBjf;
import bean.ProdutoVendasBjf;
import bean.VendasBjf;
import view.JDlgVendasBjf;
import dao.VendasDAO;
import java.util.List;
import tools.Util;


/**
 *
 * @author duals
 */
public class JDlgVendaPesquisaBjf extends javax.swing.JDialog {
    
  private JDlgVendasBjf jDlgVendasBjf;
    private VendasControle vendasControle;
    ProdutoVendasBjf produtoVendasBjf;
    VendasBjf vendasbjf;
    /**
     * Creates new form JDlgVendaPesquisaBjf
     */
    public JDlgVendaPesquisaBjf(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Pesquisa de Vendas");
        setLocationRelativeTo(null);
        VendasControle vendasControle = new VendasControle();
 
        vendasControle = new VendasControle();
        VendasDAO vendasDAO = new VendasDAO();
        List lista = vendasDAO.listAll();
        vendasControle.setList(lista);
        jTable1.setModel(vendasControle);
    }
    public  void  setTelaAnterior(JDlgVendasBjf jDlgVendasBjf){
        
            this.jDlgVendasBjf = this.jDlgVendasBjf;
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnCancelarBjf = new javax.swing.JButton();
        jBtnOkBjf = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jBtnCancelarBjf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jBtnCancelarBjf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarBjfActionPerformed(evt);
            }
        });

        jBtnOkBjf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/confirmar.png"))); // NOI18N
        jBtnOkBjf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOkBjfActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Georgia", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 153));
        jLabel8.setText("Pesquisa de Vendas");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jBtnOkBjf)
                .addGap(60, 60, 60)
                .addComponent(jBtnCancelarBjf, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnOkBjf)
                    .addComponent(jBtnCancelarBjf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCancelarBjfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarBjfActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jBtnCancelarBjfActionPerformed

    private void jBtnOkBjfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOkBjfActionPerformed
  int rowSel = jTable1.getSelectedRow();
        
        vendasbjf = vendasControle.getbean(rowSel);
        jDlgVendasBjf.beanView(vendasbjf);
        
        setVisible(false);      
      
//VendasControle vendasControle = new VendasControle();
//
//int rowSel = jTable1.getSelectedRow();
//
//// Verificar se há uma linha selecionada
//if (rowSel != -1) {
//    VendasBjf vendasBjf = vendasControle.getbean(rowSel);
//
//    // Verificar se vendasControle não é nulo
//    if (vendasControle != null) {
//
//        // Verificar se jDlgVendasBjf não é nulo
//        if (jDlgVendasBjf != null) {
//            jDlgVendasBjf.beanView(vendasBjf);
//            setVisible(false);
//        } else {
//            // Lógica para lidar com jDlgVendasBjf sendo nulo
//            System.err.println("Erro: jDlgVendasBjf é nulo.");
//            // Você pode lançar uma exceção, exibir uma mensagem de erro, ou tomar outra ação apropriada.
//        }
//
//    } else {
//        // Lógica para lidar com vendasControle sendo nulo
//        System.err.println("Erro: vendasControle é nulo.");
//        // Você pode lançar uma exceção, exibir uma mensagem de erro, ou tomar outra ação apropriada.
//    }
//} else {
//    // Lógica para lidar com nenhuma linha selecionada
//    System.out.println("Nenhuma linha selecionada.");
//    // Você pode exibir uma mensagem informativa ou tomar outra ação apropriada.
//}



//int rowSel = jTable1.getSelectedRow();
//
//// Verifica se uma linha está selecionada
//if (rowSel == -1) {
//    Util.mensagem("Nenhuma linha selecionada");
//} else {
//    VendasBjf vendasBjf = vendasControle.getbean(rowSel);
//
//    // Verifica se a venda possui produtos associados
//    if (vendasBjf != null && vendasBjf.getProdutoVendaBjf() != null && !vendasBjf.getProdutos().isEmpty()) {
//        // Se houver produtos, continua com o código
//        jDlgVendasBjf.beanView(vendasBjf);
//        setVisible(false);
//    } else {
//        Util.mensagem("A venda não possui produtos associados.");
//    }
//}

// Método que você pode chamar ao clicar no botão "Ok"
//    int rowSel = jTable1.getSelectedRow();
//
//    // Verifica se uma linha está selecionada
//    if (rowSel == -1) {
//        Util.mensagem("Nenhuma linha selecionada");
//        return;
//    }
//
//    // Obtém a venda associada à linha selecionada
//    VendasBjf vendasBjf = vendasControle.getbean(rowSel);
//
//    // Verifica se a venda não é nula
//    if (vendasBjf != null) {
//        // Passa a venda para JDlgVendasBjf para visualização
//        jDlgVendasBjf.beanView(vendasBjf);
//
//        // Esconde a tela atual
//        setVisible(false);
//    } else {
//        Util.mensagem("Erro ao obter informações da venda.");
//    }


    }//GEN-LAST:event_jBtnOkBjfActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgVendaPesquisaBjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgVendaPesquisaBjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgVendaPesquisaBjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgVendaPesquisaBjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgVendaPesquisaBjf dialog = new JDlgVendaPesquisaBjf(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnCancelarBjf;
    private javax.swing.JButton jBtnOkBjf;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}