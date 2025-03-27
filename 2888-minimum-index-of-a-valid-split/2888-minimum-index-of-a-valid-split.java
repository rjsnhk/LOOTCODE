class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int max=0;
        int maxEle=-1;
        for(int i:hm.keySet()){
            if(hm.get(i)>max){
                max=hm.get(i);
                maxEle=i;
            }
        }
        int c=0;
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)==maxEle) c++;

            if(c*2 > (i+1) && (max-c)*2 > (nums.size()-i-1)) return i;
        }
        return -1;
    }
}