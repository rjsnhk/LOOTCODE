class Solution {
    public int lengthOfLongestSubstring(String s) {
        int p=0;
        int maxL=0;
        Map<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(hm.containsKey(c)){
                    p=Math.max(p,hm.get(c)+1);
                }
                hm.put(c,i);
                maxL=Math.max(maxL,i-p+1);
        }
        return maxL;
    }
}