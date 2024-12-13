class Solution {
    public int minStoneSum(int[] piles, int k) {
         PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ka:piles){
            pq.add(ka);

        }
        for(int i=0;i<k;i++){
            int num=pq.poll();
            pq.add(num-((int)Math.floor(num/2)));
        }
        int sum=0;
        for(int v:pq){
            sum+=v;
        }
        return sum;
    }
}