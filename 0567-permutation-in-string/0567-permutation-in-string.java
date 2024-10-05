class Solution {
    public String sorting(String a){
        char ar[]=a.toCharArray();
        Arrays.sort(ar);
        return new String(ar);
    }
    public boolean checkInclusion(String s1, String s2) {
        int l1=s1.length();
        int l2=s2.length();
        
        String s11=sorting(s1);

        for(int i=0;i<=l2-l1;i++){
            String s22=sorting(s2.substring(i,i+l1));

            if(s11.equals(s22)) return true;
        }
        return false;
    }
}