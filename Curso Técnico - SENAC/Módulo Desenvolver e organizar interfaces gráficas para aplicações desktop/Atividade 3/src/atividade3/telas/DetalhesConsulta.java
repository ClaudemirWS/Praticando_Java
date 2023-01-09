package atividade3.telas;

import atividade3.model.Consulta;
import atividade3.model.ListaConsultas;
import javax.swing.JOptionPane;

/**
 * @author Claudemir
 */
public class DetalhesConsulta extends javax.swing.JFrame {

    public DetalhesConsulta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Detalhes = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        cBoxConsRealizada = new javax.swing.JCheckBox();
        lblTitulo2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        butFinalizar = new javax.swing.JButton();
        butCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Detalhes da Consulta");

        lblTitulo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblTitulo.setText("Detalhes da Consulta");

        cBoxConsRealizada.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        cBoxConsRealizada.setText("Consulta Finalizada");

        lblTitulo2.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        lblTitulo2.setText("Receita e observações:");

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        butFinalizar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        butFinalizar.setText("Finalizar");
        butFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butFinalizarActionPerformed(evt);
            }
        });

        butCancelar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        butCancelar.setText("Cancelar");
        butCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DetalhesLayout = new javax.swing.GroupLayout(Detalhes);
        Detalhes.setLayout(DetalhesLayout);
        DetalhesLayout.setHorizontalGroup(
            DetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetalhesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(DetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DetalhesLayout.createSequentialGroup()
                        .addComponent(butFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo)
                    .addComponent(cBoxConsRealizada)
                    .addComponent(lblTitulo2))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        DetalhesLayout.setVerticalGroup(
            DetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetalhesLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(cBoxConsRealizada)
                .addGap(22, 22, 22)
                .addComponent(lblTitulo2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(DetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(butCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Detalhes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Detalhes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butFinalizarActionPerformed

        if (!camposVazios()) {
            //MARCA A CONSULTA COMO REALIZADA OU NÃO
            setRealizada();
            //SALVA A RECEITA/OBSERVAÇÕES
            setreceitaObs();
            //REMOVE A TELA DE CADASTRO E VOLTA AO MENU
            dispose();
        }
    }//GEN-LAST:event_butFinalizarActionPerformed

    private void butCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelarActionPerformed
        //REMOVE A TELA DE CADASTRO E VOLTA AO MENU
        dispose();
    }//GEN-LAST:event_butCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Detalhes;
    private javax.swing.JButton butCancelar;
    private javax.swing.JButton butFinalizar;
    private javax.swing.JCheckBox cBoxConsRealizada;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JTextArea txtDescricao;
    // End of variables declaration//GEN-END:variables

    private int posConsulta;

    //RECEBE A LINHA DA CONSULTA PARA ESTA CLASSE
    public void setposConsulta(int posConsulta) {
        this.posConsulta = posConsulta;
    }

    //VERIFICA SE A CONSULTA FOI REALIZADA E ATIVA OU NÃO OS ELEMENTOS
    public void getconsRealizada(String consRealizada) {
        if (consRealizada.equals("Sim")) {
            //TEXT AREA
            txtDescricao.setEnabled(false);
            //CHECK BOX
            cBoxConsRealizada.setSelected(true);
            cBoxConsRealizada.setEnabled(false);
            //BOTÃO FINALIZAR
            butFinalizar.setEnabled(false);
            butFinalizar.setVisible(false);
        } else {
            //TEXT AREA
            txtDescricao.setEnabled(true);
            //CHECK BOX
            cBoxConsRealizada.setSelected(false);
            cBoxConsRealizada.setEnabled(true);
            //BOTÃO FINALIZAR
            butFinalizar.setEnabled(true);
        }
    }

    //VERIFICA SE A CAIXA DE TEXTO FOI MARCADA OU NÃO
    private void setRealizada() {
        Consulta detalhesConsulta = ListaConsultas.Listar().get(posConsulta); //PEGA A LINHA QUE FOI SELECIONADA 
        if (cBoxConsRealizada.isSelected()) {
            detalhesConsulta.setconsRealizada("Sim");
            cBoxConsRealizada.setSelected(false);
        } else {
            detalhesConsulta.setconsRealizada("Não");
        }
    }

    //ESCREVE A RECEITA E CONECTA A CONSULTA
    private void setreceitaObs() {
        Consulta detalhesConsulta = ListaConsultas.Listar().get(posConsulta); //PEGA A LINHA QUE FOI SELECIONADA 
        detalhesConsulta.setreceitaObs(txtDescricao.getText());
    }

    //VERIFICA SE OS CAMPOS ESTÃO EM BRANCO
    private boolean camposVazios() {

        boolean empty = true;

        if (txtDescricao.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Você deve preencher o campo receita e observações.");
        } else {
            empty = false;
        }

        return empty;

    }

}
