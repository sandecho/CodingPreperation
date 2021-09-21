public class QueueUsingStack {

    private Stack stack1;

    private Stack stack2;

    public QueueUsingStack() {

        stack1 = new Stack();
        stack2= new Stack();
    }

    public void enqueue(int data) {
        stack1.push(data);
    }

    public int dequeue() {

        if(stack2.isEmpty()) {

            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    public void display() {
        stack1.display();
        stack2.display();
    }

    public static void main(String args[]) {

        QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.display();

        System.out.println("Dequeued " + queue.dequeue());
        queue.display();
    }
}