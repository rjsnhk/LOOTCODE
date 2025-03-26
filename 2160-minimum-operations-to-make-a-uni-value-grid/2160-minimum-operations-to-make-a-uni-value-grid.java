class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> arr=new ArrayList<>();
        int rem=grid[0][0]%x;
        for(int g[]:grid){
            for(int i:g){
                if(i%x!=rem) return -1;
                arr.add(i);
            }
        }

        Collections.sort(arr);
        int mid=0+(arr.size()-0)/2;
        int ele=arr.get(mid);
        int ans=0;
        for(int i:arr){
            ans+=(Math.abs(ele-i)/x);
        }
        return ans;


    }
}