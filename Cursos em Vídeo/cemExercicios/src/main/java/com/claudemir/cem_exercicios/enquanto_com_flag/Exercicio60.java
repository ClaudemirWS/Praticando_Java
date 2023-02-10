package com.claudemir.cem_exercicios.enquanto_com_flag;

import java.util.Scanner;

/**
 * @author Claudemir
 */
public class Exercicio60 {

    public static void main(String[] args) {
        String programa = "S";
        //COLETA DADOS
        String nome = "", idade = "", sexo = "", maisVelha = "", mulherJovem = "";
        int media = 0, pessoas = 0, homensTrinta = 0, mulheresDezoito = 0, idadeMaisVelha = 0, idadeMaisJovem = 0;
        while (programa.equals("S")) {
            Scanner sc = new Scanner(System.in);
            System.out.print("\nDigite o nome: ");
            nome = sc.nextLine().strip();
            System.out.print("Digite a idade: ");
            idade = sc.nextLine().strip();
            System.out.print("Digite o sexo (M/F): ");
            sexo = sc.nextLine().strip().toUpperCase();
            //VERIFICA SITUAÇÕES
            //NOME E IDADE DE MULHER MAIS VELHA
            if (sexo.equals("F") && Integer.parseInt(idade) > idadeMaisVelha) {
                maisVelha = nome;
                idadeMaisVelha = Integer.parseInt(idade);
            }
            //NOME E IDADE DE MULHER MAIS JOVEM
            if (sexo.equals("F")) {
                mulherJovem = nome;
                idadeMaisJovem = Integer.parseInt(idade);
            } 
            if (sexo.equals("F") && Integer.parseInt(idade) < idadeMaisJovem) {
                mulherJovem = nome;
                idadeMaisJovem = Integer.parseInt(idade);
            }
            //MEDIA DE IDADE DO GRUPO
            media += Integer.parseInt(idade);
            pessoas += 1;
            //QUANTOS HOMENS COM MAIS DE 30 ANOS
            if (sexo.equals("M") && Integer.parseInt(idade) > 30) {
                homensTrinta += 1;
            }
            //QUANTAS MULHERES TEM MENOS DE 18 ANOS
            if (sexo.equals("F") && Integer.parseInt(idade) < 18) {
                mulheresDezoito += 1;
            }
            //FIM DA REPETIÇÃO?
            System.out.print("Deseja continuar? (S/N): ");
            programa = sc.nextLine().strip().toUpperCase();
        }
        System.out.println("\nA mulher mais velha foi a " + maisVelha + " com seus " + idadeMaisVelha + " anos.");
        System.out.println("A mulher mais jovem foi a " + mulherJovem + " com seus " + idadeMaisJovem + " anos.");
        System.out.println("A média de idade entre todos do grupo foi: " + media/pessoas + ".");
        System.out.println(homensTrinta + " homens tem mais de 30 anos.");
        System.out.println(mulheresDezoito + " mulheres tem menos de 18 anos.");
    }
}
