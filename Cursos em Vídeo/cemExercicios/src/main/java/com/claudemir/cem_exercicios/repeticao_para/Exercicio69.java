package com.claudemir.cem_exercicios.repeticao_para;

import java.util.Scanner;

/**
 * @author Claudemir
 */
public class Exercicio69 {
    public static void main(String[] args) {
        int termo, raz, pa;
        Scanner sc = new Scanner(System.in);
        System.out.println("===== 10 PRIMEIROS TERMOS DE UMA P.A =====");
        System.out.print("Digite o primerio termo de uma P.A: ");
        termo = sc.nextInt();
        System.out.print("Digite a razão da P.A: ");
        raz = sc.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.print(termo + " -> ");
            termo += raz;        
        }
        System.out.print("Fim");
    }
}
