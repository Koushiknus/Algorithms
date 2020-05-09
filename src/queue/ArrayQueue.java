package queue;

import java.util.NoSuchElementException;

public class ArrayQueue {
    private Employee[] quene;
    private int front;
    private int back;

    public ArrayQueue(int capacity){
        quene = new Employee[capacity];
    }

    public void add(Employee employee){
        if(back == quene.length){
            Employee[] newArray = new Employee[2*quene.length];
            System.arraycopy(quene,0,newArray,0,quene.length);
            quene = newArray;
        }

        quene[back] = employee;
        back++;
    }

    public Employee remove(){
        if(size() == 0){
            throw new NoSuchElementException();
        }
        Employee employee = quene[front];
        quene[front] = null;
        front++;
        if(size() == 0){
            front = 0;
            back = 0;
        }
        return employee;
    }

    public Employee peek(){
        if(size() == 0){
            throw new NoSuchElementException();
        }
        return quene[front];
    }

    public int size(){
        return back - front;
    }
    public void printQueue(){

        for(int i = front ; i< back;i++){
            System.out.println(quene[i]);
        }
    }
}
