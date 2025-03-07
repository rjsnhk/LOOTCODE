class Solution {
    public boolean isPrime(int n){
        if(n==0||n==1) return false;
        if(n==2) return true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        int ans[]=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        int dif=Integer.MAX_VALUE;
        int prev=0;
        int recent=0;
        for(int i=left;i<=right;i++){
            if(isPrime(i)){
                if(prev==0){
                    prev=i;

                }else if(recent==0){
                    recent=i;
                }else {
                    prev=recent;
                    recent=i;
                }
                }
               if(prev!=0 && recent!=0){
                if(recent-prev<dif){
                    ans[0]=prev;
                    ans[1]=recent;
                    dif=recent-prev;
                }
               } 
        }
        return ans;
    }
}