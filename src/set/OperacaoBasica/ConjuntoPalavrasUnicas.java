package set.OperacaoBasica;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> convidadoSet;

    public ConjuntoPalavrasUnicas() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        convidadoSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (convidadoSet.contains(palavra)) {
            convidadoSet.remove(palavra);
        }
    }

    public void verificarPalavra(String palavra) {
        Set<String> palavraVerif = convidadoSet;
        if (!convidadoSet.isEmpty()) {
            if (convidadoSet.contains(palavra)) {
                palavraVerif.add(palavra);
            }
        }
        System.out.println(palavraVerif);
    }

    public void exibirPalavrasUnicas() {
        System.out.println(convidadoSet);
    }
}
