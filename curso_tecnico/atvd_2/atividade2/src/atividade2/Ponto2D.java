package atividade2;

/**
 * @author Claudemir Souza
 */
public class Ponto2D {

    double x, y;
    double distancia;

    //CONSTRUTOR DE PONTOS
    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //UTILIZA A FORMULA PARA CALCULAR E RETORNA A DISTÂNCIA DO OBJETO
    public double calculaDist(double xA, double yA, double xB, double yB) {

        distancia = Math.sqrt(Math.pow(xA - xB, 2) + Math.pow(yA - yB, 2));
        return distancia;
    }

    public void mostraDist(double xA, double yA, double xB, double yB, double dist) {
        System.out.println("(" + xA + "," + yA + ") " + "a (" + xB + "," + yB + ") "
                + "- Distância: " + String.format("%.1f", dist));
    }

    //MULTIPLICA COORDENADAS SEGUINDO A FÓRMULA E MOSTRA NA TELA NO FORMATO (X,Y)
    public void calculaMult(double k, double x, double y) {
        x *= k;
        y *= k;
    }

}