class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1) return s;
        String ans="";
        for(int i=1;i<s.length();i++){
            int l=i;
            int h=i;
            while(s.charAt(l)==s.charAt(h)){
                    l--;
                    h++;
                if(l==-1||h==s.length()) break;
            }
            String sub=s.substring(l+1,h);
            if(sub.length()>ans.length()){
                ans=sub;
            }
            l=i-1;
            h=i;
            while(s.charAt(l)==s.charAt(h)){
                 l--;
                    h++;
                if(l==-1||h==s.length()) break;
            }
            sub=s.substring(l+1,h);
            if(sub.length()>ans.length()){
                ans=sub;
            }
        }
        return ans;
    }
}