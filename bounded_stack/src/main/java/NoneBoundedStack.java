
import java.util.EmptyStackException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author D00216500
 */
public class NoneBoundedStack {
    protected Node first;
    protected int numElements;

    public NoneBoundedStack() {
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
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return first.data;
        }

    }
    
    public void printCelebrate(){
        System.out.println("Celebrate Time!");
    }
//push mean addfirst

    public boolean push(int value) {
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
