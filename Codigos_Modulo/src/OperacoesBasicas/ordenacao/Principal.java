package OperacoesBasicas.ordenacao;

import java.util.List;

public class Principal {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacao = new OrdenacaoPessoas();
        
        // Adicionando algumas pessoas
        ordenacao.adicionarPessoa("João", 25, 1.75);
        ordenacao.adicionarPessoa("Maria", 30, 1.68);
        ordenacao.adicionarPessoa("José", 20, 1.80);
        
        // Imprimindo lista antes da ordenação
        System.out.println("Lista de pessoas antes da ordenação:");
        for (Pessoa pessoa : ordenacao.getListaPessoas()) {
            System.out.println("Nome: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade() + ", Altura: " + pessoa.getAltura());
        }
        
        // Ordenar por altura usando Comparator personalizado
        List<Pessoa> pessoasOrdenadasPorAltura = ordenacao.ordenarPorAltura();
        
        // Imprimindo lista após ordenação
        System.out.println("\nLista de pessoas após ordenação por altura:");
        for (Pessoa pessoa : pessoasOrdenadasPorAltura) {
            System.out.println("Nome: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade() + ", Altura: " + pessoa.getAltura());
        }
    }
}
