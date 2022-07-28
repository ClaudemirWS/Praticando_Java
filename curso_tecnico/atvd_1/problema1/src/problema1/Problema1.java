/*
1. Com relação ao atendimento a eventos, o hotel necessita de uma funcionalidade que indique qual de seus 
dois auditórios é o mais adequado para um evento. O auditório Alfa conta com 150 lugares e espaço para até 
70 cadeiras adicionais. O auditório Beta conta com 350 lugares, sem espaço para mais cadeiras. Desenvolva 
um programa Java que receba o número de convidados do evento e faça uma verificação sobre a quantidade: 
se for maior que 350 ou se for menor que zero, mostre a mensagem “Número de convidados inválido”. 
Se o valor informado forválido, mostre na tela qual dos auditórios é o mais adequado. 
No caso do auditório Alfa, calcule ainda quantas cadeiras adicionais serão necessárias, observando o limite citado.
 */
package problema1;
/**
 * @author Claudemir Souza
 */

import java.util.Scanner;

public class Problema1 {

    public static void main(String[] args) {
        int convidados;
        
        //CRIA SCANNER
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("===== EVENTO NO HOTEL =====");
        System.out.print("Quantas pessoas serão convidadas: ");
        convidados = entrada.nextInt();
        
        //AUDITÓRIO ALFA
        if (convidados >= 1 && convidados <= 220)
        {
            System.out.println("Use o auditório ALFA.");
            if (convidados > 150)
            {
                System.out.println("Inclua mais " + (convidados - 150) + " cadeiras.");
            }
        }
        //AUDITÓRIO BETA
        else if (convidados > 220 && convidados <= 350)
        {
            System.out.println("Use o auditório BETA.");
        }
        else
        {
            System.out.println("Número de convidados inválido.");
        }
        
    }
    
}