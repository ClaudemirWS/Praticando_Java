package atividade1.principal;

import javax.swing.JOptionPane;

/**
 * @author Claudemir Souza
 */
public class Principal {

    //DECLARAÇÃO DE VARIÁVEIS
    private String venda, mensagem, desconto;
    private double vendaValor;

    //RECEBE O VALOR DA VENDA
    public void getVenda(String venda) {
        this.venda = venda;
    }
    

    //VERIFICA A NECESSIDADE DE DESCONTO E FAZ O CÁLCULO
    public void calculaValor() {
        //CONVERTE VALOR PARA DOUBLE
        vendaValor = Double.parseDouble(venda);

        // VERIFICA DE A COMPRA SUPEROU R$ 500
        if (Double.parseDouble(venda) > 500) {
            desconto = JOptionPane.showInputDialog("Informe o percentual de desconto que será aplicado: ");
            vendaValor -= (vendaValor * Double.parseDouble(desconto)) / 100;
        }
    }

    //ENVIA MENSAGEM COM O VALOR
    public String mostraValor() {
        // MENSAGEM FINAL
        if (Double.parseDouble(venda) <= 500) {
            mensagem = ("Valor final: R$ " + vendaValor);
        } else {
            mensagem = ("Valor final com desconto de " + desconto + "% : R$ " + vendaValor);
        }
        return mensagem;
    }
}
