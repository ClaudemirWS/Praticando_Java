package Tela;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * @author Claudemir
 */
public class Contador extends javax.swing.JFrame {

    /**
     * Creates new form Contador
     */
    public Contador() {
        initComponents();
        lstConta.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        sldInicio = new javax.swing.JSlider();
        valorInicio = new javax.swing.JLabel();
        sldPasso = new javax.swing.JSlider();
        lblPasso = new javax.swing.JLabel();
        valorPasso = new javax.swing.JLabel();
        sldFim = new javax.swing.JSlider();
        lblFim = new javax.swing.JLabel();
        valorFim = new javax.swing.JLabel();
        btnContar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstConta = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTitulo.setText("Contador");

        lblInicio.setText("Contar de");

        sldInicio.setMaximum(50);
        sldInicio.setValue(0);
        sldInicio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldInicioStateChanged(evt);
            }
        });

        valorInicio.setText("0");

        sldPasso.setMaximum(5);
        sldPasso.setMinimum(1);
        sldPasso.setValue(1);
        sldPasso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldPassoStateChanged(evt);
            }
        });

        lblPasso.setText("Pulando de ");

        valorPasso.setText("1");

        sldFim.setMaximum(50);
        sldFim.setValue(0);
        sldFim.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldFimStateChanged(evt);
            }
        });

        lblFim.setText("Até");

        valorFim.setText("0");

        btnContar.setText("Contar!");
        btnContar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstConta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnContar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPasso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sldPasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valorPasso, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblInicio)
                                    .addComponent(lblFim, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sldInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(valorInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sldFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(valorFim, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblTitulo)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInicio)
                            .addComponent(sldInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorInicio))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFim)
                            .addComponent(sldFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorFim))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sldPasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorPasso)
                            .addComponent(lblPasso))
                        .addGap(29, 29, 29)
                        .addComponent(btnContar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sldInicioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldInicioStateChanged
        valorInicio.setText(String.valueOf(sldInicio.getValue()));
    }//GEN-LAST:event_sldInicioStateChanged

    private void sldPassoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldPassoStateChanged
        valorPasso.setText(String.valueOf(sldPasso.getValue()));
    }//GEN-LAST:event_sldPassoStateChanged

    private void sldFimStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldFimStateChanged
        valorFim.setText(String.valueOf(sldFim.getValue()));
    }//GEN-LAST:event_sldFimStateChanged

    private void btnContarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContarActionPerformed
        contador();
    }//GEN-LAST:event_btnContarActionPerformed

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
            java.util.logging.Logger.getLogger(Contador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFim;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblPasso;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> lstConta;
    private javax.swing.JSlider sldFim;
    private javax.swing.JSlider sldInicio;
    private javax.swing.JSlider sldPasso;
    private javax.swing.JLabel valorFim;
    private javax.swing.JLabel valorInicio;
    private javax.swing.JLabel valorPasso;
    // End of variables declaration//GEN-END:variables

    private void contador() {
        int inicio = sldInicio.getValue();
        int fim = sldFim.getValue();
        int passo = sldPasso.getValue();

        if (inicio < fim) {

            DefaultListModel lista = new DefaultListModel();

            for (int contador = inicio; contador < fim + 1; contador += passo) {
                lista.addElement(contador);
            }
            lstConta.setVisible(true);
            lstConta.setModel(lista);
        } else {
            JOptionPane.showMessageDialog(null, "Apenas contagem sussessiva!");
        }
    }
}
