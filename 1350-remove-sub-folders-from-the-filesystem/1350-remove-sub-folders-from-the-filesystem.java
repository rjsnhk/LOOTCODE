class Solution {
    public List<String> removeSubfolders(String[] f) {
        ArrayList<String> ans=new ArrayList<>();

        Set<String> st=new HashSet<>();
        for(String s:f){
            st.add(s);
        }
        for(int i=0;i<f.length;i++){
                String ch=f[i];
                int idx=ch.length()-1;
                int inc=1;
                while(ch.charAt(idx)!='/'){
                    idx--;
                    inc++;

                }
                for(int j=ch.length()-inc;j>=0;j=j-inc){
                    String sub=ch.substring(0,j);
                    if(st.contains(sub)){
                        st.remove(ch);
                        break;
                    }

                }
        }

        for(String ss:st){
            ans.add(ss);
        }

        return ans;
    }
}