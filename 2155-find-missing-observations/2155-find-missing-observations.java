class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m=rolls.length;
        int sum=(m+n)*mean;
        for(int i:rolls){
            sum-=i;
        }
        if(sum<n||sum>6*n) return new int[0];
        int avg=sum/n;
        int rem=sum%n;
        int ans[]=new int[n];
        for(int i=0;i<rem;i++){
            ans[i]=avg+1;
        }
        for(int i=rem;i<n;i++){
            ans[i]=avg;
        }
        return ans;
    }
}
//Rajesh Nahak - @rjsnhk