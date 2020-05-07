import java.util.EmptyStackException;

public class ArrayStack {

    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity){
        stack = new Employee[capacity];
    }

    public void push(Employee employee){
        // stack is full
        //Time complexity in this situation is O[n] as you are copying all the elements
        if(top == stack.length){
           // need to resize back array
           Employee[] newArray = new Employee[2*stack.length];
           //copy stack elements from 0 position to new Array starting from 0 position
           System.arraycopy(stack,0,newArray,0,stack.length);
           // Now assign the resized new Array to original one
           stack = newArray;
        }
        // If space is available , just insert it
        // Time Complexity is O[1] as you have space you dont bother
        stack[top++] = employee;
    }

    public Employee pop(){
       if(isEmpty()) {
           throw new EmptyStackException();
       }
       Employee employee = stack[--top];
       stack[top] = null;
       return employee;
    }

    public Employee peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){

        return top == 0;
    }

    public void printStack(){
        for(int i = top - 1 ; i>=0 ; i--){
            System.out.println(stack[i]);
        }
    }
}
