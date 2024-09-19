class Solution {
    private HashMap<String,List<Integer>> map=new HashMap<>();

public List<Integer> diffWaysToCompute(String s){
    
    if(map.containsKey(s)) return map.get(s);
    List<Integer> res=new ArrayList<>();
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='*'||s.charAt(i)=='+'||s.charAt(i)=='-'){
            List<Integer> left_res=diffWaysToCompute(s.substring(0,i));
            List<Integer> right_res=diffWaysToCompute(s.substring(i+1));

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
   if (res.isEmpty()) res.add(Integer.parseInt(s)); 
   map.put(s,res);
   return res ; 
}

    
}