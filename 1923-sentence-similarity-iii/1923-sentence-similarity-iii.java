class Solution {
    
    public boolean areSentencesSimilar(String s1, String s2) {
        if(s1.length() < s2.length()){
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }

String ar1[]=s1.split(" ");
String ar2[]=s2.split(" ");

        int i=0,j=ar1.length-1;
        int k=0,l=ar2.length-1;

        while(k<=l ){
            if(ar2[k].equals(ar1[i])){
                k++;
                i++;
            }
            else{
                break;
            }
        }
        while(l>=k){
            if(ar2[l].equals(ar1[j])){
                j--;
                l--;
            }
            else{
                break;
            }
        }
        return l<k;
    }
}