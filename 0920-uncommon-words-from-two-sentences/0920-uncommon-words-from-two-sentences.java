class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String ar1[]=s1.split(" ");
        String ar2[]=s2.split(" ");
HashMap<String,Integer> hm1=new HashMap<>();
HashMap<String,Integer> hm2=new HashMap<>();

for(int i=0;i<ar1.length;i++){
    if(!hm1.containsKey(ar1[i])){
        hm1.put(ar1[i],1);
    }else{
        hm1.put(ar1[i],(hm1.get(ar1[i])+1));
    }
}

for(int i=0;i<ar2.length;i++){
    if(!hm2.containsKey(ar2[i])){
        hm2.put(ar2[i],1);
    }else{
        hm1.put(ar2[i],(hm2.get(ar2[i])+1));
    }
}
ArrayList<String> arr=new ArrayList<>();


for(int i=0;i<ar1.length;i++){
    if(!hm2.containsKey(ar1[i])){
        if(hm1.get(ar1[i])==1){
            arr.add(ar1[i]);
        }
    }
}

for(int i=0;i<ar2.length;i++){
    if(!hm1.containsKey(ar2[i])){
        if(hm2.get(ar2[i])==1){
            arr.add(ar2[i]);
        }
    }
}
// String[] stringArray = arr.toArray(new String[0]);
// return stringArray;

return arr.toArray(new String[0]);
    }
}
//code by @rjsnhk