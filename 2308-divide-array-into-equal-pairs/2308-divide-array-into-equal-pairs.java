class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums){
            if(!hm.containsKey(i)){
                hm.put(i,1);
                hs.add(i);
            }else{
                hm.put(i,hm.get(i)+1);
            }
        }
        for(int i:hs){
            if(hm.get(i)%2!=0) return false;
        }
        return true;
    }
}