public class Pivot {
        public static int findPivotIndex(int[] nums) {
            int totalSum = 0;
            int leftSum = 0;
            
            // Calculate total sum of the array
            for (int num : nums) {
                totalSum += num;
            }
            // Iterate through the array to find the pivot index
            for (int i = 0; i < nums.length; i++) {
                // Check if left sum equals right sum
                if (leftSum == totalSum - leftSum - nums[i]) {
                    return i;
                }
                leftSum += nums[i];
            }
            // If no pivot index found, return -1
            return -1;
        }
        public static void main(String[] args) {
            int[] nums = {1, 7, 3, 6, 5, 6};
            int pivotIndex = findPivotIndex(nums);
            if (pivotIndex != -1) {
                System.out.println("Pivot Index: " + pivotIndex); // Output: Pivot Index: 3
            } else {
                System.out.println("No pivot index found");
            }
        }
    }
    

