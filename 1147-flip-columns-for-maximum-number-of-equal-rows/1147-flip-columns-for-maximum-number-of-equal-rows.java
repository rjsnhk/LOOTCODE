class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int MaxRow=0;
        for(int arr[]:matrix){
            int arr2[]=new int[col];
            for(int c=0;c<col;c++){
                arr2[c]=arr[c]==0?1:0;
            }
            int count=0;
            for(int aa[]:matrix){
                if(Arrays.equals(aa,arr)||Arrays.equals(aa,arr2)) count++;
            }

            MaxRow=Math.max(MaxRow,count);
        }
        return MaxRow;
    }
}