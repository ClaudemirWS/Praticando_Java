package com.claudemir.cem_exercicios.reoeticao_faca_enquanto;

import javax.swing.JOptionPane;

/**
 * @author Claudemir
 */
public class Exercicio63 {

    public static void main(String[] args) {
        String prog;
        int n, soma = 0, menor = 0, qtd = 0, pares = 0;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
            //SOMA TODOS OS NÚMEROS
            soma += n;
            //ADICIONA UM NÚMERO A QUANTIDADE
            qtd += 1;
            //ARMAZENA O MENOR NÚMERO
            if (qtd == 0) {
                menor = n;
            } else if (n < menor) {
                menor = n;
            }
            //CONTA QUANTOS PARES EXISTEM
            if (n % 2 == 0) {
                pares += 1;
            }
            prog = JOptionPane.showInputDialog(null, "Deseja continuar? (S/N): ").strip().toUpperCase();
        } while (!prog.equals("N"));

        System.out.println(qtd + " números foram cadastrados.");
        System.out.println("A SOMA entre todos foi " + soma);
        System.out.println("O MENOR número foi o " + menor);
        System.out.println("A MÉDIA entre todos os números foi " + qtd / soma);
        System.out.println(pares + " números são PARES.");
    }
}
