class Solution {
    public String compressedString(String w) {
        if(w.length()==1){
            return 1+w;
        }
        String comp="";
        int count=1;
        char a=w.charAt(0);
        for(int i=1;i<w.length();i++){
            
            if(count==9){
                comp+=count;
                comp+=a;
                a=w.charAt(i);
                count=1;
            }
           
            else if(a!=w.charAt(i)){
                comp+=count;
                comp+=a;
                a=w.charAt(i);
                count=1;
            }
            else if(a==w.charAt(i)){
                count++;
            }
            if(i==w.length()-1){
                comp+=count;
                comp+=a;
            }
            
            
            
            
            
        }
        
        return comp;
    }
}