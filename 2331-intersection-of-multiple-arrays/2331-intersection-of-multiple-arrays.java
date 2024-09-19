class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int r=nums.length;
        int c=nums[0].length;
        for(int i=0;i<c;i++){
            hm.put(nums[0][i],1);
        }

        for(int i=1;i<r;i++){
            for(int j=0;j<nums[i].length;j++){
                if(hm.containsKey(nums[i][j])){
                    hm.put(nums[i][j],(hm.get(nums[i][j]))+1);
                }
            }
        }
List<Integer> arr=new ArrayList<>();
        for(int i=0;i<c;i++){
            if(hm.get(nums[0][i])==r) arr.add(nums[0][i]);
        }
       Collections.sort(arr);
       return arr;
    }
}