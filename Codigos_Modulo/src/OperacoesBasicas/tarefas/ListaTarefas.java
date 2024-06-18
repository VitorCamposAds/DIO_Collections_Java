package OperacoesBasicas.tarefas;

import java.util.List;
import java.util.ArrayList;

public class ListaTarefas {
    // atributo
    private List<Tarefa> tarefaList;
    // lista vazia para adicionar elementos
    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }
    //implementando os métodos:

    //método de adicionar:
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }
    //método para remover:
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("Tarefa1");
        listaTarefas.adicionarTarefa("Tarefa1");
        listaTarefas.adicionarTarefa("Tarefa3");
        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("Tarefa1");
        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();
    }
}