package liangintro.ch24_implstructures.examples.stack_queue;

public class GenericQueue<E> {
    private java.util.LinkedList<E> list
            = new java.util.LinkedList<E>();

    public void enqueue(E e) {
        list.addLast(e);
    }

    public E dequeue() {
        return list.removeFirst();
    }

    public int getSize() {
        return list.size();
    }

    @Override
    public String toString() {
        return "Queue: " + list.toString();
    }
}
