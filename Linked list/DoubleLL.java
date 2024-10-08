public class DoubleLL {
    public class Node{
        int data;
        Node next; 
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //Add
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    public void printDoubleLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");

    }
    //Remove
    public int removeFirst(){
        if(head == null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data; 
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
    public int removeLast(){
        if(head == null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data; 
            head = tail = null;
            size--;
            return val;
        }
        Node curr = head;
        for(int i=0; i<size-2; i++){
            curr = curr.next;
        }
        int val = curr.next.data; //tail.data
        curr.next = null;
        tail = curr;
        size--;
        return val;

    }
    public void reverseDoubleLL(){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        // dll.printDoubleLL();
        // System.out.println(dll.size);

        // dll.removeFirst();
        // dll.printDoubleLL();
        // System.out.println(dll.size);

        dll.addLast(4);
        dll.addLast(5);
        dll.addLast(6);
        dll.printDoubleLL();

        // dll.removeLast();
        // dll.printDoubleLL();

        dll.reverseDoubleLL();
        dll.printDoubleLL();
    }
}
