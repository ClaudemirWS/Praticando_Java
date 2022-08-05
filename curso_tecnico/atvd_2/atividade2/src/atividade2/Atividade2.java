package atividade2;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Atividade2 {

    public static void main(String[] args) {
        
        //RECEBE QUANTIDADE DE PONTOS DA TRAJETORIA
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantidade de pontos para as Trajetórias: ");
        int pontos = entrada.nextInt();

        System.out.println("Trajetória 1: ");
        Trajetoria trajetoria1 = new Trajetoria();
        trajetoria1.rotaPontos(pontos);

        System.out.println("\nTrajetória 2: ");
        Trajetoria trajetoria2 = new Trajetoria();
        trajetoria2.rotaPontos(pontos);

        /*MULTIPLICA OS VALORES DA MENOR TRAJETORIA POR 2 */
        System.out.println("\nTrajetória Redimensionada: ");
        if (trajetoria1.resultado > trajetoria2.resultado) {
            
        } else if (trajetoria2.resultado > trajetoria1.resultado) {
            
        } else {
            System.out.println("As duas trajetórias são do mesmo tamanho.");
        }

    }

}
