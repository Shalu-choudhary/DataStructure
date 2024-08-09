
class ListNode {

    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class LinkedList {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Create a dummy node to serve as the start of the merged list
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while (l1 != null && l2 != null) {     // Traverse both lists
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        // Append the remaining nodes of the non-empty list
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }
        // Return the merged list starting from the node after the dummy
        return dummy.next;
    }

    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Helper function to create a linked list from an array
    public ListNode createList(int[] values) {
        if (values.length == 0) {
            return null;
        }

        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }
}

public class Merge {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // Create two sorted linked lists

        ListNode l1 = ll.createList(new int[]{1, 3, 5});
        ListNode l2 = ll.createList(new int[]{2, 4, 6});

        System.out.println("List 1:");
        ll.printList(l1);

        System.out.println("List 2:");
        ll.printList(l2);

        // Merge the two lists
        ListNode mergedList = ll.mergeTwoLists(l1, l2);

        System.out.println("Merged List:");
        ll.printList(mergedList);
    }
}
