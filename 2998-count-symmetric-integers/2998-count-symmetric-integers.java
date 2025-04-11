class Solution {
    
    int sum(int num,int l){
        int s=0;
        for(int i=0;i<l;i++){
            s+=num%10;
            num/=10;
        }
        return s;
    }
    boolean sym(int n){
        String num=Integer.toString(n);
        int l=num.length();
        if(l%2!=0) return false;
        int s=sum(n,l);
        if(s%2!=0) return false;
        int half=sum(n,l/2);
        if(s/2==half) return true;
        else return false;


    }
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int i=low;i<=high;i++){
            if(sym(i)) c++;
        }
        return c;
    }
}