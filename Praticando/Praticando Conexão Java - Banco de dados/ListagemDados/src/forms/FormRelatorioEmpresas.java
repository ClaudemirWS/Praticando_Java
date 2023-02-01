package forms;

import beans.Empresa;
import dao.EmpresaDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class FormRelatorioEmpresas extends javax.swing.JFrame {

    private void preencherTabela() {
        EmpresaDAO empresaDAO = new EmpresaDAO();

        String nomeempresa = txtNomeEmpresa.getText();
        List<Empresa> listaEmpresas = empresaDAO.getEmpresa(nomeempresa);

        DefaultTableModel tabelaEmpresas = (DefaultTableModel) tblEmpresas.getModel();
        //Limpar a tabela para preencher com os novos dados
        tabelaEmpresas.setNumRows(0);

        tblEmpresas.setRowSorter(new TableRowSorter(tabelaEmpresas));

        for (Empresa c : listaEmpresas) { //em cada volta do laço for, o mesmo adiciona uma dado(empresa) dentro do objeto c
            Object[] obj = new Object[]{
                c.getId(), //id
                c.getNomeempresa(), //nomeempresa
                c.getAreaatuacao(), //areadeatuacao            
            };
            tabelaEmpresas.addRow(obj);
        }
    }

    public FormRelatorioEmpresas() {
        initComponents();
        preencherTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRelatorio = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpresas = new javax.swing.JTable();
        lblNomeEmpresa = new javax.swing.JLabel();
        txtNomeEmpresa = new javax.swing.JTextField();
        lblPesquisa = new javax.swing.JLabel();
        txtIdPesquisa = new javax.swing.JTextField();
        lblAté = new javax.swing.JLabel();
        txtIdPesquisa2 = new javax.swing.JTextField();
        btnPesquisaID = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório de Empresas");

        lblRelatorio.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblRelatorio.setText("Relatório de Empresas Cadastradas");

        tblEmpresas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome da Empresa", "Área de Atuação"
            }
        ));
        jScrollPane1.setViewportView(tblEmpresas);

        lblNomeEmpresa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblNomeEmpresa.setText("Nome da Empresa:");

        txtNomeEmpresa.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtNomeEmpresaCaretUpdate(evt);
            }
        });

        lblPesquisa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblPesquisa.setText("Pesquisa entre ID's:");

        lblAté.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblAté.setText("Até");

        btnPesquisaID.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnPesquisaID.setText("Pesquisar");
        btnPesquisaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(lblRelatorio)
                        .addGap(0, 84, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAté)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdPesquisa2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisaID, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNomeEmpresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeEmpresa)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblRelatorio)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeEmpresa)
                    .addComponent(txtNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesquisa)
                    .addComponent(txtIdPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAté)
                    .addComponent(txtIdPesquisa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeEmpresaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtNomeEmpresaCaretUpdate
        preencherTabela();
    }//GEN-LAST:event_txtNomeEmpresaCaretUpdate

    private void btnPesquisaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaIDActionPerformed
        int idPesquisa = Integer.parseInt(txtIdPesquisa.getText());
        int idPesquisa2 = Integer.parseInt(txtIdPesquisa2.getText());
        //Criar uma variavel do tipo EmpresaDAO. Criamos ela porque o método getEmpresaPorId está dentro e precisamos acessar ele
        EmpresaDAO empresaDAO = new EmpresaDAO();
        //Chamar o método getEmpresa, que retorna uma variavel do tipo Empresa e que tem como parâmetro o idPesquisa que o usuário digitou

        List<Empresa> empresa = empresaDAO.getEmpresaPorId(idPesquisa, idPesquisa2);

        //Verificação para saber se o curso existe ou não
        if (empresa == null) {//Se empresa for igual a 
            JOptionPane.showMessageDialog(this, "Empresa não encontrado!");
        } else {
            List<Empresa> listaEmpresas = empresaDAO.getEmpresaPorId(idPesquisa, idPesquisa2);

            //Criar uma variavel do tipo DefaultTableModel, pois é com esse tipo que conseguimos inserir dinamicamente linhas dentro da JTable        
            DefaultTableModel tabelaEmpresas = (DefaultTableModel) tblEmpresas.getModel();

            //Limpar a tabela para preencher com os novos dados
            tabelaEmpresas.setNumRows(0);

            //Percorrer o listaEmpresas e inserir na tabelaEmpresas
            for (Empresa c : listaEmpresas) { //em cada volta do laço for, o mesmo adiciona uma dado(empresa) dentro da variavel c
                Object[] obj = new Object[]{
                    c.getId(), //id
                    c.getNomeempresa(), //nomeempresa
                    c.getAreaatuacao(), //areadeatuacao             
                };
                //colocar os dados da variavel obj dentro da tabela
                tabelaEmpresas.addRow(obj);
            }
        }
    }//GEN-LAST:event_btnPesquisaIDActionPerformed

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
            java.util.logging.Logger.getLogger(FormRelatorioEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRelatorioEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRelatorioEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRelatorioEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRelatorioEmpresas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisaID;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAté;
    private javax.swing.JLabel lblNomeEmpresa;
    private javax.swing.JLabel lblPesquisa;
    private javax.swing.JLabel lblRelatorio;
    private javax.swing.JTable tblEmpresas;
    private javax.swing.JTextField txtIdPesquisa;
    private javax.swing.JTextField txtIdPesquisa2;
    private javax.swing.JTextField txtNomeEmpresa;
    // End of variables declaration//GEN-END:variables
}
