package adivinharnumero;

import javax.swing.JOptionPane;

/**
 * @author Claudemir
 */
public class Tela extends javax.swing.JFrame {

    public Tela() {
        initComponents();
        lblMensagem.setText("<html>Vou pensar em um <br> número de 1 a 10..</html>");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMensagem = new javax.swing.JLabel();
        lblGenio = new javax.swing.JLabel();
        lblBalao = new javax.swing.JLabel();
        lblQualNumero = new javax.swing.JLabel();
        txtTentativa = new javax.swing.JTextField();
        btnTentar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMensagem.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblMensagem.setForeground(new java.awt.Color(0, 0, 0));
        lblMensagem.setText("Mensagem");
        lblMensagem.setAutoscrolls(true);
        getContentPane().add(lblMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, 40));

        lblGenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/genio.png"))); // NOI18N
        getContentPane().add(lblGenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 237, -1));

        lblBalao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/balaores.png"))); // NOI18N
        getContentPane().add(lblBalao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 210, 150));

        lblQualNumero.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblQualNumero.setText("Qual foi o número: ");
        getContentPane().add(lblQualNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));
        getContentPane().add(txtTentativa, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 196, 40, -1));

        btnTentar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnTentar.setText("Tentar");
        btnTentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTentarActionPerformed(evt);
            }
        });
        getContentPane().add(btnTentar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTentarActionPerformed
        double numero = 1 + Math.random() * (10);

        try {

            int valor = (int) numero;
            int tentativa = Integer.parseInt(txtTentativa.getText());

            if (tentativa == valor) {
                lblMensagem.setText("<html><strong>Você acertou! <br> Pensei no " + valor + ".</strong></html>");
            } else if (tentativa > 10 || tentativa <= 0) {
                lblMensagem.setText("<html>Eu disse de 1 a 10!</html>");
            } else if (tentativa <= 10 && tentativa != valor) {
                lblMensagem.setText("<html>Você errou. <br> Pensei no " + valor + ".</html>");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Não deixe sua tentativa em branco!");
        }
    }//GEN-LAST:event_btnTentarActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTentar;
    private javax.swing.JLabel lblBalao;
    private javax.swing.JLabel lblGenio;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel lblQualNumero;
    private javax.swing.JTextField txtTentativa;
    // End of variables declaration//GEN-END:variables
}
