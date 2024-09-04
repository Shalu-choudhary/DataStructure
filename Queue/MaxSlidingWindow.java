
import java.util.ArrayDeque;
import java.util.Deque;

public class MaxSlidingWindow {

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = maxSlidingWindow(nums, k);
        // Output the result
        for (int max : result) {
            System.out.print(max + " ");
        }
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0 || nums.length == 0) {
            return new int[0];
        }
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            // Remove elements that are out of the current window
            if (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            // Remove elements that are less than the current element
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            // Add the current element at the back of the deque
            deque.offer(i);
            // The front of the deque contains the index of the maximum element for the current window
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peek()];
            }
        }

        return result;
    }
}
