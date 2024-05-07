package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    public List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public List<Tarefa> getTarefaList() {
        return tarefaList;
    }

    public void setTarefaList(List<Tarefa> tarefaList) {
        this.tarefaList = tarefaList;
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefaRemover);
    }

    public int obterTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println(listaTarefas.obterTotalTarefas());

        listaTarefas.adicionarTarefa("Tarefa 01");
        listaTarefas.adicionarTarefa("Tarefa 01");
        listaTarefas.adicionarTarefa("Tarefa 03");
        System.out.println(listaTarefas.obterTotalTarefas());

        listaTarefas.removerTarefa("Tarefa 01");
        System.out.println(listaTarefas.obterTotalTarefas());

        listaTarefas.obterDescricoesTarefas();
    }
}
