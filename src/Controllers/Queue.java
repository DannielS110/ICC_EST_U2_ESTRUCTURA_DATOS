package Controllers;

public class Queue {
    private Node primero;
    private Node ultimo;
    private int size; 

    public void add(int value) {
        if(isEmpty()) {
            primero = new Node(value);
            ultimo = primero;
        } else {
            ultimo.setNext(new Node(value));
            ultimo = ultimo.getNext();
        }
        size++; 
    }

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getValue() {
            return value;
        }
    }

    public boolean isEmpty() {
        return primero == null;
    }

    public int remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int value = primero.getValue();
        primero = primero.getNext();
        if (primero == null) {
            ultimo = null;
        }
        size--; 
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("Queue is empty");
        }
        return primero.getValue();
    }

        public int size() {
            return size;
        }
    }

