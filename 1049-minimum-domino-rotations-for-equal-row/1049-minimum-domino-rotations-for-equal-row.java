class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=6;i++){
            int topc=0,bottomc=0;
            boolean poss=true;
            for(int j=0;j<tops.length;j++){
                if(tops[j]!=i&&bottoms[j]!=i){
                    poss=false;
                    break;
                }
                if(tops[j]!=i) topc++;
                if(bottoms[j]!=i) bottomc++;
            }
            if(poss) min=Math.min(min,Math.min(topc,bottomc));
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}