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

    public void deleteAtBeg() {
        if(head!=null) {
            head=head.next;
        }
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

    public void deleteAtEnd() {
        Node temp=head;
        if(temp==null)
            return;

        if(temp.next==null) {
            head=null;
            return;
        }

        while(temp.next.next!=null) {
            temp=temp.next;
        }
        temp.next=null;
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

    // To delete linkedlist
    public void deleteList() {
        head=null;
    }

    // Search an element
    public boolean search(int val) {
        if(head==null)
            return false;

        boolean flag=false;
        Node temp=head;
        do {
            if(temp.data==val) {
                flag=true;
            } else {
                temp=temp.next;
            }
        } while(!flag && (temp!=null));

        return flag;
    }

    // Search an element
    public boolean search(int val, Node temp) {
        if(temp==null)
            return false;

        if(temp.data==val)
            return true;

        return search(val, temp.next);

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

    // Finding Nth Node from End
    public int nNodefromEnd(int n) {

        Node temp1=head;
        Node temp2=head;

        if(head==null) {
            System.out.println("Empty List");
        }

        int i=0;
        while(temp1!=null && i<n) {
            temp1=temp1.next;
            i++;
        }


        while(temp1!=null) {
            temp1=temp1.next;
            temp2=temp2.next;
        }


        return temp2.data;
    }

    // Finding Middle Node

    public int middleNode() {
        Node temp1=head;
        Node temp2=head;

        if(head==null)
            return -1;

        if(head.next==null)
            return head.data;

        while(temp1.next!=null) {
            if(temp1.next.next==null) {
                temp1=temp1.next;
            }
            else {
                temp1=temp1.next.next;
            }
            temp2=temp2.next;
        }

        return temp2.data;
    }




    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.addAtBegining(3);
        list.display();
        System.out.println("Element  in middle is " + list.middleNode());
        list.addAtBegining(2);
        list.display();
        System.out.println("Element  in middle is " + list.middleNode());
        list.addAtBegining(1);
        list.addAtEnd(4);
        list.addAtEnd(5);
        list.display();
        System.out.println("Element  in middle is " + list.middleNode());
        list.addAtEnd(6);
        System.out.println("Element  in middle is " + list.middleNode());

        list.display();
        System.out.println("3 node from end " + list.nNodefromEnd(3));
        System.out.println("5 node from end " + list.nNodefromEnd(5));

        System.out.println("Search 6 " + list.search(6));
        System.out.println("Search 16 " + list.search(16, list.head));
        System.out.println("The length is " + list.getLength());
        System.out.println("Recursively the length is " + list.getLength(list.head));
        list.deleteAtBeg();
        list.deleteAtEnd();
        list.display();
        System.out.println("Recursively the length is " + list.getLength(list.head));
        list.deleteAtBeg();
        list.deleteAtEnd();
        list.display();
        System.out.println("Recursively the length is " + list.getLength(list.head));
        list.deleteAtBeg();
        list.deleteAtEnd();
        list.display();

    }
}


