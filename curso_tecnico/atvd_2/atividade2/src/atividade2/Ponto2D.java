package atividade2;

/**
 * @author Claudemir Souza
 */
public class Ponto2D {

    private double distancia;
    public double x, y;
    
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

    //MOSTRA A ROTA ENTRE OS PONTOS E A DISTANCIA RESULTANTE
    public void mostraDist(int k , double xA, double yA, double xB, double yB, double dist) {
        System.out.println("(" + (xA*k) + "," + (yA*k) + ") " + "a (" + (xB*k) + "," + (yB*k) + ") "
                + "- Distância: " + String.format("%.1f", dist));
    }

    //REDIMENSIONA OS PONTOS
    public double redimensPontos(int k, double valor) {
        valor *= k;
        return valor;
    }

}
