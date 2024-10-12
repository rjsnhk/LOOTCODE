class Solution {
    public int minGroups(int[][] intervals) {
        PriorityQueue<Integer> ar=new PriorityQueue<>();
        Arrays.sort(intervals,(a,b)->(a[0]==b[0])?a[1]-b[1]:a[0]-b[0]);

        for(int inter[]:intervals){
            int st=inter[0];
            int end=inter[1];

            
                if(!ar.isEmpty()&&ar.peek()<st){
                    ar.remove();
                    ar.add(end);
                }else
                    ar.add(end);
                
        }
        return ar.size();
    }
}