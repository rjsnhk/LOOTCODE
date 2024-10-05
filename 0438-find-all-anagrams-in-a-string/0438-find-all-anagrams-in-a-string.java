class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans=new ArrayList<>();
int l1=p.length();
int l2=s.length();
        int p_freq[]=new int[26];
        int s_freq[]=new int[26];

        for(int i=0;i<l1;i++){
            p_freq[p.charAt(i)-'a']++;
        }

        int i=0;
        int j=0;
        while(j<l2){
            s_freq[s.charAt(j)-'a']++;
            if(j-i+1>l1){
                s_freq[s.charAt(i)-'a']--;
                i++;
            }
            if(Arrays.equals(p_freq,s_freq)){
                ans.add(i);
            }
            j++;
        }

        return ans;
        
    }
}