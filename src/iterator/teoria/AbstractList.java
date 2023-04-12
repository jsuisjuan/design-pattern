package iterator.teoria;

public abstract class AbstractList implements Iterable {
    public abstract void appent(Object o);
    public abstract int size();
    public abstract Object get(int i);
}
