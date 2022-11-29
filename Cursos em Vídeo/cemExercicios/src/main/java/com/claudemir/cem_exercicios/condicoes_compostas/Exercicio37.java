package com.claudemir.cem_exercicios.condicoes_compostas;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio37 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String salAtual, gen, anos;
        float salNovo = 0;
        System.out.println("===== AUMENTO SALARIAL =====");
        System.out.print("Digite o seu salário atual: ");
        salAtual = sc.nextLine().strip();
        System.out.print("Digite o seu gênero M ou F: ");
        gen = sc.nextLine().strip().toUpperCase();
        System.out.print("Digite há quantos anos você trabalha na empresa: ");
        anos = sc.nextLine().strip();

        //CONDIÇÕES DO PROGRAMA
        if (gen.equals("M")) {
            if (Integer.parseInt(anos) < 15) {
                salNovo = Float.parseFloat(salAtual) + (Float.parseFloat(salAtual) * 5 / 100);
            } else if (Integer.parseInt(anos) >= 15 && Integer.parseInt(anos) <= 20) {
                salNovo = Float.parseFloat(salAtual) + (Float.parseFloat(salAtual) * 12 / 100);
            } else if (Integer.parseInt(anos) > 20) {
                salNovo = Float.parseFloat(salAtual) + (Float.parseFloat(salAtual) * 23 / 100);
            }
        } else if (gen.equals("F")) {
            if (Integer.parseInt(anos) < 20) {
                salNovo = Float.parseFloat(salAtual) + (Float.parseFloat(salAtual) * 3 / 100);
            } else if (Integer.parseInt(anos) >= 20 && Integer.parseInt(anos) <= 30) {
                salNovo = Float.parseFloat(salAtual) + (Float.parseFloat(salAtual) * 13 / 100);
            } else if (Integer.parseInt(anos) > 30) {
                salNovo = Float.parseFloat(salAtual) + (Float.parseFloat(salAtual) * 25 / 100);
            }
        } else {
            System.out.println("Informações incorretas.");
        }

        System.out.println("Seu salário de R$ " + salAtual + " subiu para R$ " + salNovo);
    }
}
