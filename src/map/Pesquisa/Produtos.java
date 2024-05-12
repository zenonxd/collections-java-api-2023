package map.Pesquisa;

public class Produtos {
    private long cod;
    private String nome;
    private int quantidade;
    private double preco;

    public Produtos(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produtos{");
        sb.append("cod=").append(cod);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", quantidade=").append(quantidade);
        sb.append(", preco=").append(preco);
        sb.append('}');
        return sb.toString();
    }
}
