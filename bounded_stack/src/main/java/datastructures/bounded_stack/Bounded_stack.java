/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package datastructures.bounded_stack;

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

    public int size() {
        return numElements;
    }

    public boolean isEmpty() {
        //return first == null;
        return numElements == 0;
    }

    public Node peek() {
        if (numElements <= 0 || first == null) {
            throw new IndexOutOfBoundsException("No data");
        } else {

            return first;
        }

    }
    
  

    public void push(String value) {
        Node newNode = new Node(value);
        newNode.next = first;
        first = newNode;
        numElements++;
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
