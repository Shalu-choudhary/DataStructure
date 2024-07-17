import java.util.Arrays;

public class Insertion{

    public static void insertElements(int[] arr, int[] elements, int[] positions) {
        // Determine the size of the new array
        int newSize = arr.length + elements.length;
        int[] newArr = new int[newSize];
        
        // Initialize a pointer for the new array
        int newArrIndex = 0;
        
        // Iterate over the original array and insert elements as needed
        for (int i = 0; i < arr.length; i++) {
            // Check if we need to insert an element at this position
            while (newArrIndex < newSize && (newArrIndex + 1) == positions[i]) {
                newArr[newArrIndex++] = elements[i];
            }
            
            // Insert the original element from arr
            newArr[newArrIndex++] = arr[i];
        }
        
        // If there are any remaining elements to be added at the end
        while (newArrIndex < newSize) {
            newArr[newArrIndex++] = elements[positions.length - 1];
        }
        
        // Copy the new array back to the original array
        System.arraycopy(newArr, 0, arr, 0, newSize);
    }

    public static void main(String[] args) {
        // Example inputs
        int[] arr = {0, 1, 2, 3, 4};
        int[] elements = {5, 6};
        int[] positions = {2, 4}; // 1-based positions

        // Call method to insert elements at specified positions
        insertElements(arr, elements, positions);

        // Print the modified array
        System.out.println("Modified array:");
        System.out.println(Arrays.toString(arr));
    }
}


