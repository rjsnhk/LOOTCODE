class Solution {
    public int minGroups(int[][] intervals) {
        PriorityQueue<Integer> ar=new PriorityQueue<>();
        Arrays.sort(intervals,(a,b)->(a[0]==b[0])?a[1]-b[1]:a[0]-b[0]);

        for(int inter[]:intervals){

            
                if(ar.size()>0 &&ar.peek()<inter[0]){
                    ar.remove();
                    ar.add(inter[1]);
                }else
                    ar.add(inter[1]);
                
        }
        return ar.size();
    }
}