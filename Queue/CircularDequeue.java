
class CircularDequeue {

    private int[] deque;
    private int front, rear, size, capacity;

    //Initialize the deque with the given capacity.
    public CircularDequeue(int k) {
        capacity = k;
        deque = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    /* Inserts an element at the front of the deque. Return true if the
     * operation is successful.*/
    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            front = (front - 1 + capacity) % capacity;
        }
        deque[front] = value;
        size++;
        return true;
    }

    /* Inserts an element at the rear of the deque. Return true if the operation
     * is successful.*/
    public boolean insertRear(int value) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }
        deque[rear] = value;
        size++;
        return true;
    }
    // * Deletes an element from the front of the deque. Return true if the * operation is successful.

    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
        return true;
    }

    /**
     * Deletes an element from the rear of the deque. Return true if the
     * operation is successful.
     */
    public boolean deleteRear() {
        if (isEmpty()) {
            return false;
        }
        if (front == rear) {
            front = rear = -1;
        } else {
            rear = (rear - 1 + capacity) % capacity;
        }
        size--;
        return true;
    }

    /**
     * Get the front element of the deque.
     */
    public int getFront() {
        if (isEmpty()) {
            return -1; // Or throw an exception
        }
        return deque[front];
    }

    /**
     * Get the rear element of the deque.
     */
    public int getRear() {
        if (isEmpty()) {
            return -1; // Or throw an exception
        }
        return deque[rear];
    }

    /**
     * Checks whether the deque is empty or not.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Checks whether the deque is full or not.
     */
    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        CircularDequeue deque = new CircularDequeue(3);

        System.out.println(deque.insertRear(1));  // true
        System.out.println(deque.insertRear(2));  // true
        System.out.println(deque.insertFront(3)); // true
        System.out.println(deque.insertFront(4)); // false (deque is full)

        System.out.println(deque.getRear());  // 2
        System.out.println(deque.isFull());   // true

        System.out.println(deque.deleteRear()); // true
        System.out.println(deque.insertFront(4)); // true

        System.out.println(deque.getFront()); // 4
        System.out.println(deque.getRear());  // 1
    }
}
