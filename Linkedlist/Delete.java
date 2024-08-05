
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
    
class LinkedList {
    Node head;
    // Method to delete the first occurrence of a given value
    void deleteNode(int value) {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }// List is empty
        // If the node to be deleted is the head
        if (head.data == value) {
            head = head.next;
            System.out.println("Deleted node with value: " + value);
            return;
        }
        // Traverse the list to find the node to be deleted
        Node current = head;
        Node previous = null;
        while (current != null && current.data != value) {
            previous = current;
            current = current.next;
        }
        // If the value was not found
        if (current == null) {
            System.out.println("Node with value " + value + " not found.");
            return;
        }
        // Unlink the node from the list
        previous.next = current.next;
        System.out.println("Deleted node with value: " + value);
    }

    // Method to print the list
    void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Delete {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);

        System.out.println("Original List:");
        list.printList();
        // Test deleting a node that exists
        list.deleteNode(3);
        System.out.println("List after deleting 3:");
        list.printList();
        // Test deleting a node that does not exist
        list.deleteNode(5);
        System.out.println("List after trying to delete 5:");
        list.printList();
        // Test deleting the head node
        list.deleteNode(1);
        System.out.println("List after deleting 1:");
        list.printList();
        // Test deleting from an empty list
        list.deleteNode(2);
        System.out.println("List after trying to delete 2 from an empty list:");
        list.printList();
    }
}
