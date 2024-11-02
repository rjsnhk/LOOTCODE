class Solution {
    public boolean isCircularSentence(String s) {
        
        int n=s.length();
        if(s.charAt(0)==s.charAt(n-1)){
       char prev=' ';
       char curr=' ';
            for(int i=1;i<n;i++){
                prev=s.charAt(i-1);
                curr=s.charAt(i);
                if(curr==' '){
                    if(prev!=s.charAt(i+1)){
                        return false;
                    }
                }
            }
        }else{
            return false;
        }
        return true;
    }
}