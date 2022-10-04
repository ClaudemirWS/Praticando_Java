package problema;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Problema {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Indicador de Exercicíos da Academia SenacFit =====");
        System.out.print("Categoria dos Exerícios: 1 - Musculação | 2 - Corrida: ");
        byte opc = sc.nextByte();

        Modelo modelo = null;
        switch (opc) {
            case 1:
                modelo = new Cat_Musculacao();
                break;
            case 2:
                modelo = new Cat_Corrida();
                break;
        }

        IndicacaoExercicio indicacao = new IndicacaoExercicio(modelo);
        indicacao.gerar();

        System.out.println("===== Indicações =====");
        System.out.println("Resistência: " + indicacao.getResistencia().toString());
        System.out.println("Velocidade: " + indicacao.getVelocidade().toString());
    }
}
