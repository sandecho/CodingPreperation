public class LinkedList {

    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            this.next=null;
        }
    }

    private Node head;

    public LinkedList() {
        this.head=null;
    }

    public void addAtBegining(int data) {
        Node node = new Node(data);
        node.next=head;
        head=node;
    }

    public void addAtEnd(int data) {
        Node node = new Node(data);

        if(head==null) {
            head=node;
        } else {
            Node temp=head;
            while(temp.next!=null) {
                temp=temp.next;
            }
            temp.next=node;
        }
    }

    // Get length
    public int getLength() {
        int len=0;
        Node temp=head;
        while(temp!=null) {
            len++;
            temp=temp.next;
        }
        return len;
    }

    // Recursively get length
    public int getLength(Node temp) {
        if(temp==null)
            return 0;
        else
            return 1+ getLength(temp.next);
    }


    public void display() {
        if(head==null) {
            System.out.println("List is Empty");
        }
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data +" ---> ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.addAtBegining(3);
        list.addAtBegining(2);
        list.addAtBegining(1);
        list.addAtEnd(4);
        list.addAtEnd(6);
        list.display();
        System.out.println("The length is " + list.getLength());
        System.out.println("The length is " + list.getLength(list.head));

    }
}


