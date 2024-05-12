package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionário {
    private Map<String, String> dicionario;

    public Dicionário() {
        this.dicionario = new HashMap<>();
    }

    void adicionarPalavra(String palavra, String definicao) {
        if (!dicionario.isEmpty()) {
            dicionario.put(palavra, definicao);
        }
    }

    void removerPalavra(String palavra) {
        if (!dicionario.isEmpty()) {
            dicionario.remove(palavra);
        }
    }

    void exibirPalavras() {
        System.out.println(dicionario);
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicao = dicionario.get(palavra);
        if (definicao != null) {
            return definicao;
        }
        return "Linguagem não encontrada no dicionário.";
    }

    public static void main(String[] args) {
        Dicionário dicionario = new Dicionário();

        // Adicionar palavras (linguagens de programação)
        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

        // Exibir todas as palavras
        dicionario.exibirPalavras();

        // Pesquisar palavras
        String definicaoJava = dicionario.pesquisarPorPalavra("java");
        System.out.println("Definição da linguagem 'java': " + definicaoJava);

        String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
        System.out.println(definicaoCSharp);

        // Remover uma palavra
        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras();
    }
}
