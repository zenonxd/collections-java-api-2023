package set.OperacaoBasica;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidados(String nome, int codigo) {
        convidadoSet.add(new Convidado(nome, codigo));
    }

    public void removerConvidadoConvite(int codigo) {
        Convidado removidos = null;

        if (!convidadoSet.isEmpty()) {
            for (Convidado c : convidadoSet) {
                if (c.getCodigo() == codigo) {
                    removidos = c;
                    break;
                }
            }
        }
        convidadoSet.remove(removidos);
    }

    public int contarConvidado() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println(conjuntoConvidados.contarConvidado());

        conjuntoConvidados.adicionarConvidados("Cvd1", 1234);
        conjuntoConvidados.adicionarConvidados("Cvd2", 1235);
        conjuntoConvidados.adicionarConvidados("Cvd3", 1235);
        conjuntoConvidados.adicionarConvidados("Cvd4", 1236);
        System.out.println(conjuntoConvidados.contarConvidado());

        conjuntoConvidados.removerConvidadoConvite(1234);
        System.out.println(conjuntoConvidados.contarConvidado());
    }
}
