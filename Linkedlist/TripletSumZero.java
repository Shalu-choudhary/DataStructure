
public class TripletSumZero {

    // for sorting 
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Function to check if there is a triplet that sums up to zero
    public static boolean hasTripletWithZeroSum(int[] arr) {
        int n = arr.length;
        // Sort the array using Bubble Sort
        bubbleSort(arr);
        // Iterate through the array
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;   // in this we use two pointer method (left/right)
            int right = n - 1;
            // Check for the triplet with the sum of zero
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    return true;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        if (hasTripletWithZeroSum(arr)) {
            System.out.println("Found a triplet with zero sum.");
        } else {
            System.out.println("No triplet with zero sum found.");
        }
    }
}
