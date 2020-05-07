public class Stack {

    public static void main(String args[]){
        ArrayStack stack = new ArrayStack(10);

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
