package iterator.facade.proxy;

// Named CustomIterator because Java already has an Iterator interface
public interface CustomIterator<T> {
    boolean hasNext();
    T next();
}
