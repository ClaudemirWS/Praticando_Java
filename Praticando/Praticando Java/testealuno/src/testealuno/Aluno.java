package testealuno;

/**
 * @author Claudemir Souza
 */
public class Aluno {

    String nome;
    int matricula;
    String cpf;
    int idade;
    double nota1, nota2, media;

    // O MÉTODO CONSTRUTOR SEMPRE FICARÁ ABAIXO DOS ATRIBUTOS DA CLASSE 
    public Aluno(String nome, int matricula, String cpf, int idade, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    //MÉTODO QUE MOSTRA OS DADOS
    public void mostrarDados() {
        System.out.println("Mostrar Aluno:");
        System.out.println("O Aluno se chama: " + nome);
        System.out.println("Matricula do " + nome + " : " + matricula);
        System.out.println("CPF do " + nome + " : " + cpf);
        System.out.println("Idade do " + nome + " : " + idade);
    }

    //MÉTODO PARA CALCULAR A MÉDIA
    public double calculaMedia() {
        media = (nota1 + nota2) / 2;
        return media;
    }
}
