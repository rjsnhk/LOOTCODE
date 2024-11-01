class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans=new StringBuilder();
        int count=1;
        ans.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            if(ans.charAt(ans.length()-1)==ch){
                count++;
                if(count<3){
                    ans.append(ch);
                }
            }else{
                count=1;
                ans.append(ch);
            }
            
            
        }
        return ans.toString();
    }
}


