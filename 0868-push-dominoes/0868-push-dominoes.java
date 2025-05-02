class Solution {
    public String pushDominoes(String d) {
        int l=d.length();
        int rightFirst[]=new int[l];
        int leftLast[]=new int[l];
        for(int i=0;i<l;i++){
            char ch=d.charAt(i);
            if(ch=='R'){
               rightFirst[i]=i; 
            }else if(ch=='.'){
                rightFirst[i]=(i!=0)?rightFirst[i-1]:-1;
            }else{
                rightFirst[i]=-1;
            }
        }
        for(int i=l-1;i>=0;i--){
            char ch=d.charAt(i);
            if(ch=='L'){
               leftLast[i]=i; 
            }else if(ch=='.'){
                leftLast[i]=(i!=l-1)?leftLast[i+1]:-1;
            }else{
                leftLast[i]=-1;
            }
        }
        String ans="";
        for(int i=0;i<l;i++){
            if(rightFirst[i]==-1&&leftLast[i]==-1){
                ans+=".";
            }else if(rightFirst[i]==-1){
                ans+="L";
            }else if(leftLast[i]==-1){
                ans+="R";
            }else{
                int distRF=Math.abs(i-rightFirst[i]);
                int distLL=Math.abs(i-leftLast[i]);
                if (distRF>distLL) ans+="L";
                else if(distRF==distLL) ans+=".";
                else ans+="R";
            }
        }
        return ans;
        
    }
}