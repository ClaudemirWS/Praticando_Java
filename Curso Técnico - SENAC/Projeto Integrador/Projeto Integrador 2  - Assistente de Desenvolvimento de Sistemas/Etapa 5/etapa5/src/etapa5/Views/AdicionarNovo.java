package etapa5.Views;

import etapa5.Principal.Conteudo;
import etapa5.Dados.ConexaoDAO;
import etapa5.Dados.FilmeDAO;
import etapa5.Dados.SerieDAO;
import javax.swing.JOptionPane;

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
        btnConfirmar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Background.setBackground(new java.awt.Color(51, 51, 51));
        Background.setForeground(new java.awt.Color(51, 51, 51));
        Background.setToolTipText("");

        txtTitulo.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Adicionar Novo");
        txtTitulo.setToolTipText("");

        lblNomeFilme.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNomeFilme.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeFilme.setText("Titulo:");
        lblNomeFilme.setToolTipText("");

        txtNome.setToolTipText("Digite o nome do conteúdo");

        lblTipo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(255, 255, 255));
        lblTipo.setText("Tipo:");
        lblTipo.setToolTipText("");

        cboxTipo.setForeground(new java.awt.Color(51, 51, 51));
        cboxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filme", "Série" }));
        cboxTipo.setToolTipText("Escolha entre filme ou série");
        cboxTipo.setNextFocusableComponent(cboxGenero);

        lblGenero.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(255, 255, 255));
        lblGenero.setText("Gênero:");
        lblGenero.setToolTipText("");

        cboxGenero.setForeground(new java.awt.Color(51, 51, 51));
        cboxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ação", "Aventura", "Animação", "Biografia", "Comédia", "Documentário", "Drama", "Esportes", "Fantasia", "Ficção Científica", "Músicais", "Policial", "Romance", "Suspense", "Terror" }));
        cboxGenero.setToolTipText("Escolha um gênero");
        cboxGenero.setNextFocusableComponent(cboxStreaming);

        lblStreaming.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblStreaming.setForeground(new java.awt.Color(255, 255, 255));
        lblStreaming.setText("Streaming:");
        lblStreaming.setToolTipText("");

        cboxStreaming.setForeground(new java.awt.Color(51, 51, 51));
        cboxStreaming.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Netflix", "Prime Vídeo", "Disney+", "Star+", "HBO MAX", "Apple TV", "Paramount+" }));
        cboxStreaming.setToolTipText("Escolha um streaming");
        cboxStreaming.setNextFocusableComponent(btnConfirmar);

        btnConfirmar.setBackground(new java.awt.Color(102, 102, 102));
        btnConfirmar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.setNextFocusableComponent(btnVoltar);
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(102, 102, 102));
        btnVoltar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.setNextFocusableComponent(txtTitulo);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(txtTitulo)
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(BackgroundLayout.createSequentialGroup()
                                    .addComponent(btnConfirmar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(BackgroundLayout.createSequentialGroup()
                                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblGenero)
                                        .addComponent(lblTipo, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblNomeFilme, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(37, 37, 37)
                                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cboxTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNome)
                                        .addComponent(cboxGenero, 0, 230, Short.MAX_VALUE))))
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(cboxStreaming, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lblStreaming)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(70, 70, 70))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(txtTitulo)
                .addGap(35, 35, 35)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeFilme)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        if (!camposVazios()) {
            //ADICIONA A LISTA
            inserirConteudo();
            //LIMPA O TEXTO DITIADO
            txtNome.setText("");
            //FECHA A JANELA
            dispose();
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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

    //INSERE OS VALORES NO BANCO DE DADOS
    private void inserirConteudo() {

        Conteudo conteudo = new Conteudo();
        ConexaoDAO conexaoDao = new ConexaoDAO();
        int resposta;

        conteudo.setNome(txtNome.getText());
        conteudo.setGenero(cboxGenero.getSelectedItem().toString());
        conteudo.setStreaming(cboxStreaming.getSelectedItem().toString());
        conteudo.setTipo(cboxTipo.getSelectedItem().toString());
        if (conteudo.getTipo().equals("Filme")){
            FilmeDAO filmeDao = new FilmeDAO();
            resposta = filmeDao.salvarFilme(conteudo);
        } else {
            SerieDAO serieDao = new SerieDAO();
            resposta = serieDao.salvarSerie(conteudo);
        }
        switch (resposta) {
            case 1 -> {
                JOptionPane.showMessageDialog(null, "Dados incluidos com sucesso.");
                //limpar os campos
                txtNome.setText("");
                //recomeçar inserção de dados do inicio
                txtNome.requestFocus();
            }
            case 1062 ->
                JOptionPane.showMessageDialog(null, "Conteúdo já cadastrado.");
            default ->
                JOptionPane.showMessageDialog(null, "Erro ao tentar inserir dados.");
        }
        conexaoDao.desconectar();
    }

    //VERIFICA SE OS CAMPOS ESTÃO EM BRANCO
    private boolean camposVazios() {

        boolean empty = true;

        if (txtNome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Digite o nome do Filme ou Série.");
        } else {
            empty = false;
        }

        return empty;

    }

}
