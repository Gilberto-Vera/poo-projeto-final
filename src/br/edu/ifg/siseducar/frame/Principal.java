/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg.siseducar.frame;

import br.edu.ifg.siseducar.util.FormulariosContext;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

/**
 * @author danilo
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelDesktop = new javax.swing.JPanel();
        BtnSair2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        configuracoesMenu = new javax.swing.JMenu();
        menuItemSair = new javax.swing.JMenuItem();
        cadastroMenu = new javax.swing.JMenu();
        cadastroCategoriaItem = new javax.swing.JMenuItem();
        cadastroDisciplinaMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema 2.0");

        BtnSair2.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        BtnSair2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifg/siseducar/icones/Sair.png"))); // NOI18N
        BtnSair2.setText("Sair");
        BtnSair2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSair2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDesktopLayout = new javax.swing.GroupLayout(painelDesktop);
        painelDesktop.setLayout(painelDesktopLayout);
        painelDesktopLayout.setHorizontalGroup(
            painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDesktopLayout.createSequentialGroup()
                .addGap(0, 356, Short.MAX_VALUE)
                .addComponent(BtnSair2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelDesktopLayout.setVerticalGroup(
            painelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDesktopLayout.createSequentialGroup()
                .addGap(0, 341, Short.MAX_VALUE)
                .addComponent(BtnSair2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        configuracoesMenu.setText("Configurações");

        menuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        menuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifg/siseducar/icones/Sair.png"))); // NOI18N
        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        configuracoesMenu.add(menuItemSair);

        jMenuBar1.add(configuracoesMenu);

        cadastroMenu.setText("Cadastro");

        cadastroCategoriaItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        cadastroCategoriaItem.setText("Fluxo de Caixa");
        cadastroCategoriaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroCategoriaItemActionPerformed(evt);
            }
        });
        cadastroMenu.add(cadastroCategoriaItem);

        cadastroDisciplinaMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        cadastroDisciplinaMenuItem.setText("Categoria");
        cadastroDisciplinaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroDisciplinaMenuItemActionPerformed(evt);
            }
        });
        cadastroMenu.add(cadastroDisciplinaMenuItem);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Usuário");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        cadastroMenu.add(jMenuItem1);

        jMenuBar1.add(cadastroMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemSairActionPerformed

    private void cadastroDisciplinaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroDisciplinaMenuItemActionPerformed
        FormulariosContext.showCadastroCategoria();
    }//GEN-LAST:event_cadastroDisciplinaMenuItemActionPerformed

    private void BtnSair2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSair2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSair2ActionPerformed

    private void cadastroCategoriaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroCategoriaItemActionPerformed
        FormulariosContext.showCadastroFluxoCaixa();
    }//GEN-LAST:event_cadastroCategoriaItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FormulariosContext.showCadastroUsuario();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public JPanel getPainelDesktop() {
        return painelDesktop;
    }
    
    public void addInternal(JInternalFrame internal){
        painelDesktop.add(internal);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSair2;
    private javax.swing.JMenuItem cadastroCategoriaItem;
    private javax.swing.JMenuItem cadastroDisciplinaMenuItem;
    private javax.swing.JMenu cadastroMenu;
    private javax.swing.JMenu configuracoesMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JPanel painelDesktop;
    // End of variables declaration//GEN-END:variables
}
