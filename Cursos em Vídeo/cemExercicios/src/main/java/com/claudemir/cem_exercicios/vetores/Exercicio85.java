package com.claudemir.cem_exercicios.vetores;

import java.util.Scanner;

/**
 * @author Claudemir
 */
public class Exercicio85 {

    public static void main(String[] args) {
        String nomes[] = new String[5];
        String sexos[] = new String[5];
        String salarios[] = new String[5];
        String nome, sexo, salario;
        Scanner sc = new Scanner(System.in);

        //PREENCHE VETORES COM DADOS
        System.out.print("===== DADOS DE PESSOAS =====");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("\n"+(i + 1) + "º pessoa | Nome: ");
            nome = sc.nextLine().strip();
            System.out.print((i + 1) + "º pessoa | Sexo(M/F): ");
            sexo = sc.nextLine().toUpperCase().strip();
            System.out.print((i + 1) + "º pessoa | Salário: ");
            salario = sc.nextLine().strip();

            nomes[i] = nome;
            sexos[i] = sexo;
            salarios[i] = salario;
        }

        //VERIFICA CONDIÇÃO PARA APRESENTAR DADOS NA TELA
        System.out.print("\n===== MULHERES QUE RECEBEM MAIS DO QUE R$ 5.000 =====");
        for (int i = 0; i < nomes.length; i++) {
            if (sexos[i].equals("F") && Float.parseFloat(salarios[i]) > 5000) {
                System.out.println("\nA " + nomes[i] + " recebe R$ " + salarios[i] + ".");
            }
        }
    }
}
