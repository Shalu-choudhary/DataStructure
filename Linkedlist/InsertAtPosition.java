
public class InsertAtPosition {

    Node head;

    class Node {

        int data;
        Node next;

        Node(int data1) {
            this.data = data1;
            this.next = null;
        }
    }

    // Method to add a node at a specific position
    public void addAtPosition(int position, int data) {
        Node newNode = new Node(data);
        // Special case: Insert at the head (position 0)
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        // Traverse to the position before the desired position
        Node currNode = head;
        for (int i = 0; currNode != null && i < position - 1; i++) {
            currNode = currNode.next;
        }
        // If the position is greater than the number of nodes, do nothing
        if (currNode == null) {
            System.out.println("Position out of bounds");
            return;
        }

        // Insert the new node
        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    // Method to print the linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        InsertAtPosition ll = new InsertAtPosition();

        // Add nodes to the list
        ll.addAtPosition(0, 10); // List: 10
        ll.addAtPosition(1, 20); // List: 10 -> 20
        ll.addAtPosition(1, 15); // List: 10 -> 15 -> 20
        ll.addAtPosition(3, 25); // List: 10 -> 15 -> 20 -> 25

        // Print the list
        ll.printList();
    }
}
