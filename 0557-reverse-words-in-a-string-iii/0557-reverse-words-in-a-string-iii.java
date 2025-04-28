class Solution {
    public String reverseWords(String s) {
        StringBuilder word=new StringBuilder();
    StringBuilder rev=new StringBuilder();
    for(char c:s.toCharArray()){
      if(c!=' '){
        word.append(c);
      }
      else{
        rev.append(word.reverse());
        rev.append(c);
        word.setLength(0);
      }
    }
    rev.append(word.reverse());
    return rev.toString();
    }
    
}