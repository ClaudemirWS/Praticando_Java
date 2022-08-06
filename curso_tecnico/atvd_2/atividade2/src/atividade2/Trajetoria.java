package atividade2;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Trajetoria {

    private String x, y;
    private Ponto2D ponto2d[];
    private double dist, novaDist, novoTotal;
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
        //RETORNA A DISTANCIA ENTRE OS PONTOS
        for (int i = 0; i < ponto2d.length - 1; i++) {
            //CALCULA A DISTÂNCIA
            dist = ponto2d[i].calculaDist(ponto2d[i].x, ponto2d[i].y, ponto2d[i + 1].x, ponto2d[i + 1].y);
            //MOSTRA AS COORDENADAS COM A DISTÂNCIA
            ponto2d[i].mostraDist(ponto2d[i].x, ponto2d[i].y, ponto2d[i + 1].x, ponto2d[i + 1].y, dist);
            //SOMA A DISTANCIA TOTAL
            total += dist;
        }
        //PRINTA A DISTÂNCIA TOTAL
        System.out.println("Distância Total = " + String.format("%.1f", total));
    }

    public void redimensionaPontos() {
        //É CHAMADA QUANDO O RESULTADO É O MENOR ENTRE AS TRAJETÓRIAS
        for (int i = 0; i < ponto2d.length - 1; i++) {

            //CALCULA A NOVA DISTANCIA
            novaDist = ponto2d[i].calculaDist(ponto2d[i].x = ponto2d[i].calculaMult(2, ponto2d[i].x)
                                            , ponto2d[i].y = ponto2d[i].calculaMult(2, ponto2d[i].y)
                                            , ponto2d[i + 1].x = ponto2d[i].calculaMult(2, ponto2d[i + 1].x)
                                            , ponto2d[i + 1].y = ponto2d[i].calculaMult(2, ponto2d[i + 1].y));
            //MOSTRA AS COORDENADAS COM A DISTÂNCIA
            ponto2d[i].mostraDist(ponto2d[i].x, ponto2d[i].y, ponto2d[i + 1].x, ponto2d[i + 1].y, novaDist);
            //CALCULA O NOVO TOTAL
            novoTotal += novaDist;
        }
        //PRINTA A DISTÂNCIA TOTAL
        System.out.println("Distância Total = " + String.format("%.1f", novoTotal));
    }

}
