// public class Greatest_element {
//     public static void main(StringLetter[] args) {
//         int arr[]={3,6,5,1,8};
//         for(int i=0;i<arr.length;i++){

//         }

//         System.out.println();
//     }
// }

class Greatest_element {
    
        
    
    public int maxSumDivThree(int[] nums) {
            int n=nums.length;
            int[] sums=new int [3]; 
            // Consider these as 3 persons or 3 buckets who have their own running sums which match their criterion of specific remainder. 
            // 1st person criterion is that sum's remainder should be 0.
            // 2nd person criterion is that sum's remainder should be 1.
            // 3rd person criterion is that sum's remainder should be 2.
            // When a new number is considered, all 3 persons will temporarily add it their own running sums and calculate the remainder.
            // Now each person looks at all 3 temporary sums and their remainders. 
            // If remainder of any sums(1 or more) match their criterion they will steal the running those sums if it exceeds their existing running sum.
            // If no remainder of any sum matches, then they will have to leave that temporary running sum and be happy with their previous sums.
    
            for(int i=0; i<n; i++){
                int s0=sums[0]+nums[i]; // temporary sum of person 1
                int s1=sums[1]+nums[i]; // temporary sum of person 2
                int s2=sums[2]+nums[i]; // temporary sum of person 3
                int r0=s0 % 3; // remainder of temporary sum of person 1
                int r1=s1 % 3; // remainder of temporary sum of person 2
                int r2=s2 % 3; // remainder of temporary sum of person 3
    
                // Now 3 temporary sums can only be stealed by ones whose remainder matches their criterion. If for example, r0 and r1 are both 0, then 1st person gets chance to compare and steal both temporary sum from self and 2nd person.
                sums[r0]=Math.max(sums[r0], s0);
                sums[r1]=Math.max(sums[r1], s1);
                sums[r2]=Math.max(sums[r2], s2);
            } 
    
            return sums[0];
        
        }
    }