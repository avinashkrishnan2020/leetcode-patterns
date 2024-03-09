package LinkedList;

public class BinarySearch {
    public static void main(String[] args) {
        Node head = prepareLinkedList(5);
        search(head, 2);

    }

    public static int search(Node head, int target){
        Node left = head;
        Node right = null;

        while(true){
            Node middle = findMiddle(left, right);
            if(middle.val == target){
                return middle.val;
            } else if(middle.val < target) {
                left = middle.next;
            } else {

            }
        }
    }

    public static Node findMiddle(Node left, Node right){
        Node slowPtr = left;
        Node fastPtr = left;
        Node prev = null;
        while(fastPtr.next != null && fastPtr.next.next != null){
            fastPtr = fastPtr.next.next;
            prev = slowPtr;
            slowPtr = slowPtr.next;
        }
        return slowPtr;
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
