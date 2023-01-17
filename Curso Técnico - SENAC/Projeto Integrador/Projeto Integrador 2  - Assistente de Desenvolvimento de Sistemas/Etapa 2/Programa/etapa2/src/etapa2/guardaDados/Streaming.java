package etapa2.guardaDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Claudemir
 */
public class Streaming {

    //CRIA LISTA DE SERVIÇOS DE STREAMING 
    private List streaming = new ArrayList();

    //FUNCIONALIDADES DO PROGRAMA
    private int programa = 0;
    private String escolha = "";

    //SERÃO COLOCADOS EM UM COMBO BOX QUANDO HOUVER INTERFACE
    public void atualizaStreaming() {
        streaming.add("Netflix");
        streaming.add("Prime Vídeo");
        streaming.add("Disney+");
        streaming.add("Star+");
        streaming.add("HBO MAX");
        streaming.add("Apple TV");
        streaming.add("Paramount+");
    }

    //LISTA STREAMING E RETORNA VALOR ESCOLHIDO NO TECLADO
    public String getStreaming() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n===== SELECIONE UM SERVIÇO DE STREAMING =====");
        for (int i = 0; i < streaming.size(); i++) {
            System.out.println(i + " = " + streaming.get(i));
        }
        System.out.print("Sua escolha: ");
        programa = sc.nextInt();
        escolha = String.valueOf(streaming.get(programa));

        return escolha;
    }

}