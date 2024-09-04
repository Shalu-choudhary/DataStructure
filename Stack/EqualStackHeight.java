
import java.util.PriorityQueue;
import java.util.Stack;

public class EqualStackHeight {

    public static void main(String[] args) {
        // Example stacks (cylinders heights)
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();
        stack1.push(3);
        stack1.push(2);
        stack1.push(1);

        stack2.push(4);
        stack2.push(2);

        stack3.push(1);
        stack3.push(1);
        stack3.push(4);
        // Find the maximum possible height
        int maxHeight = maxEqualHeight(stack1, stack2, stack3);
        System.out.println("Maximum possible height: " + maxHeight);
    }

    public static int maxEqualHeight(Stack<Integer> stack1, Stack<Integer> stack2, Stack<Integer> stack3) {
        // Calculate initial total heights
        int height1 = totalHeight(stack1);
        int height2 = totalHeight(stack2);
        int height3 = totalHeight(stack3);
        // Use priority queue to simulate max heap
        PriorityQueue<StackInfo> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b.totalHeight, a.totalHeight));
        maxHeap.add(new StackInfo(stack1, height1));
        maxHeap.add(new StackInfo(stack2, height2));
        maxHeap.add(new StackInfo(stack3, height3));

        while (true) {
            StackInfo largest = maxHeap.poll(); // Get stack with maximum height

            // If the priority queue is empty or all stacks have the same height
            if (maxHeap.isEmpty()) {
                return largest.totalHeight;
            }

            StackInfo nextLargest = maxHeap.peek(); // Get stack with the next maximum height

            // If the largest and next largest are the same height
            if (largest.totalHeight == nextLargest.totalHeight) {
                continue;
            }

            // Remove the top cylinder from the stack with the maximum height
            largest.stack.pop();
            if (largest.stack.isEmpty()) {
                return 0; // If any stack becomes empty, the max height is 0
            }

            // Update the total height and re-add to the max heap
            largest.totalHeight = totalHeight(largest.stack);
            maxHeap.add(largest);
        }
    }

    // Helper method to calculate the total height of a stack
    private static int totalHeight(Stack<Integer> stack) {
        int total = 0;
        for (int height : stack) {
            total += height;
        }
        return total;
    }

    // Helper class to store stack and its total height
    private static class StackInfo {

        Stack<Integer> stack;
        int totalHeight;

        StackInfo(Stack<Integer> stack, int totalHeight) {
            this.stack = stack;
            this.totalHeight = totalHeight;
        }
    }
}
