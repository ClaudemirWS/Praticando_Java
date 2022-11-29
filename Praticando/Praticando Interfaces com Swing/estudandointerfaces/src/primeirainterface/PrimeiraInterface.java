package primeirainterface;

import javax.swing.JOptionPane;

/**
 * @author Claudemir
 */
public class PrimeiraInterface {

    public static void main(String[] args) {
        //Variáveis
        Double peso;
        Double altura;
        Double imc;
        String nome;
        String mensagem = "";

        //Janelas iniciais
        JOptionPane.showMessageDialog(null, "Olá\nVamos calcular a melhor dieta para você!!");
        nome = JOptionPane.showInputDialog("Digite seu nome:");
        peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso em Kg:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("informe sua altura em cm:"));

        // Cálculo
        imc = peso / (altura / 100 * altura / 100);
        if (imc < 18.5) {
            mensagem = nome + " você está muito magro.\nPrecisa de uma dieta para engordar";
        } else if (imc < 24.9) {
            mensagem = nome + " você está com peso ideal.\nNão precisa de dieta";
        } else if (imc < 29.9) {
            mensagem = nome + " você está com sobrepeso.\nPrecisa de uma dieta para emagrecer";
        } else if (imc < 30) {
            mensagem = nome + " você está com obesidade.\nPrecisa de uma dieta, exercicios e uma mudança de vida";
        } else {
            mensagem = nome + " você está com obesidade grave.\nPrecisa procurar um médico";
        }

        // Mensagem final
        JOptionPane.showMessageDialog(null, mensagem);
    }

}
