class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char v=s.charAt(i);
            if(st.empty()){
                st.push(v);
            }
            else if(v==')'){
                    if(st.peek()=='('){
                        st.pop();
                    }
                    else{
                        st.push(v);
                    }
                }
            else{
                st.push(v);
            }
                }

        
        return st.size();
    }
}