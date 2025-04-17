class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        int rs=0,re=m.length-1,cs=0,ce=m[0].length-1;
        List<Integer> ans=new ArrayList<>();

        while(rs<=re&&cs<=ce){
            for(int i=cs;i<=ce;i++){
                ans.add(m[rs][i]);
            }
            rs++;
            for(int i=rs;i<=re;i++){
                ans.add(m[i][ce]);
            }
            ce--;
            if(rs<=re)
            for(int i=ce;i>=cs;i--){
                ans.add(m[re][i]);
            }
            re--;
            if(cs<=ce)
            for(int i=re;i>=rs;i--){
                ans.add(m[i][cs]);
            }
            cs++;
        }
        return ans;
    }
}