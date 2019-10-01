/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 12537541600
 */
public class TMProduto extends AbstractTableModel {
    
    private List<Produto> listaProduto;
    
    //private int COL_ID = 0;

    @Override
    public int getRowCount() {
        return listaProduto.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto p = this.listaProduto.get(rowIndex);
        
        if(columnIndex == COL_ID)
        {
            return p.GetId();
        }
        
        return null;
    }
    
    
}
