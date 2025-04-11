class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int i=low;i<=high;i++){
            String num=Integer.toString(i);
            int len=num.length();
            if(len%2!=0) continue;
            int half=len/2;
            int sum1=0;
            int sum2=0;
            for(int j=0;j<half;j++){
                sum1+=num.charAt(j);
                sum2+=num.charAt(half+j);
            }
            if(sum1==sum2) c++;
        }
        return c;
    }
}