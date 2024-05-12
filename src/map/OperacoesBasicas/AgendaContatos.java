package map.OperacoesBasicas;

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
        contatos.remove(nome);
    }

    void exibirContatos() {
        System.out.println(contatos);
    }

    void pesquisarPorNome(String nome) {
        System.out.println(contatos.get(nome));
    }
}
