package LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head = prepareLinkedList(5);
        Node reversedLinkedList = reverseLinkedList(head);
        printList(reversedLinkedList);
    }

    public static void printList(Node head){
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static Node reverseLinkedList(Node head){
        Node prev = null;
        Node current = head;
        Node next = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;

            current = next;
        }

        return prev;
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

