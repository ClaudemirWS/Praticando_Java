package Telas;

/**
 * @author Claudemir
 */
public class Equacao extends javax.swing.JFrame {

    public Equacao() {
        initComponents();
        Resultados.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        spnA = new javax.swing.JSpinner();
        spnB = new javax.swing.JSpinner();
        spnC = new javax.swing.JSpinner();
        lblX2 = new javax.swing.JLabel();
        lblX = new javax.swing.JLabel();
        lbl0 = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        lblAoQuad = new javax.swing.JLabel();
        lblA = new javax.swing.JLabel();
        lblVezes = new javax.swing.JLabel();
        lblDelta = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        Resultados = new javax.swing.JPanel();
        lblMsgDelta = new javax.swing.JLabel();
        lblMsgRaizes = new javax.swing.JLabel();
        lblResDelta = new javax.swing.JLabel();
        lblResRaizes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblTitulo.setText("Equação do Segundo Grau");

        spnA.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        spnA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnAStateChanged(evt);
            }
        });

        spnB.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        spnB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnBStateChanged(evt);
            }
        });

        spnC.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        spnC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCStateChanged(evt);
            }
        });

        lblX2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblX2.setText("x² +");

        lblX.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblX.setText("x +");

        lbl0.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl0.setText("= 0");

        lblC.setBackground(new java.awt.Color(255, 0, 51));
        lblC.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblC.setForeground(new java.awt.Color(255, 0, 51));
        lblC.setText("C");

        lblB.setBackground(new java.awt.Color(255, 0, 51));
        lblB.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblB.setForeground(new java.awt.Color(255, 0, 51));
        lblB.setText("B");

        lblAoQuad.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblAoQuad.setText("²  - 4  x");

        lblA.setBackground(new java.awt.Color(255, 0, 51));
        lblA.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblA.setForeground(new java.awt.Color(255, 0, 51));
        lblA.setText("A");

        lblVezes.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblVezes.setText("x");

        lblDelta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblDelta.setText("▲ = ");

        btnCalcular.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnCalcular.setText("Calcular ▲");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblMsgDelta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblMsgDelta.setText("Resultado de ▲: ");

        lblMsgRaizes.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblMsgRaizes.setText("Tipo de raízes:");

        lblResDelta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblResDelta.setText("0");

        lblResRaizes.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblResRaizes.setText("0");

        javax.swing.GroupLayout ResultadosLayout = new javax.swing.GroupLayout(Resultados);
        Resultados.setLayout(ResultadosLayout);
        ResultadosLayout.setHorizontalGroup(
            ResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultadosLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(ResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMsgDelta)
                    .addComponent(lblMsgRaizes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblResDelta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblResRaizes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(70, 70, 70))
        );
        ResultadosLayout.setVerticalGroup(
            ResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMsgDelta)
                    .addComponent(lblResDelta))
                .addGap(26, 26, 26)
                .addGroup(ResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMsgRaizes)
                    .addComponent(lblResRaizes))
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Resultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spnA, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblX2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnB, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblX)
                        .addGap(9, 9, 9)
                        .addComponent(spnC, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl0))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblDelta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAoQuad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblVezes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblC))
                    .addComponent(lblTitulo)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblX2)
                    .addComponent(lblX)
                    .addComponent(lbl0))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblB)
                    .addComponent(lblC)
                    .addComponent(lblA)
                    .addComponent(lblAoQuad)
                    .addComponent(lblVezes)
                    .addComponent(lblDelta))
                .addGap(27, 27, 27)
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(Resultados, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spnAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnAStateChanged
        lblA.setText(spnA.getValue().toString());
    }//GEN-LAST:event_spnAStateChanged

    private void spnBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnBStateChanged
        lblB.setText(spnB.getValue().toString());
    }//GEN-LAST:event_spnBStateChanged

    private void spnCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCStateChanged
        lblC.setText(spnC.getValue().toString());
    }//GEN-LAST:event_spnCStateChanged

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        int a = Integer.parseInt(spnA.getValue().toString());
        int b = Integer.parseInt(spnB.getValue().toString());
        int c = Integer.parseInt(spnC.getValue().toString());

        double delta = Math.pow(b, 2) - 4 * a * c;
        lblResDelta.setText(String.format("%.2f", delta));

        if (delta < 0) {
            lblResRaizes.setText("Não existem raízes reais.");
        } else {
            lblResRaizes.setText("Existem raízes reais.");
        }

        Resultados.setVisible(true);
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Equacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Equacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Equacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Equacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Equacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Resultados;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel lbl0;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblAoQuad;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblDelta;
    private javax.swing.JLabel lblMsgDelta;
    private javax.swing.JLabel lblMsgRaizes;
    private javax.swing.JLabel lblResDelta;
    private javax.swing.JLabel lblResRaizes;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVezes;
    private javax.swing.JLabel lblX;
    private javax.swing.JLabel lblX2;
    private javax.swing.JSpinner spnA;
    private javax.swing.JSpinner spnB;
    private javax.swing.JSpinner spnC;
    // End of variables declaration//GEN-END:variables
}
