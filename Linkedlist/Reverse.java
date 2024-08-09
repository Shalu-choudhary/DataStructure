
class Node {

    int data;
    Node next;
    Node prev;

    // Node constructor
    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {

    Node head;

    // Function to reverse the doubly linked list
    public void reverse() {
        Node current = head;
        Node temp = null;
        // Swap next and prev for all nodes
        while (current != null) {
            temp = current.prev; // Store previous node
            current.prev = current.next; // Swap next and prev
            current.next = temp; // Swap next and prev
            current = current.prev; // Move to next node in the original list
        }
        // After the loop, adjust head
        if (temp != null) {
            head = temp.prev;
        }
    }

    // Function to print the list from head to end
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Function to append node at the end of the list
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }
}

public class Reverse {

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        // Append nodes
        dll.append(10);
        dll.append(20);
        dll.append(30);
        dll.append(40);

        System.out.println("Original list:");
        dll.printList();

        // Reverse the list
        dll.reverse();

        System.out.println("Reversed list:");
        dll.printList();
    }
}
