package atividade4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Atividade4 {

    public static void main(String[] args) {

        //UTILIZEI O COLLECTION PARA CRIAR UMA LISTA ÚNICA COM OS IMPOSTOS
        Collection<String> impostos = new ArrayList();

        //MENU PRINCIPAL
        int programa = 0, imposto = 0;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("\t\t===== MENU PRINCIPAL =====");
            System.out.print("1 - Calcular Imposto | 2 - Listar Cálculos | 3 - Sair: ");
            programa = sc.nextInt();
            //ESCOLHER IMPOSTO PARA CÁLCULAR
            if (programa == 1) {
                Scanner nsc = new Scanner(System.in);
                System.out.println("\t\t===== MENU DE IMPOSTOS =====");
                System.out.println("Opções: 1 - PIS | 2 - Confins | 3 - ICMS | 4 - IPI");
                System.out.print("Sua opção: ");
                imposto = nsc.nextInt();
                if (imposto == 1) {
                    PIS pis = new PIS();
                    impostos.add(pis.retornaImposto());
                } else if (imposto == 2) {
                    Confins confins = new Confins();
                    impostos.add(confins.retornaImposto());
                } else if (imposto == 3) {
                    ICMS icms = new ICMS();
                    impostos.add(icms.retornaImposto());
                } else if (imposto == 4) {
                    IPI ipi = new IPI();
                    impostos.add(ipi.retornaImposto());
                } else {
                    System.out.println("Opção incorreta.");
                }
            } //LISTAR IMPOSTOS
            else if (programa == 2) {
                //PERCORRE TODOS OS ELEMENTOS DA COLEÇÃO 
                if (impostos.isEmpty()) {
                    System.out.println("A lista está vazia.");
                } else {
                    System.out.println("\t===== LISTA DE IMPOSTOS CALCULADOS =====");
                    for (String i : impostos) //UTILIZANDO LAÇO FOR EACH 
                    {
                        System.out.println(i);
                    }
                }

            } //SAIR DO PROGRAMA
            else if (programa == 3) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção incorreta.");
            }
        } while (programa != 3);

    }

}
