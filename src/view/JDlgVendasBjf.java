
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import CONTROLEBJF.ProdutoControleBjf;
import CONTROLEBJF.VendasControle;
import CONTROLEBJF.VendasProdutoControleBjf;
import bean.ClienteBjf;
import bean.FuncionarioBjf;
import bean.ProdutoVendasBjf;
import bean.VendasBjf;
import dao.ClientesDAO;
import dao.FuncionarioDAO;
import dao.VendasDAO;
import dao.VendasProdutoDAO;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import pesquisa.JDlgVendaPesquisaBjf;
import tools.Util;

/**
 *
 * @author duals
 */
public class JDlgVendasBjf extends javax.swing.JDialog {
    private boolean incl;
    VendasBjf vendasBjf;
    JDlgVendaPesquisaBjf jDlgVendasPesquisa;
    MaskFormatter maskdata;
    private JDlgVendasBjf jDlgVendasBjf;
    private VendasControle vendasControle;
    MaskFormatter maskcpf;
    MaskFormatter maskdatanascimento;
    JDlgVendasProduto jDlgVendasProduto;
    VendasDAO vendasdao;
    VendasProdutoDAO vendproddao;
    ProdutoVendasBjf produtoVendasBjf;
    VendasProdutoControleBjf vendaprodutoControleBjf;
    
    /**
     * Creates new form JDlgVendasBjf
     */
    public JDlgVendasBjf(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        
        List lista = new ArrayList();    
        VendasDAO vendasDAO = new VendasDAO();
        VendasProdutoDAO  vendproddao = new VendasProdutoDAO();
        jDlgVendasProduto = new JDlgVendasProduto(null, true);
        vendasControle = new VendasControle();
        vendaprodutoControleBjf = new VendasProdutoControleBjf();
        vendaprodutoControleBjf.setList(lista);
        List listProduto = vendproddao.listAll();
        jTable1.setModel(vendaprodutoControleBjf);
        
        ClientesDAO clienteDAO = new ClientesDAO();
        List listaClientes = clienteDAO.listAll();
        for (int i = 0; i < listaClientes.size(); i++) {
            jCboClientesBjf.addItem((ClienteBjf) listaClientes.get(i));
        }
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        List listaFuncionario = funcionarioDAO.listAll();
        for (int i = 0; i < listaFuncionario.size(); i++) {
            jCboVendedorBjf.addItem((FuncionarioBjf) listaFuncionario.get(i));
        }
     try {
            maskcpf = new MaskFormatter("###.###.###-##");
            maskdatanascimento = new MaskFormatter("##/##/####");
            
        } catch (ParseException ex) {
            Logger.getLogger(JDlgUsuariosBjf.class.getName()).log(Level.SEVERE, null, ex);
        }
        jFmtDataBjf.setFormatterFactory(new DefaultFormatterFactory(maskdatanascimento));
        
        Util.habilitar(false, jBtnAlterar,jBtnCancelar,jBtnConfirmar,jBtnExcluir,jCboClientesBjf, jCboVendedorBjf, jTxtNumPed, jFmtDataBjf,jTxtTotal);
        jBtnIncluir.setEnabled(true);
        Util.limparCampos(jFmtDataBjf,jCboClientesBjf,jCboVendedorBjf,jTxtNumPed,jTxtTotal);}
    
    public  void  setTelaAnterior(JDlgVendasBjf jDlgVendasBjf){
            this.jDlgVendasBjf  = jDlgVendasBjf;
            
    }
  public VendasBjf viewBean() {
        VendasBjf vendasBjf = new VendasBjf();
        int id = Util.strInt(jTxtNumPed.getText());
        vendasBjf.setIdvendasBjf(id);
        double total = Util.strDouble(jTxtTotal.getText());
       Date data = Util.strDate(jFmtDataBjf.getText());
        vendasBjf.setDatadaVendasBjf(data);
        vendasBjf.setClienteBjf((ClienteBjf) jCboClientesBjf.getSelectedItem());
        vendasBjf.setFuncionarioBjf((FuncionarioBjf) jCboVendedorBjf.getSelectedItem());
        return vendasBjf;
     }
     public void beanView(VendasBjf vendasBjf) {
        String intStr = Util.intStr(vendasBjf.getIdvendasBjf());
        jTxtNumPed.setText(intStr);
        String total = Util.doubleStr(vendasBjf.getValorTotalBjf());
        jTxtTotal.setText(total);
        jFmtDataBjf.setText(Util.dateStr(vendasBjf.getDatadaVendasBjf()));
        jCboVendedorBjf.setSelectedItem(vendasBjf.getFuncionarioBjf());
        jCboClientesBjf.setSelectedItem(vendasBjf.getClienteBjf());
        
       VendasProdutoDAO vendasProdutoDAO = new VendasProdutoDAO();
       List listaProd = (List) vendasProdutoDAO.listProduto(produtoVendasBjf);
              vendaprodutoControleBjf.setList(listaProd);
            
              
              
        }
     public int getSelectedRowProd(){
     return jTable1.getSelectedRow();
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCboClientesBjf = new javax.swing.JComboBox<ClienteBjf>();
        jCboVendedorBjf = new javax.swing.JComboBox<>();
        jTxtTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jFmtDataBjf = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jBtnAlterarprod = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBtnExcluirprod = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jbtnIncluirprod = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTxtNumPed = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTxtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTotalActionPerformed(evt);
            }
        });

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

        jLabel1.setText("Num. Pedido");

        jBtnAlterarprod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        jBtnAlterarprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarprodActionPerformed(evt);
            }
        });

        jLabel2.setText("Data");

        jBtnExcluirprod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir.png"))); // NOI18N
        jBtnExcluirprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirprodActionPerformed(evt);
            }
        });

        jLabel3.setText("CLientes");

        jbtnIncluirprod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir.png"))); // NOI18N
        jbtnIncluirprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIncluirprodActionPerformed(evt);
            }
        });

        jLabel4.setText("Vendedor");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/confirmar.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir.png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnPesquisar)
                .addGap(18, 18, 18)
                .addComponent(jBtnCancelar)
                .addGap(18, 18, 18)
                .addComponent(jBtnConfirmar)
                .addGap(28, 28, 28)
                .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnAlterar)))
                .addContainerGap())
        );

        jLabel5.setText("Total");

        jTxtNumPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNumPedActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 102));
        jLabel7.setText("Tela de Vendas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jTxtNumPed, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jFmtDataBjf, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCboClientesBjf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jCboVendedorBjf, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(284, 284, 284)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBtnExcluirprod, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnAlterarprod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnIncluirprod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jbtnIncluirprod, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnAlterarprod, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnExcluirprod, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCboClientesBjf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCboVendedorBjf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFmtDataBjf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtNumPed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtTotalActionPerformed

    private void jbtnIncluirprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIncluirprodActionPerformed
    jDlgVendasProduto.setTitle("Incluir");
    jDlgVendasProduto.setTelaAnterior(this);
    
    jDlgVendasProduto.setVisible(true);
    
    
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnIncluirprodActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        VendasBjf vendaBjf = viewBean();
        VendasDAO vendaDAO = new VendasDAO();
        if (incl == true) {
            vendaDAO.insert(vendaBjf);
            VendasProdutoDAO vendasProdutoDAO = new VendasProdutoDAO();
            ProdutoVendasBjf produtoVendasBjf;
            for (int linha = 0; linha < jTable1.getRowCount(); linha++) {
                produtoVendasBjf = vendaprodutoControleBjf.getBean(linha);
                produtoVendasBjf.setVendasBjf(vendaBjf);
                vendasProdutoDAO.insert(produtoVendasBjf);
                Util.mensagem("Registro incluido com sucesso.");
            }
        } else {
            vendaDAO.update(vendaBjf);
            //remover todos os pedidos produtos deste pedido

            //incluir todos os pedidosProduto que estao no jtable
            VendasProdutoDAO vendasProdutoDAO = new VendasProdutoDAO();
            ProdutoVendasBjf produtoVendasBjf;
            for (int linha = 0; linha < jTable1.getRowCount(); linha++) {
                produtoVendasBjf = vendaprodutoControleBjf.getBean(linha);
                produtoVendasBjf.setVendasBjf(vendaBjf);
                vendasProdutoDAO.insert(produtoVendasBjf);
                Util.mensagem("Registro alterado com sucesso.");
            }
        }
         vendaprodutoControleBjf.limparTabela();

        Util.habilitar(false,jTxtNumPed, jFmtDataBjf, jCboClientesBjf, jCboVendedorBjf, jTxtTotal, jBtnAlterarprod, jBtnExcluirprod, jbtnIncluirprod);
        Util.habilitar(true, jBtnIncluir,jBtnPesquisar,jBtnExcluir);
        Util.limparCampos(jBtnAlterar,jBtnCancelar,jBtnConfirmar,jBtnExcluir,jTxtNumPed, jFmtDataBjf , jCboClientesBjf, jCboVendedorBjf, jTxtTotal, jBtnAlterarprod, jBtnExcluirprod, jbtnIncluirprod, jTable1);
        Util.mensagem("Tabela limpa após atualização.");
        vendasBjf = null;
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
//        if (Util.perguntar("Deseja excluir o registro?") == true) {
//                VendasBjf vendasBjf = viewBean();
//                VendasDAO vendasDAO = new VendasDAO();
//                vendasDAO.delete(vendasBjf);
//                Util.mensagem("Registro Excluido.");
//            
//            }else{
//                Util.mensagem("Exclusão Cancelada.");
//             }
//        Util.limparCampos(jBtnAlterar,jBtnCancelar,jBtnConfirmar,jBtnExcluir,jTxtNumPed, jFmtDataBjf, jCboClientesBjf, jCboVendedorBjf, jTxtTotal, jBtnAlterarprod, jBtnExcluirprod, jbtnIncluirprod);
   
if(vendasBjf != null){
       if (Util.perguntar("Deseja excluir msm parça?") == true) {
       VendasProdutoDAO vendasprodutodao = new VendasProdutoDAO();
        ProdutoVendasBjf produtoVendasBjf;
        for(int linha = 0; linha< jTable1.getRowCount(); linha++){
            produtoVendasBjf = vendaprodutoControleBjf.getBean(linha);
            vendproddao.delete(produtoVendasBjf);
        }
        vendasdao.delete(vendasBjf);
    }
      else{
             Util.mensagem("PESQUISA ANTES CARAI");
               }
}
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        Util.mensagem("Operação Cancelada!");
        Util.habilitar(false, jBtnCancelar, jBtnConfirmar, jBtnAlterar,jTxtNumPed, jFmtDataBjf, jCboClientesBjf, jCboVendedorBjf, jTxtTotal, jBtnAlterarprod, jBtnExcluirprod, jbtnIncluirprod);
        Util.habilitar(true, jBtnIncluir, jBtnPesquisar, jBtnExcluir);
        Util.limparCampos(jBtnAlterar,jBtnCancelar,jBtnConfirmar,jBtnExcluir,jTxtNumPed, jFmtDataBjf, jCboClientesBjf, jCboVendedorBjf, jTxtTotal, jBtnAlterarprod, jBtnExcluirprod, jbtnIncluirprod);

    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        
        jDlgVendasPesquisa = new JDlgVendaPesquisaBjf(null, true);
        jDlgVendasPesquisa.setTitle("Pesquisar");
        jDlgVendasPesquisa.setTelaAnterior(this);
        jDlgVendasPesquisa.setVisible(true);
        Util.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnIncluir);
        Util.habilitar(false, jBtnCancelar, jBtnConfirmar);
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        incl = true;
        Util.habilitar(true,jBtnExcluir, jBtnConfirmar, jBtnCancelar,jTxtNumPed, jFmtDataBjf, jCboClientesBjf, jCboVendedorBjf, jTxtTotal, jBtnAlterarprod, jBtnExcluirprod, jbtnIncluirprod);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar,  jBtnPesquisar);
        Util.limparCampos(jBtnAlterar,jBtnCancelar,jBtnConfirmar,jBtnExcluir,jTxtNumPed, jFmtDataBjf, jCboClientesBjf, jCboVendedorBjf, jTxtTotal, jBtnAlterarprod, jBtnExcluirprod, jbtnIncluirprod);
    }//GEN-LAST:event_jBtnIncluirActionPerformed
 
    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        incl = false;
        Util.habilitar(true, jBtnConfirmar, jBtnCancelar,jTxtNumPed, jFmtDataBjf, jCboClientesBjf, jCboVendedorBjf, jTxtTotal, jBtnAlterarprod, jBtnExcluirprod, jbtnIncluirprod);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jTxtNumPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNumPedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNumPedActionPerformed

    private void jBtnAlterarprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarprodActionPerformed
    JDlgVendasProduto jDlgVendasProduto = new JDlgVendasProduto(null, true);
    jDlgVendasProduto.setTitle("Alteração de Produto");
    jDlgVendasProduto.setTelaAnterior(this);
    int linSel = jTable1.getSelectedRow();
    ProdutoVendasBjf produtoVendasBjf = (ProdutoVendasBjf) vendaprodutoControleBjf.getBean(linSel);
    jDlgVendasProduto.beanView(produtoVendasBjf);
    jDlgVendasProduto.setVisible(true);
    Util.mensagem("Produto Alterado.");

    // TODO add your handling code here:
    }//GEN-LAST:event_jBtnAlterarprodActionPerformed

    private void jBtnExcluirprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirprodActionPerformed

   VendasProdutoControleBjf vendasProdutoControleBjf = new  VendasProdutoControleBjf ();
int linha = jTable1.getSelectedRow();
        if (linha == -1) {
            Util.mensagem("Nenhuma linha selecionada");
            
        } else {
            if (Util.perguntar("Confirma exclusão do produto?") == true) {
                vendasProdutoControleBjf.removeBean(linha);
                    Util.mensagem("Produto Excluido.");
        ((VendasProdutoControleBjf) jTable1.getModel()).removeBean(linha);
            }
        }
               

        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnExcluirprodActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgVendasBjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgVendasBjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgVendasBjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgVendasBjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgVendasBjf dialog = new JDlgVendasBjf(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnAlterarprod;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnExcluirprod;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JComboBox<ClienteBjf> jCboClientesBjf;
    private javax.swing.JComboBox<FuncionarioBjf> jCboVendedorBjf;
    private javax.swing.JFormattedTextField jFmtDataBjf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtNumPed;
    private javax.swing.JTextField jTxtTotal;
    private javax.swing.JButton jbtnIncluirprod;
    // End of variables declaration//GEN-END:variables
}
