package com.solomka;

public class MyQueue<E> {
    private static class Node<E> {
        public E data;
        public Node<E> next;
    }

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public void enqueue(E element) {
        Node<E> node = new Node<>();
        node.data = element;
        if (isEmpty()) {
            this.head = node;
            this.tail = node;
            this.size++;
            return;
        }
        Node<E> oldTail = this.tail;
        this.tail = node;
        oldTail.next = node;
        this.size++;
    }

    public E dequeue() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return null;
        }
        E temp = this.head.data;
        this.head = this.head.next;
        this.size--;
        return temp;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int size() {
        return this.size;
    }

    public void display() {
        if (this.head == null) {
            System.out.println("Queue is empty");
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
