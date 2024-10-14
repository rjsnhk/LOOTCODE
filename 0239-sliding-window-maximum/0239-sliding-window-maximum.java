class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l=nums.length;
       int idx=0;
       int ans[]=new int[l-k+1];
       Deque<Integer> dq=new ArrayDeque<>();
       for(int i=0;i<l;i++){
if(!dq.isEmpty()&&dq.peek()==(i-k)){
    dq.poll();
}

while(!dq.isEmpty()&&nums[i]>nums[dq.peekLast()]){
    dq.pollLast();
}
dq.offer(i);

if(i>=k-1){
    ans[idx++]=nums[dq.peek()];
}

       }
       return ans;


    }
}