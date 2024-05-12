package map.Pesquisa;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produtos> produtosMap;

    public EstoqueProdutos() {
        this.produtosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        produtosMap.put(cod, new Produtos(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(produtosMap);
    }

    public Double calcularValorTotalEstoque() {
        double sum = 0.0;
        if (!produtosMap.isEmpty()) {
            for (Produtos p : produtosMap.values()) {
                sum += p.getPreco() * p.getQuantidade();
            }
        }
        return sum;
    }

    public Produtos obterProdutoMaisCaro() {
        Produtos produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!produtosMap.isEmpty()) {
            for (Produtos p : produtosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produtos obterProdutoMaisBarato() {
        Produtos produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!produtosMap.isEmpty()) {
            for (Produtos p : produtosMap.values()) {
                if (p.getPreco() < menorPreco) {
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produtos obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produtos maiorProduto = null;
        double maiorValorTotal = 0d;
        if (!produtosMap.isEmpty()) {
            for (Map.Entry<Long, Produtos> entry : produtosMap.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotal) {
                    maiorValorTotal = valorProdutoEmEstoque;
                    maiorProduto = entry.getValue();
                }
            }
        }
        return maiorProduto;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adicionarProduto(1L, "PRODUTO A", 10, 5.0);
        estoqueProdutos.adicionarProduto(2L, "PRODUTO B", 5, 10.0);
        estoqueProdutos.adicionarProduto( 3L, "PRODUTO C", 2, 15.0);
        estoqueProdutos.adicionarProduto( 8L, "PRODUTO D", 2, 20.0);

        estoqueProdutos.exibirProdutos();

        System.out.println(estoqueProdutos.calcularValorTotalEstoque());
    }
}
