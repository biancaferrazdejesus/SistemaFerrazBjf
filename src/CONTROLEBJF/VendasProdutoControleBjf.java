///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package CONTROLEBJF;
//
//import bean.ProdutoVendasBjf;
//import bean.VendasBjf;
//import java.util.List;
//import javax.swing.table.AbstractTableModel;
//import javax.swing.table.DefaultTableModel;
//
///**
// *
// * @author duals
// */
//public class VendasProdutoControleBjf extends AbstractTableModel {
//
//  
//private List lista;
//
//public void setList(List lista){
//        this.lista = lista;
//        this.fireTableDataChanged();
//    }
//
//public ProdutoVendasBjf getBean(int linha){
//return (ProdutoVendasBjf) lista.get(linha);
//}
//
//@Override
//public int getRowCount() {
//        return lista.size();
//    }
//
//@Override
// public int getColumnCount() {
//      return 4;
//    }
// public Object getValueAt(int rowIndex, int columnIndex) {
//       ProdutoVendasBjf ProdutoVendasBjf = (ProdutoVendasBjf) lista.get(rowIndex);
//      if (columnIndex == 0) {
//             return ProdutoVendasBjf.getProdutoBjf().getNomeBjf();
//        }
//        if (columnIndex == 1) {
//             return ProdutoVendasBjf.getQuantidadeBjf();
//        }
//        if (columnIndex == 2) {
//             return ProdutoVendasBjf.getValorUnitarioBjf();
//        }
//        if (columnIndex == 3) {
//            return ProdutoVendasBjf.getQuantidadeBjf() * ProdutoVendasBjf.getValorUnitarioBjf();
//        }
//       return null;
//    }
//
// public String getColumnName(int columnIndex){
//        if (columnIndex == 0) {
//             return "ID";
//        }
//        if (columnIndex == 1) {
//             return "Quantidade";
//        }
//        if (columnIndex == 2) {
//             return "Valor Unitario";
//        }
//        if (columnIndex == 3) {
//             return "Valor Total";
//        }
//    return null;
//    }
//
//    public void addBean(ProdutoVendasBjf produtovendasbjf) {
//       lista.add(produtovendasbjf);
//       this.fireTableDataChanged();
//    }
//    public void removeBean(int index){
//    lista.remove(index);
//    this.fireTableDataChanged();
//    }
//    public void updateBean(int index, ProdutoVendasBjf produtovendasbjf){
//       lista.set(index, produtovendasbjf);
//       this.fireTableDataChanged();
//    }
//    
//}
//
//    
//    
//
package CONTROLEBJF;

import bean.ProdutoVendasBjf;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class VendasProdutoControleBjf extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }

    public ProdutoVendasBjf getBean(int linha) {
        return (ProdutoVendasBjf) lista.get(linha);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ProdutoVendasBjf ProdutoVendasBjf = (ProdutoVendasBjf) lista.get(rowIndex);
        if (columnIndex == 0) {
            return ProdutoVendasBjf.getProdutoBjf().getNomeBjf();
        }
        if (columnIndex == 1) {
            return ProdutoVendasBjf.getQuantidadeBjf();
        }
        if (columnIndex == 2) {
            return ProdutoVendasBjf.getValorUnitarioBjf();
        }
        if (columnIndex == 3) {
            return ProdutoVendasBjf.getQuantidadeBjf() * ProdutoVendasBjf.getValorUnitarioBjf();
        }
        return null;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        }
        if (columnIndex == 1) {
            return "Quantidade";
        }
        if (columnIndex == 2) {
            return "Valor Unitario";
        }
        if (columnIndex == 3) {
            return "Valor Total";
        }
        return null;
    }

    public void addBean(ProdutoVendasBjf produtovendasbjf) {
        lista.add(produtovendasbjf);
        this.fireTableDataChanged();
    }

//    public void removeBean(int index) {
//        lista.remove(index);
//        this.fireTableDataChanged();
//    }
 public void removeBean(int index) {
        if (lista != null && index >= 0 && index < lista.size()) {
            lista.remove(index);
            this.fireTableDataChanged();
        } else {
            System.out.println("Índice inválido ou lista não inicializada corretamente.");
        }
    }
    public void updateBean(int index, ProdutoVendasBjf produtovendasbjf) {
        lista.set(index, produtovendasbjf);
        this.fireTableDataChanged();
    }

    // Novo método para limpar a tabela
    public void limparTabela() {
        lista.clear();
        this.fireTableDataChanged();
    }
}
