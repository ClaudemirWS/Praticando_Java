package br.com.senac.view;

import br.com.model.Podcast;
import br.com.senac.persistencia.CadastroDAO;
import br.com.senac.persistencia.PodcastDAO;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Claudemir
 */
public class ListaPodcast extends javax.swing.JFrame {

    PodcastDAO podcastDao = new PodcastDAO();

    public ListaPodcast() {
        initComponents();

        List<Podcast> podcasts = podcastDao.listar();
        preencheTabela(podcasts);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPodcasts = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        lblPesquisa = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblPodcasts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Produtor", "Nome do Episódio", "Nº Episódio", "Duração", "URL Repo"
            }
        ));
        jScrollPane1.setViewportView(tblPodcasts);

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lblTitulo.setText("CENAFLIX");

        lblSubtitulo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblSubtitulo.setText("LISTAGEM");

        btnExcluir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnCadastrar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setEnabled(false);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblPesquisa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPesquisa.setText("Pesquisar podcast por produtor:");

        txtPesquisa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtPesquisa.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtPesquisaCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(lblSubtitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSubtitulo)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesquisa)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Cadastro cadastro = new Cadastro();
        cadastro.setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluirPodcast();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtPesquisaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtPesquisaCaretUpdate
        pesquisaProdutor();
    }//GEN-LAST:event_txtPesquisaCaretUpdate

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaPodcast().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPesquisa;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblPodcasts;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

    //PREENCHE A TABELA COM OS DADOS
    public void preencheTabela(List<Podcast> podcasts) {
        String colunas[] = {"ID", "Produtor", "Nome do Episódio", "Nº Episódio", "Duração", "URL do Repo"};
        String dados[][] = new String[podcasts.size()][colunas.length];

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");

        int i = 0;
        for (Podcast p : podcasts) {
            dados[i] = new String[]{
                p.getId(),
                p.getProdutor(),
                p.getNome(),
                p.getNumero().toString(),
                p.getDuracao().format(formatter),
                p.getUrl()
            };
            i++;
        }

        DefaultTableModel model = new DefaultTableModel(dados, colunas);
        tblPodcasts.setModel(model);
    }

    //FAZ A PESQUISA DINAMICA POR PRODUTOR
    public void pesquisaProdutor() {

        String nomeProdutor = txtPesquisa.getText();
        List<Podcast> podcasts = podcastDao.listarProdutor(nomeProdutor);

        String colunas[] = {"ID", "Produtor", "Nome do Episódio", "Nº Episódio", "Duração", "URL do Repo"};
        String dados[][] = new String[podcasts.size()][colunas.length];

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");

        int i = 0;
        for (Podcast p : podcasts) {
            dados[i] = new String[]{
                p.getId(),
                p.getProdutor(),
                p.getNome(),
                p.getNumero().toString(),
                p.getDuracao().format(formatter),
                p.getUrl()
            };
            i++;
        }

        DefaultTableModel model = new DefaultTableModel(dados, colunas);
        tblPodcasts.setModel(model);
    }

    //EXCLUI UM PODCAST POR VEZ
    private void excluirPodcast() {
        try {
            if (tblPodcasts.getSelectedRow() >= 0) { //verifica se há algo selecionado na tabela
                //obtém o valor da coluna id da linha selecionada
                String id = (String) tblPodcasts.getValueAt(tblPodcasts.getSelectedRow(), 0);
                //janela de confirmação
                int resposta = JOptionPane.showConfirmDialog(this, "Deseja mesmo excluir o podcast " + id + "?");
                if (resposta == 0) {
                    //realizando a exclusão
                    CadastroDAO cadastroDao = new CadastroDAO();
                    cadastroDao.excluir(id);
                    JOptionPane.showMessageDialog(this, "Podcast excluído com sucesso");
                    //refazendo a pesquisa para atualizar a tabela na tela
                    List<Podcast> podcasts = podcastDao.listar();
                    preencheTabela(podcasts);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Selecione um podcast corretamente.");
        }
    }

    //TORNA O BOTÃO VISIVEL DE ACORDO COM O TIPO DE USUÁRIO
    public void cadastrarVisible(String tipo) {
        if (tipo.equals("Administrador") || tipo.equals("Operador")) {
            btnCadastrar.setEnabled(true);
        } else {
            btnCadastrar.setEnabled(false);
        }
    }

    //TORNA O BOTÃO VISIVEL DE ACORDO COM O TIPO DE USUÁRIO
    public void excluirVisible(String tipo) {
        if (tipo.equals("Administrador")) {
            btnExcluir.setEnabled(true);
        } else {
            btnExcluir.setEnabled(false);
        }
    }

}
