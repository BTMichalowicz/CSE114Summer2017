package lab09;









import java.util.EmptyStackException;

//Benjamin Michalowicz (SBU ID: 110982339)
//:ab 9 Part 2: Infinite Stack of Objects
public class StackOfObjects {

    private Object[] elements;
    private int size;
 
    

    private static final int DEFAULT = 2;

    public StackOfObjects() {
        this(StackOfObjects.DEFAULT);
    }

    public StackOfObjects(int size) {

        if (size < StackOfObjects.DEFAULT && size >= 0) {
            size = StackOfObjects.DEFAULT;
        } else if (size < 0) {
            System.out.println("Can't have a stack of a negative size. Goodbye.");
            throw new IllegalArgumentException();
        }
        this.elements = new Object[size];
        this.size = 0;
        
        

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void push(Object obj) {
        if (isFull()) {
            resize();
        }

        this.elements[size++] = obj;
        

       

    }

    public void resize() {
        Object[] large = new Object[elements.length * 2];

        System.arraycopy(elements, 0, large, 0, elements.length);

        elements = large;
       
    }

    public Object peek() {

        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return this.elements[size - 1];
    }

    public boolean isFull() {
        return (size==this.elements.length);
    }

    public Object pop() {

        if (isEmpty()) {
            throw new EmptyStackException();
        }
       return this.elements[--size];
        

        
    }

}
