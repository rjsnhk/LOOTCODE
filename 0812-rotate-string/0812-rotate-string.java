class Solution {
    public boolean rotateString(String s, String goal) {
        String ss=s+s;
        if(ss.contains(goal)&&s.length()==goal.length()){
            return true;
        }
        return false;
    }
}