class Solution {
    public int toMinute(String a){
        int h=Integer.parseInt(a.substring(0,2))*60;
        int m=Integer.parseInt(a.substring(3));
        return h+m;
    }
    public int findMinDifference(List<String> t) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(String h:t){
            arr.add(toMinute(h));
        } 
        Collections.sort(arr);
        int min=arr.get(1)-arr.get(0);
        int l=1,r=2;
        while(r<arr.size()){
            min=Math.min(min,arr.get(r)-arr.get(l));
            l=r;
            r++;
        }
int last=1440-arr.get(arr.size()-1);
int ad=last+arr.get(0);
min=Math.min(ad,min);

return min;


    }

}