

public class DoublyLinkedList {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
      public static Node tail;
         public static int size;
         public  void addFirst(int data){
             Node newNode=new Node(data);
             size++;
            if (head==null) {
                head=tail=newNode;
                return;
            }
           
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
         }

         public void addLast(int data){
            Node newNode=new Node(data);
            size++;
            if (head==null) {
                head=tail=newNode;
            }
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
         }
         public  int removeFirst(int data){
              if (head==null) {
               System.out.println("DLL is empty");
               return Integer.MIN_VALUE;
            }
            if (size==1) {
                  int val=head.data;
                  head=tail=null;
                  size--;
                  return val;
            }
            int val=head.data;
            head=head.next;
            head.prev=null;
            size--;
            return val;
         }
         public int removeLast(int data){
            if (head==null) {
                System.out.println("DLL is empty");
               return Integer.MIN_VALUE;
            }
            if (size==1) {
                int val=tail.data;
                size--;
                head=tail=null;
            }
               int val=tail.data;
            tail=tail.prev;
            tail.next=null;
            size--;
            return val;
         }
        public void reverse() {
    Node curr = head;
    Node prev = null;
    Node next;

    while (curr != null) {
        next = curr.next;      // Store next
        curr.next = prev;      // Reverse next pointer
        curr.prev = next;      // Reverse prev pointer
        prev = curr;           // Move prev forward
        curr = next;           // Move curr forward
    }

    head = prev;               // Reset head
}

         public void print(){
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.data + "<-->");
                temp=temp.next;
            }
            System.out.println("null");
         }
    public static void main(String[] args) {
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.addFirst(3);
          dll.addFirst(2);
                 dll.addFirst(1);
        
          dll.print();
          System.out.println(dll.size);
          dll.addLast(4);
           dll.addLast(5);
            dll.print();
          System.out.println(dll.size);
dll.removeFirst(1);
            dll.print();
          System.out.println(dll.size);
          dll.removeLast(5);
           dll.print();
          System.out.println(dll.size);
          dll.reverse();
          dll.print();
    }
}
