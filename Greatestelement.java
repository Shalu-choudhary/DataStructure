
public class Greatestelement {
    public static void main(String[] args) {
        int[] arr = {3, 6, 5, 1, 8};
        int maxSum = maxSumDivThree(arr);
        System.out.println("The greatest sum divisible by three is: " + maxSum);
    }
    public static int maxSumDivThree(int[] nums) {
        int[] dp = new int[3]; // dp[i] means the maximum sum which % 3 == i
        for (int num : nums) {
            int[] dpNext = dp.clone();
            for (int i = 0; i < 3; i++) {
                dpNext[(i + num) % 3] = Math.max(dpNext[(i + num) % 3], dp[i] + num);
            }
            dp = dpNext;
        }
        return dp[0];
    }
}