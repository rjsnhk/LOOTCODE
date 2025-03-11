class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int i = 0, j = 0;
        int n = s.length();
        int ans = 0;
        while (j < n) {

            char cj = s.charAt(j);

            hm.put(cj, hm.getOrDefault(cj, 0) + 1);
            while (hm.size() == 3) {
                ans += n - j;
                char ci = s.charAt(i);
                hm.put(ci, hm.get(ci) - 1);
                if (hm.get(ci) == 0) {
                    hm.remove(ci);
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}