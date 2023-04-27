package com.claudemir.cem_exercicios.vetores;

import java.util.Scanner;

/**
 * @author Claudemir
 */
public class Exercicio82 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[5];
        int nota, media = 0, acimaMedia = 0, maiorNota = 0;

        //PREENCHE NOTAS DOS ALUNOS E ARMAZENA OUTRAS VARIÁVEIS
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite a nota do " + (i + 1) + "º aluno: ");
            nota = sc.nextInt();
            vetor[i] = nota;
            //GUARDA PARA QUANTIFICAR A MÉDIA
            media += vetor[i];
            //VERIFICA SE ALUNOS ESTÃO ACIMA DA MÉDIA
            if (vetor[i] >= 7) {
                acimaMedia += 1;
            }
            //GUARDA A MAIOR NOTA
            if (i == 0) {
                maiorNota = vetor[i];
            } else if (vetor[i] > maiorNota) {
                maiorNota = vetor[i];
            }
        }

        //PRINTA RESULTADOS INICIAIS
        System.out.println("A média de todos os alunos foi " + (media / vetor.length));
        System.out.println("A quantidade de alunos acima da média foi " + acimaMedia);
        System.out.println("A maior nota dos alunos foi " + maiorNota);
        //PRINTA ALUNOS COM MAIOR NOTA
        System.out.print("Os alunos com a maior nota foram: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == maiorNota) {
                System.out.print((i + 1) + "º Aluno ");
            }
        }
    }
}
