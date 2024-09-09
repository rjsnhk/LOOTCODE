class Solution {
    public int[][] generateMatrix(int n) {
     int ar[][]=new int[n][n];
     int tr=0,br=n-1;
     int lc=0,rc=n-1;
     int num=1;
     while(num<=n*n){
        for(int col=lc;col<=rc;col++){
            ar[tr][col]=num++;
        }
        tr++;
        for(int row=tr;row<=br;row++){
            ar[row][rc]=num++;
        }
        rc--;
        for(int col=rc;col>=lc;col--){
            ar[br][col]=num++;
        }
        br--;
        for(int row=br;row>=tr;row--){
            ar[row][lc]=num++;
        }
        lc++;
     }  
     return ar; 
    }
}