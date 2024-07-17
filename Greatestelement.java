class Greatestelement {
    int[][] dp = new int[100005][3];
    int n;
     int rec(int ind,int sum,int[] a)
     {
         if(ind>=n)
         {
if(sum!=0)
return Integer.MIN_VALUE;
return 0;
}
if(dp[ind][sum]!=-1)
return dp[ind][sum];
int k=(sum+a[ind])%3;
int ans1=a[ind]+rec(ind+1,k,a);
int ans2=rec(ind+1,sum,a);
return dp[ind][sum]=Math.max(ans1,ans2);
}

public int maxSumDivThree(int[] nums) { 
n=nums.length;
int i,j;
for(i=0;i<=n;i++)
for(j=0;j<=2;j++)
dp[i][j]=-1;
return rec(0,0,nums);
}
}