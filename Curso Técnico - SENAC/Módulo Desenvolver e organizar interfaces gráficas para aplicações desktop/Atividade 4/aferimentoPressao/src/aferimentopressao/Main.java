package aferimentopressao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

/**
 * @author Claudemir
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        lerDados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SalvarPressao = new javax.swing.JLayeredPane();
        lblData = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        lblHora = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        lblDiastolica = new javax.swing.JLabel();
        txtDiastolica = new javax.swing.JTextField();
        lblSistolica = new javax.swing.JLabel();
        txtSistolica = new javax.swing.JTextField();
        butnSalvar = new javax.swing.JButton();
        cboxExtresse = new javax.swing.JCheckBox();
        Resultado = new javax.swing.JLayeredPane();
        jScrollPane = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SalvarPressao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Aferimento de Pressão", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 24))); // NOI18N

        lblData.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        lblData.setText("Data");

        lblHora.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        lblHora.setText("Hora");

        lblDiastolica.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        lblDiastolica.setText("Pressão diastólica");

        lblSistolica.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        lblSistolica.setText("Pressão sistólica");

        butnSalvar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        butnSalvar.setText("Salvar");
        butnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butnSalvarActionPerformed(evt);
            }
        });

        cboxExtresse.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        cboxExtresse.setText("Em situação de estresse");

        SalvarPressao.setLayer(lblData, javax.swing.JLayeredPane.DEFAULT_LAYER);
        SalvarPressao.setLayer(txtData, javax.swing.JLayeredPane.DEFAULT_LAYER);
        SalvarPressao.setLayer(lblHora, javax.swing.JLayeredPane.DEFAULT_LAYER);
        SalvarPressao.setLayer(txtHora, javax.swing.JLayeredPane.DEFAULT_LAYER);
        SalvarPressao.setLayer(lblDiastolica, javax.swing.JLayeredPane.DEFAULT_LAYER);
        SalvarPressao.setLayer(txtDiastolica, javax.swing.JLayeredPane.DEFAULT_LAYER);
        SalvarPressao.setLayer(lblSistolica, javax.swing.JLayeredPane.DEFAULT_LAYER);
        SalvarPressao.setLayer(txtSistolica, javax.swing.JLayeredPane.DEFAULT_LAYER);
        SalvarPressao.setLayer(butnSalvar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        SalvarPressao.setLayer(cboxExtresse, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout SalvarPressaoLayout = new javax.swing.GroupLayout(SalvarPressao);
        SalvarPressao.setLayout(SalvarPressaoLayout);
        SalvarPressaoLayout.setHorizontalGroup(
            SalvarPressaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalvarPressaoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(SalvarPressaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SalvarPressaoLayout.createSequentialGroup()
                        .addComponent(cboxExtresse)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(SalvarPressaoLayout.createSequentialGroup()
                        .addGroup(SalvarPressaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblData)
                            .addComponent(lblHora)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(SalvarPressaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSistolica)
                            .addComponent(lblDiastolica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDiastolica)
                            .addComponent(txtSistolica, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))
                    .addGroup(SalvarPressaoLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(butnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        SalvarPressaoLayout.setVerticalGroup(
            SalvarPressaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalvarPressaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SalvarPressaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SalvarPressaoLayout.createSequentialGroup()
                        .addComponent(lblData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblHora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SalvarPressaoLayout.createSequentialGroup()
                        .addComponent(lblDiastolica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiastolica, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSistolica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSistolica, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboxExtresse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butnSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Resultado.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 24))); // NOI18N

        tabela.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane.setViewportView(tabela);

        Resultado.setLayer(jScrollPane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ResultadoLayout = new javax.swing.GroupLayout(Resultado);
        Resultado.setLayout(ResultadoLayout);
        ResultadoLayout.setHorizontalGroup(
            ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                .addContainerGap())
        );
        ResultadoLayout.setVerticalGroup(
            ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Resultado)
                    .addComponent(SalvarPressao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(SalvarPressao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butnSalvarActionPerformed

        File txt = new File("C:\\medicao.txt");

        escreverDados(txt);

        lerDados();

    }//GEN-LAST:event_butnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane Resultado;
    private javax.swing.JLayeredPane SalvarPressao;
    private javax.swing.JButton butnSalvar;
    private javax.swing.JCheckBox cboxExtresse;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDiastolica;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblSistolica;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDiastolica;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtSistolica;
    // End of variables declaration//GEN-END:variables

    private final String[] tableColumns = {""};
    DefaultTableModel tableModel = new DefaultTableModel(tableColumns, 0);

    //ATUALIZA OS ITENS NA TABELA
    private String salvaMedicao() {

        String medicao;
        String estresse;

        //VERIFICA SE JÁ FOI PACIENTE
        if (cboxExtresse.isSelected()) {
            estresse = "Sim";
            cboxExtresse.setSelected(false);
        } else {
            estresse = "Não";
        }

        medicao = ("Data: " + txtData.getText()
                + "\nHora: " + txtHora.getText()
                + "\nEm situação de estresse: " + estresse
                + "\nPressão Sistólica: " + txtSistolica.getText()
                + "\nPressão Distólica: " + txtDiastolica.getText());

        return medicao;

    }

    private void escreverDados(File txt) {
        try {

            OutputStream out = new FileOutputStream(txt);

            // Convertendo a string em bytes
            byte[] dataBytes = salvaMedicao().getBytes();

            // Grava dados no OutputStream
            out.write(dataBytes);
            System.out.println("Arquivo criado com sucesso.");
            
            // Fecha o OutputStream
            out.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    private void lerDados() {
        tableModel = new DefaultTableModel(tableColumns, 0);
        try {
            File obj = new File("C://medicao.txt");
            Scanner Reader = new Scanner(obj);
            while (Reader.hasNextLine()) {
                String[] data = {Reader.nextLine()};
                tableModel.addRow(data);
            }
            tabela.setModel(tableModel);
            tabela.setEnabled(false);
            Reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Não consegui ler.");
        }
    }

}
