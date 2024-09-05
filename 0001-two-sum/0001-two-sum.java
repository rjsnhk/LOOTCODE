
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(numbers.containsKey(nums[i])){
                return new int[] {numbers.get(nums[i]),i};
            }
            numbers.put(target-nums[i], i);
        }
        return null;
    }
}