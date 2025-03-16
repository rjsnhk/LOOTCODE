class Solution {
    public boolean isPossible(int ranks[],long mid,int cars){
        int c=0;
        for(int i:ranks){
            c+=Math.sqrt(mid/i);
        }
        return c>=cars;
    }
    public long repairCars(int[] ranks, int cars) {
        long res=-1;
        long max=ranks[0];
        for(int i:ranks){
            max=Math.max(i,max);
        }
        long l=1,h=max*cars*cars;
        while(l<=h){
            long mid=l+(h-l)/2;
            if(isPossible(ranks,mid,cars)){
                res=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return res;
    }
}