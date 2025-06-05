package Controllers;

public class Stack {
    private Node top;

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            return next;
        }

        public int getValue() {
            return value;
        }
    }

public Stack() {
    this.top = null;
}   

public void push(int value) {
        Node newNode = new Node(value);
        newNode.setNext(top);
  
        top = newNode;
    
}

public int pop()
{
    if(top == null) {
        throw new IllegalStateException("");
    }
int value = top.getValue();
    top = top.getNext();
    return value;
}
public int peek() {
    if (top == null) {
        throw new IllegalStateException("Stack is empty");
    }
    return top.getValue();
}

public boolean isEmpty() {
    return top == null;

}
public void printStack() {
    Node current = top;
    while (current != null) {
        System.out.print(current.getValue() + " ");
        current = current.getNext();
    }
    System.out.println();
}
public int size() {
    int count = 0;
    Node current = top;
    while (current != null) {
        count++;
        current = current.getNext();
    }
    return count;
}
}