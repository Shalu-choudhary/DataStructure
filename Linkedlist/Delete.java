
public class Delete {

    class Node {

        int data;
        Node next;

        // creating a constructor
        Node(int data1, Node next1) {
            this.data = data1;
            this.next = next1;

        }

        Node(int data1) {
            this.data = data1;
            this.next = null;
        }
    };

    public static void print(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;

        }
        System.out.println();
    }

    public static Node deleteHead(Node head) {
        if (head == null) {
            return head;
        }
        head = head.next;
        return head;

    }

    public static void main(String[] args) {

    }
}
