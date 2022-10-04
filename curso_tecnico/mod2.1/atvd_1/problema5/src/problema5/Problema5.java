/*
Monte um programa Java que mostre na tela em formato de tabela os
quartos ocupados e os desocupados. Considere que o hotel tem quatro
andares e três quartos por andar. Primeiro, o usuário registrará os quartos
ocupados, informando para cada ocupação o número do apartamento
(andares de 1 a 4 e números de quarto de 1 a 3). O programa deverá
questionar “Deseja informar outra ocupação? (S/N)” e o usuário poderá
informar quantos quartos quiser, até que responda “N” a essa pergunta.
Em seguida, o programa mostrará uma tabela, em que o primeiro andar é
o inferior e o último é o superior, marcando com X o quarto ocupado.
 */
package problema5;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Problema5 {

    public static void main(String[] args) {
        String[][] quartosAndar = new String[4][3]; //4 ANDARES E 3 QUARTOS
        int andar, quarto;
        String prog;

        System.out.println("===== OCUPAÇÃO DE QUARTOS =====");
        //PREENCHE TODOS OS QUARTOS COM VALORES VAZIOS
        for (int i = 0; i < quartosAndar.length; i++) {
            for (int j = 0; j < quartosAndar[i].length; j++) {
                quartosAndar[i][j] = " ";
            }
        }
        do {
            //RECEBE DADOS
            Scanner dados = new Scanner(System.in);
            System.out.print("Infome andar: ");
            andar = dados.nextInt();
            System.out.print("Informe o quarto: ");
            quarto = dados.nextInt();

            /*UTILIZEI O -1 PARA NÃO RECEBER UM QUARTO COMO NÚMERO 0 NA ENTRADA
            ASSIM AS POSIÇÕES NA MATRIZ IRÃO CORRESPONDER AOS NÚMEROS 0..1..2*/
            quartosAndar[andar - 1][quarto - 1] = "X";

            //REPETE O PROGRAMA ATÉ O USUÁRIO CANCELAR
            Scanner repete = new Scanner(System.in);
            System.out.print("Deseja informar outra ocupação? (S/N): ");
            prog = repete.nextLine().strip().toUpperCase();
        } while (prog.equals("S"));

        //PRINTA A MATRIZ NA TELA
        System.out.println("\nOcupação do hotel: ");
        for (int i = quartosAndar.length; i > 0; i--) //INVERTE OS ANDARES
        {
            System.out.print(+(i) + "º Andar ");
            for (int j = 0; j < quartosAndar[j].length; j++) {
                /*ADICIONEI -1 NO i PARA O ANDAR SER EXIBIDO CORRETAMENTE
                COM A CONTAGEM SENDO FIEL A ORDEM NA MATRIZ 3...2...1..0*/
                System.out.print("[" + quartosAndar[i - 1][j] + "]");
            }
            System.out.println();
        }
    }

}
