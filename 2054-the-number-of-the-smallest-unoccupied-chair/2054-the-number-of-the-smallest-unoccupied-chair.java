class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int n=times.length;
int seat[]=new int[n];
Arrays.fill(seat,-1);

        int targetArrival=times[targetFriend][0];
        // Sort the 2D array based on the first column
Arrays.sort(times, Comparator.comparingInt(a -> a[0]));



for(int time[]:times){
    int arrival=time[0];
    int depart=time[1];
    for(int i=0;i<n;i++){
if(seat[i]<=arrival){
    seat[i]=depart;

if(arrival==targetArrival){
    return i;
}
break;
    }
    }
}
return -1;

    }
}