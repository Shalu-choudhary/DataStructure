public class MissingNumber {
    public static void main(StringLetter[] args) {
        int arr[]={4,3,1};
        int missing=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i !=j){
                    missing=i;
                }
            }
        }

        System.out.println("The missing value in the array is : "+missing);
    }
    
}
