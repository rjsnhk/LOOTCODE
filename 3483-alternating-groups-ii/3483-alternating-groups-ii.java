class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int cnt=0;
        int n=colors.length;
        int j=1;
        int i=0;
        while(i<colors.length){
            if(colors[j%n]==colors[(j-1)%n]){
                i=j;
                j++;
            }else{
                if(j-i+1==k){
                    cnt++;
                    i++;
                }
                j++;
            }
        }
     return cnt;  
    }
}