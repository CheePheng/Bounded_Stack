/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package priorityQue;

import java.util.NoSuchElementException;

/**
 *
 * @author D00216500
 */
public class Queue extends LinkedList {

    public int remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return super.remove(0);
    }

    public Integer peek() {
        if (isEmpty()) {
            return null;
        } else {
            return super.get(0);
        }
    }

    public void empty() {
        super.clear();
    }

    @Override
    public boolean add(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else if (value > first.data) {
            first.next = newNode;
            first = newNode;
        } else if (value < last.data) {
            last.next = newNode;
            last = newNode;
        } else {
            Node current = first.next;
            Node previous = first;

            while (current.data >= value) {
                previous = current;
                current = current.next;
            }
            previous.next = newNode;
            newNode.next = current;
            size++;

        }
        return true;
    }

    @Override
    public boolean add(int value, int pos) {
        throw new UnsupportedOperationException("Method not available for queues");
    }

}
