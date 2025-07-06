
public class LinkedList {

    // Node Class
    public static class Node {

        int data;
        Node next; // reference variable

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node Tail;
    public static int size;

    // Methods
    public void addFirst(int data) { // TC: O(1)
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = Tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) { // TC: O(1)
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = Tail = newNode;
            return;
        }
        Tail.next = newNode;
        Tail = newNode;
    }

    public void print() { // TC: O(n)
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addMiddle(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = Tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = Tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        Tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key) {
        //BASE CASE
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        return (idx == -1) ? -1 : idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverse() {
        Node prev = null;
        Node curr = Tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthfromEnd(int n) { // TC: O(n)
        // Step 1: Calculate the size of the linked list
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        // Step 2: Edge case - if n is greater than size
        if (n > size) {
            System.out.println("Invalid n: greater than size of linked list.");
            return;
        }

        // Step 3: If deleting the head node
        if (n == size) {
            head = head.next;
            return;
        }

        // Step 4: Find the (size - n)th node (previous to node to delete)
        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        // Step 5: Delete the node
        prev.next = prev.next.next;
    }
    // Step 1

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // slow is the middle node
    }

    public boolean checkPalindrome() {
        // BASE CASE
        if (head == null || head.next == null) {
            return true;
        }
        // step1- find mid
        Node midNode = findMid(head);
        //step2- reverse 2nd half
        Node prev = null;
        Node curr = midNode;

        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        //step3-  check left half and right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
// how can we detect loop in linkedList

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; //+1 moves
            fast = fast.next.next; //+2 moves
            if (fast == slow) {
                return true; //cycle exists
            }

        }
        return false; //cycle does not exists
    }

public static void removeCycle(Node head) {
    // Step 1: Detect cycle using Floyd’s Algorithm
    Node slow = head;
    Node fast = head;
    boolean cycle = false;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;

        if (fast == slow) {
            cycle = true;
            break;
        }
    }

    // Step 2: If no cycle found, return
    if (cycle=false) {
        return;
    }

    // Step 3: Find start of the loop
    slow = head;
    Node prev = null; // This will store the node just before meeting point

    while (slow != fast) {
        prev = fast;
        slow = slow.next;
        fast = fast.next;
    }

    // Step 4: Remove loop
    prev.next = null;
}


    

    public static void main(String[] args) {
                // --------------------part-2--------------
        //     LinkedList ll = new LinkedList();

        //     ll.addFirst(2);
        //     ll.addFirst(1);
        //     ll.addLast(4);
        //     ll.addLast(5);
        //     ll.addMiddle(2, 3);
        //     ll.print();
        //     ll.removeFirst();
        //     ll.print();
        //     ll.removeLast();
        //     ll.print();
        //     System.out.println("Size: " + ll.size);
        //     System.out.println("Index of 3 : " + ll.itrSearch(3));
        //     System.out.println("Index of 10: " + ll.itrSearch(10));
        //     System.out.println("Index of 3 (recursive): " + ll.recSearch(3));
        //     System.out.println("Index of 10 (recursive): " + ll.recSearch(10));
        //     ll.reverse();
        //     ll.print();
        //     ll.deleteNthfromEnd(3);
        //     ll.print();
        //     ll.addFirst(1);
        //     ll.addFirst(2);
        //     ll.addLast(2);
        //     ll.addLast(1);
        //      ll.print(); //1->2->2->1->null
        //    System.out.println(ll.checkPalindrome());
        // PART 2
        // --------------------
        // head= new Node(1);
        // head.next=new Node(2);
        //   head.next.next=new Node(3);
        //     head.next.next.next=head;
        //     System.out.println(isCycle());
        // --------------------part-2--------------
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        System.out.println(isCycle());
        removeCycle(head);
        System.out.println(isCycle());

    }
}

