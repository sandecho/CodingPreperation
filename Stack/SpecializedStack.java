/*
A special stack with push, pop, peek and get minimum in O(1)
*/

public class SpecializedStack {

    private Stack stack1;

    private Stack stack2;

    public SpecializedStack() {

        stack1=new Stack();
        stack2=new Stack();

    }

    public void push(int data) {

        stack1.push(data);

        if(stack2.isEmpty()) {
            stack2.push(data);
        } else {
            int peek = stack2.peek();
            if( peek<data) {
                stack2.push(peek);
            } else {
                stack2.push(data);
            }
        }

    }

    public int pop() {

        stack2.pop();
        return stack1.pop();
    }

    public void display() {
        stack1.display();
    }

    public int peek() {
        return stack1.peek();
    }

    public int getMin() {
        return stack2.peek();
    }

    public static void main(String args[]) {

        SpecializedStack stack = new SpecializedStack();
        stack.push(1);
        stack.push(2);
        stack.push(-1);
        stack.push(4);
        stack.push(-5);
        stack.display();
        System.out.println("Minimum is "+ stack.getMin());
        stack.pop();
        stack.display();
        System.out.println("Minimum is "+ stack.getMin());
        stack.pop();
        stack.display();
        System.out.println("Minimum is "+ stack.getMin());
        stack.pop();
        stack.display();
        System.out.println("Minimum is "+ stack.getMin());

    }
}