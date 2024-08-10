
public class LlSort {

    // Class definition for the ListNode
    static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Function to merge two sorted linked lists
    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newlist = new ListNode(0);
        ListNode current = newlist;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        // Attach the remaining nodes
        if (l1 != null) {
            current.next = l1;
        } else if (l2 != null) {
            current.next = l2;
        }
        return newlist.next;
    }

    // Function to reverse a linked list
    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Function to sort the given linked list
    public static ListNode sortLinkedList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode ascendingHead = null;
        ListNode descendingHead = null;
        ListNode ascendingTail = null;
        ListNode descendingTail = null;
        ListNode current = head;
        boolean isAscending = true;
        // Separate the linked list into ascending and descending parts
        while (current != null) {
            if (isAscending) {
                if (ascendingHead == null) {
                    ascendingHead = current;
                    ascendingTail = current;
                } else {
                    ascendingTail.next = current;
                    ascendingTail = ascendingTail.next;
                }
            } else {
                if (descendingHead == null) {
                    descendingHead = current;
                    descendingTail = current;
                } else {
                    descendingTail.next = current;
                    descendingTail = descendingTail.next;
                }
            }
            current = current.next;
            isAscending = !isAscending;
        }

        // Terminate both lists
        if (ascendingTail != null) {
            ascendingTail.next = null;
        }
        if (descendingTail != null) {
            descendingTail.next = null;
        }

        // Reverse the descending list
        descendingHead = reverseList(descendingHead);

        // Merge both lists
        return mergeTwoLists(ascendingHead, descendingHead);
    }

    // Helper function to print linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create the sample linked list: 1 -> 9 -> 2 -> 8 -> 3 -> 7
        ListNode head = new ListNode(1);
        head.next = new ListNode(9);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(8);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(7);

        System.out.println("Original List:");
        printList(head);

        // Sort the linked list
        ListNode sortedHead = sortLinkedList(head);

        System.out.println("Sorted List:");
        printList(sortedHead);
    }
}
