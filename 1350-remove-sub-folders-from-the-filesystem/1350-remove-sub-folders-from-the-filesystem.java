class Solution {
    public List<String> removeSubfolders(String[] f) {
        Arrays.sort(f);
        ArrayList<String> ans=new ArrayList<>();
for(String ss:f){
        if(ans.isEmpty() || !ss.startsWith(ans.get(ans.size()-1)+"/") )
        ans.add(ss);


}

        return ans;
    }
}