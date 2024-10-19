class Solution {  
    public char findKthBit(int n, int k) {  
        if (n == 1) return '0';  
        
        int midIndex = (1 << (n - 1)); // midIndex = 2^(n-1)  
        
        if (k == midIndex) return '1';  
        else if (k < midIndex) return findKthBit(n - 1, k);  
        else return invert(findKthBit(n - 1, (2 * midIndex - k)));  
    }  

    private char invert(char c) {  
        return c == '0' ? '1' : '0';  
    }  
}