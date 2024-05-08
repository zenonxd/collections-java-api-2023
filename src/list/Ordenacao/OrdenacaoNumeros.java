package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    public List<Integer> integerList;

    public OrdenacaoNumeros() {
        this.integerList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        integerList.add(numero);
    }

    public List<Integer> ordenarAsc() {
        List<Integer> listaAsc = integerList;
        if (!integerList.isEmpty()) {
            Collections.sort(listaAsc);
        }
        return listaAsc;
    }

    public List<Integer> ordenarDesc() {
        List<Integer> listaDesc = integerList;
        if (!integerList.isEmpty()) {
            Collections.reverse(listaDesc);
        }
        return listaDesc;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        System.out.println(numeros.ordenarDesc());
    }
}


