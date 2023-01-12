package arquivoCSV;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Claudemir
 */
public class gravarCSV {

    public static void main(String[] args) throws IOException {

        File obj = new File("C:\\exemplo.csv");
        FileWriter csvWriter = new FileWriter(obj);
        //criando as informações do cabeçalho
        csvWriter.append("disciplina");
        csvWriter.append(";");
        csvWriter.append("ano");
        csvWriter.append(";");
        csvWriter.append("horas");
        csvWriter.append("\n");

        // Armazenando as informações em um array de string
        List<List<String>> rows = Arrays.asList(
                Arrays.asList("Linguagem Java", "2022", "108"),
                Arrays.asList("Banco de Dados", "2021", "100"),
                Arrays.asList("Redes de computadores", "2023", "96")
        );

        //percorrendo a lista de dados
        for (List<String> rowData : rows) {
            csvWriter.append(String.join(";", rowData));
            csvWriter.append("\n");
        }

        //posicionando no final do arquivo
        csvWriter.flush();
        //fechando o arquivo
        csvWriter.close();

    }

}
