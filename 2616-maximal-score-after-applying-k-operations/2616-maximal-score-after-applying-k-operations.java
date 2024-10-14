class Solution {

  
    public long maxKelements(int[] nums, int k) {
       PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
       for(int i:nums){
        pq.add(i);
       }
       long ans=0;
       for(int i=0;i<k;i++){
        double popp=pq.remove();
            ans+=popp;
            pq.add((int)(Math.ceil(popp/3)));
       }
return ans;

    }
}