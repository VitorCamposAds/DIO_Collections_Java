package OperacoesBasicas.livro;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    // atributo
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;

    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {

        List<Livro> livrosPorIntervloAnos = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervloAnos.add(l);
                }
            }
        }
        return livrosPorIntervloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()) {
            for(Livro l :  livroList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro2", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro3", "Autor 3", 2022);
        catalogoLivros.adicionarLivro("Livro4", "Autor 4", 2010);

        // Pesquisar por livros no intervalo de anos 2010 a 2022
        List<Livro> livrosIntervalo = catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022);

        if (!livrosIntervalo.isEmpty()) {
            System.out.println("Livros encontrados no intervalo de anos 2010 a 2022:");
            for (Livro livro : livrosIntervalo) {
                System.out.println(livro); // Utiliza o método toString() da classe Livro de forma implícita
            }
        } else {
            System.out.println("Nenhum livro encontrado no intervalo de anos 2010 a 2022.");
        }

        // Pesquisar por livros do Autor "Autor 2"
        List<Livro> livrosAutor2 = catalogoLivros.pesquisarPorAutor("Autor 2");

        if (!livrosAutor2.isEmpty()) {
            System.out.println("\nLivros encontrados para o autor 'Autor 2':");
            for (Livro livro : livrosAutor2) {
                System.out.println(livro); // Utiliza o método toString() da classe Livro de forma implícita
            }
        } else {
            System.out.println("\nNenhum livro encontrado para o autor 'Autor 2'.");
        }

        // Pesquisar por livro com título específico
        String tituloPesquisa = "Livro3";
        Livro livroEncontrado = catalogoLivros.pesquisarPorTitulo(tituloPesquisa);
        
        if (livroEncontrado != null) {
            System.out.println("\nLivro encontrado com o título '" + tituloPesquisa + "':");
            System.out.println(livroEncontrado); // Utiliza o método toString() da classe Livro de forma implícita
        } else {
            System.out.println("\nNenhum livro encontrado com o título '" + tituloPesquisa + "'.");
        }
    }
}