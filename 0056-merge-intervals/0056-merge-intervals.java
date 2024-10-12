class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        int num = 0;

        for(int i=1; i<intervals.length; i++) {
            if(intervals[num][1] >= intervals[i][0]) {
                intervals[num][1] = Math.max(intervals[num][1], intervals[i][1]);
            } else {
                num++;
                intervals[num] = intervals[i];
            }
        }

        return Arrays.copyOf(intervals, num + 1);
    }
}