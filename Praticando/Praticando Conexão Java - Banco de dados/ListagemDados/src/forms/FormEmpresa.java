package forms;

import beans.Empresa;
import dao.EmpresaDAO;
import javax.swing.JOptionPane;

/**
 * @author Claudemir
 */
public class FormEmpresa extends javax.swing.JFrame {

    public FormEmpresa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEmpresa = new javax.swing.JLabel();
        lblNomeEmpresa = new javax.swing.JLabel();
        lblAreaAtuacao = new javax.swing.JLabel();
        txtNomeEmpresa = new javax.swing.JTextField();
        cmbArea = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();
        sepEmpresa = new javax.swing.JSeparator();
        lblPesquisa = new javax.swing.JLabel();
        txtIdPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        lblPesquisar = new javax.swing.JLabel();
        txtIdPesquisaNome = new javax.swing.JTextField();
        btnPesquisar2 = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblEmpresa.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lblEmpresa.setText("Empresa");

        lblNomeEmpresa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNomeEmpresa.setText("Nome da Empresa:");

        lblAreaAtuacao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblAreaAtuacao.setText("Área de atuação:");

        cmbArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administração", "Contabilidade", "Medicina", "Informática", "Outros" }));

        btnSalvar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblPesquisa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPesquisa.setText("Pesquisa por ID:");

        txtIdPesquisa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnPesquisar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        lblID.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblID.setText("ID:");

        txtId.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtId.setEnabled(false);

        btnEditar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        lblPesquisar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPesquisar.setText("Pesquisa por nome:");

        txtIdPesquisaNome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnPesquisar2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnPesquisar2.setText("Pesquisar");
        btnPesquisar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisar2ActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton1.setText("Empresas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblPesquisar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPesquisa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtIdPesquisaNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmpresa)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIdPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnPesquisar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNomeEmpresa)
                                    .addComponent(lblAreaAtuacao))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNomeEmpresa)
                                    .addComponent(cmbArea, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(sepEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesquisa)
                    .addComponent(txtIdPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesquisar)
                    .addComponent(txtIdPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(sepEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeEmpresa)
                    .addComponent(txtNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAreaAtuacao)
                    .addComponent(cmbArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir)
                    .addComponent(jButton1))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String nomeEmpresa = txtNomeEmpresa.getText();
        String areaatuacao = cmbArea.getSelectedItem().toString();

        Empresa empresa = new Empresa();

        empresa.setNomeempresa(nomeEmpresa);
        empresa.setAreaatuacao(areaatuacao);

        EmpresaDAO empresaDAO = new EmpresaDAO();
        empresaDAO.inserir(empresa);

        txtNomeEmpresa.setText("");
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        int idPesquisa = Integer.parseInt(txtIdPesquisa.getText());

        EmpresaDAO empresaDAO = new EmpresaDAO();
        Empresa empresa = empresaDAO.getEmpresa(idPesquisa);

        if (empresa == null) {
            JOptionPane.showMessageDialog(this, "Área de atuação não encontrada!");
        } else {
            txtId.setText(String.valueOf(empresa.getId())); //linha adicionada
            txtNomeEmpresa.setText(empresa.getNomeempresa());
            cmbArea.setSelectedItem(empresa.getAreaatuacao());
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //Pegar o código que o usuário digitou no campo de texto, converte para inteiro e salvar da variavel id
        int id = Integer.parseInt(txtId.getText());
        String nomeempresa = txtNomeEmpresa.getText();
        String areadeatuacao = cmbArea.getSelectedItem().toString();

        Empresa empresa = new Empresa();
        empresa.setId(id);
        empresa.setNomeempresa(nomeempresa);
        empresa.setAreaatuacao(areadeatuacao);

        EmpresaDAO empresaDAO = new EmpresaDAO();
        empresaDAO.editar(empresa);

        JOptionPane.showMessageDialog(this, "Edição concluída com sucesso.");

        //limpando os campos
        txtId.setText("");
        txtNomeEmpresa.setText("");
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnPesquisar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisar2ActionPerformed
        String nomepesquisa = txtIdPesquisaNome.getText();

        EmpresaDAO empresaDAO = new EmpresaDAO();
        Empresa empresa = empresaDAO.getEmpresaNome(nomepesquisa);

        if (empresa == null) {
            JOptionPane.showMessageDialog(this, "Empresa não encontrado!");
        } else {
            txtId.setText(String.valueOf(empresa.getId()));
            txtNomeEmpresa.setText(empresa.getNomeempresa());
            cmbArea.setSelectedItem(empresa.getAreaatuacao());
        }
    }//GEN-LAST:event_btnPesquisar2ActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        //Pegar o código que o usuário digitou no campo de texto, converte para inteiro e salvar da variavel id
        int id = Integer.parseInt(txtId.getText());

        EmpresaDAO empresaDAO = new EmpresaDAO();
        empresaDAO.excluir(id);

        //limpando os campos
        txtId.setText("");
        txtNomeEmpresa.setText("");
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Vinculando o formRelatorioEmpresas ao botão Empresas Cadastradas
        FormRelatorioEmpresas fre = new FormRelatorioEmpresas();
        //Mostrando o form quando clicar no botão
        fre.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPesquisar2;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblAreaAtuacao;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNomeEmpresa;
    private javax.swing.JLabel lblPesquisa;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JSeparator sepEmpresa;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdPesquisa;
    private javax.swing.JTextField txtIdPesquisaNome;
    private javax.swing.JTextField txtNomeEmpresa;
    // End of variables declaration//GEN-END:variables
}
