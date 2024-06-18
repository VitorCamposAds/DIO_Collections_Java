package OperacoesBasicas.ordenacao;

import java.util.Comparator;

public class ComparadorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa pessoa1, Pessoa pessoa2) {
        // Comparação por altura (em ordem decrescente, por exemplo)
        // Para ordem crescente, troque a ordem de pessoa2 e pessoa1
        return Double.compare(pessoa2.getAltura(), pessoa1.getAltura());
    }
}
