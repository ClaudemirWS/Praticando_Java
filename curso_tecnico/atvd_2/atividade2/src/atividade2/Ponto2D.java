package atividade2;

/**
 * @author Claudemir Souza
 */
public class Ponto2D {
    double xA, yA, xB, yB;
    double distancia, novoxA, novoyA;
    
    //CONSTRUTOR QUE RECEBE AS COORDENADAS
    public Ponto2D(double xA, double yA, double xB, double yB)
    {
        this.xA = xA;
        this.yA = yA;
        this.xB = xB;
        this.yB = yB;
    }

    //UTILIZA A FORMULA PARA CALCULAR E RETORNA A DISTÂNCIA DO OBJETO
    public double calculaDist() {
        distancia = Math.sqrt(Math.pow(xB - xA, 2) + Math.pow(yB - yA, 2));
        return distancia;
    }

    //MULTIPLICA COORDENADAS SEGUINDO A FÓRMULA E MOSTRA NA TELA NO FORMATO (X,Y)
    public void calculaMult(double k) {
        novoxA = xA * k;
        novoyA = yA * k;
        System.out.println("Novas coordenadas: (" + novoxA + " , " + novoyA + ")");
    }

}
