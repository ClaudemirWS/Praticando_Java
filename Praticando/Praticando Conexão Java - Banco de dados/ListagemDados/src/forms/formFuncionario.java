package forms;

import beans.Empresa;
import beans.Funcionario;
import dao.EmpresaDAO;
import dao.FuncionarioDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author Claudemir
 */
public class formFuncionario extends javax.swing.JFrame {

    private void preencherComboEmpresa() {
        EmpresaDAO empresaDAO = new EmpresaDAO();
        List<Empresa> lista = empresaDAO.getEmpresa("");
        //Percorrer essa lista e cada empresa que ele achar, colocar dentro da caixa de combinação
        for (Empresa c : lista) {
            cmbEmpresa.addItem(c);
            //devido ao ajuste que fizemos na caixa de combinação, podemos adicionar a ela objetos, e não mais somente String
        }
    }

    public formFuncionario() {
        initComponents();
        preencherComboEmpresa();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblNomeFuncionario = new javax.swing.JLabel();
        txtNomeFunc = new javax.swing.JTextField();
        lblEmpresa = new javax.swing.JLabel();
        cmbEmpresa = new javax.swing.JComboBox();
        lblDataAdmissao = new javax.swing.JLabel();
        txtDataAdmissao = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblPesquisa = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulário de Funcionários");
        setPreferredSize(new java.awt.Dimension(580, 440));

        lblTitulo.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lblTitulo.setText("Formulário de Funcionários");

        lblNomeFuncionario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNomeFuncionario.setText("Nome do funcionário:");

        txtNomeFunc.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblEmpresa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblEmpresa.setText("Empresa:");

        cmbEmpresa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblDataAdmissao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblDataAdmissao.setText("Data de admissão:");

        txtDataAdmissao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnSalvar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblID.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblID.setText("ID:");

        txtId.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtId.setEnabled(false);

        lblPesquisa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPesquisa.setText("ID do funcionário:");

        txtPesquisar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnPesquisar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblPesquisa)
                                .addComponent(lblNomeFuncionario)
                                .addComponent(lblEmpresa)
                                .addComponent(lblDataAdmissao)
                                .addComponent(lblID))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDataAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNomeFunc)
                                    .addComponent(cmbEmpresa, 0, 378, Short.MAX_VALUE))
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(29, 29, 29))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(117, 117, 117)
                                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblTitulo))
                            .addGap(85, 85, 85)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(241, 241, 241))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesquisa)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeFuncionario)
                    .addComponent(txtNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpresa)
                    .addComponent(cmbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataAdmissao)
                    .addComponent(txtDataAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        //Pegando os valores do formulário digitado e selecionado pelo usuário
        String nomefunc = txtNomeFunc.getText();
        Empresa empresaid = (Empresa) cmbEmpresa.getSelectedItem();

        //Passando os valores fornecidos pelo usuário
        Funcionario funcionario = new Funcionario();
        funcionario.setNomefunc(nomefunc);
        funcionario.setEmpresaid(empresaid);
        //Essa classe fará a conversão da data para o padrão brasileiro
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            //Método parse converte de String para Date
            funcionario.setDataAdmissao(sdf.parse(txtDataAdmissao.getText()));
        } catch (ParseException ex) {
            System.out.println("Erro ao converter o texto para date");
        }

        //Chamando o método de inserção
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        funcionarioDAO.inserir(funcionario);

        //Limpar os campos
        txtNomeFunc.setText("");
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        //Pegar o ID que será pesquisado
        int id = Integer.parseInt(txtPesquisar.getText());
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

        Funcionario f = funcionarioDAO.getFuncionario(id);

        //Preencher os campos
        txtId.setText(String.valueOf(f.getId()));
        txtNomeFunc.setText(f.getNomefunc());
        txtDataAdmissao.setText(String.valueOf(f.getDataAdmissao()));
        cmbEmpresa.setSelectedItem(f.getEmpresaid());
    }//GEN-LAST:event_btnPesquisarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(formFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cmbEmpresa;
    private javax.swing.JLabel lblDataAdmissao;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNomeFuncionario;
    private javax.swing.JLabel lblPesquisa;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtDataAdmissao;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNomeFunc;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
