class Solution {
   public boolean checkInclusion(String s1, String s2) {
        int l1=s1.length();
        int l2=s2.length();
        
       if(l1>l2) return false;

int s1_freq[]=new int[26];
int s2_freq[]=new int[26];

for(int i=0;i<s1.length();i++){
    s1_freq[s1.charAt(i)-'a']++;
}

int i=0;
int j=0;
while(j<l2){
    s2_freq[s2.charAt(j)-'a']++;

    if(j-i+1>l1){
       s2_freq[s2.charAt(i)-'a']--;
       i++; 
    }
    if(Arrays.equals(s1_freq, s2_freq)) return true;
    j++;
}
return false;

    }
}