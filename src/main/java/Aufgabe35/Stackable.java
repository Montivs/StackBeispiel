package Aufgabe35;

public interface Stackable<T> {
    String push(T data);
    T peek();
    T pop();
    boolean isEmplty();
    int size();
    void print();
    void clear();
}
