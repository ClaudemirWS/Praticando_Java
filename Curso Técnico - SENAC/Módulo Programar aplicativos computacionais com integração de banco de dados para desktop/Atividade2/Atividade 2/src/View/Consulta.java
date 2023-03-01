package View;

import Dados.Filme;
import Dados.FilmeDB;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 * @author Claudemir
 */
public class Consulta extends javax.swing.JFrame {

    FilmeDB db = new FilmeDB();

    public Consulta() {
        initComponents();
        preencherTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblFilmes = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lblCategoria = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblFilmes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Data de lançamento", "Categoria"
            }
        ));
        jScrollPane1.setViewportView(tblFilmes);

        lblTitulo.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        lblTitulo.setText("Lista de Filmes - Cenaflix");

        btnExcluir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAtualizar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lblCategoria.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblCategoria.setText("Categoria");

        txtCategoria.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtCategoriaCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCategoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(lblTitulo)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizar)
                    .addComponent(btnExcluir)
                    .addComponent(btnVoltar))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        FilmeDB db = new FilmeDB();

        try {
            if (getFilmeSelecionado() != null) {
                int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza?");
                if (confirma == 0) {
                    JOptionPane.showMessageDialog(null, "Filme excluído com sucesso.");
                    db.excluir(getFilmeSelecionado());
                    preencherTabela();
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Filme não encontrado.");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        try {
            if (getFilmeSelecionado() != null) {
                Atualizar telaAtualiza = new Atualizar();
                telaAtualiza.setVisible(true);
                telaAtualiza.preencheCampos(getFilmeSelecionado());
                dispose();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Filme não encontrado.");
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtCategoriaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtCategoriaCaretUpdate
        pesquisaCategoria();
    }//GEN-LAST:event_txtCategoriaCaretUpdate

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
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblFilmes;
    private javax.swing.JTextField txtCategoria;
    // End of variables declaration//GEN-END:variables

    //PEGA A POSIÇÃO DO FILME NA TABELA
    private String getFilmeSelecionado() {

        //PEGA A POSIÇÃO NA LINHA SELECIONADA NA TABELA
        int linha = tblFilmes.getSelectedRow();

        //PEGA O ID DO FILME A PARTIR DA LINHA E COLUNA
        String idFilme = String.valueOf(tblFilmes.getValueAt(linha, 0));

        //SE NÃO TIVER NENHUMA POSIÇÃO, EXIGE UMA
        if (linha == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um filme.");
        }
        return idFilme;
    }

    //PREENCHE TODAS AS LINHAS DA TABELA
    public void preencherTabela() {

        List<Filme> listaFilmes = db.getFilmes();
                
        DefaultTableModel tabelaFilmes = (DefaultTableModel) tblFilmes.getModel();
        //permite clicar nas colunas para ordenar por ordem crescente ou decrescente
        tblFilmes.setRowSorter(new TableRowSorter(tabelaFilmes));
        //Limpar a tabela para preencher com os novos dados
        tabelaFilmes.setNumRows(0);

        for (Filme f : listaFilmes) { //em cada volta do laço for, o mesmo adiciona uma filme
            Object[] obj = new Object[]{
                f.getId(),
                f.getNome(),
                f.getData(),
                f.getCategoria()};
            tabelaFilmes.addRow(obj);
        }
    }

    //PREENCHE AS LINHAS NA TABELA DE ACORDO COM A CATEGORIA
    private void pesquisaCategoria() {

        String nomeCategoria = txtCategoria.getText();
        List<Filme> listaFilmes = db.getFilmeCategoria(nomeCategoria);

        DefaultTableModel tabelaEmpresas = (DefaultTableModel) tblFilmes.getModel();
        //Limpar a tabela para preencher com os novos dados
        tabelaEmpresas.setNumRows(0);
        //permite clicar nas colunas para ordenar por ordem crescente ou decrescente
        tblFilmes.setRowSorter(new TableRowSorter(tabelaEmpresas));

        for (Filme f : listaFilmes) { //em cada volta do laço for, o mesmo adiciona uma filme
            Object[] obj = new Object[]{
                f.getId(),
                f.getNome(),
                f.getData(),
                f.getCategoria()
            };
            tabelaEmpresas.addRow(obj);
        }
    }
}
