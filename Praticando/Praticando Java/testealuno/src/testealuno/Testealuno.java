package testealuno;

/**
 * @author Claudemir Souza
 */
public class Testealuno {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Celso Medeiros", 1, "00134578090", 23, 7.5, 6.5);

        aluno1.mostrarDados();
        System.out.println("Média do " + aluno1.nome + " : " + aluno1.calculaMedia());

    }

}
