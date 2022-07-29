/*
Monte um algoritmo em que o usuário poderá cadastrar e pesquisar
hóspedes. O algoritmo deve oferecer um menu com três opções ao
usuário: 1- cadastrar; 2- pesquisar; 3- sair. A opção “cadastrar” deve
permitir que o usuário informe um nome de hóspede, gravando-o em
memória (máximo de 15 cadastros; caso atinja essa quantidade, o
programa deve mostrar “Máximo de cadastros atingido”). A opção
“pesquisar” deve permitir que o usuário informe um nome e, caso seja
encontrado um nome exatamente igual, mostre a mensagem “Hóspede
(nome) foi encontrado no índice (índice onde foi cadastrado)”. Se o nome
não foi encontrado, o programa deve mostrar “Hóspede não encontrado”.
O algoritmo deve permitir que o usuário realize essas operações repetidas
vezes, até que use a opção “3”, que encerra o algoritmo. 
*/
package problema4;
import java.util.Scanner;
/**
 * @author Claudemir Souza
 */
public class Problema4 {

    public static void main(String[] args) {
        
        //DECLARA VARIÁVEIS
        int prog = 0, indiceHospd = 0;
        String hospedes[] = new String [15]; 
        String nomeHospede, pesquisaHospd;
        
        //REPETIÇÃO DO PROGRAMA
        while (prog != 3)
        {
            //MENU PRINCIPAL
            if (prog == 0 || prog != 3)
            {
                Scanner entrada = new Scanner (System.in);
                System.out.println("\n ==========   MENU PRINCIPAL    ==========");
                System.out.print("1 - Cadastrar | 2 - Pesquisar | 3 - Sair: ");
                prog = entrada.nextInt();
            }            
            //CADASTRO DE HOSPEDES
            if (prog == 1)
            {
                if (indiceHospd != 14)
                {
                Scanner dados = new Scanner (System.in);
                System.out.print("Digite o nome do novo hóspede: ");
                nomeHospede = dados.nextLine().strip();
                hospedes[indiceHospd] = nomeHospede;
                indiceHospd += 1; //SOMA O NOVO HOSPEDE AO TOTAL
                }
                else if (indiceHospd > 14) 
                {
                    System.out.println("Máximo de cadastros atingido.");
                }
                prog = 0; //RETORNA AO MENU
            }
            //PESQUISA HOSPEDES
            else if (prog == 2)
            {   
                Scanner pesquisa = new Scanner (System.in);
                System.out.print("Pesquise o nome do hóspede: ");
                pesquisaHospd = pesquisa.nextLine().strip();
                for (int i = 0; i <= 14; i++)
                {
                    //FAZ O TRATAMENTO EM CASO DE POSIÇÕES NULL NO VETOR
                    if (hospedes[i] != null && hospedes[i].equals(pesquisaHospd))
                    {   
                        System.out.println("Hóspede " + hospedes[i] + " foi encontrado no índice [" + i + "].");
                    }
                    
                    //WORK IN PROGRESS
                }
                prog = 0; //RETORNA AO MENU
            }
        }
    }
}