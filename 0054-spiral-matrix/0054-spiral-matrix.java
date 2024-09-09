class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> lis=new ArrayList<>();
        int rowBegin=0;
        int rowEnd=matrix.length-1;
        int colBegin=0;
        int colEnd=matrix[0].length-1;
        while(rowBegin<=rowEnd&&colBegin<=colEnd){

            for(int j=colBegin;j<=colEnd;j++){
                lis.add(matrix[rowBegin][j]);
            }
            rowBegin++;
            for(int j=rowBegin;j<=rowEnd;j++){
                lis.add(matrix[j][colEnd]);
            }
            colEnd--;

            if(rowBegin<=rowEnd)
            for(int j=colEnd;j>=colBegin;j--){
                lis.add(matrix[rowEnd][j]);
            }
            rowEnd--;

            if(colBegin<=colEnd)
            for(int j=rowEnd;j>=rowBegin;j--){
                lis.add(matrix[j][colBegin]);
            }
            colBegin++;

        }
        return lis;
    }
}