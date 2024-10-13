class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        int k=nums.size();
        int ar[]=new int[k];

        int resultRange[]={-1000000,1000000};
        while(true){
            int minEl=Integer.MAX_VALUE;
            int maxEl=Integer.MIN_VALUE;
            int minElListIdx=0;

            for(int i=0;i<k;i++){
                    int listIdx=i;
                    int elIndex=ar[i];
                    int element=nums.get(listIdx).get(elIndex);

                    if(element<minEl){
                        minEl=element;
                        minElListIdx=i; //listIndex
                    }

                    maxEl=Math.max(maxEl,element);
            }
            if(maxEl-minEl<resultRange[1]-resultRange[0]){
                resultRange[1]=maxEl;
                resultRange[0]=minEl;
            }

            int nextIndex=ar[minElListIdx]+1;
            if(nextIndex>=nums.get(minElListIdx).size()){
                break;
            }
            ar[minElListIdx]=nextIndex;
        }
return resultRange;
    }
}