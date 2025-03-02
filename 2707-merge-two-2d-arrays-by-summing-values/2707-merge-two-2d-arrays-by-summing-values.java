class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int n1=nums1.length;
        int n2=nums2.length;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n1;i++){
            hs.put(nums1[i][0],nums1[i][1]);
            set.add(nums1[i][0]);
        }
        for(int i=0;i<n2;i++){
            if(!hs.containsKey(nums2[i][0])) hs.put(nums2[i][0],nums2[i][1]);
            else hs.put(nums2[i][0],hs.get(nums2[i][0])+nums2[i][1]);
            set.add(nums2[i][0]);
        }
        int ans[][]=new int[set.size()][2];
        int idx=0;
        for(int i:set){
            ans[idx][0]=i;
            ans[idx++][1]=hs.get(i);
        }
        Arrays.sort(ans,Comparator.comparingInt(a->a[0]));
        return ans;
    }
}