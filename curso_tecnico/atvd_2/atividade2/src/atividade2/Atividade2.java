package atividade2;

/**
 * @author Claudemir Souza
 */
public class Atividade2 {

    public static void main(String[] args) {
        
        double a = 1.2, b = 4.35;

        //PEGA O VALOR ANTES E DEPOIS DO PONTO E CONVERTE PARA DOUBLE
        double xA = Double.parseDouble(String.valueOf(a).split("\\.")[0]); //ANTES DO PONTO
        double yA = Double.parseDouble(String.valueOf(a).split("\\.")[1]); //DEPOIS DO PONTO 
        double xB = Double.parseDouble(String.valueOf(b).split("\\.")[0]); //ANTES DO PONTO
        double yB = Double.parseDouble(String.valueOf(b).split("\\.")[1]); //DEPOIS DO PONTO
        
        System.out.println("Coordenadas: (" + xA + " , " + yA + ")");
        System.out.println("Coordenadas: (" + xB + " , " + yB + ")");

        //Ponto2D ponto2d = new Ponto2D(xA, yA, xB, yB);
        //double k = 2;

        //System.out.println("1.A: " + ponto2d.calculaDist());
        //ponto2d.calculaMult(k);
    }

}
