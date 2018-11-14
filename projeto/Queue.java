package projeto;

public interface Queue {

    public int size();

    public boolean isEmpty();

    public boolean isFull();

    public Object peek();

    public Object remove();

    public void add(Object f);

}