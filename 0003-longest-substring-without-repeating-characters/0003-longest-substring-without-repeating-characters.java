class Solution {
    public int lengthOfLongestSubstring(String s) {

        if (s.length()==0) return 0;
        HashSet<Character> hs=new HashSet<>();
        int ans=0;
        int i=0;
        int j=0;

        while(j<s.length()){
            char v=s.charAt(j);
if(!hs.contains(v)){
hs.add(v);
j++;
        }
        else{
            hs.remove(s.charAt(i));
            i++;
        }
        

        ans=Math.max(ans,(j-i+1));
        }

        
        return ans-1;

    }
}