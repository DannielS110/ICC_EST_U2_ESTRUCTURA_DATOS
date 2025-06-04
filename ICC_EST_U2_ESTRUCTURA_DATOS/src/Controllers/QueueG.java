package Controllers;

import java.util.LinkedList;

import Models.Persona;


public class QueueG<T> {
    private LinkedList<T> elements = new LinkedList<>();

    public void enqueue(T item) {
        elements.addLast(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        return elements.removeFirst();
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return elements.getFirst();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }
    

public void printCola() {
    System.out.print("Cola: ");
    for (T item : elements) {
        System.out.print(item + " ");
    }
    System.out.println();
}
public Persona findByName(String name) {
        for (T item : elements) {
            if (item instanceof Persona) {
                Persona persona = (Persona) item;
                if (persona.getNombre().equals(name)) {
                    return persona;
                }
            }
        }
        return null;
    }

public Persona deleteByName(String nombre) {
    for (int i = 0; i < elements.size(); i++) {
        T item = elements.get(i);
        if (item instanceof Persona) {
            Persona p = (Persona) item;
            if (p.getNombre().equals(nombre)) {
                elements.remove(i);
                return p;
            }
        }
    }
    return null;
}

}

