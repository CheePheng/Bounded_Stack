/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

import java.util.EmptyStackException;

/**
 *
 * @author D00216500
 */
public class Stack {

    private static final int INITIAL_CAPACITY = 10;
    private int capacity;
    private Node first;
    private int numElements;

    public Stack() {
        first = null;
        numElements = 0;
        capacity = INITIAL_CAPACITY;
    }

    public Stack(int capacity) {
        first = null;
        numElements = 0;
        this.capacity = capacity;
    }

    public int count() {
        return numElements;
    }

    public boolean isEmpty() {
        //return first == null;
        return numElements == 0;
    }

    //peek mean looking at the first/ top of the stack
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return first.data;
        }

    }
//push mean addfirst

    public boolean push(int value) {
        if(isFull()){
            throw new StackFullException("No space avaible in stack.");
        }
        Node newNode = new Node(value);
        if (first == null) {
            first = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
        numElements++;
        return true;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            int original = first.data;
            first = first.next;
            numElements--;
            return original;
        }
    }

    public boolean isFull() {
        return numElements < capacity;
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
