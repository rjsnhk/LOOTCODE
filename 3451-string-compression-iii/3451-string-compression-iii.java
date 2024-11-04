class Solution {
    public String compressedString(String w) {
        String comp="";
        int n=w.length();
int i=0;
while(i<n){

        int count=0;
        char ch=w.charAt(i);
        while(i<n && count<9 && ch==w.charAt(i)){
            count++;
            i++;
        }
        comp+=count;
        comp+=ch;
        
}


        return comp;
    }
}