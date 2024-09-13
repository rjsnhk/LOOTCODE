class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
int prefix[]=new int[arr.length];
prefix[0]=arr[0];
for(int i=1;i<arr.length;i++){
    prefix[i]=prefix[i-1]^arr[i];
}
int ans[]=new int[queries.length];
int index=0;
for(int r=0;r<queries.length;r++){
    int i=queries[r][0];
    int j=queries[r][1];
    if(i==0) ans[index++]=prefix[j];
    else ans[index++]=prefix[j]^prefix[i-1];
}
return ans;

    }
}