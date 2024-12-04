class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int sl=s.length();
        int j=0;
        if(s.length()==0) return true;

        for(int i=0;i<t.length();i++){
            if(t.charAt(i)==s.charAt(j)){
                j++;
            }
            if(j==sl) return true;
        }
        return false;
    }
}