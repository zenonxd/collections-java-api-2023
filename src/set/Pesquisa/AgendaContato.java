package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    private Set<Contato> contatoSet;

    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisaPorNome(String nome) {
        Set<Contato> setPesquisaNome = new HashSet<>();
        if (!contatoSet.isEmpty()) {
            for (Contato c : contatoSet) {
                if (c.getNome().startsWith(nome)) {
                    setPesquisaNome.add(c);
                }
            }
        }
        return setPesquisaNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        if (!contatoSet.isEmpty()) {
            for (Contato c : contatoSet) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    c.setNumero(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
            return contatoAtualizado;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.exibirContatos();


        agendaContato.adicionarContato("João", 123456789);
        agendaContato.adicionarContato("Maria", 987654321);
        agendaContato.adicionarContato("Maria Fernandes", 55555555);
        agendaContato.adicionarContato("Ana", 88889999);
        agendaContato.adicionarContato("Fernando", 77778888);
        agendaContato.adicionarContato("Carolina", 55555555);

        agendaContato.exibirContatos();

        System.out.println(agendaContato.pesquisaPorNome("Maria"));

        Contato contatoAtualizado = agendaContato.atualizarNumeroContato("Fernando", 44443333);
        System.out.println("Contato atualizado: " + contatoAtualizado);

        agendaContato.exibirContatos();
    }
}
