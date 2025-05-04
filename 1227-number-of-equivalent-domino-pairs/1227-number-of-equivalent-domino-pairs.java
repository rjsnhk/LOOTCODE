class Solution {
    public int numEquivDominoPairs(int[][] dom) {
        for(int ar[]:dom){
            if(ar[0]>ar[1]){
                int t=ar[0];
                ar[0]=ar[1];
                ar[1]=t;
            }
        }
        int cnt[]=new int[100];
        for(int ar[]:dom){
            int a0=ar[0];
            int a1=ar[1];
            int idx=a0*10+a1;
            cnt[idx]++;
        }
        int total=0;
        for(int i:cnt){
            total+=(i*(i-1)/2);
        }
        return total;
    }
}