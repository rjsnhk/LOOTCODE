class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

List<int[]> arr=new ArrayList<>();

for(int interval[]:intervals){
    if(interval[1]<newInterval[0]){
        arr.add(interval);
    }else if(newInterval[1]<interval[0]){
        arr.add(newInterval);
        newInterval=interval;
    }else{
        newInterval[0]=Math.min(newInterval[0],interval[0]);
        newInterval[1]=Math.max(newInterval[1],interval[1]);
    }
}
arr.add(newInterval);

return arr.toArray(new int[arr.size()][]);
    }
}