class Solution {
    public String compressedString(String w) {
        StringBuilder comp=new StringBuilder();
int i=0;
while(i<w.length()){
        int count=0;
        char ch=w.charAt(i);
        while(i<w.length() && count<9 && ch==w.charAt(i)){
            count++;
            i++;
        }
        comp.append(count);
        comp.append(ch);
        
}


        return comp.toString();
    }
}