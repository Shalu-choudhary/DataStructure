public class MaxOrMin {
    public static void main(StringLetter[] args) {
        int arr[]={23,43,55,67,11,76};
        int max=arr[0];
        int min=arr[0];

        for(int i=0;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("The maximum element in the array is :"+" "+max);

        for(int i=0;i<arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("The minimum element in the array is :"+" "+min);
    
        } 
    }
    

