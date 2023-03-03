package br.com.senac.view;

import br.com.model.Criptografia;
import br.com.model.Usuario;
import br.com.senac.persistencia.UsuarioDAO;
import javax.swing.JOptionPane;

/**
 * @author Claudemir
 */
public class Login extends javax.swing.JFrame {

    ListaPodcast listaPodcast = new ListaPodcast();

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lblTitulo.setText("CENAFLIX");

        lblLogin.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblLogin.setText("Login:");

        txtLogin.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        lblSenha.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblSenha.setText("Senha:");

        txtSenha.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        btnLogin.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSenha)
                            .addComponent(lblLogin)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(lblTitulo)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lblTitulo)
                .addGap(28, 28, 28)
                .addComponent(lblLogin)
                .addGap(18, 18, 18)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblSenha)
                .addGap(18, 18, 18)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        Usuario usuario = new Usuario();

        // Atribuimos os valores Login e Senha baseado nos dados dos componentes JTextField
        usuario.setLogin(txtLogin.getText());
        usuario.setSenha(Criptografia.getMD5(txtSenha.getText()));

        usuario = UsuarioDAO.validarUsuario(usuario);

        //torna visivel os botões de acordo com o usuario
        listaPodcast.cadastrarVisible(usuario.getTipo());
        listaPodcast.excluirVisible(usuario.getTipo());

        if (usuario != null) {
            // Dependendo do tipo de usuário, levamos a uma página diferente
            if (usuario.getTipo().equalsIgnoreCase("Administrador")) {
                JOptionPane.showMessageDialog(null, "Bem-vindo, Administrador " + usuario.getNome() + ".");
            } else if (usuario.getTipo().equalsIgnoreCase("Operador")) {
                JOptionPane.showMessageDialog(null, "Bem-vindo, Operador " + usuario.getNome() + ".");
            } else {
                JOptionPane.showMessageDialog(null, "Bem-vindo, Usuário " + usuario.getNome() + ".");
            }

            listaPodcast.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Erro de autenticação! Verifique se os dados estão corretos.");
        }

        dispose();
    }//GEN-LAST:event_btnLoginActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
