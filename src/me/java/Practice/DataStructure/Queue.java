package me.java.Practice.DataStructure;
public interface Queue<E>{
    boolean isEmpty();

    boolean isFull();

    int size();

    E front();

    E rear();

    boolean offer(E item);
    E poll();

    E peek();
    void clear();
}
