package projeto;

public interface Stack {

    public int size();

    public boolean isEmpty();

    public boolean isFull();

    public void push(Object e);

    public Object top();

    public Object pop();
}