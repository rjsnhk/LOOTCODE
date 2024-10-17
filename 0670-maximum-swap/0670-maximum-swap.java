class Solution {
    public int maximumSwap(int num) {
        char ar[]=Integer.toString(num).toCharArray();
        int l=ar.length;
        int occ[]=new int[10];
        Arrays.fill(occ,-1);
        for(int i=0;i<l;i++){
            int ind=ar[i]-'0';
            occ[ind]=i;
        }

        for(int i=0;i<l;i++){
            int check=ar[i]-'0';
            for(int j=9;j>check;j--){
                if(occ[j]>i){
                    char temp=ar[i];
                    ar[i]=ar[occ[j]];
                    ar[occ[j]]=temp;
                    return Integer.parseInt(new String(ar));
                }
            }
        }

       return num; 
    }
}