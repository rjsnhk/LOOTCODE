class Solution {
    public String shortestPalindrome(String s) {
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            if(s.substring(0,s.length()-i).equals(rev.substring(i))){
                return rev.substring(0,i)+s;
            }
        }
        return rev+s;
    }
}