class Solution {
    public int[] pivotArray(int[] nums, int p) {
        int low=0;
        int same=0;
        for(int i:nums){
            if(i<p) low++;
            else if(p==i) same++;
        }
        int ar[]=new int[nums.length];
        int il=0;
        int sl=low;
        int ih=low+same;
        for(int i:nums){
            if(i<p){
                ar[il++]=i;
            }else if(i==p){
                ar[sl++]=i;
            }else{
                ar[ih++]=i;
            }
        }
        return ar;
    }
}