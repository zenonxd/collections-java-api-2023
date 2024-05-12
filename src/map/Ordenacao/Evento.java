package map.Ordenacao;

import java.time.LocalDate;
import java.util.StringJoiner;

public class Evento {
    private String nome;
    private String atracao;

    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAtracao() {
        return atracao;
    }

    public void setAtracao(String atracao) {
        this.atracao = atracao;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Evento.class.getSimpleName() + "[", "]")
                .add("nome='" + nome + "'")
                .add("atracao='" + atracao + "'")
                .toString();
    }
}
