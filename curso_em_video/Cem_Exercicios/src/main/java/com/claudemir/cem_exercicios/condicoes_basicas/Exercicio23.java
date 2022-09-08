package com.claudemir.cem_exercicios.condicoes_basicas;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, sexo, valor;
        double desct;
        System.out.println("===== PROMOÇÃO DIA DA MULHER =====");
        System.out.print("Digite o seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite o seu sexo (M/F): ");
        sexo = sc.nextLine().strip().toUpperCase();
        System.out.print("Digite o valor de suas compras: R$ ");
        valor = sc.nextLine();
        desct = Double.parseDouble(valor);
        if (sexo.equals("F")) {
            desct -= (desct * 13) / 100;
            System.out.println(nome + " você recebeu um desconto de 13%, valor de suas compras R$ " + desct);
        } else if (sexo.equals("M")) {
            desct -= (desct * 5) / 100;
            System.out.println(nome + " você recebeu um desconto de 5%, valor de suas compras R$ " + desct);
        }

    }
}
