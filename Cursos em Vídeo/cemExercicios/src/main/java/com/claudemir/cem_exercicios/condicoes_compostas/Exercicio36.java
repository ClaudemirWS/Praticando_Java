package com.claudemir.cem_exercicios.condicoes_compostas;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio36 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaAtivd, pontos = 0;
        float centFaturados = 0;
        System.out.println("===== VIDA SAUDÁVEL =====");
        System.out.print("Quantas horas você fez atividade fisica neste mês: ");
        horaAtivd = sc.nextInt();

        //CONDIÇÕES DO PROGRAMA 
        if (horaAtivd < 10)
        {
            pontos += horaAtivd * 2;
            centFaturados += pontos * 0.05;
        }
        else if (horaAtivd >= 10 || horaAtivd <= 20)
        {
            pontos += horaAtivd * 5;
            centFaturados += pontos * 0.05;
        }
        else if (horaAtivd > 20)
        {
            pontos += horaAtivd * 10;
            centFaturados += pontos * 0.05;
        }
        
        System.out.println("Você se exercitou por " + horaAtivd + " horas e \n"
        + "ganhou " + pontos + " pontos. Totalizando em R$ " + centFaturados);
    }
}
