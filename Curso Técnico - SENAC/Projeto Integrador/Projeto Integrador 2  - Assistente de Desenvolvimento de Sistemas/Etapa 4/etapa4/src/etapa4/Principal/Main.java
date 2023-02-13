package etapa4.Principal;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Main {

    public static void main(String[] args) {

        //FUNCIONALIDADES DO PROGRAMA 
        int programa = 0;
        CriaListas listas = new CriaListas();

        //INICIA REPETIÇÃO
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("\t\t===== MENU PRINCIPAL =====");
            System.out.print("1 - Adicionar novo | 2 - Lista Filmes | 3 - Lista Séries | 4 - Sair: ");
            programa = sc.nextInt();
            //ACESSO AO CLIENTE
            switch (programa) {
                case 1:
                    listas.atualizaListas(); //ATUALIZA AS LISTAS
                    break;
                case 2:
                    listas.listaFilmes();
                    break;
                case 3:
                    listas.listaSeries();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção incorreta.");
                    break;
            }

        } while (programa != 4);
    }

}