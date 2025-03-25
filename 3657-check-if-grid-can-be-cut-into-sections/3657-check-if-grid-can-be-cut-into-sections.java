class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        int num = 0;

        for(int i=1; i<intervals.length; i++) {
            if(intervals[num][1] > intervals[i][0]) {
                intervals[num][1] = Math.max(intervals[num][1], intervals[i][1]);
            } else {
                num++;
                intervals[num] = intervals[i];
            }
        }

        return Arrays.copyOf(intervals, num + 1);
    }
    public boolean checkValidCuts(int n, int[][] rect) {
        int xar[][]=new int[rect.length][2];
        
        for(int i=0;i<rect.length;i++){
            xar[i][0]=rect[i][0];
            xar[i][1]=rect[i][2];
        }
        int yar[][]=new int[rect.length][2];
        
        for(int i=0;i<rect.length;i++){
            yar[i][0]=rect[i][1];
            yar[i][1]=rect[i][3];
        }
        if(merge(xar).length>=3||merge(yar).length>=3) return true;
        else return false;

    }
}