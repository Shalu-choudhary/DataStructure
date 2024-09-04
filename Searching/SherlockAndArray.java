
public class SherlockAndArray {

    public static String balancedSums(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of the array
        for (int num : arr) {
            totalSum += num;
        }

        // Traverse through the array and check for the balanced index
        for (int i = 0; i < arr.length; i++) {
            // Calculate the right sum
            int rightSum = totalSum - leftSum - arr[i];

            // Check if the left sum equals the right sum
            if (leftSum == rightSum) {
                return "YES";
            }

            // Update the left sum for the next index
            leftSum += arr[i];
        }

        return "NO";
    }

    public static void main(String[] args) {
        // Example test cases
        int[] arr1 = {1, 2, 3, 3};  // Output: YES
        int[] arr2 = {1, 2, 3};     // Output: NO

        System.out.println(balancedSums(arr1));
        System.out.println(balancedSums(arr2));
    }
}
