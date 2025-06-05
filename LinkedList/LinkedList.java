
public class LinkedList {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node Tail;
//Methods

    public void addFirst(int data) { // TC:O(n)

        // Step1=Create a new Node
        Node newNode = new Node(data);
        // if LinkedList will be empty
        if (head == null) {
            head = Tail = newNode;
            return;
        }
        // Step2 newNode next point to old node
        newNode.next = head; //Linking Step

        // Step3 head-newNode
        head = newNode;
    }

    public void addLast(int data) { // TC:O(n)
            // Step1 Create a new Node
        Node newNode = new Node(data);
         // if LinkedList will be empty
        if (head == null) {
            head = Tail = newNode;
        }
        //Step2 Tail's node point to the newNode
        Tail.next = newNode;
 //Step3 make new node tail
        Tail = newNode;
    }
public void print(){
    if (head==null) {
        System.out.println("LL is empty");
        return;
    }
    Node temp=head;
    while(temp!= null){
        System.out.println(temp.data +"--> ");
        temp=  temp.next;
    }
    System.out.println();
}
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();

    }
}
