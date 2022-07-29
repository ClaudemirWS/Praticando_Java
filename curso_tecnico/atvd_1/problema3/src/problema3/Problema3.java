/*
3. Escreva um programa Java que receba o valor padrão de uma diária e,
em seguida, receba vários nomes de hóspedes e suas idades. Caso o
hóspede tenha idade menor que 4 anos, ele não paga hospedagem
(nesse caso, o programa deve mostrar na tela “(Nome do hóspede) possui
gratuidade”); mas, se o hóspede tiver mais de 80 anos, ele paga metade
(o programa deve mostrar na tela “(Nome do hóspede) paga meia”). O
usuário informará hóspedes até digitar a palavra “PARE”, que interrompe
a entrada de dados. Ao fim, o programa deve mostrar a quantidade de
gratuidades, a quantidade de meias hospedagens e o valor total,
considerando todos os hóspedes informados.
*/
package problema3;
import java.util.Scanner;
/**
 * @author Claudemir Souza
 */
public class Problema3 {
    public static void main(String[] args) {
        //DECLARAÇÃO DE VARIÁVEIS 
        String nome = "";
        float diaria, total = 0;
        int idade, grat = 0, meia = 0;
        //RECEBE VALOR DA DIÁRIA
        Scanner entrada = new Scanner(System.in);
        System.out.println("===== CALCULO DE DIÁRIA =====");
        System.out.print("Digite o valor padrão da diária: R$ ");
        diaria = entrada.nextFloat();
        //INICIA LAÇO DE REPETIÇÃO
        while (!nome.equals("PARE"))
        {
            //RECEBE DADOS DE HOSPEDES 
            Scanner dados = new Scanner(System.in);
            System.out.print("\nNome do hospede (Digite PARE para sair): ");
            nome = dados.nextLine().strip().toUpperCase();
            //AVALIA SE CONTINUA O PROGRAMA
            if(!nome.equals("PARE")) {
                System.out.print("Idade do(a) " + nome + ": ");
                idade = dados.nextInt();  
                //TOTALIZA DIARIA
                if (idade < 4)
                {
                    System.out.println(nome + " possui gratuidade.");
                    grat += 1;
                }
                else if (idade > 80)
                {
                    System.out.println(nome + " paga meia.");
                    meia += 1;
                    total += (diaria/2);
                }
                else
                {
                    total += diaria;
                }                  
            }          
        }        
        System.out.println("\nTotal de hospedagens: R$ " + total);
        System.out.println("Quantidade de meias: " + meia + ", Quantidade de gratuitas: " + grat + ".");
    }   
}