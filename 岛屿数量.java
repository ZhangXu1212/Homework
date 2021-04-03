class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count0=0;
        UnionFind ufds=new UnionFind(m*n);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='0') count0++;
                else{
                    if(i>0&&grid[i-1][j]=='1')ufds.union(i*n+j,(i-1)*n+j);
                    if(i<m-1&&grid[i+1][j]=='1') ufds.union(i*n+j,(i+1)*n+j);
                    if(j>0&&grid[i][j-1]=='1') ufds.union(i*n+j,i*n+j-1);
                    if(j<n-1&&grid[i][j+1]=='1') ufds.union(i*n+j,i*n+j+1);
                }
            }
        }
        return ufds.count()-count0;
    }
}
class UnionFind {
    private int count = 0;
    private int[] parent;
    public UnionFind(int n) {
        count = n;
        parent = new int[n];
        for(int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public int find(int p) {
        while(p != parent[p]) {
            parent[p] = parent[parent[p]];
            p = parent[p];
        }
        return p;
    }

    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);

        if(rootP == rootQ) return;
        parent[rootP] = rootQ;
        count--;
    }

    public int count() {
        return count;
    }
}