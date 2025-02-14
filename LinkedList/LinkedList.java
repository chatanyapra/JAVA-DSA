package LinkedList;

public class LinkedList {
    class Node {
        int data;
        Node next;

        // constructor
        Node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int val) {
        Node nn = new Node(val);

        if (size == 0) {
            head = nn;
            tail = nn;
            size++;

        } else {
            nn.next = head;
            head = nn;
            size++;
        }
    }

    public void addLast(int val) {

        Node nn = new Node(val);
        if (size == 0) {
            addFirst(val);
        } else {
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    public void removeFirst() {
        if (size == 1) {
            head = null;
            tail = null;
            size = 0;

        } else {
            head = head.next;
            size--;
        }

    }

    public void removeLast() {
        if (size == 1) {
            removeFirst();
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            size--;
        }
    }

    public void removeAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new RuntimeException("Index out of bound");
        } else if (index == 0) {
            removeFirst();
        } else if (index == size) {
            removeLast();
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next; 
            }
            temp.next = temp.next.next;
            size--;
        }
    }
    public void getSize(){
        System.out.println("Size of LinkedList is: "+size);
    }

    public void getValue(int index){
        if(index < 0 || index >= size){
            throw new RuntimeException("Index out of bound");
        }else{
            Node temp = head;
            for(int i = 0; i<index; i++){
                temp = temp.next;
            }
            System.out.println("value---- "+temp.data);
        }
            
    }

    // reverse of linkedlist-
    public void reverseIterate() {  
        if(head == null || head.next == null) {  
            return;  
        }     
        Node prevNode = head;  
        Node currNode = head.next;  
    
        while(currNode != null) {  
            Node nextNode = currNode.next;  
            currNode.next = prevNode;  
    
            prevNode = currNode;  
            currNode = nextNode;  
        }      
        head.next = null;  
        head = prevNode;  
    }

    // traverse;
    public void traverse() {
        traverse(head);
    }

    private void traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("********************");
    }
}