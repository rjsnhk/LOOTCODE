class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int openCount=0;
        int closeCount=0;
        for(int i=0;i<s.length();i++){
            char v=s.charAt(i);
            if(v=='('){
                openCount++;
            }else{
                if(openCount>0){
                    openCount--;
                }
                else{
                    closeCount++;
                }
            }

        }
        return openCount+closeCount;
            
    }
}