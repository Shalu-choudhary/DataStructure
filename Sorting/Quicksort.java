
public class Quicksort {

    // partition return the index of pivot as integer value
    public static int partition(int arr[], int low, int high) {
        // let assume pivot is end indexed point
        int pivot = arr[high];
        int i = low - 1;   // i = -1  we assume that initially there are no element in an array 
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap (the ele. which is currently at empty space in array and the ele which is smaller than pivot)
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        // for right place of pivot
        int temp = arr[i];
        arr[i] = arr[high];  // arr[high]=pivot
        arr[high] = temp;
        return i;   // pivot index
    }

    public static void quicksort(int arr[], int low, int high) {   // initially= low->0,high->n-1
        // low--->start index, high last index--(n-1)
        if (low < high) {
            int pivotindex = partition(arr, low, high); // partition give the index of pivot
            quicksort(arr, low, pivotindex - 1);  // small item is left side of pivot so we use pivotindex-1
            quicksort(arr, pivotindex + 1, high);  // biger item are at right side of pivot
        }
    }
    public static void main(String[] args) {
        int arr[] = {23, 34, 21, 11, 56, 20};
        int n = arr.length;
        quicksort(arr, 0, n - 1);  // n--> length,n-1--> last element
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
