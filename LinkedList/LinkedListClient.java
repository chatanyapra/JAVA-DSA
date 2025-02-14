package LinkedList;
public class LinkedListClient {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addLast(40);
        ll.traverse();
        // ll.removeLast();
        // ll.removeAtIndex(2);
        ll.reverseIterate();
        ll.traverse();
        // ll.getValue(2);
        // ll.getSize();
    }
}