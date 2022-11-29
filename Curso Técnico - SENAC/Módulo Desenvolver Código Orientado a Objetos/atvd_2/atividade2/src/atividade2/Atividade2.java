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

        //TRAJETÓRIA 1
        System.out.println("Trajetória 1: ");
        Trajetoria trajetoria1 = new Trajetoria();
        trajetoria1.criaPontos(pontos);
        trajetoria1.rotaPontos();

        //TRAJETÓRIA 2
        System.out.println("\nTrajetória 2: ");
        Trajetoria trajetoria2 = new Trajetoria();
        trajetoria2.criaPontos(pontos);
        trajetoria2.rotaPontos();

        //CHAMA O MÉTODO QUE REDIMENSIONA OS PONTOS PARA A MENOR TRAJETÓRIA 
        if (trajetoria1.total > trajetoria2.total) {
            System.out.println("\nTrajetória 2 Redimensionada: ");
            trajetoria2.redimensionaPontos();
        } else if (trajetoria2.total > trajetoria1.total) {
            System.out.println("\nTrajetória 1 Redimensionada: ");
            trajetoria1.redimensionaPontos();
        } else {
            System.out.println("As duas trajetórias são do mesmo tamanho.");
        }

    }

}
