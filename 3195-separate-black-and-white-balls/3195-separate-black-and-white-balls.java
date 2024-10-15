class Solution {
    public long minimumSteps(String s) {
          long ans=0;
          char arr[]=s.toCharArray();
          int countone=0;
          for(int i=0;i<arr.length;i++){
            if(arr[i]=='1'){
                countone++;
            }
            if(arr[i]=='0'){
                ans+=countone;
            }
          }
return ans;
    }
}