import java.util.*;

class Solution {
    int idx(ArrayList<Integer> ans, int x) {
    int l = 0;
    int r = ans.size() - 1; // Fix: `r` should be last index, not size

    while (l <= r) {
        int mid = l + (r - l) / 2; // Fix: Correct binary search formula

        if (ans.get(mid) == x) return mid; // Fix: Compare values, not indices
        else if (ans.get(mid) > x) {
            r = mid - 1;
        } else {
            l = mid + 1;
        }
    }
    return -1; // Element not found
}

    public List<Integer> solveQueries(int[] nums, int[] queries) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();

        // Store indices of each number in nums
        for (int i = 0; i < nums.length; i++) {
            hm.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        for (int q : queries) {
            if (hm.get(nums[q]).size() == 1) {
                ans.add(-1);
            } else {
                ArrayList<Integer> list = hm.get(nums[q]);
                int index = idx(list,q);

                if (index == 0) {
                    ans.add(Math.min(list.get(1) - list.get(0), nums.length - list.get(list.size() - 1)+list.get(0)));
                } else if (index == list.size() - 1) {
                    ans.add(Math.min(list.get(index) - list.get(index - 1), nums.length - list.get(index)+list.get(0)));
                } else {
                    ans.add(Math.min(list.get(index) - list.get(index - 1), list.get(index + 1) - list.get(index)));
                }
            }
        }
        return ans;
    }
}
