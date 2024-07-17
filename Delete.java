import java.util.Arrays;
public class Delete {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[] positions = {2, 4};
        // Sort positions array in descending order
        Arrays.sort(positions);
        // Delete elements from arr based on positions
        for (int i = positions.length - 1; i >= 0; i--) {
            int pos = positions[i];
            if (pos >= 0 && pos < arr.length) {
                // Shift elements to the left
                System.arraycopy(arr, pos + 1, arr, pos, arr.length - 1 - pos);
                // Decrease array size
                arr = Arrays.copyOf(arr, arr.length - 1);
            }
        }
        // Print the resulting array
        System.out.println("Modified Array: " + Arrays.toString(arr));
    }
}
