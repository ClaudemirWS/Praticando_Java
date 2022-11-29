package testeempresa;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class TesteEmpresa {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Empresa novaEmpresa;

        novaEmpresa = new Empresa("XYZ S.A.", "13.522.667/0001-07", 3);

        Funcionario = new Funcionario("João", "Gerente", LocalDate.of(1980, 10, 10), 2000.5);

        novaEmpresa.gerente = joao;

        //o vetor "funcionarios" foi construído com três posições no construtor
        Empresa  = new Empresa.funcionarios[0] = joao;
        novaEmpresa.funcionarios[1] = new Funcionario("Maria", "Vendas", LocalDate.of(1990, 10, 15), 1500);
        novaEmpresa.funcionarios[2] = new Funcionario("Joaquim", "Vendedor", LocalDate.of(1997, 1, 30), 1500);

        //acessando recursos dos objetos associados a Empresa        
        System.out.println("A empresa " + novaEmpresa.nome
                + " conta com " + novaEmpresa.gerente.nome + " na gerência"
                + " e possui " + novaEmpresa.funcionarios.length + " funcionarios: ");

        //percorrendo o vetor “funcionarios" e acessando informações de cada objeto guardado nele
        for (int i = 0; i < novaEmpresa.funcionarios.length; i++) {
            System.out.println("\t" + novaEmpresa.funcionarios[i].nome + "(" + novaEmpresa.funcionarios[i].cargo + ")");
        }

    }

}
