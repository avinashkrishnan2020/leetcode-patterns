package LinkedList;

public class MiddleElement {
    public static void main(String[] args) {
        Node head = prepareLinkedList(5);

        System.out.println(findMiddleUsingSlowAndFastPointer(head));


    }

    /**
     * Logic: fastPtr moves twice as fast as slowPtr.
     * Therefore, when fastPtr completes iterating the list, the
     * slowPtr will only be halfway through.
     * 
     * @param head
     * @return
     */
    public static int findMiddleUsingSlowAndFastPointer(Node head){
        Node slowPtr = head;
        Node fastPtr = head;

        while(fastPtr.next != null && fastPtr.next.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }
        return slowPtr.val;
    }

    public static Node prepareLinkedList(int size){
        Node head = new Node(1);
        Node headPointer = head;

        for(int i=2; i<=size; i++){
            head.next = new Node(i);
            head = head.next;
        }

        return headPointer;
    }
}
class Node{
    public int val;
    public Node next;

    public Node(int val){
        this.val = val;
    }
}
