package lidandocomnumeros;

import javax.swing.JOptionPane;

/**
 * @author Claudemir
 */
public class LidandoComNumeros {

    public static void main(String[] args) {
        int n, totalNumeros = 0, par = 0, imp = 0, mais100 = 0, media = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número(0 para sair): "));
            //SOMA TOTAL DE NÚMEROS
            if (n > 0) {
                totalNumeros += 1;
                //CONTA QUANTOS SÃO MAIORES QUE CEM
                if (n > 100) {
                    mais100 += 1;
                }
                //CONTA OS NÚMEROS PARES
                if (n % 2 == 0) {
                    par += 1;
                }
                //CONTA OS NÚMEROS ÍMPARES
                if (n % 2 != 0) {
                    imp += 1;
                }
                //SOMA TODOS OS VALORES PARA DEPOIS GERAR UMA MÉDIA
                media += n;
            }
        } while (n != 0);
        //MOSTRA RESULTADO NA TELA
        JOptionPane.showMessageDialog(null, "------------- Resultado -------------"
                + "\nQuantidade de números: " + totalNumeros
                + "\nQunatidade acima de 100: " + mais100
                + "\nQuantidade de pares: " + par
                + "\nQuantidade de ímpares: " + imp
                + "\nMédia: " + media / totalNumeros);
    }

}
