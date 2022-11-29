package com.claudemir.cem_exercicios.sequencias_basicas;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float preco;
        System.out.println("===== APLICANDO DESCONTO DE 5% =====");
        System.out.print("Digite o preco de um produto: R$ ");
        preco = sc.nextFloat();
        preco -= (preco*5/100);
        System.out.println("O produto com desconto de 5% ficou em: R$ " + preco);
    }
}
