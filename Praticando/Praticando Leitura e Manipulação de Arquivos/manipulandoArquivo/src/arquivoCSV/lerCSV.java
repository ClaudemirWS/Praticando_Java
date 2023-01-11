package arquivoCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 * @author Claudemir
 */
public class lerCSV {

    public static void main(String[] args) {
        try {
            //criando uma lista para armazenar os dados
            List<List<String>> data = new ArrayList<>();

            //caminho de arquivo
            String file = "C:\\teste\\exemplo.csv";
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            //lendo linha a linha 
            String line = br.readLine();
            while (line != null) {
                //separando as informações através do metodo split dos dados 
                //delimitados em ponto e virgula
                List<String> lineData = Arrays.asList(line.split(";"));
                data.add(lineData);
                line = br.readLine();
            }

            //imprimindo os dados buscados
            for (List<String> list : data) {
                for (String str : list) {
                    System.out.print(str + " ");
                }
                System.out.println();
            }
            //fechando o arquivo
            br.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
