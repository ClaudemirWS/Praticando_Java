package atividade2;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Trajetoria {

    private String x, y;
    private Ponto2D ponto2d[];
    private double dist, novaDist, novoTotal;
    private double xA, yA, xB, yB;
    public double total;

    //CONSTRUTOR DE TRAJETÓRIAS
    public Trajetoria() {

    }

    public void criaPontos(int pontos) {
        ponto2d = new Ponto2D[pontos];
        //PREENCHE A LISTA DE PONTOS
        for (int i = 0; i < pontos; i++) {
            Scanner dados = new Scanner(System.in);
            System.out.print("Digite a coordenada X do ponto " + (i + 1) + ": ");
            x = dados.nextLine();
            System.out.print("Digite a coordenada Y do ponto " + (i + 1) + ": ");
            y = dados.nextLine();
            ponto2d[i] = new Ponto2D(Double.parseDouble(x), Double.parseDouble(y));
        }
    }

    public void rotaPontos() {
        System.out.println("");
        for (int i = 0; i < ponto2d.length - 1; i++) {
            //DECIDI ATRIBUIR OS VALORES A VARIÁVEIS PARA MELHORAR A LEITURA DO PROGRAMA
            xA = ponto2d[i].x;
            yA = ponto2d[i].y;
            xB = ponto2d[i + 1].x;
            yB = ponto2d[i + 1].y;
            //CALCULA A DISTÂNCIA
            dist = ponto2d[i].calculaDist(xA, yA, xB, yB);
            //MOSTRA AS COORDENADAS COM A DISTÂNCIA
            ponto2d[i].mostraDist(1, xA, yA, xB, yB, dist); //VALOR PADRÃO 1 PARA CALCULO DE DISTANCIA SEM REDIMENSIONAR
            //SOMA A DISTANCIA TOTAL
            total += dist;
        }
        //PRINTA A DISTÂNCIA TOTAL
        System.out.println("Distância Total = " + String.format("%.1f", total));
    }

    //VAI MULTIPLICAR OS VALORES LIDOS POR 2 CONFORME SOLICITADO
    public void redimensionaPontos() {
        for (int i = 0; i < ponto2d.length - 1; i++) {
            //DECIDI ATRIBUIR OS VALORES A VARIÁVEIS PARA MELHORAR A LEITURA DO PROGRAMA
            xA = ponto2d[i].x;
            yA = ponto2d[i].y;
            xB = ponto2d[i + 1].x;
            yB = ponto2d[i + 1].y;
            //CALCULA A NOVA DISTANCIA
            novaDist = ponto2d[i].calculaDist(ponto2d[i].redimensPontos(2, xA), ponto2d[i].redimensPontos(2, yA),
                    ponto2d[i].redimensPontos(2, xB), ponto2d[i].redimensPontos(2, yB));
            //MOSTRA AS COORDENADAS COM A DISTÂNCIA
            ponto2d[i].mostraDist(2, xA, yA, xB, yB, novaDist); //2 É O NÚMERO DE VEZES QUE OS PONTOS FORAM REDIMENSIONADOS
            //CALCULA O NOVO TOTAL
            novoTotal += novaDist;
        }
        //PRINTA A DISTÂNCIA TOTAL
        System.out.println("Distância Total = " + String.format("%.1f", novoTotal));
    }

}
