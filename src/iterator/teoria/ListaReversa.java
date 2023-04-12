package iterator.teoria;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaReversa extends AbstractList {
    private ArrayList lista = new ArrayList<>();
    @Override
    public Iterator iterator() {
        return new IteratorReverso(this);
    }
    @Override
    public void appent(Object o) {
        lista.add(o);
    }
    @Override
    public int size() {
        return lista.size();
    }
    @Override
    public Object get(int i) {
        return lista.get(i);
    }
}
