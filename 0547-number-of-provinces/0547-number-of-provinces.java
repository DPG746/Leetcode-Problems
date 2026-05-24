class Solution {
    public void dfs(int node,int[][] con,boolean[] visit){
        visit[node]=true;
        for(int i=0;i<con.length;i++){
            if(con[node][i]==1 && !visit[i]){
                dfs(i,con,visit);

            }

        }

    }
    
        
    public int findCircleNum(int[][] con) {
        
        int n=con.length;
        int count=0;
        boolean[] visit= new boolean[n];
        for(int i=0;i<n;i++){
            if(!visit[i]){
                count++;
                dfs(i,con,visit);

            }

        }
        return count;
    }
}