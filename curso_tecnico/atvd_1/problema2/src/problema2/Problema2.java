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
        
        String nome1, nome2;
        int idade1, idade2, maior = 0;
 
        Scanner entrada = new Scanner (System.in);
        //CLIENTE 1
        System.out.print("Nome do 1º Cliente:");
        nome1 = entrada.nextLine();
        System.out.print("Idade do 1º Cliente:");
        idade1 = entrada.nextInt();
        //CONTINUANDO PARA PRÓXIMA LEITURA
        entrada.nextLine(); 
        //CLIENTE 2
        System.out.print("Nome do 2º Cliente:");
        nome2 = entrada.nextLine();
        System.out.print("Idade do 2º Cliente:");
        idade2 = entrada.nextInt();
        entrada.close(); //FECHANDO O BUFFER DE ENTRADA
        
        //COMPARANDO DADOS 
        if (maior == 0)
        {
            maior = idade1;
        }
        if (idade2 > maior)
        {
            maior = idade2;
        }
        
        //MOSTRANDO NA TELA
        if (maior == idade1)
        {
            System.out.print("Quarto A: " + nome1);
            if (maior >= 60)
            {
                System.out.print(" com desconto de 40%; Quarto B " + nome2 + ".\n");
            }
            else
            {
                System.out.print("; Quarto B " + nome2 + ".\n");
            }
        }
        else if (maior == idade2)
        {
            System.out.print("Quarto A: " + nome2);
            if (maior >= 60)
            {
                System.out.print(" com desconto de 40%; Quarto B " + nome1 + ".\n");
            }
            else 
            {
                System.out.print("; Quarto B " + nome1 + ".\n");
            }
        }
            
    }
    
}