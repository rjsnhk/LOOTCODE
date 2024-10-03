class Solution {
    public int minSubarray(int[] nums, int p) {

       int sum=0;

       //(a+b)%p=(a%p+b%p)%p;
       for(int i:nums){
        sum=(sum+i)%p;
       }
       int rem=sum%p;

       if(rem==0) return 0;

        HashMap<Integer,Integer> hm=new HashMap<>();
        int curr=0;
        int minLength=nums.length;
        hm.put(0,-1);
        for(int i=0;i<nums.length;i++){

             curr = (curr + nums[i]) % p;

            int target = (curr - rem + p) % p;

            if (hm.containsKey(target)) {
                minLength = Math.min(minLength, i - hm.get(target));
            }

            hm.put(curr, i);
        }

        return minLength == nums.length ? -1 : minLength;

        }
}


    