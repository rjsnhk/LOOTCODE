class Solution {
    public int minChanges(String s) {
        int i=0;
        int n=s.length();
        
        int count=0;
        int change=0;
        while(i<n){
            char ch=s.charAt(i);
            while(i<n && ch==s.charAt(i)){
                count++;
                i++;
            }
            if(count%2!=0){
                count=0;
                change+=1;
                i++;
            }else{
                count=0;
            }

            
        }
        return change;
    }
}