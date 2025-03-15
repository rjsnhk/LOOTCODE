class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> hs=new HashSet<>();
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<=s.length()-10;i++){
            String sub=s.substring(i,i+10);
            if(hs.isEmpty()){
                hs.add(sub);
            }else{
                if(hs.contains(sub) && !ans.contains(sub)) ans.add(sub);
                hs.add(sub);
            }
        }
        return ans;
    }
}