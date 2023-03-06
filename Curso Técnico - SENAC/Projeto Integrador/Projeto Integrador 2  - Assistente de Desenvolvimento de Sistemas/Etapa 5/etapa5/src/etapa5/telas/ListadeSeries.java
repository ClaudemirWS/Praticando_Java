package etapa5.telas;

import etapa5.Dados.Conteudo;
import etapa5.Dados.SerieDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ListadeSeries extends javax.swing.JFrame {

    SerieDAO serieDao = new SerieDAO();

    public ListadeSeries() {
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
        tblSeries = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Background.setBackground(new java.awt.Color(51, 51, 51));
        Background.setForeground(new java.awt.Color(51, 51, 51));
        Background.setToolTipText("Lista as séries");

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

        tblSeries.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSeries.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(tblSeries);
        tblSeries.getAccessibleContext().setAccessibleName("Tabela com séries");
        tblSeries.getAccessibleContext().setAccessibleDescription("Tabela com lista de séries");

        lblTitulo.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Lista de Séries");
        lblTitulo.setToolTipText("Lista de Séries");

        btnExcluir.setBackground(new java.awt.Color(102, 102, 102));
        btnExcluir.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("Exclui uma série");
        btnExcluir.setNextFocusableComponent(btnSair);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(102, 102, 102));
        btnSair.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Voltar");
        btnSair.setToolTipText("Volta ao menu");
        btnSair.setNextFocusableComponent(btnExcluir);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnAtualizar.setBackground(new java.awt.Color(102, 102, 102));
        btnAtualizar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setToolTipText("Exclui uma série");
        btnAtualizar.setNextFocusableComponent(btnSair);
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
                .addGap(30, 30, 30)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(lblStreaming)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStreaming, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(BackgroundLayout.createSequentialGroup()
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStreaming)
                    .addComponent(txtStreaming, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair)
                    .addComponent(btnAtualizar))
                .addGap(20, 20, 20))
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

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            if (getSerieSelecionada() != null) {
                int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza?");
                if (confirma == 0) {
                    JOptionPane.showMessageDialog(null, "Serie excluída com sucesso.");
                    serieDao.excluirSerie(getSerieSelecionada());
                    preencherTabela();
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Serie não encontrada.");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        try {
            if (getSerieSelecionada() != null) {
                AtualizarSerie telaAtualiza = new AtualizarSerie();
                telaAtualiza.setVisible(true);
                telaAtualiza.preencheCampos(getSerieSelecionada());
                dispose();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Serie não encontrada.");
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
            java.util.logging.Logger.getLogger(ListadeSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadeSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadeSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadeSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListadeSeries().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblStreaming;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblSeries;
    private javax.swing.JTextField txtStreaming;
    // End of variables declaration//GEN-END:variables

    //PREENCHE TODAS AS LINHAS DA TABELA
    public void preencherTabela() {

        List<Conteudo> listaSeries = serieDao.getSeries();

        DefaultTableModel tabelaSeries = (DefaultTableModel) tblSeries.getModel();
        //permite clicar nas colunas para ordenar por ordem crescente ou decrescente
        tblSeries.setRowSorter(new TableRowSorter(tabelaSeries));
        //Limpar a tabela para preencher com os novos dados
        tabelaSeries.setNumRows(0);

        for (Conteudo s : listaSeries) { //em cada volta do laço for, o mesmo adiciona uma filme
            Object[] obj = new Object[]{
                s.getId(),
                s.getNome(),
                s.getGenero(),
                s.getStreaming()};
            tabelaSeries.addRow(obj);
        }
    }

    //PEGA A POSIÇÃO DO FILME NA TABELA
    private String getSerieSelecionada() {

        //PEGA A POSIÇÃO NA LINHA SELECIONADA NA TABELA
        int linha = tblSeries.getSelectedRow();

        //PEGA O ID DO FILME A PARTIR DA LINHA E COLUNA
        String idSerie = String.valueOf(tblSeries.getValueAt(linha, 0));

        //SE NÃO TIVER NENHUMA POSIÇÃO, EXIGE UMA
        if (linha == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma série.");
        }
        return idSerie;
    }

    //PREENCHE AS LINHAS NA TABELA DE ACORDO COM O STREAMING
    private void pesquisaStreaming() {

        String streaming = txtStreaming.getText();
        List<Conteudo> listaFilmes = serieDao.getSerieStreaming(streaming);

        DefaultTableModel tabelaSeries = (DefaultTableModel) tblSeries.getModel();
        //Limpar a tabela para preencher com os novos dados
        tabelaSeries.setNumRows(0);
        //permite clicar nas colunas para ordenar por ordem crescente ou decrescente
        tblSeries.setRowSorter(new TableRowSorter(tabelaSeries));

        for (Conteudo f : listaFilmes) { //em cada volta do laço for, o mesmo adiciona uma filme
            Object[] obj = new Object[]{
                f.getId(),
                f.getNome(),
                f.getGenero(),
                f.getStreaming()};
            tabelaSeries.addRow(obj);
        }
    }

}
