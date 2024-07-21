package Exercicio;

public interface IPilha<T> {
    public void push(int numero) throws Exception;
    public int pop() throws Exception;
    public boolean isEmpty();
    public int size() throws Exception;
    public int top() throws Exception;
}
