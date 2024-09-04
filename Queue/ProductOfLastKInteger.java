
public class ProductOfLastKInteger {

    public static void main(String[] args) {
        // Example array
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3; // Number of last elements to consider

        // Calculate the product of the last k integers
        long product = productOfLastK(arr, k);

        // Output the result
        System.out.println("Product of the last " + k + " integers: " + product);
    }

    public static long productOfLastK(int[] arr, int k) {
        // Check if k is valid
        if (arr == null || k <= 0 || k > arr.length) {
            return 0; // Or throw an exception if needed
        }

        long product = 1;
        for (int i = arr.length - k; i < arr.length; i++) {
            product *= arr[i];
        }
        return product;
    }
}
