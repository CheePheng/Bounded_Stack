/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Que;

import java.util.NoSuchElementException;

/**
 *
 * @author D00216500
 */
public class Queue {

    private Node first;
    private Node last;
    protected int size;

    public Queue() {
        first = null;
        size = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    //add to end of queue
    public boolean enque(int value) {

        Node newNode = new Node(value);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
        return true;

    }

    //remove from start of the que
    public int deque() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        int original = first.data;
        first = first.next;
        size--;
        return original;
    }

    //remove first element in que
    public String poll() {
        if (isEmpty()) {
            return null;
        }
        int original = first.data;
        first = first.next;
        size--;
        return "Removed Value : " + original;
    }

    public String peek() {
        if (isEmpty()) {
            return null;
        } else {
            return "First data " + first.data;
        }

    }

    public int size() {
        return size;
    }

    //get first element in que
    public int element() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return first.data;
    }

    private static class Node {

        private int data;
        private Node next;

        public Node(int value) {
            this.data = value;
            this.next = null;
        }

        public boolean hasNext() {
            return next != null;
        }

    }

}
