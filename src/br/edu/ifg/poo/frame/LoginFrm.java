package br.edu.ifg.poo.frame;

import br.edu.ifg.poo.dao.UsuarioDAO;
import javax.swing.JOptionPane;

/**
 * @author gilberto
 */
public class LoginFrm extends javax.swing.JFrame {

    public LoginFrm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLogin = new javax.swing.JLabel();
        jLabelSenhaLogin = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jButtonEntrarLogin = new javax.swing.JButton();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jButtonCancelarLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setType(java.awt.Window.Type.POPUP);

        jLabelLogin.setText("Login:");

        jLabelSenhaLogin.setText("Senha:");

        jTextFieldLogin.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        jButtonEntrarLogin.setText("Entrar");
        jButtonEntrarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarLoginActionPerformed(evt);
            }
        });

        jPasswordFieldSenha.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        jButtonCancelarLogin.setText("Cancelar");
        jButtonCancelarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelSenhaLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordFieldSenha))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonEntrarLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLogin)
                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSenhaLogin)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEntrarLogin)
                    .addComponent(jButtonCancelarLogin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarLoginActionPerformed
            String login = jTextFieldLogin.getText();
            String senha = jPasswordFieldSenha.getText();
        
        if ("".equals(login.trim())) {
            JOptionPane.showMessageDialog(rootPane, "Por favor informe um Login!", "Aviso!", JOptionPane.WARNING_MESSAGE);
            jTextFieldLogin.requestFocus();
            return;
        }
        
        if ("".equals(senha.trim())) {
            JOptionPane.showMessageDialog(rootPane, "Por favor informe uma Senha!", "Aviso!", JOptionPane.WARNING_MESSAGE);
            jPasswordFieldSenha.requestFocus();
            return;
        }
        
        if (UsuarioDAO.verificaLogin(login.toLowerCase(), senha.toLowerCase())){
            limparCampos();
            new SplashScreen().setVisible(true);
            dispose();
        } else {
            limparCampos();
            jTextFieldLogin.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Usuario e/ou senha incorretos!", "Aviso!", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_jButtonEntrarLoginActionPerformed

    private void jButtonCancelarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarLoginActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonCancelarLoginActionPerformed

        private void limparCampos(){
        jTextFieldLogin.setText("");
        jPasswordFieldSenha.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarLogin;
    private javax.swing.JButton jButtonEntrarLogin;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelSenhaLogin;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldLogin;
    // End of variables declaration//GEN-END:variables
}
