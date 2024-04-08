package com.example;

import java.util.Vector;

/**
 * Implementación de un Heap utilizando un Vector como estructura subyacente.
 *
 * @param <E> Tipo de elementos que se almacenarán en el Heap, deben ser comparables.
 */
public class VectorHeap<E extends Comparable<E>> implements IPriorityQueue<E>{

    protected Vector<E> data;// Vector que almacena los elementos del Heap

    /**
     * Constructor por defecto que inicializa el Vector.
     */
    public VectorHeap() {
        data = new Vector<>();
    }

    public VectorHeap(Vector<E> v) {
        int i;
        data = new Vector<>(v.size()); 
        for (i = 0; i < v.size(); i++) {
            add(v.get(i));
        }
    }

    //Calcula el índice del padre de un elemento en el Heap.
    protected static int parent(int i) {
        return (i - 1) / 2;
    }

    //Calcula el índice del hijo izquierdo de un elemento en el Heap.
    protected static int left(int i) {
        return 2 * i + 1;
    }

    //Calcula el índice del hijo derecho de un elemento en el Heap.
    protected static int right(int i) {
        return (2 * i + 1) + 1;
    }

    //Realiza el proceso de empujar hacia abajo (push down) el elemento en la raíz del Heap para mantener la propiedad de Heap.
    protected void pushDownRoot(int root) {
        int heapSize = data.size();
        E value = data.get(root);
        while (root < heapSize) {
            int childpos = left(root);
            if (childpos < heapSize) {
                if ((right(root) < heapSize) && ((data.get(childpos + 1)).compareTo(data.get(childpos)) < 0)) {
                    childpos++;
                }
                if ((data.get(childpos)).compareTo(value) < 0) {
                    data.set(root, data.get(childpos));
                    root = childpos;
                } else {
                    data.set(root, value);
                    return;
                }
            } else {
                data.set(root, value);
                return;
            }
        }
    }

    //Elimina y devuelve el elemento con la prioridad más alta del Heap.
    @Override
    public E remove() {
        if (data.size() == 0) {
            return null;
        }
        E minVal = data.get(0);
        data.set(0, data.get(data.size() - 1));
        data.setSize(data.size() - 1);
        if (data.size() > 1) {
            pushDownRoot(0);
        }
        return minVal;    
    }

    //Agrega un nuevo elemento al Heap y lo ordena para mantener la propiedad de Heap.
    @Override
    public void add(E paciente) {
        data.add(paciente);
        ordenar(data.size() -1);

    }
    
    //Método interno para ordenar un elemento en el Heap
    public void ordenar(int leaf) {
        int parent = parent(leaf);
        E value = data.get(leaf);
        while (leaf > 0 && value.compareTo(data.get(parent)) < 0) {
            data.set(leaf, data.get(parent));
            leaf = parent;
            parent = parent(leaf);
        }
        data.set(leaf, value);
    }

    //Verifica si el Heap está vacío.
    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

}
