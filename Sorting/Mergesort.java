
public class Mergesort {

    public static void conqure(int arr[], int start, int mid, int end) {
        int mergedarr[] = new int[end - start + 1];  // new array for sort 
        int indx = start;   // for one seprate array start from start pointer to last at mid
        int indx2 = mid + 1;    // for another seprate array it strat with mid+1
        int x = 0;
        while (indx <= mid && indx2 <= end) {
            if (arr[indx] <= arr[indx2]) {
                mergedarr[x++] = arr[indx++];
            } else {
                mergedarr[x++] = arr[indx2++];
            }
        }
        while (indx <= mid) {
            mergedarr[x++] = arr[indx++];
        }
        while (indx2 <= end) {
            mergedarr[x++] = arr[indx2++];
        }
        for (int i = 0, j = start; i < mergedarr.length; i++, j++) {
            arr[j] = mergedarr[i];
        }
    }

    public static void divide(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        conqure(arr, start, mid, end);
    }

    public static void main(String[] args) {
        int arr[] = {32, 12, 21, 77, 43, 56};
        int n = arr.length;
        divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
