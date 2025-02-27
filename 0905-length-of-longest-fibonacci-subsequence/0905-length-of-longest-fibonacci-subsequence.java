class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:arr){
            hs.add(i);
        }
        int maxlen=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int len=2;
                int prev=arr[j];
                int curr=arr[i]+arr[j];
                while(hs.contains(curr)){
                    int temp=curr;
                    curr+=prev;
                    prev=temp;
                    maxlen=Math.max(maxlen,++len);
                }
            }
        }
        return maxlen; }
}