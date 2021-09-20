public class ListIntersection {

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

    public ListIntersection() {
        this.head=null;
    }

    public void addAtBegining(int data) {
        Node node = new Node(data);
        node.next=head;
        head=node;
    }

    public Node intersectTwoList(Node node1, Node node2) {

        if(node1==null)
            return node2;

        if(node2==null)
            return node1;

        Node head=null;
        Node temp=null;



        if(node1.data < node2.data) {
            temp=node1;
            node1=node1.next;
        } else {
            temp=node2;
            node2=node2.next;
        }
        head=temp;

        while(node1!=null && node2!=null) {

            if(node1.data <node2.data) {
                temp.next=node1;
                node1=node1.next;
            } else if(node2.data < node1.data) {
                temp.next=node2;
                node2=node2.next;
            } else if(node1.data==node2.data) {
                temp.next=node1;
                node1=node1.next;
                node2=node2.next;
            }
            temp=temp.next;
        }
        return head;


    }

    public Node changeLastNodetoHead(Node temp) {

        if(temp==null || temp.next==null)
            return temp;

        Node temp1=temp;
        Node temp2=temp1.next;

        while(temp2.next!=null) {
            temp2=temp2.next;
            temp1=temp1.next;
        }

        temp1.next=null;
        temp2.next=temp;
        return temp2;


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

    public static void main(String args[]) {

        ListIntersection list1 = new ListIntersection();
        ListIntersection list2 = new ListIntersection();
        ListIntersection list3 = new ListIntersection();



        list1.addAtBegining(5);
        list1.addAtBegining(4);
        list1.addAtBegining(3);
        list1.addAtBegining(2);
        list2.addAtBegining(4);
        list2.addAtBegining(3);
        list2.addAtBegining(2);
        list2.addAtBegining(1);

        Node head1= list1.getHead();
        System.out.println("Displaying First List");
        list1.display(head1);

        Node head2= list2.getHead();
        System.out.println("Displaying Second List");
        list2.display(head2);

        Node temp = list3.intersectTwoList(head1, head2);
        System.out.println("Displaying Intersected List");
        list3.display(temp);

        temp=list3.changeLastNodetoHead(temp);
        System.out.println("Moving last to first");
        list3.display(temp);


    }
}


