class Solution {
    boolean isPalli(String s){
        int l=0,h=s.length()-1;
        while(l<=h){
            if(s.charAt(l)!=s.charAt(h)) return false;
        l++;
        h--;
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String ss="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)<='9'&&s.charAt(i)>='0'){
                ss+=s.charAt(i);
            }
        }

        return isPalli(ss);
    }
}