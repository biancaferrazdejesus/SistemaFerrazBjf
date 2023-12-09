/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLEBJF;

import bean.UsuariosBjf;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author duals
 */
public class UsuariosControleBjf extends AbstractTableModel{
    
    List lista;
    
    public void setList(List lista){
        this.lista = lista;
        this.fireTableDataChanged();
    }
    
    public UsuariosBjf getBean(int row){
        return (UsuariosBjf) lista.get(row);
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
        UsuariosBjf usuariosBjf = (UsuariosBjf) lista.get(rowIndex);
        if(columnIndex == 0){
            return usuariosBjf.getIdusuariosBjf();
        }
        if(columnIndex == 1){
            return usuariosBjf.getNomeBjf();
        }
        if(columnIndex == 2){
            return usuariosBjf.getEmailBjf();
        }
        if(columnIndex == 3){
            return usuariosBjf.getCpfBjf();
        }
        return "";
     
     }
    @Override
     public String getColumnName(int column){
        if(column == 0){
            return "ID";
        }
        if(column == 1){
            return "Nome";
        }
        if(column == 2){
            return "Email";
        }
        if(column == 3){
            return "Cpf";
        }
        return null;
    }
    
}
