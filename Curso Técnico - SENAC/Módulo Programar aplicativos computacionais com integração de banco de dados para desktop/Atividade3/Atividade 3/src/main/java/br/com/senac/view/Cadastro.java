package br.com.senac.view;

import br.com.model.Podcast;
import br.com.senac.persistencia.CadastroDAO;
import java.time.LocalTime;
import javax.swing.JOptionPane;

/**
 * @author Claudemir
 */
public class Cadastro extends javax.swing.JFrame {

    public Cadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        lblProdutor = new javax.swing.JLabel();
        txtProdutor = new javax.swing.JTextField();
        txtNomeEpisodio = new javax.swing.JTextField();
        lblNomeEpisodio = new javax.swing.JLabel();
        txtNumeroEpisodio = new javax.swing.JTextField();
        lblNumeroEpisodio = new javax.swing.JLabel();
        lblDuracao = new javax.swing.JLabel();
        txtDuracao = new javax.swing.JFormattedTextField();
        lblUrlEpisodio = new javax.swing.JLabel();
        txtUrlEpisodio = new javax.swing.JTextField();
        btnListagem = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lblTitulo.setText("CENAFLIX");

        lblSubtitulo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblSubtitulo.setText("CADASTRAR PODCAST");

        lblProdutor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblProdutor.setText("Produtor:");

        txtProdutor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtNomeEpisodio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblNomeEpisodio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNomeEpisodio.setText("Nome do Episódio:");

        txtNumeroEpisodio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblNumeroEpisodio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNumeroEpisodio.setText("Número do Episódio:");

        lblDuracao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblDuracao.setText("Duração:");

        txtDuracao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance())));
        txtDuracao.setText("00:00:00");
        txtDuracao.setToolTipText("00:00:00");

        lblUrlEpisodio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblUrlEpisodio.setText("Url do Repositório:");

        txtUrlEpisodio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnListagem.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnListagem.setText("Ver Listagem");
        btnListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListagemActionPerformed(evt);
            }
        });

        btnCadastrar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblProdutor, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtProdutor, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNomeEpisodio, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUrlEpisodio)
                                    .addComponent(lblDuracao)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblNumeroEpisodio)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtNumeroEpisodio, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                                        .addComponent(txtNomeEpisodio))
                                    .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUrlEpisodio, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSubtitulo)
                                .addGap(9, 9, 9))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(lblTitulo)))
                .addContainerGap(229, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSubtitulo)
                .addGap(18, 18, 18)
                .addComponent(lblProdutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProdutor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNomeEpisodio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeEpisodio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroEpisodio)
                    .addComponent(txtNumeroEpisodio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblDuracao)
                .addGap(10, 10, 10)
                .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblUrlEpisodio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUrlEpisodio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnListagem, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListagemActionPerformed
        dispose();
    }//GEN-LAST:event_btnListagemActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        novoCadastro();
        dispose();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnListagem;
    private javax.swing.JLabel lblDuracao;
    private javax.swing.JLabel lblNomeEpisodio;
    private javax.swing.JLabel lblNumeroEpisodio;
    private javax.swing.JLabel lblProdutor;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUrlEpisodio;
    private javax.swing.JFormattedTextField txtDuracao;
    private javax.swing.JTextField txtNomeEpisodio;
    private javax.swing.JTextField txtNumeroEpisodio;
    private javax.swing.JTextField txtProdutor;
    private javax.swing.JTextField txtUrlEpisodio;
    // End of variables declaration//GEN-END:variables

    //ARMAZENA UM NOVO CADASTRO NO BANCO DE DADOS
    private void novoCadastro() {
        Podcast novoPodcast = new Podcast();

        try {
            novoPodcast.setProdutor(txtProdutor.getText());
            novoPodcast.setNome(txtNomeEpisodio.getText());
            novoPodcast.setNumero(Integer.parseInt(txtNumeroEpisodio.getText()));
            novoPodcast.setDuracao(LocalTime.parse(txtDuracao.getText()));
            novoPodcast.setUrl(txtUrlEpisodio.getText());

            CadastroDAO cadastroDao = new CadastroDAO();

            cadastroDao.cadastrar(novoPodcast);

            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos corretamente.");
        }
    }

}
