
class Node {

    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;

    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }

};

public class TraversLL {

    private static Node converArr2ll(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 0; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;

        }
        return head;

    }

    private static int lengthOfll(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5};
        Node head = converArr2ll(arr);
        System.out.println(lengthOfll(head));
        // Node temp = head;
        // // while (temp != null) {
        // //     System.out.println(temp.data);

        // //     temp = temp.next;
        // // }
    }
}
