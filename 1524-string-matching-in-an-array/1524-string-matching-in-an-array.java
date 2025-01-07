class Solution {
    public List<String> stringMatching(String[] w) {
        List<String> st=new ArrayList<>();
        for(int i=0;i<w.length;i++){
                for(int j=i+1;j<w.length;j++){
                    if(w[i].contains(w[j])&& (!st.contains(w[j]))){
                        st.add(w[j]);
                    }else if(w[j].contains(w[i])&&(!st.contains(w[i])))
                        st.add(w[i]);
                }
        }
        return st;
    }
}