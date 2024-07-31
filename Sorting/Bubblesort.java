class Bubblesort {
    public static void printArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={34,45,43,12,56,20};
        // bubble sort
        // Time complexity:---- o(n^2)              (n-1)1st then (n-2).....so on constant ignore
        for(int i=0;i<arr.length-1;i++){  // outer loop  
            for(int j=0;j<arr.length-i-1;j++){  //inner loop
                if(arr[j]>arr[j+1]){
                    int swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }
            }
        }
        printArray(arr);
    }
}
