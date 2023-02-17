package etapa4.telas;

import etapa4.Principal.CriaListas;
import etapa4.modeloConteudo.Conteudo;
import etapa4.telas.ListadeFilmes;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Claudemir
 */
public class AdicionarNovo extends javax.swing.JFrame {

    public AdicionarNovo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        lblNomeFilme = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        cboxTipo = new javax.swing.JComboBox<>();
        lblGenero = new javax.swing.JLabel();
        cboxGenero = new javax.swing.JComboBox<>();
        lblStreaming = new javax.swing.JLabel();
        cboxStreaming = new javax.swing.JComboBox<>();
        btnVoltar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtTitulo.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        txtTitulo.setText("Adicionar Novo");

        lblNomeFilme.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNomeFilme.setText("Titulo:");

        lblTipo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblTipo.setText("Tipo:");

        cboxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filme", "Série" }));

        lblGenero.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblGenero.setText("Gênero:");

        cboxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ação", "Aventura", "Animação", "Biografia", "Comédia", "Documentário", "Drama", "Esportes", "Fantasia", "Ficção Científica", "Músicais", "Policial", "Romance", "Suspense", "Terror" }));

        lblStreaming.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblStreaming.setText("Streaming:");

        cboxStreaming.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Netflix", "Prime Vídeo", "Disney+", "Star+", "HBO MAX", "Apple TV", "Paramount+" }));

        btnVoltar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnConfirmar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(txtTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGenero)
                            .addComponent(lblNomeFilme))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboxGenero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(lblStreaming)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboxStreaming, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(lblTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(txtTitulo)
                .addGap(35, 35, 35)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNomeFilme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipo))
                .addGap(29, 29, 29)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblStreaming)
                    .addComponent(cboxStreaming, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnConfirmar))
                .addGap(34, 34, 34))
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        //ADICIONA A LISTA
        inserirConteudo(getConteudo());

        txtNome.setText("");

        dispose();
    }//GEN-LAST:event_btnConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(AdicionarNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarNovo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cboxGenero;
    private javax.swing.JComboBox<String> cboxStreaming;
    private javax.swing.JComboBox<String> cboxTipo;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNomeFilme;
    private javax.swing.JLabel lblStreaming;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables

    private final String[] tableColumns = {"Nome", "Gênero", "Streaming"};
    DefaultTableModel tableModel = new DefaultTableModel(tableColumns, 0);

    //INSERE OS VALORES NA LISTA
    private void inserirConteudo(Conteudo conteudo) {

        //ADICIONA DADOS A LISTA
        if (conteudo.getTipo().equals("Filme")) {
            CriaListas.AdicionarFilme(conteudo);
        } else if (conteudo.getTipo().equals("Série")) {
            CriaListas.AdicionarSerie(conteudo);
        }

        //MENSAGEM DE FEEDBACK
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");

    }

    //RETORNA OS VALORES DE UM FILME
    private Conteudo getConteudo() {

        //RECEBE DADOS DA CONSULTA
        Conteudo conteudo = new Conteudo();
        conteudo.setNome(txtNome.getText());
        conteudo.setGenero(cboxGenero.getSelectedItem().toString());
        conteudo.setStreaming(cboxStreaming.getSelectedItem().toString());
        conteudo.setTipo(cboxTipo.getSelectedItem().toString());
        return conteudo;
    }

    //ATUALIZA OS ITENS NA TABELA DE FILMES
    protected DefaultTableModel getTabelaFilmes() {

        if (!CriaListas.ListarFilmes().isEmpty()) {

            Conteudo atualizaConteudos;

            tableModel = new DefaultTableModel(tableColumns, 0);

            for (int i = 0; i < CriaListas.ListarFilmes().size(); i++) {

                atualizaConteudos = CriaListas.ListarFilmes().get(i);

                String[] linha = {atualizaConteudos.getNome(), atualizaConteudos.getGenero(), atualizaConteudos.getStreaming()};

                tableModel.addRow(linha);
            }

        } else {

            tableModel = new DefaultTableModel(tableColumns, 0);
        }

        return tableModel;
    }

    //ATUALIZA OS ITENS NA TABELA DE SÉRIES
    protected DefaultTableModel getTabelaSeries() {

        if (!CriaListas.ListarSeries().isEmpty()) {

            Conteudo atualizaConteudos;

            tableModel = new DefaultTableModel(tableColumns, 0);

            for (int i = 0; i < CriaListas.ListarSeries().size(); i++) {

                atualizaConteudos = CriaListas.ListarSeries().get(i);

                String[] linha = {atualizaConteudos.getNome(), atualizaConteudos.getGenero(), atualizaConteudos.getStreaming()};

                tableModel.addRow(linha);
            }

        } else {

            tableModel = new DefaultTableModel(tableColumns, 0);
        }

        return tableModel;
    }
}
