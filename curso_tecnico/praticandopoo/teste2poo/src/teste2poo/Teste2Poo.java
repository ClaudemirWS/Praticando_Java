package teste2poo;

/**
 * @author Claudemir Souza
 */
public class Teste2Poo {

    public static void main(String[] args) {
        Video v = new Video("Video generico", "Francisco da silva", 2022, 30);

        Filme f = new Filme("Aventura", "Sun Films", "Aventuras nos Alpes", "Joana da silva", 2000, 120);

        Episodio e = new Episodio("Tecnologias perigosas", "Joaquim da silva", 2021, 45, 5, 1);

        v.tocar();
        f.tocar();
        e.tocar();
        
        /*
        //REFERENCIANDO UM OBJETO DE UM TIPO DERIVADO PELO TIPO DE SUA SUPERCLASSE
        Video referencia1 = f;
        referencia1.tocar();

        Video referencia2 = new Episodio("Série clássica", "João da silva", 1980, 30, 2, 2);
        referencia2.tocar();
        */
    }

}
