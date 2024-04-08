package com.example;

/**
 * Interfaz IPriorityQueue que define los métodos básicos que debe tener una cola de prioridad.
 *
 * @param <E> Tipo de elementos que se almacenarán en la cola de prioridad, deben ser comparables.
 */
public interface IPriorityQueue<E extends Comparable<E>> {
    public boolean isEmpty();
    public E remove();
    public void add(E paciente);
}
