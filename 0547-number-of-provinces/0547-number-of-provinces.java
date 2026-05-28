class Solution {
    public  void dfs(int[][] con,boolean[] isvisible,int i){
        if(isvisible[i]==false){
            isvisible[i]=true;
            for(int j=0;j<con.length;j++){
                if(con[i][j]==1 && !isvisible[j]){
                    dfs(con,isvisible,j);

                }

            }


        }

    }
    public int findCircleNum(int[][] con) {
        int n=con.length;
        boolean[] isvisible = new boolean[n];
        int cnt=0;
        for(int i=0;i<n;i++){
            if(isvisible[i]==false){
                dfs(con,isvisible,i);
                cnt++;

            }

        }
        return cnt;

    }

}