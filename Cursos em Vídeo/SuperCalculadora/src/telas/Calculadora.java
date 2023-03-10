package telas;

import javax.swing.JOptionPane;


/**
 * @author Claudemir
 */
public class Calculadora extends javax.swing.JFrame {


    public Calculadora() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDigiteValor = new javax.swing.JLabel();
        spnValor = new javax.swing.JSpinner();
        imgCalc = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        Resultados = new javax.swing.JPanel();
        lblRaiz = new javax.swing.JLabel();
        lblValorRaiz = new javax.swing.JLabel();
        lblCubica = new javax.swing.JLabel();
        lblValorCubica = new javax.swing.JLabel();
        lblDivi = new javax.swing.JLabel();
        lblValorDivi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblDigiteValor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblDigiteValor.setText("Digite um valor:");

        spnValor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        spnValor.setModel(new javax.swing.SpinnerNumberModel());

        imgCalc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calc1.png"))); // NOI18N

        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calc2.png"))); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblRaiz.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblRaiz.setText("Raiz quadrada: ");

        lblValorRaiz.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblValorRaiz.setText("0");

        lblCubica.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCubica.setText("Raiz cúbica: ");

        lblValorCubica.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblValorCubica.setText("0");

        lblDivi.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblDivi.setText("Resultado da divisão:");

        lblValorDivi.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblValorDivi.setText("0");

        javax.swing.GroupLayout ResultadosLayout = new javax.swing.GroupLayout(Resultados);
        Resultados.setLayout(ResultadosLayout);
        ResultadosLayout.setHorizontalGroup(
            ResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultadosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ResultadosLayout.createSequentialGroup()
                        .addComponent(lblDivi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblValorDivi, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ResultadosLayout.createSequentialGroup()
                        .addComponent(lblCubica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblValorCubica, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ResultadosLayout.createSequentialGroup()
                        .addComponent(lblRaiz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblValorRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ResultadosLayout.setVerticalGroup(
            ResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultadosLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(ResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRaiz)
                    .addComponent(lblValorRaiz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValorCubica)
                    .addComponent(lblCubica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDivi)
                    .addComponent(lblValorDivi))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Resultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(lblDigiteValor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnValor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)))
                        .addComponent(imgCalc)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDigiteValor)
                            .addComponent(spnValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCalcular)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(imgCalc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGap(18, 18, 18)
                .addComponent(Resultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        //PREPARA VALORES
        Double valor = Double.parseDouble(spnValor.getValue().toString());
        double div = Double.parseDouble(JOptionPane.showInputDialog("Digite por quanto será a divisão: "));
        //RAIZ QUADRADA
        double rq = Math.sqrt(valor);
        lblValorRaiz.setText(String.format("%.2f", rq));
        //RAIZ CÚBICA
        double rc = Math.cbrt(valor);
        lblValorCubica.setText(String.format("%.2f", rc));
        //RESULTADO DA DIVISÃO
        double calcDiv = valor / div;
        lblValorDivi.setText(String.format("%.2f", calcDiv));
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Resultados;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel imgCalc;
    private javax.swing.JLabel lblCubica;
    private javax.swing.JLabel lblDigiteValor;
    private javax.swing.JLabel lblDivi;
    private javax.swing.JLabel lblRaiz;
    private javax.swing.JLabel lblValorCubica;
    private javax.swing.JLabel lblValorDivi;
    private javax.swing.JLabel lblValorRaiz;
    private javax.swing.JSpinner spnValor;
    // End of variables declaration//GEN-END:variables
}
