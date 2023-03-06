package etapa5.telas;

import etapa5.Dados.Conteudo;
import etapa5.Dados.FilmeDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ListadeFilmes extends javax.swing.JFrame {

    FilmeDAO filmeDao = new FilmeDAO();

    public ListadeFilmes() {
        initComponents();
        preencherTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        lblStreaming = new javax.swing.JLabel();
        txtStreaming = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFilmes = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Background.setBackground(new java.awt.Color(51, 51, 51));
        Background.setForeground(new java.awt.Color(51, 51, 51));
        Background.setToolTipText("Lista os filmes");

        lblStreaming.setBackground(new java.awt.Color(255, 255, 255));
        lblStreaming.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblStreaming.setForeground(new java.awt.Color(255, 255, 255));
        lblStreaming.setText("Streaming:");

        txtStreaming.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtStreaming.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtStreamingCaretUpdate(evt);
            }
        });

        tblFilmes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Gênero", "Streaming"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFilmes.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(tblFilmes);
        tblFilmes.getAccessibleContext().setAccessibleName("Tabela com filmes");
        tblFilmes.getAccessibleContext().setAccessibleDescription("Tabela com lista de filmes");

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Lista de Filmes");
        lblTitulo.setToolTipText("Lista de Filmes");

        btnExcluir.setBackground(new java.awt.Color(102, 102, 102));
        btnExcluir.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("Exclui um filme");
        btnExcluir.setNextFocusableComponent(btnVoltar);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(102, 102, 102));
        btnVoltar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.setToolTipText("Volta ao menu ");
        btnVoltar.setNextFocusableComponent(btnExcluir);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnAtualizar.setBackground(new java.awt.Color(102, 102, 102));
        btnAtualizar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setToolTipText("Exclui um filme");
        btnAtualizar.setNextFocusableComponent(btnVoltar);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(BackgroundLayout.createSequentialGroup()
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(BackgroundLayout.createSequentialGroup()
                            .addComponent(lblTitulo)
                            .addGap(346, 346, 346))
                        .addComponent(jScrollPane1))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(lblStreaming)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStreaming, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStreaming)
                    .addComponent(txtStreaming, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnVoltar)
                    .addComponent(btnAtualizar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            if (getFilmeSelecionado() != null) {
                int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza?");
                if (confirma == 0) {
                    JOptionPane.showMessageDialog(null, "Filme excluído com sucesso.");
                    filmeDao.excluirFilme(getFilmeSelecionado());
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
                AtualizarFilme telaAtualiza = new AtualizarFilme();
                telaAtualiza.setVisible(true);
                telaAtualiza.preencheCampos(getFilmeSelecionado());
                dispose();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Filme não encontrado.");
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void txtStreamingCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtStreamingCaretUpdate
        pesquisaStreaming();
    }//GEN-LAST:event_txtStreamingCaretUpdate

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
            java.util.logging.Logger.getLogger(ListadeFilmes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadeFilmes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadeFilmes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadeFilmes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListadeFilmes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblStreaming;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblFilmes;
    private javax.swing.JTextField txtStreaming;
    // End of variables declaration//GEN-END:variables

    //PREENCHE TODAS AS LINHAS DA TABELA
    public void preencherTabela() {

        List<Conteudo> listaFilmes = filmeDao.getFilmes();

        DefaultTableModel tabelaFilmes = (DefaultTableModel) tblFilmes.getModel();
        //permite clicar nas colunas para ordenar por ordem crescente ou decrescente
        tblFilmes.setRowSorter(new TableRowSorter(tabelaFilmes));
        //Limpar a tabela para preencher com os novos dados
        tabelaFilmes.setNumRows(0);

        for (Conteudo f : listaFilmes) { //em cada volta do laço for, o mesmo adiciona uma filme
            Object[] obj = new Object[]{
                f.getId(),
                f.getNome(),
                f.getGenero(),
                f.getStreaming()};
            tabelaFilmes.addRow(obj);
        }
    }

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

    //PREENCHE AS LINHAS NA TABELA DE ACORDO COM O STREAMING
    private void pesquisaStreaming() {

        String streaming = txtStreaming.getText();
        List<Conteudo> listaFilmes = filmeDao.getFilmeStreaming(streaming);

        DefaultTableModel tabelaFilmes = (DefaultTableModel) tblFilmes.getModel();
        //Limpar a tabela para preencher com os novos dados
        tabelaFilmes.setNumRows(0);
        //permite clicar nas colunas para ordenar por ordem crescente ou decrescente
        tblFilmes.setRowSorter(new TableRowSorter(tabelaFilmes));

        for (Conteudo f : listaFilmes) { //em cada volta do laço for, o mesmo adiciona uma filme
            Object[] obj = new Object[]{
                f.getId(),
                f.getNome(),
                f.getGenero(),
                f.getStreaming()};
            tabelaFilmes.addRow(obj);
        }
    }

}
