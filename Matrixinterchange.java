
    import java.util.Scanner;
public class Matrixinterchange {

    public static void interchangeRowsAndColumns(int[][] matrix) {
        // Get the dimensions of the matrix
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Interchange rows with columns
        int[][] result = new int[cols][rows]; // Transposed matrix
        
        // Fill the transposed matrix
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                result[i][j] = matrix[j][i];
            }
        }
        // Print the transposed matrix
        System.out.println("Matrix after interchanging rows and columns:");
        printMatrix(result);
    } 
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter dimensions of the matrix
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        
        // Initialize the matrix based on user input
        int[][] matrix = new int[rows][cols];
        
        // Prompt user to enter matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        // Close scanner
        scanner.close();
        // Print original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        // Interchange rows and columns
        interchangeRowsAndColumns(matrix);
    }
}


