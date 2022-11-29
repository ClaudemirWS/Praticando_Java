package atividade1;

import javax.swing.JOptionPane;

/**
 * @author Claudemir Souza
 */
public class Atividade1 {

    public static void main(String[] args) {
        //DECLARAÇÃO DE VARIÁVEIS
        String venda, mensagem, desconto;
        double vendaValor;

        //RECEBE VALORES
        JOptionPane.showMessageDialog(null, "Vamos iniciar o cálculo do valor da venda.");
        venda = JOptionPane.showInputDialog("Informe o valor da venda: ");

        //CONVERTE VALOR PARA DOUBLE
        vendaValor = Double.parseDouble(venda);

        // VERIFICA DE A COMPRA SUPEROU R$ 500
        if (Double.parseDouble(venda) > 500) {
            desconto = JOptionPane.showInputDialog("Informe o percentual de desconto que será aplicado: ");
            vendaValor -= (vendaValor * Double.parseDouble(desconto)) / 100;  
        } 
        
        mensagem = ("Valor da venda: R$ " + vendaValor);

        // MENSAGEM FINAL
        JOptionPane.showMessageDialog(null, mensagem);
    }

}