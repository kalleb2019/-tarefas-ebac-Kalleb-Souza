package Exercicio;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class ListaEncadeada<T> {
    private Node<T> head;
    private int size;

    public ListaEncadeada() {
        head = null;
        size = 0;
    }

    
    public void push(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        size++;
    }

    public T pop() throws Exception {
        if (head == null) {
            throw new IllegalStateException("A lista está vazia");
        }
        if (head.next == null) {
            Node<T> node = head;
            head = null;
            size--;
            return node.data;
        }
        Node<T> current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        Node<T> node = current.next;
        current.next = null;
        size--;
        return node.data;
    }

   
    public void insert(int index, T data) throws Exception {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Índice inválido.");
        }
        Node<T> node = new Node<>(data);
        if (index == 0) {
            node.next = head;
            head = node;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
        size++;
    }

    
    public void remove(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice inválido.");
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

  
    public T elementAt(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice inválido.");
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    
    public int size() {
        return size;
    }

    
    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}