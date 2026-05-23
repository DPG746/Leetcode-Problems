class Solution {

    public void bfs(int[][] con, boolean isVis[], int i) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(i);
        isVis[i] = true;
        while (!q.isEmpty()) {
            int f = q.poll();
            for (int j = 0; j < con[f].length; j++) {
                if (con[f][j] == 1 && !isVis[j]) {
                    q.offer(j);
                    isVis[j] = true;
                }
            }
        }
    }
    public int findCircleNum(int[][] con) {
        int n = con.length;
        boolean isVis[] = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!isVis[i]) {
                bfs(con, isVis, i);
                count++;
            }
        }
        return count;
    }
}