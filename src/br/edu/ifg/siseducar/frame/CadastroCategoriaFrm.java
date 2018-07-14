/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg.siseducar.frame;

import br.edu.ifg.siseducar.util.Banco;
import br.edu.ifg.siseducar.vo.Categoria;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author aluno
 */
public class CadastroCategoriaFrm extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroAluno
     */
    public CadastroCategoriaFrm() {
        initComponents();
        carregaLista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cboCategoriaSuperior = new javax.swing.JComboBox();
        btnSalvar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro Categoria");

        jLabel1.setText("Nome");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Categoria Superior");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboCategoriaSuperior, 0, 384, Short.MAX_VALUE)
                    .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboCategoriaSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        String nome = txtNome.getText();
        Integer id_cmb = cboCategoriaSuperior.getSelectedIndex() - 1;
                
        if ("".equals(nome.trim())) {
            JOptionPane.showMessageDialog(rootPane, "Por favor informe o nome!", "Aviso!", JOptionPane.WARNING_MESSAGE);
            txtNome.setBorder(new LineBorder(Color.red));
            txtNome.requestFocus();
            return;
        }
        
        String sql; 
        if(id_cmb == - 1){
            sql = "INSERT INTO categoria VALUES (DEFAULT, " + "'" + nome + "', NULL);";
            JOptionPane.showMessageDialog(rootPane,"Categoria Superior " + nome + " adicionado com sucesso!");
            carregaLista();
        } else {
            String[] idDiscs = cboCategoriaSuperior.getSelectedItem().toString().split("-");
            Integer id_cat = Integer.parseInt(idDiscs[0]);
            sql = "INSERT INTO categoria VALUES (DEFAULT, '" + nome.toLowerCase() 
                + "', " + id_cat + ");";
            JOptionPane.showMessageDialog(rootPane, "Categoria " + nome + " adicionado com sucesso!");
            carregaLista();
        }
        
        System.out.println(sql); try {
            Banco.Query(sql);
            carregaLista();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroCategoriaFrm.class.getName()).log(Level.SEVERE, null, ex);
        }       

        txtNome.setBorder(new LineBorder(Color.gray));        
        cboCategoriaSuperior.setBorder(new LineBorder(Color.gray));

        limparCampos();
    }//GEN-LAST:event_btnSalvarActionPerformed
    
    private void carregaLista() {                                            
        Banco.recarregaCategoria();
        cboCategoriaSuperior.setModel(new javax.swing.DefaultComboBoxModel());
        cboCategoriaSuperior.addItem("Nenhuma");
        for(Categoria c : Banco.getCategorias()){
            if(c.getId_catSup()== 0)
                cboCategoriaSuperior.addItem(c.getId() + "-" + c.getDescricao().toUpperCase());
        }
    }
    
    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        txtNome.transferFocus();
    }//GEN-LAST:event_txtNomeActionPerformed

    private void limparCampos(){
        txtNome.setText("");
        cboCategoriaSuperior.setSelectedIndex(0);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cboCategoriaSuperior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
