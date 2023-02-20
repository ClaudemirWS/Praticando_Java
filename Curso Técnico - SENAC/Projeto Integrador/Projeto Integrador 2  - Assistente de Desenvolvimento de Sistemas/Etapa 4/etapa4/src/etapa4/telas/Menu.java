package etapa4.telas;

/**
 * @author Claudemir
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        btnAddNovo = new javax.swing.JButton();
        btnListaFilmes = new javax.swing.JButton();
        btnListaSeries = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(51, 51, 51));
        Background.setForeground(new java.awt.Color(51, 51, 51));
        Background.setToolTipText("Menu Principal");

        btnAddNovo.setBackground(new java.awt.Color(102, 102, 102));
        btnAddNovo.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        btnAddNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnAddNovo.setText("Adicionar Novo");
        btnAddNovo.setToolTipText("Adiciona novo filme ou série");
        btnAddNovo.setNextFocusableComponent(btnListaFilmes);
        btnAddNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNovoActionPerformed(evt);
            }
        });

        btnListaFilmes.setBackground(new java.awt.Color(102, 102, 102));
        btnListaFilmes.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnListaFilmes.setForeground(new java.awt.Color(255, 255, 255));
        btnListaFilmes.setText("Lista de Filmes");
        btnListaFilmes.setToolTipText("Ver lista de filmes");
        btnListaFilmes.setNextFocusableComponent(btnListaSeries);
        btnListaFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaFilmesActionPerformed(evt);
            }
        });

        btnListaSeries.setBackground(new java.awt.Color(102, 102, 102));
        btnListaSeries.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnListaSeries.setForeground(new java.awt.Color(255, 255, 255));
        btnListaSeries.setText(" Lista de Séries");
        btnListaSeries.setToolTipText("Ver lista de séries");
        btnListaSeries.setNextFocusableComponent(btnSair);
        btnListaSeries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaSeriesActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(102, 102, 102));
        btnSair.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(btnListaFilmes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListaSeries)))
                .addContainerGap(143, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnAddNovo)
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListaSeries, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListaFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Background.getAccessibleContext().setAccessibleName("Menu");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnAddNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNovoActionPerformed
        AdicionarNovo novoItem = new AdicionarNovo();
        novoItem.setVisible(true);
    }//GEN-LAST:event_btnAddNovoActionPerformed

    private void btnListaFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaFilmesActionPerformed
        ListadeFilmes listafilmes = new ListadeFilmes();
        listafilmes.atualizarTabela();
        listafilmes.setVisible(true);
    }//GEN-LAST:event_btnListaFilmesActionPerformed

    private void btnListaSeriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaSeriesActionPerformed
        ListadeSeries listaseries = new ListadeSeries();
        listaseries.atualizarTabela();
        listaseries.setVisible(true);
    }//GEN-LAST:event_btnListaSeriesActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnAddNovo;
    private javax.swing.JButton btnListaFilmes;
    private javax.swing.JButton btnListaSeries;
    private javax.swing.JButton btnSair;
    // End of variables declaration//GEN-END:variables
}
