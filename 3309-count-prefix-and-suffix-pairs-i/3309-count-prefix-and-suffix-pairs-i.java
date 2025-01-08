class Solution {
    public int countPrefixSuffixPairs(String[] w) {
        int c=0;
        for(int i=0;i<w.length;i++){
            for(int j=i+1;j<w.length;j++){
                if(w[j].startsWith(w[i])&&w[j].endsWith(w[i])) c++;
            }
        }
        return c;
    }
}