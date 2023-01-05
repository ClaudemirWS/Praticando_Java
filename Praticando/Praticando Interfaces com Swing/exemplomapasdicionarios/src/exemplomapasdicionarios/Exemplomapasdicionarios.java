package exemplomapasdicionarios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Claudemir
 */
public class Exemplomapasdicionarios {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //declarando o HashMap, com tipo String para chave e tipo Pessoa para valor
        Map<String, Pessoa> pessoas = new HashMap<String, Pessoa>();
        Pessoa p;

        //incluindo valores "Pessoa" no mapa
        p = new Pessoa("Maria Silva", 25);
        pessoas.put("854.093.660-79", p);
        p = new Pessoa("João Siqueira", 20);
        pessoas.put("750.005.080-18", p);

        //Pessoa, naturalmente, pode ser instanciado direto no parâmetro
        pessoas.put("196.761.060-68", new Pessoa("Antônio Sá", 45));

        //na inclusão abaixo fará substituição do valor anterior, já que usa a mesma chave
        pessoas.put("196.761.060-68", new Pessoa("Zeferino Querencia", 50));

        //mostrando na tela o mapa completo
        System.out.println("Mapa completo: ");
        Set<String> chaves = pessoas.keySet();
        for (String chave : chaves) {
            System.out.println(chave + " -> " + pessoas.get(chave).nome);
        }

        //realizando busca
        System.out.println("Digite um cpf: ");
        String cpfBusca = entrada.nextLine();
        if (pessoas.containsKey(cpfBusca)) {
            Pessoa resultado = pessoas.get(cpfBusca);
            System.out.println("Pessoa: " + resultado.nome + "; Idade: " + resultado.idade);
        } else {
            System.out.println("Não há registro de pessoa com este CPF");
        }

    }
    
}
