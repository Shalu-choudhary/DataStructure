
public class PossibleTriangle {

    // Function to count the number of triangles that can be formed
    public static int countTriangles(int[] arr) {
        int n = arr.length;
        int count = 0;
        // Check every combination of three different elements  time complexity--->o(n^3) due to the 3 nested loops 
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    // Extract sides
                    int a = arr[i];
                    int b = arr[j];
                    int c = arr[k];

                    // Check the triangle inequality conditions  (x+y > z)
                    if (a + b > c && a + c > b && b + c > a) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {6, 4, 9, 7, 8};
        System.out.println("Number of triangles: " + countTriangles(arr));
    }
}
