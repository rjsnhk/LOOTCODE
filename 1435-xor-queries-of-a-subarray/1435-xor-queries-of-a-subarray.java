class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int ans[]=new int[queries.length];
        
        int index=0;
        for(int inner[]:queries){
           int s=inner[0];
           int e=inner[1];
           for(int i=s;i<=e;i++){
            ans[index]=ans[index]^arr[i];
           }
           index++;

        }
        return ans;
    }
}