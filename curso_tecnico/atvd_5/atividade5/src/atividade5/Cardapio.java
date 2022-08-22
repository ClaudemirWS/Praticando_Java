package atividade5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 * @author Claudemir Souza 
 */
public class Cardapio {

    protected Collection<String> listaPizzas = new ArrayList();
    protected Collection<String> listaBebidas = new ArrayList();
    protected String nomePizzaria;
    protected int programa = 0;

    public Cardapio() {

    }

    public void atualizaCardapio() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("\t\t\t===== ATUALIZA CARDÁPIO =====");
            System.out.print("1 - Nova Pizza | 2 - Nova Bebida | 3 - Voltar: ");
            programa = sc.nextInt();
            Scanner dados = new Scanner(System.in);
            if (programa == 1) {
                Pizza pizza = new Pizza();
                listaPizzas.add(pizza.getPizza());
            } else if (programa == 2) {
                Bebida bebida = new Bebida();
                listaBebidas.add(bebida.getBebida());
            } else if (programa == 3) {
                System.out.println("voltando...");
            } else {
                System.out.println("Opção incorreta.");
            }

        } while (programa != 3);
    }

    public void listaCardapio() {
        System.out.println("===== CARDAPIO ===== ");
        System.out.println("PIZZAS: ");
        for (String p : listaPizzas) //UTILIZANDO LAÇO FOR EACH 
        {
            System.out.println(p);
        }
        System.out.println("BEBIDAS: ");
        for (String b : listaBebidas) //UTILIZANDO LAÇO FOR EACH 
        {
            System.out.println(b);
        }
    }

}
