public class RemoveDublicate {

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

    public RemoveDublicate() {
        this.head=null;
    }

    public void addAtBegining(int data) {
        Node node = new Node(data);
        node.next=head;
        head=node;
    }

    public Node removeDublicateFromSortedList(Node node) {

        if(node==null|| node.next==null) {
            return node;
        }

        Node temp1=node;
        Node temp2=node.next;

        while(temp2!=null) {
            if(temp1.data==temp2.data) {
                temp1.next=temp2.next;
                temp2=temp2.next;
            } else {
                temp1=temp1.next;
                temp2=temp2.next;
            }
        }

        return node;
    }

    public Node removeDublicate(Node node) {
        
        if(node==null || node.next==null) {
            return node;
        }

        Node temp1=node;
        Node temp2=node;

        while(temp1!=null && temp1.next!=null) {
            temp2=temp1;
            while(temp2!=null && temp2.next!=null) {
                if(temp1.data==temp2.next.data) {
                    temp2.next=temp2.next.next;
                } else {
                    temp2=temp2.next;
                }
            }
            temp1=temp1.next;
        }
        
        return node;

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

        RemoveDublicate sortedList = new RemoveDublicate();

        sortedList.addAtBegining(5);
        sortedList.addAtBegining(4);
        sortedList.addAtBegining(4);
        sortedList.addAtBegining(3);
        sortedList.addAtBegining(2);
        sortedList.addAtBegining(2);
        sortedList.addAtBegining(2);
        sortedList.addAtBegining(1);

        Node head= sortedList.getHead();
        System.out.println("Displaying  List");
        sortedList.display(head);

        sortedList.removeDublicateFromSortedList(head);
        System.out.println("Displaying  List after removing dublicate");
        sortedList.display(head);
        
        sortedList = new RemoveDublicate();

        sortedList.addAtBegining(1);
        sortedList.addAtBegining(5);
        sortedList.addAtBegining(4);
        sortedList.addAtBegining(4);
        sortedList.addAtBegining(3);
        sortedList.addAtBegining(2);
        sortedList.addAtBegining(2);
        sortedList.addAtBegining(2);
        sortedList.addAtBegining(1);

        head= sortedList.getHead();
        System.out.println("Displaying  List");
        sortedList.display(head);

        sortedList.removeDublicate(head);
        System.out.println("Displaying  List after removing dublicate");
        sortedList.display(head);

    }
}


