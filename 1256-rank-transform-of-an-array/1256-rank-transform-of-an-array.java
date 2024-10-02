class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashSet<Integer> hs=new HashSet<>();
        int a[]=arr.clone();
        HashMap<Integer,Integer> hm=new HashMap<>();
        Arrays.sort(a);
        int rank=1;
        for(int i:a){
if(!hm.containsKey(i)){
    hm.put(i,rank++);
}
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=hm.get(arr[i]);
        }
        return arr;

    }
}