class Solution {
    public int minimumRecolors(String b, int k) {
        int l=0;
        int n=b.length();
        int min=Integer.MAX_VALUE;
        while(l<=n-k){
            String sub=b.substring(l,l+k);
            int c=0;
            for(int i=0;i<k;i++){
                if(sub.charAt(i)=='W'){
                    c++;
                }
            }    
            if(c==0) return 0;
            min=Math.min(min,c);

            l++;
        }
        return min;
    }
}