package com.solomka;

public class Main {

    public static void main(String[] args) {
        System.out.println("\tLinked List");
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        System.out.println("The list is empty " + (list.isEmpty() ? "Yes" : "No"));
        list.add(5, 0);
        list.addFirst(1);
        list.addLast(9);
        list.add(-2, 0);
        list.add(3, 3);
        list.display();
        System.out.println("First element was deleted " + list.removeFirst());
        System.out.println("Last element was deleted " + list.removeLast());
        list.display();
        System.out.println("0d element was deleted " + list.remove(0));
        System.out.println("1d element was deleted " + list.remove(1));
        list.display();
        System.out.println("The list is empty " + (list.isEmpty() ? "Yes" : "No"));

        System.out.println("\n\tQueue");
        MyQueue<String> queue = new MyQueue<>();
        System.out.println("The queue is empty " + (queue.isEmpty() ? "Yes" : "No"));
        queue.enqueue("First");
        queue.enqueue("Second");
        queue.enqueue("Third");
        queue.enqueue("Fourth");
        queue.display();
        System.out.println("The queue is empty " + (queue.isEmpty() ? "Yes" : "No"));
        System.out.println("Dequeue " + queue.dequeue());
        System.out.println("Dequeue " + queue.dequeue());
        System.out.println("Dequeue " + queue.dequeue());
        System.out.println("Dequeue " + queue.dequeue());
        System.out.println("Dequeue " + queue.dequeue());
        queue.display();

        System.out.println("\n\tStack");
        MyStack<String> stack = new MyStack<>();
        System.out.println("The stack is empty " + (stack.isEmpty() ? "Yes" : "No"));
        stack.push("Red");
        stack.push("Blue");
        stack.push("White");
        stack.push("Green");
        stack.display();
        System.out.println("Top element " + stack.top());
        System.out.println(stack.pop() + " was removed from stack");
        System.out.println(stack.pop() + " was removed from stack");
        System.out.println(stack.pop() + " was removed from stack");
        System.out.println(stack.pop() + " was removed from stack");
        stack.display();
    }
}
