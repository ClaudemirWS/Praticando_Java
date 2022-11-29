package com.claudemir.cem_exercicios.sequencias_basicas;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cig, anos, anos_em_dias, qtd_cig, dias_vida;
        System.out.println("===== TEMPO DE VIDA DE UM FUMANTE =====");
        System.out.print("Quantos cigarros você fumou por dia: ");
        cig = sc.nextInt();
        System.out.print("Por quantos anos: ");
        anos = sc.nextInt();
        //multiplicam-se os anos fumados por 365 para obter em dias
        anos_em_dias = anos * 365; 
        //quantidade de cigarros fumados por dia
        qtd_cig = anos_em_dias * cig; 
        //multiplica-se por 10 minutos e divide-se por 60 minutos
        //perde 10 minutos de vida a cada cigarro
        dias_vida = (qtd_cig * 10) / 1440;
        System.out.println("Você fumou por " + anos + " anos"
                + " e perdeu um total de " + dias_vida + " dias de vida.");
    }
}
