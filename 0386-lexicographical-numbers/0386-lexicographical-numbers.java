class Solution {
public void solve(int i,int n,List<Integer> ar){
    if(i>n) return;
    ar.add(i);
    for(int j=0;j<=9;j++){
        int check=i*10+j;
        if(check>n) return;
        solve(check,n,ar);
        
    }
}


    public List<Integer> lexicalOrder(int n) {
        List<Integer> arr=new ArrayList<>();
        for(int i=1;i<=9;i++){
            solve(i,n,arr);
        }
        return arr;
    }
}