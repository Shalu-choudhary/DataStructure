
class Node {

    int data;
    Node next;

    // creating a constructor
    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;

    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
};

public class Linkedlist {

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5};
        Node x = new Node(arr[3]);
        System.out.println(x.data);
    }
}
