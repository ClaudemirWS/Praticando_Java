package problema;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Problema {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe 1 - Antigos | 2 - Novos: ");
        byte opc = sc.nextByte();

        Modelo modelo = null;
        switch (opc) {
            case 1:
                modelo = new FabricaAntigos();
                break;
            case 2:
                modelo = new FabricaNovos();
                break;
        }

        SugestaoGame sugestao = new SugestaoGame(modelo);
        sugestao.gerar();

        System.out.println("Exercicio: " + sugestao.getGameEsporte().toString());
        System.out.println("Exercicio: " + sugestao.getGameRpg().toString());
    }
}
