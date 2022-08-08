package javaio;

import java.io.*;

import java.util.List;

public class CriarArquivoTxt {

    public static void main(String[] args) {

        CriarArquivoTxt criarArquivoTxt = new CriarArquivoTxt();

        List<String> jogos = criarArquivoTxt.criarListaJogos();
        File file = criarArquivoTxt.criarArquivo("./MeuArquivo.txt");
        criarArquivoTxt.salvarListaNoArquivo(file, jogos);
    }

    public void salvarListaNoArquivo(File file, List<String> jogos) {

        try {
            FileWriter writer = new FileWriter(file);

            for (String jogo : jogos) {
                writer.write(jogo + "\n");
            }

            writer.flush();
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public List<String> criarListaJogos() {
        return List.of("Minecraft", "LOL", "FIFA");
    }

    public File criarArquivo(String caminhoNomeArquivo) {
        try {
            File file = new File(caminhoNomeArquivo);
            file.createNewFile();
            return file;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
