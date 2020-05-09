package queue;

import stack.Employee;
import stack.LinkedStack;

public class Main {

    public static void main(String[] args){
        ArrayQueue quene = new ArrayQueue(10);

        quene.add(new queue.Employee("Jane","Jones",123));
        quene.add(new queue.Employee("Jomes","Bond",456));
        quene.add(new queue.Employee("William","Buyers",989));
        quene.add(new queue.Employee("Money","Heist",2000));
        quene.add(new queue.Employee("Mike","Tyson",4000));

        quene.printQueue();

        quene.remove();
        quene.remove();
        quene.printQueue();

    }
}
