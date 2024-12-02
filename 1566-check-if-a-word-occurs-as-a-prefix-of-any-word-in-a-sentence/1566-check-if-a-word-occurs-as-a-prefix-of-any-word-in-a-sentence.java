class Solution {
    public int isPrefixOfWord(String s, String searchWord) {
        String ar[]=s.split(" ");
        for(int i=0;i<ar.length;i++){
            if(ar[i].length()>=searchWord.length()){
            String w=ar[i].substring(0,searchWord.length());
            if(w.equals(searchWord)) return i+1;
            }
        }
        return -1;
    }
}