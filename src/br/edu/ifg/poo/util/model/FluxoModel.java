/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg.poo.util.model;

import br.edu.ifg.poo.util.Banco;
import br.edu.ifg.poo.vo.Fluxo;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * @author danilo
 */
public class FluxoModel extends AbstractTableModel {

    private String[] colunas = {"Cod", "Descrição", "Data", "Valor", "Categoria"};
    private List<Fluxo> fluxo;

    public FluxoModel(List<Fluxo> fluxo) {
        this.fluxo = fluxo;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    @Override
    public int getRowCount() {
        return fluxo.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return fluxo.get(rowIndex).getId();
            case 1:
                return fluxo.get(rowIndex).getDesc();
            case 2:
                String data = new SimpleDateFormat("dd/MM/yyyy").format(fluxo.get(rowIndex).getData());
                return data;
            case 3:
                return fluxo.get(rowIndex).getValor();
            case 4:
                return fluxo.get(rowIndex).getId_cat() + " - " + Banco.nomeCategoria(fluxo.get(rowIndex).getId_cat());
            default:
                return null;
        }
    }
}
