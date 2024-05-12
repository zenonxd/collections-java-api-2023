package map.OperacoesBasicas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatos;

    public AgendaContatos() {
        this.contatos = new HashMap<>();
    }

    void adicionarContato(String nome, Integer telefone) {
        contatos.put(nome, telefone);
    }

    void removerContato(String nome) {
        if (!contatos.isEmpty()) {
            contatos.remove(nome);
        }
    }

    void exibirContatos() {
        System.out.println(contatos);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numberName = null;
        if (!contatos.isEmpty()) {
            numberName = contatos.get(nome);
        }
        return numberName;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 5665);
        agendaContatos.adicionarContato("Camila Cavalcante", 1111111);
        agendaContatos.adicionarContato("Camila DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria Silva");
        agendaContatos.exibirContatos();
    }
}
