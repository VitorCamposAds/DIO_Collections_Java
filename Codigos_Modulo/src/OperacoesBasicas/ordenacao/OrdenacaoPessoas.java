package OperacoesBasicas.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listaPessoas;
    private Comparator<Pessoa> comparadorAltura; // Atributo para armazenar o comparador de altura
    
    // Construtor
    public OrdenacaoPessoas() {
        this.listaPessoas = new ArrayList<>();
        this.comparadorAltura = new ComparadorAltura(); // Instancia o comparador de altura
    }
    
    // Método para adicionar uma pessoa à lista
    public void adicionarPessoa(String nome, int idade, double altura) {
        Pessoa novaPessoa = new Pessoa(nome, idade, altura);
        listaPessoas.add(novaPessoa);
    }

    // Método para ordenar a lista de pessoas por idade e retornar a lista ordenada
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoas); 
        Collections.sort(pessoasPorIdade); 
        return pessoasPorIdade;
    }

    // Método para ordenar a lista de pessoas por altura usando Comparator personalizado
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorAltura, comparadorAltura); // Utiliza o comparador de altura
        return pessoasPorAltura;
    }

    // Getter para acessar a lista de pessoas
    public List<Pessoa> getListaPessoas() {
        return listaPessoas;
    }
}
