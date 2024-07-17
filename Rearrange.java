import java.util.Arrays;
public class Rearrange {
            public static void rearrange(int[] arr) {
                int left = 0;
                int right = arr.length - 1;
        
                while (left <= right) {
                    // Move left pointer to find a negative number
                    while (left <= right && arr[left] < 0) {
                        left++;
                    }
                    // Move right pointer to find a positive number
                    while (left <= right && arr[right] >= 0) {
                        right--;
                    }
        
                    // Swap elements if necessary
                    if (left <= right) {
                        int temp = arr[left];
                        arr[left] = arr[right];
                        arr[right] = temp;
                        left++;
                        right--;
                    }
                }
            }
            public static void main(String[] args) {
                int[] arr = {2, -3, 4, -1, 6, -9, 0, 8, -7};
                
                System.out.println("Original Array: " + Arrays.toString(arr));
                
                rearrange(arr);
                
                System.out.println("Rearranged Array: " + Arrays.toString(arr));
            }
        }