package iterator.exercicio;

import java.util.Iterator;

public class IteratorBuscaBinaria implements Iterator {
    private ListaOrdenada lista;
    private int posicao;
    private int resultado;

    public IteratorBuscaBinaria(ListaOrdenada listaOrdenada, int index) {
        this.lista = listaOrdenada;
        posicao = 1;
        resultado = buscaBinaria(lista, index);
    }

    @Override
    public boolean hasNext() {
        return posicao != 0;
    }

    @Override
    public Object next() {
        return lista.get(posicao++);
    }

    int buscaBinaria(ListaOrdenada arr, int x) {
        int left = 0, right = arr.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) == x) {
                return mid;
            }
            if (arr.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
