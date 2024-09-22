class Solution {
    public int count(long curr,long next,int limit){
       int c=0;
        while(curr<=limit){
c += (next-curr);
 curr*=10;
 next*=10;
 next=Math.min(next,(long)limit+1);
        }
return c;
    }

    public int findKthNumber(int n, int k) {
        int curr=1;
        k-=1;
        while(k>0){
            int countNum=count(curr,curr+1,n);
            if(countNum<=k){
                curr++;
                k-=countNum;
            }else{
                curr*=10;
                k-=1;
            }
        }
        return curr;
    }
}