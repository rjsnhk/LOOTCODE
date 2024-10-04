class Solution {
    public long dividePlayers(int[] skill) {
        int n=skill.length;
        long part=n/2;
        long sum=0;
        for(int i:skill){
            sum+=i;
        }
        if(sum%part!=0) return -1;
        long target=sum/part;

        Arrays.sort(skill);
        
        int left = 0, right = n - 1;
        long ans = 0;
        
        while (left < right) {
            if (skill[left] + skill[right] != target) {
                return -1;
            }
            ans += skill[left] * skill[right];
            left++;
            right--;
        }
        
        return ans;
    }
}