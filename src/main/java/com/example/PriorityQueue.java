package com.example;

public interface PriorityQueue<E> {
    public boolean isEmpty();
    public E remove();
    public void add(E paciente);
    public void ordenar(int leaf);
}
