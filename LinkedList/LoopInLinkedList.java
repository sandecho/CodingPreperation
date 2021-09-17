import java.util.HashMap;
import java.util.Map;

public class LoopInLinkedList {

    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            this.next=null;
        }
    }

    private Node head;

    public LoopInLinkedList() {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node2;
        head=node1;
        //node5.next=null;
    }

    private boolean detectLoopUsingMap() {

        if(head==null)
            return false;

        boolean loop=false;

        Map<Node, Boolean> map = new HashMap<Node, Boolean>();

        Node node=head;

        int i=1;
        while(node!=null) {
            System.out.println("iteration i "+i++);
            if(node.next==null) {
                loop=false;
                break;
            }
            if(map.containsKey(node)) {
                loop=true;
                break;
            }
            map.put(node, true);
            node=node.next;
        }

        return loop;
    }

    private boolean detectLoopUsingFloyd() {

        if(head==null)
            return false;

        if(head.next==null)
            return false;

        boolean loop=false;

        int i=1;
        Node temp1=head;
        Node temp2=head;

        while(temp1!=null && temp2!=null && temp2.next!=null) {
            System.out.println("iteration i "+ i++ +"\t"+temp1.data +"\t" + temp2.data);
            temp1=temp1.next;
            temp2=temp2.next.next;
            if(temp1==temp2) {
                loop=true;
                break;
            } else  if(temp1.next==null || temp2.next.next==null) {
                loop=false;
                break;
            }

        }

        return loop;
    }


    private int loopLength() {

        if(head==null)
            return -1;

        if(head.next==null)
            return -1;

        boolean loop=false;

        int i=1;
        Node temp1=head;
        Node temp2=head;

        while(temp1!=null && temp2!=null && temp2.next!=null) {
            System.out.println("iteration i "+ i++ +"\t"+temp1.data +"\t" + temp2.data);
            temp1=temp1.next;
            temp2=temp2.next.next;
            if(temp1==temp2) {
                loop=true;
                break;
            } else  if(temp1.next==null || temp2.next.next==null) {
                loop=false;
                break;
            }

        }
        if(loop) {
            int count=1;
            temp2=temp2.next;
            while(temp2!=temp1) {
                count++;
                temp2=temp2.next;
            }
            return count;

        } else {
            return -1;
        }
    }





    public void display() {

        Node temp=head;

        for(int i=0; i<10 && temp!=null; i++) {
            System.out.print(temp.data +"\t");
            temp=temp.next;
        }
        System.out.println();
    }



    public static void main(String args[]) {

        LoopInLinkedList list = new LoopInLinkedList();
        list.display();
        System.out.println("List has loop " + list.detectLoopUsingMap());
        System.out.println("List has loop detectLoopUsingFloyd " + list.detectLoopUsingFloyd());
        System.out.println("Loop Length is " + list.loopLength());



    }
}


