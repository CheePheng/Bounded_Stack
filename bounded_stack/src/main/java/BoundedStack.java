
import java.util.EmptyStackException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author D00216500
 */
public class BoundedStack extends NoneBoundedStack {

    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;

    public BoundedStack() {
        super();
        capacity = DEFAULT_CAPACITY;
    }

    public BoundedStack(int capacity) {
        super();
        this.capacity = capacity;
    }

    public boolean isFull() {
        return numElements >= capacity;
    }

    @Override
    public boolean push(int value) {
        if (isFull()) {
            throw new EmptyStackException();
        }
        return super.push(value);
    }
    
    @Override
    public void printCelebrate(){
        throw new UnsupportedOperationException("This feature is not avaible");
    }

}
