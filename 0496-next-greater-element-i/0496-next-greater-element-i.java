class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans[] = new int[nums1.length];
        Stack<Integer> st = new Stack<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!st.empty() && st.peek() < nums2[i]) {
                st.pop();
            }
            if (st.empty()) {
                hm.put(nums2[i], -1);
            } else{
                hm.put(nums2[i], st.peek());
            }
            st.push(nums2[i]);

        }
        int id = 0;
        for (int i : nums1) {
            ans[id++] = hm.get(i);
        }
        return ans;

    }
}