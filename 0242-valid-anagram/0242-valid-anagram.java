class Solution {
    public boolean isAnagram(String s, String t) {
        int l1=s.length();
        int l2=t.length();
        int s_freq[]=new int[26];
        int t_freq[]=new int[26];
        for(int i=0;i<l1;i++){
            s_freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<l2;i++){
            t_freq[t.charAt(i)-'a']++;
        }
        if(Arrays.equals(s_freq,t_freq)) return true;
        return false;

    }
}