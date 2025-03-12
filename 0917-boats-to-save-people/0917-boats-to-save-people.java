class Solution {
    public int numRescueBoats(int[] p, int limit) {
        Arrays.sort(p);
       int boatCount = 0;
       for(int lw = 0, hw = p.length-1; lw<=hw; --hw){
        if(p[lw]+p[hw] <= limit){
        ++lw;
        }
           boatCount++;
       }
    
       return boatCount;
    }
}