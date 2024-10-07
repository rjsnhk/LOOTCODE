class Solution {
    public int minLength(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();){
            if((i<s.length()-1 && s.charAt(i)=='A'&& s.charAt(i+1)=='B')||(i<s.length()-1 && s.charAt(i)=='C'&& s.charAt(i+1)=='D')){
                i=i+2;
            }
            else if(s.charAt(i)=='B'){
                if(!st.empty() && st.peek()=='A'){
                    st.pop();
                    i++;
                }
                else{
                    st.push('B');
                    i++;
                }
            }
            else if(s.charAt(i)=='D'){
                if(!st.empty() && st.peek()=='C'){
                    st.pop();
                    i++;
                }
                else{
                    st.push('D');
                    i++;
                }
            }
            else{
                st.push(s.charAt(i));
                i++;
            }
        }

        return st.size();
    }
}