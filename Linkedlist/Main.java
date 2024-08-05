
// Node class for a doubly linked list
class Node {

    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
// DoublyLinkedList class

class DoublyLinkedList {

    Node head;

    // Constructor
    DoublyLinkedList() {
        head = null;
    }

    // Method to insert a new node in a sorted manner
    void insertSorted(int data) {
        Node newNode = new Node(data);
        // If the list is empty, insert the new node as the head
        if (head == null) {
            head = newNode;
            return;
        }
        // If the new node should be inserted before the head
        if (data < head.data) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return;
        }
        // Traverse the list to find the correct insertion point
        Node current = head;
        while (current.next != null && current.next.data < data) {
            current = current.next;
        }

        // Insert the new node after the current node
        newNode.next = current.next;
        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    // Method to print the list (for verification)
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

// Main class to test the insertion
public class Main {

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        // Inserting nodes into the doubly linked list
        dll.insertSorted(5);
        dll.insertSorted(1);
        dll.insertSorted(3);
        dll.insertSorted(4);
        dll.insertSorted(2);

        // Print the list to verify correct insertion
        dll.printList(); // Output should be: 1 2 3 4 5
    }
}
