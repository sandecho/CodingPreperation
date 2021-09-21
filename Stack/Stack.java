public class Stack {

    private static final int MAX_SIZE=100;

    private int top;

    private int arr[];

    private int size;

    public Stack() {

        top=-1;
        size=0;
        arr = new int[MAX_SIZE];
    }

    public void push(int data) {

        if(size<MAX_SIZE) {
            arr[++top]=data;
            size++;
        } else {
            System.out.println("Stack is full");
        }
    }

    public int pop() {
        if(size==0) {
            System.out.println("Stack is Empty");
            return -1;
        }
        size--;
        return arr[top--];
    }

    public boolean isEmpty() {
        return size==0;
    }

    public int peek() {
        if(size==0) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    public int getSize() {
        return this.size;
    }

    public void display() {
        if(size==0) {
            System.out.println("Stack is Empty");
            return;
        } else {
            for(int i=0; i<size; i++) {
                System.out.print(arr[i]+"\t");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {

        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();
        System.out.println("Size is "+ stack.getSize());
        System.out.println("Peek is "+ stack.peek());
        System.out.println("Pop is "+ stack.pop());
        stack.display();
        System.out.println("Size is "+ stack.getSize());
    }
}