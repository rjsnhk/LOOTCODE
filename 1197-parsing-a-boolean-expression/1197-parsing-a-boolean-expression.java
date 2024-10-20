class Solution {
    public char solveOperator(HashSet<Character> arr,char op){
        if(op=='!'){
           if (arr.contains('t')) return 'f';
            else return 't';
        }
        else if(op=='&'){
            if (arr.contains('f')) return 'f';
            else return 't';
        }
        else{
            if (arr.contains('t')) return 't';
            else return 'f';
        }
    }
    public boolean parseBoolExpr(String exp) {
        Stack<Character> st=new Stack<Character>();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(ch!=','&&ch!=')'){
                st.push(ch);
            }
            else if(ch==')'){
                set.clear();
                char aa=st.pop();
                while(aa!='('){
                    set.add(aa);
                    aa=st.pop();
                }
                char op=st.pop();
                char solve=solveOperator(set,op);
                
                st.push(solve);
            }
        }
        
         return st.pop()=='t';

 

    }
}