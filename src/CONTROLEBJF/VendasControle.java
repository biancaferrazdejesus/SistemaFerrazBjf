/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLEBJF;

import bean.VendasBjf;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author duals
 */
public class VendasControle extends AbstractTableModel {

  
private List lista;

public void setList(List lista){
        this.lista = lista;
        this.fireTableDataChanged();
    }

public VendasBjf getbean(int row){
return (VendasBjf) lista.get(row);
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
        VendasBjf vendasBjf = (VendasBjf) lista.get(rowIndex);
      if (columnIndex == 0) {
             return vendasBjf.getIdvendasBjf();
        }
        if (columnIndex == 1) {
             return vendasBjf.getClienteBjf();
        }
        if (columnIndex == 2) {
             return vendasBjf.getDatadaVendasBjf();
        }
        if (columnIndex == 3) {
            return vendasBjf.getValorTotalBjf();
        }
       return "" ;
    }
@Override
 public String getColumnName(int columnIndex){
        if (columnIndex == 0) {
             return "ID";
        }
        if (columnIndex == 1) {
             return "Cliente";
        }
        if (columnIndex == 2) {
             return "Data";
        }
        if (columnIndex == 3) {
             return "Valor Total";
        }
    return "" ;
    }
}

    
    

