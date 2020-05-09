package stack;

import stack.Employee;
import stack.LinkedStack;

public class Stack {

    public static void main(String args[]){
       /* stack.ArrayStack stack = new stack.ArrayStack(10);

        stack.push(new stack.queue.Employee("Jane","Jones",123));
        stack.push(new stack.queue.Employee("Jomes","Bond",456));
        stack.push(new stack.queue.Employee("William","Buyers",989));
        stack.push(new stack.queue.Employee("Money","Heist",2000));
        stack.push(new stack.queue.Employee("Mike","Tyson",4000));

       // stack.printStack();


        System.out.println("Popped: "+ stack.pop());
        System.out.println(stack.peek());*/



        LinkedStack stack = new LinkedStack();

        stack.push(new Employee("Jane","Jones",123));
        stack.push(new Employee("Jomes","Bond",456));
        stack.push(new Employee("William","Buyers",989));
        stack.push(new Employee("Money","Heist",2000));
        stack.push(new Employee("Mike","Tyson",4000));

        // stack.printStack();


        System.out.println("Popped: "+ stack.pop());
        System.out.println(stack.peek());


    }
}
