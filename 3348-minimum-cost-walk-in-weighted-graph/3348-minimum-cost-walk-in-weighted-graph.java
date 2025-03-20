class DSU{
    int rank[];
    int parent[];
    public DSU(int n){
        rank=new int[n];
        parent=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
    }
    public int find(int n){
        if(n==parent[n]) return n;
        parent[n]=find(parent[n]);
        return parent[n];
    }

    public void union(int u,int v){
        int rootU=find(u);
        int rootV=find(v);

        if(rootU==rootV) return;
        if(rank[rootU]<rank[rootV]){
            parent[rootU]=rootV;
        }else if(rank[rootU]>rank[rootV]){
            parent[rootV]=rootU;
        }else{
            parent[rootU]=rootV;
            rank[rootV]++;
        }
    }

}
class Solution {
    public int[] minimumCost(int n, int[][] edges, int[][] query) {
        DSU dsu=new DSU(n);
        
        for(int e[]:edges){
            dsu.union(e[0],e[1]);
        }
        int cost[]=new int[n];
        Arrays.fill(cost,Integer.MAX_VALUE);
        for(int e[]:edges){
            int rootP=dsu.find(e[0]);
            cost[rootP]&=e[2];
        }
        int m=query.length;
        int ans[]=new int[m];
        for(int i=0;i<m;i++){
            int rootP1=dsu.find(query[i][0]);
            int rootP2=dsu.find(query[i][1]);
            if(rootP1!=rootP2){
                ans[i]=-1;
            }else{
                ans[i]=cost[rootP1];
            }
        }
        return ans;
    }
}