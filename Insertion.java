public class Insertion {
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4};
        int[] pos={2,4};
        int[] element={5,6};
        



        for(int i=arr.length-1;i>pos-1;i--){
            arr[i]=arr[i-2];
  
        }
        arr[pos-1]=element;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


        
    }
    
}
