package teste6poo;

/**
 * @author Claudemir Souza
 */
public class Teste6Poo {

    public static void main(String args[]) {
        Animal animal = new Animal();
        Animal cachorro = new Cachorro();
        Animal pato = new Pato();
        Animal gato = new Gato();
        
        animal.falar(); // "???" Padrão
        cachorro.falar(); // "Au au"
        pato.falar(); // "Quack"
        gato.falar(); // "Miau"
    }

}
