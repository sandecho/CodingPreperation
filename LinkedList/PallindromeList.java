
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

    private void setHead(Node node) {
        this.head=node;
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

        Node curr=node;
        Node prev=null;
        Node next=node.next;

        while(next!=null) {
            curr.next=prev;
            prev=curr;
            curr=next;
            next=next.next;
        }
        curr.next=prev;
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

    public Node getMidNode(Node node) {
        Node temp1=node;
        Node temp2=node;

        if(temp1==null || temp1.next==null) {
            return temp1;
        }

        while(temp2!=null && temp2.next!=null) {
            temp1=temp1.next;
            temp2=temp2.next.next;
        }

        return temp1;
    }



    public static void main(String args[]) {
        PallindromeList list = new PallindromeList();

        //  list.addAtBegining(6);
        list.addAtBegining(5);
        list.addAtBegining(4);
        list.addAtBegining(3);
        list.addAtBegining(2);
        list.addAtBegining(1);
        System.out.println("Displaying Original List");
        list.display();

        Node node = list.reverseList(list.getHead());
        list.setHead(node);
        System.out.println("Displaying Reverse List");
        list.display();

        Node head= list.getHead();
        list.display(head);
        Node mid= list.getMidNode(head);
        System.out.println("Displaying from Mid Node");
        list.display(mid);
        mid = list.reverseList(mid);
        System.out.println("Displaying Half List from start");
        list.display(head);
        list.display(mid);


    }
}


