/*
2. Escreva um programa Java que faça a troca de quartos entre dois hóspedes. 
O programa deve receber o nome de um cliente e a idade dele (este cliente, a princípio, 
será hospedado no quarto A), depois receber o nome de outro cliente e a idade 
(este, se for mais jovem, ficará no quarto B, mas, se for mais velho que o primeiro cliente, 
ficará no quarto A e o primeiro cliente ficará no quarto B). Além disso, se a pessoa mais velha 
for idosa (tem 60 anos ou mais), ela terá desconto de 40%. O programa deve mostrar, ao final, 
qual cliente ficou no quarto A e o desconto, se houver, e qual ficou no quarto B.
 */
package problema2;
/**
 * @author Claudemir Souza
 */
import java.util.Scanner;

public class Problema2 {

    public static void main(String[] args) {
        
        String nome, quartoA = "", quartoB = "";
        int idade, maior = 0;
 
        //REPETE ATÉ CUMPRIR OBJETIVO
        for (int i = 1; i <= 2; i++)
        {
            Scanner entrada = new Scanner (System.in);
            System.out.print("Nome do " + i + "º Cliente:");
            nome = entrada.nextLine();
            System.out.print("Idade do " + i + "º Cliente:");
            idade = entrada.nextInt();
        
            //COMPARANDO IDADES 
            if (maior == 0)
            {
                maior = idade;
                quartoA = nome;
            }
            else if (maior != 0 && idade > maior)
            {
                maior = idade;
                quartoB = quartoA; //TRANSFERE O ANTIGO CLIENTE PARA O B
                quartoA = nome; //PASSA O NOVO CLIENTE PARA O A
            }
        }
        //PRINTA RESULTADOS
        System.out.print("Quarto A: " + quartoA);
        if (maior >= 60)
        {
            System.out.print(" com desconto de 40%; Quarto B " + quartoB + ".\n");
        }
        else
        {
            System.out.print("; Quarto B " + quartoB + ".\n");
        }            
    }   
}