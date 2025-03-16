class Solution {
    public boolean isPossible(int[] piles,int rate,int h){
        int tm=0;
        for(int i:piles){
            tm+=Math.ceil((double)i/rate);
        }
        return tm<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=piles[0];
        for(int i:piles){
            max=Math.max(i,max);
        }
        int l=1,r=max;
        int res=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(piles,mid,h)){
                res=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return res;
    }
}