class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int max=maxWeight/w;
        if(n*n<=max){
            return n*n;
        }else{
            return max;
        }
    }
}