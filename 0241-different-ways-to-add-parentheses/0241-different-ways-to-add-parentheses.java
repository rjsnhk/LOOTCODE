class Solution {
public List<Integer> solve(String s){
    List<Integer> res=new ArrayList<>();
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='*'||s.charAt(i)=='+'||s.charAt(i)=='-'){
            List<Integer> left_res=solve(s.substring(0,i));
            List<Integer> right_res=solve(s.substring(i+1));

            for(int l:left_res){
                for(int r:right_res){
                    if(s.charAt(i)=='*'){
                        res.add(l*r);
                    }
                    else if(s.charAt(i)=='+'){
                        res.add(l+r);
                    }
                    else{
                        res.add(l-r);
                    }
                }
            }

        }
        
    }
   if (res.size()==0) res.add(Integer.parseInt(s)); 
   return res ; 
}

    public List<Integer> diffWaysToCompute(String expression) {
        return solve(expression);

    }
}