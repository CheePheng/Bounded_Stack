/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package datastructures.bounded_stack;

import java.util.EmptyStackException;

/**
 *
 * @author D00216500
 */
public class Bounded_stack {

    private Node first;
    private int numElements;

    public Bounded_stack() {
        first = null;
        numElements = 0;
    }

    public int count() {
        return numElements;
    }

    public boolean isEmpty() {
        //return first == null;
        return numElements == 0;
    }

    //peek mean looking at the first/ top of the stack
    public String peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return first.data;
        }

    }
//push mena addfirst
    public boolean push(String value) {
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

    
    public String pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else{
       String original = first.data;
        first = first.next;
        numElements--;
        return original;
        }
    }



    private static class Node {

        private String data;
        private Node next;

        public Node(String value) {
            this.data = value;
            this.next = null;
        }

        public boolean hasNext() {
            return next != null;
        }

    }
}
