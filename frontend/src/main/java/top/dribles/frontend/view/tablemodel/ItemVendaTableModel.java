/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package top.dribles.frontend.view.tablemodel;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import top.dribles.frontend.model.ItemVenda;

/**
 *
 * @author crist
 */
public class ItemVendaTableModel extends DefaultTableModel {
    
    public ItemVendaTableModel() {
//        this.addColumn("Id");
//        this.addColumn("Desconto");
        this.addColumn("Descricao");
        this.addColumn("Quantidade");
        this.addColumn("Valor");
    }
    
    public ItemVendaTableModel(List<ItemVenda> listItemVenda) {
        this();
        addItensVenda(listItemVenda);
    }
    
    public void addItensVenda(List<ItemVenda> listItemVenda) {
        for (ItemVenda itemVenda : listItemVenda) {
            this.addRow(new Object[] {
//                itemVenda.getProduto_id(),
//                itemVenda.getDesconto_un(),
                itemVenda.getProduto().getDescricao(),
                itemVenda.getQuantidade(),
                itemVenda.getValor_total()
            });
        }
    }
    
    public void setItensVenda(List<ItemVenda> listItemVenda) {
        this.setRowCount(0); // Limpa todas as linhas existentes na tabela
        addItensVenda(listItemVenda); // Adiciona os novos itens de venda à tabela
    }
    
    public ItemVenda getSelectedProduto(JTable table,
            List<ItemVenda> itensVenda) {
        return null;
    }
}
