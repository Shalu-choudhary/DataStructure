public class Rearrange {
    public static void main(StringLetter[] args) {
        int arr[]={4,2,-6,8,-2,-3,-5,9,1};
        int i=0;
        int temp;
        for( i=0;i<arr.length;i++){
            if(arr[i]<0 && arr[i+1]>0){
                temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
            }
           
        }
        for( i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        
    }
}
