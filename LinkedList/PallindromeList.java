/*
Function to check if a singly linked list is palindrome

*/

public class PallindromeList {

    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            this.next=null;
        }
    }

    private Node head;

    private Node getHead() {
        return this.head;
    }

    public PallindromeList() {
        this.head=null;
    }

    public void addAtBegining(int data) {
        Node node = new Node(data);
        node.next=head;
        head=node;
    }

    public void deleteAtBeg() {
        if(head!=null) {
            head=head.next;
        }
    }

    public void display() {
        if(head==null) {
            System.out.println("List is Empty");
        }
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data +" \t\t ");
            temp=temp.next;
        }
        System.out.println();
    }


    public Node reverseList(Node node) {

        if(node==null || node.next==null)
            return node;

        Node curr=head;
        Node prev=null;
        Node next=head.next;

        while(next!=null) {
            curr.next=prev;
            prev=curr;
            curr=next;
            next=next.next;
        }
        curr.next=prev;
        head=curr;
        return curr;
    }

    public void display(Node node) {
        if(node==null) {
            System.out.println("List is Empty");
        }
        Node temp=node;
        while(temp!=null) {
            System.out.print(temp.data +" \t\t ");
            temp=temp.next;
        }
        System.out.println();

    }


    public Node middleNode() {


        return null;
    }


    public static void main(String args[]) {
        PallindromeList list = new PallindromeList();
        list.addAtBegining(5);
        list.addAtBegining(4);
        list.addAtBegining(3);
        list.addAtBegining(2);
        list.addAtBegining(1);
        list.display();
        list.reverseList(list.getHead());
        list.display();


    }
}


