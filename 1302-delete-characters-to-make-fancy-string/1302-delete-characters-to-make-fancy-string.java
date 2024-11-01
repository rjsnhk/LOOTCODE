class Solution {
    public String makeFancyString(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        char prev = s.charAt(0);
        sb.append(s.charAt(0));
        int count = 1;

        for(int i=1;i<n;i++){
            if(s.charAt(i) == prev){
                count++;
            }
            else{
                prev = s.charAt(i);
                count = 1;
            }
            if(count < 3){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}