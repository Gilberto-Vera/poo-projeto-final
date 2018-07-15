/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg.poo.frame;

import br.edu.ifg.poo.dao.FluxoDAO;
import br.edu.ifg.poo.exception.NegocioException;
import br.edu.ifg.poo.exception.SistemaException;
import br.edu.ifg.poo.util.Assert;
import br.edu.ifg.poo.util.Banco;
import br.edu.ifg.poo.util.MessageUtil;
import br.edu.ifg.poo.util.model.FluxoModel;
import br.edu.ifg.poo.vo.Categoria;
import br.edu.ifg.poo.vo.Fluxo;
import java.util.Date;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author gilberto
 */
public class CadastroFluxoCaixaFrm extends javax.swing.JInternalFrame {

    private Fluxo fluxo;
    private List<Fluxo> fluxos;
    
    public CadastroFluxoCaixaFrm() {
        initComponents();
        carregaLista();
        listar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupEntradaSaida = new javax.swing.ButtonGroup();
        jLabelCategoriaFC = new javax.swing.JLabel();
        jComboBoxCategoriaFC = new javax.swing.JComboBox<>();
        jLabelDataFC = new javax.swing.JLabel();
        jTextFieldDataFC = new javax.swing.JTextField();
        jRadioButtonEntradaFC = new javax.swing.JRadioButton();
        jLabelTipoMovimentacaoFC = new javax.swing.JLabel();
        jRadioButtonSaidaFC = new javax.swing.JRadioButton();
        jLabelDescricaoFC = new javax.swing.JLabel();
        jTextFieldDescricaoFC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldValorFC = new javax.swing.JTextField();
        jButtonNovoFC = new javax.swing.JButton();
        jButtonSalvarFC = new javax.swing.JButton();
        jButtonCancelarFC = new javax.swing.JButton();
        jButtonEditarFC = new javax.swing.JButton();
        jButtonExcluirFC = new javax.swing.JButton();
        jLabelValorEntradaFC = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMovimentosFC = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelEntradaFC = new javax.swing.JLabel();
        jLabelSaidaFC = new javax.swing.JLabel();
        jLabelValorSaidaFC = new javax.swing.JLabel();
        jLabelSaldoFC = new javax.swing.JLabel();
        jLabelValorSaldoFC = new javax.swing.JLabel();
        jButtonFiltrarFC = new javax.swing.JButton();

        setClosable(true);
        setTitle("Fluxo de Caixa");

        jLabelCategoriaFC.setText("Categoria:");

        jComboBoxCategoriaFC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelDataFC.setText("Data:");

        buttonGroupEntradaSaida.add(jRadioButtonEntradaFC);
        jRadioButtonEntradaFC.setText("Entrada");

        jLabelTipoMovimentacaoFC.setText("Tipo de Movimentação:");

        buttonGroupEntradaSaida.add(jRadioButtonSaidaFC);
        jRadioButtonSaidaFC.setText("Saída");

        jLabelDescricaoFC.setText("Descrição:");

        jLabel2.setText("Valor:");

        jButtonNovoFC.setText("Novo");
        jButtonNovoFC.setPreferredSize(new java.awt.Dimension(110, 30));

        jButtonSalvarFC.setText("Salvar");
        jButtonSalvarFC.setPreferredSize(new java.awt.Dimension(110, 30));

        jButtonCancelarFC.setText("Cancelar");
        jButtonCancelarFC.setPreferredSize(new java.awt.Dimension(110, 30));

        jButtonEditarFC.setText("Editar");
        jButtonEditarFC.setPreferredSize(new java.awt.Dimension(110, 30));

        jButtonExcluirFC.setText("Excluir");
        jButtonExcluirFC.setPreferredSize(new java.awt.Dimension(110, 30));

        jLabelValorEntradaFC.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jLabelValorEntradaFC.setForeground(new java.awt.Color(0, 255, 0));
        jLabelValorEntradaFC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelValorEntradaFC.setText("Valor");

        jTableMovimentosFC.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableMovimentosFC);

        jLabelEntradaFC.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jLabelEntradaFC.setForeground(java.awt.Color.black);
        jLabelEntradaFC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEntradaFC.setText("Entrada:");

        jLabelSaidaFC.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jLabelSaidaFC.setForeground(java.awt.Color.black);
        jLabelSaidaFC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSaidaFC.setText("Saída:");

        jLabelValorSaidaFC.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jLabelValorSaidaFC.setForeground(java.awt.Color.red);
        jLabelValorSaidaFC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelValorSaidaFC.setText("Valor");

        jLabelSaldoFC.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jLabelSaldoFC.setForeground(java.awt.Color.black);
        jLabelSaldoFC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSaldoFC.setText("Saldo:");

        jLabelValorSaldoFC.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jLabelValorSaldoFC.setForeground(new java.awt.Color(0, 0, 255));
        jLabelValorSaldoFC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelValorSaldoFC.setText("Valor");

        jButtonFiltrarFC.setText("Filtrar");
        jButtonFiltrarFC.setPreferredSize(new java.awt.Dimension(110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCategoriaFC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxCategoriaFC, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabelDescricaoFC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldDescricaoFC))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jButtonNovoFC, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonSalvarFC, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonEditarFC, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonExcluirFC, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonCancelarFC, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonFiltrarFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelDataFC)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldDataFC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldValorFC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabelTipoMovimentacaoFC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonEntradaFC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonSaidaFC))))
                            .addComponent(jScrollPane1)
                            .addComponent(jSeparator2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelEntradaFC)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelValorEntradaFC)
                                .addGap(32, 32, 32)
                                .addComponent(jLabelSaidaFC)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelValorSaidaFC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelSaldoFC)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelValorSaldoFC)))
                        .addGap(0, 8, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCategoriaFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTipoMovimentacaoFC)
                    .addComponent(jRadioButtonEntradaFC)
                    .addComponent(jRadioButtonSaidaFC)
                    .addComponent(jLabelCategoriaFC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescricaoFC)
                    .addComponent(jTextFieldDescricaoFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDataFC)
                    .addComponent(jTextFieldDataFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldValorFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovoFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvarFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelarFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditarFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluirFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFiltrarFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEntradaFC)
                    .addComponent(jLabelValorEntradaFC)
                    .addComponent(jLabelSaidaFC)
                    .addComponent(jLabelValorSaidaFC)
                    .addComponent(jLabelValorSaldoFC)
                    .addComponent(jLabelSaldoFC))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupEntradaSaida;
    private javax.swing.JButton jButtonCancelarFC;
    private javax.swing.JButton jButtonEditarFC;
    private javax.swing.JButton jButtonExcluirFC;
    private javax.swing.JButton jButtonFiltrarFC;
    private javax.swing.JButton jButtonNovoFC;
    private javax.swing.JButton jButtonSalvarFC;
    private javax.swing.JComboBox<String> jComboBoxCategoriaFC;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCategoriaFC;
    private javax.swing.JLabel jLabelDataFC;
    private javax.swing.JLabel jLabelDescricaoFC;
    private javax.swing.JLabel jLabelEntradaFC;
    private javax.swing.JLabel jLabelSaidaFC;
    private javax.swing.JLabel jLabelSaldoFC;
    private javax.swing.JLabel jLabelTipoMovimentacaoFC;
    private javax.swing.JLabel jLabelValorEntradaFC;
    private javax.swing.JLabel jLabelValorSaidaFC;
    private javax.swing.JLabel jLabelValorSaldoFC;
    private javax.swing.JRadioButton jRadioButtonEntradaFC;
    private javax.swing.JRadioButton jRadioButtonSaidaFC;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableMovimentosFC;
    private javax.swing.JTextField jTextFieldDataFC;
    private javax.swing.JTextField jTextFieldDescricaoFC;
    private javax.swing.JTextField jTextFieldValorFC;
    // End of variables declaration//GEN-END:variables

    private void listar() {
        resetcampos();
        jButtonNovoFC.setEnabled(true);
        jButtonFiltrarFC.setEnabled(true);
        limparcampos();
        listarDados(null,null);
    }
    
    private void resetcampos(){
        jComboBoxCategoriaFC.setEnabled(false);
        jRadioButtonEntradaFC.setEnabled(false);
        jRadioButtonSaidaFC.setEnabled(false);
        jTextFieldDescricaoFC.setEnabled(false);
        jTextFieldDataFC.setEnabled(false);
        jTextFieldValorFC.setEnabled(false);
        jButtonNovoFC.setEnabled(false);
        jButtonSalvarFC.setEnabled(false);
        jButtonEditarFC.setEnabled(false);
        jButtonExcluirFC.setEnabled(false);
        jButtonCancelarFC.setEnabled(false);
        jButtonFiltrarFC.setEnabled(false);
    }
    
    private void carregaLista() {                                            
        Banco.recarregaCategoria();
        jComboBoxCategoriaFC.setModel(new javax.swing.DefaultComboBoxModel());
        jComboBoxCategoriaFC.addItem("Nenhuma");
        for(Categoria c : Banco.getCategorias()){
            if(c.getId_catSup()!= 0)
                jComboBoxCategoriaFC.addItem(c.getId() + "-" + c.getDescricao().toUpperCase());
        }
    }

    private void limparcampos() {
        jComboBoxCategoriaFC.setSelectedIndex(0);
        buttonGroupEntradaSaida.clearSelection();
        jTextFieldDescricaoFC.setText("");
        jTextFieldDataFC.setText(null);
        jTextFieldValorFC.setText("");
        fluxo = null;
    }

    private void listarDados(Fluxo ent, Date antes) {
        try {
            if(Assert.isNull(ent)){
                fluxos = new FluxoDAO().buscar(ent);
            } else {
                fluxos = new FluxoDAO().pesquisa(ent, antes);
            }
            
            Double entrada = 0.0;
            Double saida = 0.0;
            for (int i = 0; i < fluxos.size(); i++) {
                if(fluxos.get(i).getValor() >= 0) {
                    entrada += fluxos.get(i).getValor();
                } else {
                    saida -= fluxos.get(i).getValor();
                }
            }
            jLabelValorEntradaFC.setText("R$ "+String.format("%.2f", entrada));
            jLabelValorSaidaFC.setText("R$ "+String.format("%.2f", saida));
            Double resumo = entrada - saida;
            jLabelValorSaldoFC.setText("R$ "+String.format("%.2f", resumo));
            
            FluxoModel fluxoModel = new FluxoModel(fluxos);
            jTableMovimentosFC.setModel(fluxoModel);
            ListSelectionModel selectionModel = jTableMovimentosFC.getSelectionModel();
            selectionModel.addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    if(jTableMovimentosFC.getSelectedRow() >= 0){
                        jButtonEditarFC.setEnabled(true);
                        jButtonExcluirFC.setEnabled(true);
                    }
                }
            });
            
        } catch (SistemaException ex) {
            MessageUtil.showMessage(ex);
        } catch (NegocioException ex) {
            MessageUtil.showMessage(ex);
        }
    }
}
