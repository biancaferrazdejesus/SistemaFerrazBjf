/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLEBJF;


import bean.ClienteBjf;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author duals
 */
public class ClientesControleBjf extends AbstractTableModel {
  
    List lista;
    
    public void setList(List lista){
        this.lista = lista;
        this.fireTableDataChanged();
    }
    
    public ClienteBjf getBean(int row){
        return (ClienteBjf) lista.get(row);
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
        ClienteBjf cliente = (ClienteBjf) lista.get(rowIndex);
        if(columnIndex == 0){
            return cliente.getIdclienteBjf();
        }
        if(columnIndex == 1){
            return cliente.getNomeBjf();
        }
        if(columnIndex == 2){
            return cliente.getEmailBjf();
        }
        if(columnIndex == 3){
            return cliente.getCpfBjf();
        }
        return "";
     
     }
    @Override
    public String getColumnName(int column){
        if(column == 0){
            return "id";
        }
        if(column == 1){
            return "nomebjf";
        }
        if(column == 2){
            return "apelidobjf";
        }
        if(column == 3){
            return "cpfbjf";
        }
        return null;
    }
    
    }

