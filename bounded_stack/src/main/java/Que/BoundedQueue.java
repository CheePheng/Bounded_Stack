/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Que;

import java.util.EmptyStackException;

/**
 *
 * @author D00216500
 */
public class BoundedQueue extends Queue {

    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;

    public BoundedQueue() {
        super();
        capacity = DEFAULT_CAPACITY;
    }

    public BoundedQueue(int capacity) {
        super();
        this.capacity = capacity;
    }

    public boolean isFull() {
        return size >= capacity;
    }

    @Override
    public boolean enque(int value) {
        if (isFull()) {
            throw new EmptyStackException();
        }
        return super.enque(value);
    }

}
