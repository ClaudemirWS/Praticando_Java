package etapa4.guardaDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Claudemir
 */
public class Genero {

    //CRIA LISTA DE GENEROS 
    private List genero = new ArrayList();

    //FUNCIONALIDADES DO PROGRAMA
    private int programa = 0;
    private String escolha = "";

    //CONSTUTOR
    public Genero() {
        //ATUALIZA LISTA DE GENEROS
        atualizaGenero();
    }

    //SERÃO COLOCADOS EM UM COMBO BOX QUANDO HOUVER INTERFACE
    private void atualizaGenero() {
        genero.add("Ação");
        genero.add("Aventura");
        genero.add("Animação");
        genero.add("Biografia");
        genero.add("Comédia");
        genero.add("Documentário");
        genero.add("Drama");
        genero.add("Esportes");
        genero.add("Fantasia");
        genero.add("Ficção Científica");
        genero.add("Músicais");
        genero.add("Policial");
        genero.add("Romance");
        genero.add("Suspense");
        genero.add("Terror");

    }

    //LISTA GENEROS E RETORNA VALOR ESCOLHIDO NO TECLADO
    public String getGenero() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("\n===== SELECIONE UM GÊNERO =====");
            for (int i = 0; i < genero.size(); i++) {
                System.out.println(i + " = " + genero.get(i));
            }
            System.out.print("Sua escolha: ");
            programa = sc.nextInt();
            escolha = String.valueOf(genero.get(programa));
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("\nSelecione uma das opções listadas.");
        } finally {
            System.out.print("\nSua escolha: ");
            programa = sc.nextInt();
            escolha = String.valueOf(genero.get(programa));
        }

        return escolha;
    }
}
