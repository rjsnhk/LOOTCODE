class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int n:gifts){
            pq.add(n);
        }
        for(int i=0;i<k;i++){
            int p=pq.poll();
            pq.add((int)Math.sqrt(p));
        }
        long sum=0;
        for(int v:pq){
            sum+=v;
        }
    return sum;
        
    }
}