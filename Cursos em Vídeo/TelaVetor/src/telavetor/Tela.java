package telavetor;

import java.util.Arrays;
import javax.swing.DefaultListModel;

/**
 * @author Claudemir
 */
public class Tela extends javax.swing.JFrame {

    int vetor[] = new int[5];
    DefaultListModel lista = new DefaultListModel();
    int selec = 0;

    public Tela() {
        initComponents();
        //PREENCHE O VETOR COM ZEROS IMEDIATAMENTE
        for (int cont = 0; cont < vetor.length; cont++) {
            lista.addElement(vetor[cont]);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spnValor = new javax.swing.JSpinner();
        btnAdicionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstArray = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        spnValor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnAdicionar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnRemover.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnOrdenar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        lstArray.setFont(new java.awt.Font("Dialog", 0, 19)); // NOI18N
        lstArray.setModel(lista);
        lstArray.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstArrayMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstArray);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(spnValor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnOrdenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdicionar)
                                .addGap(18, 18, 18)
                                .addComponent(btnRemover))
                            .addComponent(spnValor, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnOrdenar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        //O VETOR NA POSIÇÃO VAI RECEBER O VALOR
        vetor[selec] = Integer.parseInt(spnValor.getValue().toString());
        //LIMPA A LISTA ANTES DE ADICIONAR O VALOR
        lista.removeAllElements();
        //O VETOR VAI SER LIDO E PASSAR O VALOR PARA A POSIÇÃO
        for (int cont = 0; cont < vetor.length; cont++) {
            lista.addElement(vetor[cont]);
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void lstArrayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstArrayMouseClicked
        selec = lstArray.getSelectedIndex();
    }//GEN-LAST:event_lstArrayMouseClicked

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        //O VETOR NA POSIÇÃO VAI SER ZERADO
        vetor[selec] = 0;
        //LIMPA A LISTA ANTES DE ADICIONAR O VALOR
        lista.removeAllElements();
        //O VETOR VAI SER LIDO E PASSAR O VALOR PARA A POSIÇÃO
        for (int cont = 0; cont < vetor.length; cont++) {
            lista.addElement(vetor[cont]);
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        //ORDENA O VETOR
        Arrays.sort(vetor);
        //LIMPA A LISTA ANTES DE ADICIONAR O VALOR
        lista.removeAllElements();
        //O VETOR VAI SER LIDO E PASSAR O VALOR PARA A POSIÇÃO
        for (int cont = 0; cont < vetor.length; cont++) {
            lista.addElement(vetor[cont]);
        }
    }//GEN-LAST:event_btnOrdenarActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstArray;
    private javax.swing.JSpinner spnValor;
    // End of variables declaration//GEN-END:variables
}
