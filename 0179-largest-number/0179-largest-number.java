class Solution {
    public String largestNumber(int[] nums) {
      String arr[]=new String[nums.length];
      for(int i=0;i<nums.length;i++){
        arr[i]=String.valueOf(nums[i]);
      }
      Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));

      StringBuilder sb=new StringBuilder();
      for(int i=0;i<nums.length;i++){
        sb.append(arr[i]);
      }
      while (sb.charAt(0) == '0' && sb.length() > 1)
            sb.deleteCharAt(0);
        return sb.toString();

    }
}