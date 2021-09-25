/*
Implementing two stack in one array
*/

public class TwoStack {


    private static final int MAX_SIZE=10;

    private int arr[];

    private int top1;

    private int top2;

    private int size1;

    private int size2;

    public TwoStack() {

        arr=new int[MAX_SIZE];
        top1=-1;
        top2=MAX_SIZE;
        size1=0;
        size2=0;

    }

    public void push1(int data) {

        if(top1+1<top2) {
            arr[++top1]=data;
            size1++;
        } else {
            System.out.println("No space left");
        }
    }

    public void push2(int data) {

        if(top1+1<top2) {
            arr[--top2]=data;
            size2++;
        } else {
            System.out.println("No space left");
        }
    }

    public int pop1() {

        if(size1>0) {
            size1--;
            return arr[top1--];
        }
        else {
            return -1;
        }
    }


    public int pop2() {

        if(size2>0) {
            size2--;
            return arr[top2++];
        }
        else {
            return -1;
        }
    }


    public void display() {

        for(int i=0; i<size1; i++) {
            System.out.print(arr[i]+"\t");
        }

        System.out.println();

        for(int i=MAX_SIZE-1; i>=MAX_SIZE-size2; i--) {
            System.out.print(arr[i]+"\t");
        }

        System.out.println();
    }



    public static void main(String args[]) {

        TwoStack stack = new TwoStack();

        stack.push1(1);
        stack.push1(2);
        stack.push1(3);
        stack.push1(4);
        stack.push1(5);
        stack.push1(6);
        stack.push2(7);
        stack.push2(8);
        stack.push2(9);
        stack.push2(10);

        stack.display();


        stack.push1(11);
        stack.push1(12);

        System.out.println("Pop 1 is "+  stack.pop1());
        stack.display();
        stack.push1(11);
        System.out.println("Pop 2 is "+  stack.pop2());
        stack.display();


    }
}