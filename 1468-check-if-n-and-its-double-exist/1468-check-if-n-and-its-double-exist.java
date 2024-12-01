class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:arr){
           if(!hm.containsKey(i)) hm.put(i,1);
           else{
            hm.put(i,hm.get(i)+1);
           }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0&&hm.get(0)>=2){return true;}
            if(arr[i]!=0&&hm.containsKey(arr[i]*2)) return true;
            
        }
        return false;
    }
}