package com.solomka;

public class DoublyLinkedList<E> {
    private static class Node<E> {
        public E data;
        public Node<E> next;
        public Node<E> prev;
    }

    private Node<E> first;
    private Node<E> last;
    private int size;

    public void addFirst(E element) {
        Node<E> node = new Node<>();
        node.data = element;
        if (isEmpty()) {
            this.first = node;
            this.last = node;
            this.size++;
            return;
        }
        this.first.prev = node;
        node.next = this.first;
        this.first = node;
        this.size++;
    }

    public void addLast(E element) {
        Node<E> node = new Node<>();
        node.data = element;
        if (isEmpty()) {
            this.first = node;
            this.last = node;
            this.size++;
            return;
        }
        this.last.next = node;
        node.prev = this.last;
        this.last = node;
        this.size++;
    }

    public void add(E element, int index) {
        Node<E> current = this.first;
        for (int i = 0; i < index; i++) {
            if (current.next != null) {
                current = current.next;
            } else {
                System.out.println("There is no such position");
                return;
            }
        }
        if (current == null || current == this.first) {
            addFirst(element);
            return;
        }
        Node<E> node = new Node<>();
        node.data = element;
        node.next = current;
        current.prev.next = node;
        node.prev = current.prev;
        current.prev = node;
        this.size++;
    }

    public E removeFirst() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return null;
        }
        E temp = this.first.data;
        if (this.first == this.last) {
            this.first = null;
            this.last = null;
            this.size--;
            return temp;
        }
        this.first.next.prev = null;
        this.first = this.first.next;
        this.size--;
        return temp;
    }

    public E removeLast() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return null;
        }
        E temp = this.last.data;
        if (this.first == this.last) {
            this.first = null;
            this.last = null;
            this.size--;
            return temp;
        }
        this.last.prev.next = null;
        this.last = this.last.prev;
        this.size--;
        return temp;
    }

    public E remove(int index) {
        if (isEmpty()) {
            System.out.println("List is empty");
            return null;
        }
        Node<E> current = this.first;
        for (int i = 0; i < index; i++) {
            if (current.next != null) {
                current = current.next;
            } else {
                System.out.println("There is no such position");
                return null;
            }
        }
        if (current == this.first) {
            return removeFirst();
        }
        if (current == this.last) {
            return removeLast();
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        this.size--;
        return current.data;
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public int size() {
        return this.size;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Node<E> current = this.first;
        System.out.print("Size = " + this.size+" [");
        while (current != null) {
            System.out.print(current.data + " | ");
            current = current.next;
        }
        System.out.println();
    }
}
