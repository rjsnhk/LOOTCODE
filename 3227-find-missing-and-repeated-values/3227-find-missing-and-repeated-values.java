class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int ans[]=new int[2];
        int n=grid.length;
        Set<Integer> hs=new HashSet<>();
        int sum=0;
        for(int i=1;i<=n*n;i++){
            sum+=i;
        }
        int rec=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!hs.contains(grid[i][j])){
                    hs.add(grid[i][j]);
                    rec+=grid[i][j];
                }else{
                    ans[0]=grid[i][j];
                }
            }
        }

        ans[1]=sum-rec;

return ans;
    }
}