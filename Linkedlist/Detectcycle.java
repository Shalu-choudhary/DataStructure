
// Definition for singly-linked list.
class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Detectcycle {

    // Function to detect if the linked list has a cycle
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // An empty list or a list with a single node cannot have a cycle
        }
        ListNode slow = head; // This pointer moves one step at a time
        ListNode fast = head; // This pointer moves two steps at a time
        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow pointer one step
            fast = fast.next.next; // Move fast pointer two steps

            if (slow == fast) {
                return true; // Cycle detected
            }
        }

        return false; // No cycle detected
    }

    public static void main(String[] args) {
        // Example usage
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        // Uncomment the next line to create a cycle
        // node4.next = node2; // Creates a cycle

        Detectcycle detector = new Detectcycle();
        boolean hasCycle = detector.hasCycle(node1);
        System.out.println("Cycle detected: " + hasCycle);
    }
}
