package list.Ordenacao;

import java.util.Comparator;

public class Numeros implements Comparable<Numeros> {
    private int numero;

    public Numeros(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int compareTo(Numeros o) {
        return Integer.compare(numero, o.getNumero());
    }

    public int compareDesc(Numeros o) {
        return Integer.compare(numero, o.getNumero());
    }
}
