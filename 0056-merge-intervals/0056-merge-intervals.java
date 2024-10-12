class Solution {
    public int[][] merge(int[][] intervals) {
if(intervals.length<=1){
    return intervals;
}

    
    Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));
   List<int[]> ans=new ArrayList<>();

   int newInterval[]=intervals[0];
   ans.add(newInterval);

   for(int inter[]:intervals){
    if(inter[0]<=newInterval[1]){
        newInterval[1]=Math.max(newInterval[1],inter[1]);
    }
    else{
        newInterval=inter;
        ans.add(newInterval);
    }
   }

return ans.toArray(new int[ans.size()][]);
    }
}