/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLEBJF;



import bean.FuncionarioBjf;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author duals
 */
public class FuncionarioControleBjf extends AbstractTableModel {
    List lista;
    
    public void setList(List lista){
        this.lista = lista;
        this.fireTableDataChanged();
    }
    
    public FuncionarioBjf getBean(int row){
        return (FuncionarioBjf) lista.get(row);
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
        FuncionarioBjf funcionario = (FuncionarioBjf) lista.get(rowIndex);
        if(columnIndex == 0){
            return funcionario.getIdfuncionarioBjf();
        }
        if(columnIndex == 1){
            return funcionario.getNomeBjf();
        }
        if(columnIndex == 2){
            return funcionario.getSalarioBjf();
        }
        if(columnIndex == 3){
            return funcionario.getCpfBjf();
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
            return "Salario";
        }
        if(column == 3){
            return "Cpf";
        }
        return null;
    }
    
}
 