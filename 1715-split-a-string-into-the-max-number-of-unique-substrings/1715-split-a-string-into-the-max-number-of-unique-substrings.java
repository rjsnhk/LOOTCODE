class Solution {
    int max=0;
    void solve(String s,HashSet<String> set,int i){
        int n=s.length();
        if(i==n){
            max=Math.max(max,set.size());
            return;
        }
        for(int j=i;j<n;j++){
            String sub=s.substring(i,j+1);
            if(!set.contains(sub)){
                set.add(sub);
                solve(s,set,j+1);
                set.remove(sub);
            }
        }

    }
    public int maxUniqueSplit(String s) {
        HashSet<String> set=new HashSet<>();
        
        int idx=0;
        solve(s,set,idx);

        return max;
        
    }
}