package aferimentopressao;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Claudemir
 */
//NOTA: EXECUTAR PROGRAMA COM PRIVILÉGIOS DE ADMINISTRADOR NO WINDOWS
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        lerDados();
        atalhosTeclado();
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

        txtData.setToolTipText("DD/MM/AAAA");
        txtData.setNextFocusableComponent(txtHora);

        lblHora.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        lblHora.setText("Hora");

        txtHora.setToolTipText("00:00");
        txtHora.setNextFocusableComponent(txtDiastolica);

        lblDiastolica.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        lblDiastolica.setText("Pressão diastólica");

        txtDiastolica.setToolTipText("Escreva somente números");
        txtDiastolica.setNextFocusableComponent(txtSistolica);

        lblSistolica.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        lblSistolica.setText("Pressão sistólica");

        txtSistolica.setToolTipText("Escreva somente números");
        txtSistolica.setNextFocusableComponent(cboxExtresse);

        butnSalvar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        butnSalvar.setText("Salvar");
        butnSalvar.setToolTipText("Clique ou use ALT + D para Salvar.");
        butnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butnSalvarActionPerformed(evt);
            }
        });

        cboxExtresse.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        cboxExtresse.setText("Em situação de estresse");
        cboxExtresse.setToolTipText("Marque somente se a medição tiver sido realizada após ou durante uma situação estressante.");
        cboxExtresse.setNextFocusableComponent(butnSalvar);

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

        lblData.getAccessibleContext().setAccessibleDescription("Data");
        txtData.getAccessibleContext().setAccessibleName("Digite a data no formato DD/MM/AAAA");
        txtData.getAccessibleContext().setAccessibleDescription("Digite a data no formato DD/MM/AAAA");
        lblHora.getAccessibleContext().setAccessibleDescription("Hora");
        txtHora.getAccessibleContext().setAccessibleName("Digite a hora no formato 00:00");
        txtHora.getAccessibleContext().setAccessibleDescription("Digite a hora no formato 00:00");
        lblDiastolica.getAccessibleContext().setAccessibleDescription("Pressão diastólica");
        txtDiastolica.getAccessibleContext().setAccessibleName("Digite a pressão diastólica, somente números.");
        txtDiastolica.getAccessibleContext().setAccessibleDescription("Digite a pressão diastólica, somente números.");
        lblSistolica.getAccessibleContext().setAccessibleDescription("Pressão sistólica");
        txtSistolica.getAccessibleContext().setAccessibleName("Digite a pressão sistólica, somente números.");
        txtSistolica.getAccessibleContext().setAccessibleDescription("Digite a pressão sistólica, somente números.");
        butnSalvar.getAccessibleContext().setAccessibleName("Botão de salvar");
        butnSalvar.getAccessibleContext().setAccessibleDescription("Botão de salvar");
        cboxExtresse.getAccessibleContext().setAccessibleName("Caixa para marcar situação de estresse");

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
        tabela.setToolTipText("Mostra a última leitura");
        jScrollPane.setViewportView(tabela);
        tabela.getAccessibleContext().setAccessibleDescription("Resultado da medicão");
        tabela.getAccessibleContext().setAccessibleParent(Resultado);

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

        Resultado.getAccessibleContext().setAccessibleName("Resultado de medições");
        Resultado.getAccessibleContext().setAccessibleDescription("Resultado de medições");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butnSalvarActionPerformed

        if (!camposVazios()) {
            if (!camposValidos()) {
                File txt = new File("C:\\medicao.txt");

                escreverDados(txt);

                lerDados();

                JOptionPane.showMessageDialog(rootPane, "Salvo! Leitura disponível na tabela Resultado.");

                txtData.setText("");
                txtHora.setText("");
                txtDiastolica.setText("");
                txtSistolica.setText("");
            }
        }
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
                + "\nPressão Distólica: " + txtDiastolica.getText()
                + "\nPressão Sistólica: " + txtSistolica.getText());

        return medicao;

    }

    private void escreverDados(File txt) {
        try {

            OutputStream out = new FileOutputStream(txt);

            // Convertendo a string em bytes
            byte[] dataBytes = salvaMedicao().getBytes();

            // Grava dados no OutputStream
            out.write(dataBytes);

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

    //VERIFICA SE OS CAMPOS ESTÃO EM BRANCO
    private boolean camposVazios() {

        boolean empty = true;

        if (txtData.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Digite a data, formato DD/MM/AAAA.");
        } else if (txtHora.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Digite a hora, formato 00:00.");
        } else if (txtDiastolica.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Digite a pressão diastólica.");
        } else if (txtSistolica.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Digite pressão sistólica.");
        } else {
            empty = false;
        }

        return empty;
    }

    //VAI VERIFICAR A FORMATAÇÃO DAS STRINGS E SE FOI PREENCHIDO CORRETAMENTE
    private boolean camposValidos() {

        boolean valido = true;

        String strData = txtData.getText();
        String strHora = txtHora.getText();
        String strDiastolica = txtDiastolica.getText();
        String strSistolica = txtSistolica.getText();

        boolean verificaData = strData.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}");
        boolean verificaHora = strHora.matches("[0-9]{2}[:][0-9]{2}");
        boolean verificaDiastolica = strDiastolica.matches("^[0-9]*$");
        boolean verificaSistolica = strSistolica.matches("^[0-9]*$");

        if (verificaData == false) {
            JOptionPane.showMessageDialog(rootPane, "Data deve estar no formato DD/MM/AAAA.");
        } else if (verificaHora == false) {
            JOptionPane.showMessageDialog(rootPane, "Hora deve estar no formato 00:00.");
        } else if (verificaDiastolica == false) {
            JOptionPane.showMessageDialog(rootPane, "Pressão Diastólica deve conter apenas números.");
        } else if (verificaSistolica == false) {
            JOptionPane.showMessageDialog(rootPane, "Pressão Sistólica deve conter apenas números.");
        } else {
            valido = false;
        }
        return valido;
    }

    //MÉTODO SEM RETORNO COM DEFINIÇÕES DE ATALHOS NO TECLADO
    public void atalhosTeclado() {
        //ALT+S PARA SALVAR
        butnSalvar.setMnemonic(KeyEvent.VK_S);
    }

}
