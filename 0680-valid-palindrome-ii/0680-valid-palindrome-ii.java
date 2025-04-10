class Solution {
    boolean palli(String s,int l,int h){
        while(l<h){
            if(s.charAt(l)!=s.charAt(h)) return false;
            l++;
            h--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
       int l=0,h=s.length()-1;
       int c=0;
       
       while(l<h){
            if(s.charAt(l)!=s.charAt(h)){
                return palli(s,l+1,h)||palli(s,l,h-1);
            }
            l++;
            h--;
       }
       return true; 
    }
}