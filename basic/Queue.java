package basic;

public interface Queue {
    boolean isEmpty();
    boolean isFull();
    void enqueue(int item);
    int dequeue();
    int peek();
    void clear();
}
