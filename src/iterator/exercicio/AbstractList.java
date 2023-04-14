package iterator.exercicio;

import java.util.ArrayList;

public abstract class AbstractList implements Iterable {
    public abstract void appent(int o);
    public abstract int size();
    public abstract int get(int i);
    public abstract void bubblesort(ListaOrdenada lista);
}
