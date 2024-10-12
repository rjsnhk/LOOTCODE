class Solution {
    public int minGroups(int[][] intervals) {
         PriorityQueue<Integer>pq=new PriorityQueue<>();
    
    Arrays.sort(intervals,(a,b)->(a[0]==b[0])?a[1]-b[1]:a[0]-b[0]);
    
    for(int[] arr:intervals){
        if(pq.size()>0 && pq.peek()<arr[0]){
            pq.remove();
        }
        
        pq.add(arr[1]);
    }
    
    return pq.size();
    }
}