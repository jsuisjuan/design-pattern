package iterator.teoria;

import java.util.Iterator;

public class IteratorReverso implements Iterator {
    private ListaReversa l;
    private int position;
    public IteratorReverso(ListaReversa l) {
        this.l = l;
        position = l.size();
    }
    @Override
    public boolean hasNext() {
        return position != 0;
    }
    @Override
    public Object next() {
        return l.get(--position);
    }  
}
