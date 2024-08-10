
public class KthSmallestEle {

    //  Quickselect
    public static int quickselect(int[] arr, int low, int high, int k) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            int length = pivotIndex - low + 1;
            // Check the position of the pivot
            if (k == length) {
                return arr[pivotIndex];
            } else if (k < length) {
                return quickselect(arr, low, pivotIndex - 1, k);
            } else {
                return quickselect(arr, pivotIndex + 1, high, k - length);
            }
        }
        return arr[low];
    }
    // Function to partition the array and return the pivot index
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Function to find the kth smallest element (1-based index)
    public static int findKthSmallest(int[] arr, int k) {
        // Convert k to 0-based index
        return quickselect(arr, 0, arr.length - 1, k);
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3; // in this we find 3rd smallest no(k=3)
        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value of k");
        } else {
            // Convert k to 0-based index
            int result = findKthSmallest(arr, k);
            System.out.println("The " + k + "th smallest element is: " + result);
        }
    }
}
