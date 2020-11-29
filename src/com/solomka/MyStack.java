package com.solomka;

public class MyStack<E> {
    private static class Node<E> {
        public E data;
        public Node<E> next;
    }

    private Node<E> head;
    private int size;

    public void push(E element) {
        Node<E> node = new Node<>();
        node.data = element;
        if (isEmpty()) {
            this.head = node;
            this.size++;
            return;
        }
        Node<E> oldHead = this.head;
        this.head = node;
        this.head.next = oldHead;
        this.size++;
    }

    public E pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        E temp = this.head.data;
        this.head = this.head.next;
        this.size--;
        return temp;
    }

    public E top() {
        return this.head.data;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int size() {
        return this.size;
    }

    public void display() {
        if (this.head == null) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Size = " + this.size+" [");
        Node<E> current = this.head;
        while (current != null) {
            System.out.print(current.data + " | ");
            current = current.next;
        }
        System.out.println();
    }
}
