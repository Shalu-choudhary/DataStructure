
public class Llistoperation {

    Node head;

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // add element at first
    public void addAtFirst(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;

        }
        newNode.next = head;
        head = newNode;
    }

    // add at last
    public void addAtlast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;

        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data + "");
            currNode = currNode.next;
        }
        System.out.println(3);

    }

    public static void main(String[] args) {
        // creation of object
        Llistoperation ll = new Llistoperation();
        ll.addAtFirst(1);
        ll.addAtFirst(2);
        ll.printList();

    }
}
