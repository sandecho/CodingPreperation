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
            System.out.println("iteration is "+ i++);
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



    }
}


