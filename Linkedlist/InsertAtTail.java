
public class InsertAtTail {

    Node head;

    class Node {

        int data;
        Node next;

        Node(int data1) {
            this.data = data1;
            this.next = null;
        }
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
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.print(67);
    }

    public static void main(String[] args) {
        // creation of object
        InsertAtTail ll = new InsertAtTail();
        ll.addAtlast(41);
        ll.addAtlast(52);
        ll.addAtlast(58);
        ll.printList();
    }
}
// OUTPUT---> 41 52 58 67
