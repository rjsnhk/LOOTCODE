class Solution {
    public int numRescueBoats(int[] p, int limit) {
        Arrays.sort(p);
        int cnt=0;
        int i=0;
        int j=p.length-1;
        while(i<=j){
            if(p[i]+p[j]<=limit){
                cnt++;
                i++;
                j--;
            }else{
                cnt++;
                j--;
            }
        }
        return cnt;
    }
}