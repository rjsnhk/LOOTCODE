class Solution {
    public boolean canConstruct(String s, int k) {
        int n=s.length();        
        if(n<k){
            return false;
        }

        int[] arr=new int[26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }

        int oddCharCnt=0;
        for(int i=0; i<26; i++){
            if(arr[i]==0) continue;

            if(arr[i]%2==1){
                oddCharCnt++;
            }
        }

        if(oddCharCnt>k){
            return false;
        }

        return true;
    }
}