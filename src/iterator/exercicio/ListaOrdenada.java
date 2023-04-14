package iterator.exercicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaOrdenada extends AbstractList {
    private ArrayList lista = new ArrayList<>();
    private int index;
 
    @Override
    public Iterator iterator() {
        return new IteratorBuscaBinaria(this, index);
    }

    @Override
    public void appent(int o) {
        lista.add(o);
    }

    @Override
    public void bubblesort(ListaOrdenada arr) {  
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = arr.size() - 1; j > i; j--) {
                if ( (int) arr.get(j - 1) > (int)arr.get(j)) {
                    int tmp = (int) arr.get(j - 1);
                    ((List) arr).set(j -1, arr.get(j));
                    ((List) arr).set(j, tmp);
                }
             }
        }
    }
    
    @Override
    public int size() {
        return lista.size();
    }

    @Override
    public int get(int i) {
        return (int) lista.get(i);
    }
}
