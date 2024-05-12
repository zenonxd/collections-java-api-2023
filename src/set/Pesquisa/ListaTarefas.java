package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        }
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public void contarTarefas() {
        System.out.println(tarefaSet.size());
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
            for (Tarefa t : tarefaSet) {
                if (t.isConcluida()) {
                    tarefasConcluidas.add(t);
                }
            }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefaPendente() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
            for (Tarefa t : tarefaSet) {
                if (!t.isConcluida()) {
                    tarefasPendentes.add(t);
                }
            }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {

        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaParaMarcarPendente = null;

        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaMarcarPendente = t;
                break;
            }
        }

        if (tarefaParaMarcarPendente != null) {
            if (tarefaParaMarcarPendente.isConcluida()) {
                tarefaParaMarcarPendente.setConcluida(false);
            }
            else {
                System.out.println("Tarefa não encontrada na lista.");
            }
        }
    }

    public void limparListaTarefas() {
        tarefaSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        //adicionando
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // exibindo tarefas
        listaTarefas.exibirTarefas();

        //removendo
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        //contagem
        listaTarefas.contarTarefas();

        //pendente
        System.out.println(listaTarefas.obterTarefaPendente());

        //marcando tarefas concluidas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        //obtendo concluidas
        listaTarefas.obterTarefasConcluidas();

        //marcando como pendente
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        //limpando a lista
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
